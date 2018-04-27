package com.iz2use.labels.electricalboard.components

import com.iz2use.labels.electricalboard._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.vdom.all.svg
import japgolly.scalajs.react.extra.StateSnapshot
import scalacss.ScalaCssReact._
import scala.concurrent.duration._
import org.scalajs.dom
import java.util.UUID

object Cell {
  case class Props(state: StateSnapshot[model.Cell], move: Function2[UUID, UUID, Callback], remove: Function1[UUID, Callback])
  type State = model.Cell

  final class Backend($: BackendScope[Props, State]) extends extra.TimerSupport {
    def render(p: Props, s: State) =
      <.td(
        Style.cell,
        ^.colSpan := s.span,
        <.div(
          Style.printableOnly,
          Style.cellContent,
          <.div(Style.icon, s.icon.map(i => svg.svg(svg.viewBox := "0 0 24 24", ^.dangerouslySetInnerHtml := i.svg, svg.stroke := i.mainColor, svg.fill := i.mainColor)).getOrElse[TagMod]("")),
          //<.div(Style.icon, s.icon.map(i => i.imgsrc()).getOrElse[TagMod]("")),
          <.div(Style.label, s.label1, <.br(), s.label2)
        ),
        <.div(
          Style.notPrintable,
          Style.cellContent,
          ^.onDragOver ==> { (ev: ReactDragEvent) =>
            ev.dataTransfer.dropEffect = "move"
            ev.preventDefaultCB
          },
          ^.onDrop ==> { (ev: ReactDragEvent) =>
            val data = ev.dataTransfer.getData("item")
            ev.preventDefaultCB >> p.move(UUID.fromString(data), p.state.value.id)
          },
          <.div(
            Style.label,
            <.span(^.backgroundColor := "black", ^.width := "0.5em", ^.height := "0.5em",
              ^.draggable := true,
              ^.onDragStart ==> { (ev: ReactDragEvent) =>
                ev.dataTransfer.dropEffect = "move"
                Callback(ev.dataTransfer.setData("item", s.id.toString))
              }),
            <.button(^.tabIndex := -1, "-", ^.onClick --> $.setState(s.copy(span = Math.max(1, s.span - 1)))),
            s.span,
            <.button(^.tabIndex := -1, "x", ^.onClick --> p.remove(s.id)),
            <.button(^.tabIndex := -1, "+", ^.onClick --> $.setState(s.copy(span = s.span + 1)))
          ),
          <.div(Style.icon, <.select(
            ^.value := s.icon.map(_.toString()).getOrElse(""),
            ^.onChange ==> { (e: ReactEventFromInput) =>
              val v = e.target.value
              $.setState(s.copy(icon = model.Icon.map.get(v)))
            },
            <.option(^.value := "", ""),
            model.Icon.list.toTagMod(v => <.option(^.value := v.toString(), v.label))
          )),
          <.div(Style.label, <.input(
            ^.value := s.label1,
            ^.onChange ==> { (e: ReactEventFromInput) =>
              val v = e.target.value
              $.setState(s.copy(label1 = v))
            }
          )),
          <.div(Style.label, <.input(
            ^.value := s.label2,
            ^.onChange ==> { (e: ReactEventFromInput) =>
              val v = e.target.value
              $.setState(s.copy(label2 = v))
            }
          ))
        )
      )

    def update = $.props >>= { props =>
      $.state >>= { state =>
        if (props.state.value == state) Callback.empty
        else props.state.setState(state)
      }
    }
  }

  val component = ScalaComponent.builder[Props]("Cell")
    .initialStateFromProps[State](p => p.state.value)
    .renderBackend[Backend]
    .componentDidMount(c => c.backend.setInterval(c.backend.update, 2.seconds))
    .configure(extra.TimerSupport.install)
    .build
}