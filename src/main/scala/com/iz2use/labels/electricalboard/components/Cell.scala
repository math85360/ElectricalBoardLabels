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
  case class Props(state: StateSnapshot[model.Cell], moveCell: Function2[UUID, Option[UUID], Callback])
  type State = Unit

  final class Backend($: BackendScope[Props, State]) extends extra.TimerSupport {
    def render(p: Props, s: State) =
      <.td(
        Style.cell,
        ^.colSpan := p.state.value.span,
        <.div(
          Style.printableOnly,
          Style.cellContent,
          <.div(Style.icon, p.state.value.icon.map(i => svg.svg(svg.viewBox := "0 0 24 24", ^.dangerouslySetInnerHtml := i.svg, svg.stroke := i.mainColor, svg.fill := i.mainColor)).getOrElse[TagMod]("")),
          //<.div(Style.icon, s.icon.map(i => i.imgsrc()).getOrElse[TagMod]("")),
          <.div(Style.label, p.state.value.label1, <.br(), p.state.value.label2)
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
            ev.preventDefaultCB >> p.moveCell(UUID.fromString(data), Some(p.state.value.id))
          },
          <.div(
            Style.label,
            <.span(^.backgroundColor := "black", ^.width := "0.5em", ^.height := "0.5em",
              ^.draggable := true,
              ^.onDragStart ==> { (ev: ReactDragEvent) =>
                ev.dataTransfer.dropEffect = "move"
                Callback(ev.dataTransfer.setData("item", p.state.value.id.toString))
              }),
            <.button(^.tabIndex := -1, "-", ^.onClick --> p.state.modState(_.copy(span = Math.max(1, p.state.value.span - 1)))),
            p.state.value.span,
            <.button(^.tabIndex := -1, "x", ^.onClick --> p.moveCell(p.state.value.id, None)),
            <.button(^.tabIndex := -1, "+", ^.onClick --> p.state.modState(_.copy(span = p.state.value.span + 1)))
          ),
          <.div(Style.icon, <.select(
            ^.value := p.state.value.icon.map(_.toString()).getOrElse(""),
            ^.onChange ==> { (e: ReactEventFromInput) =>
              val v = e.target.value
              p.state.modState(_.copy(icon = model.Icon.map.get(v)))
            },
            <.option(^.value := "", ""),
            model.Icon.list.toTagMod(v => <.option(^.value := v.toString(), v.label))
          )),
          <.div(Style.label, <.input(
            ^.value := p.state.value.label1,
            ^.onChange ==> { (e: ReactEventFromInput) =>
              val v = e.target.value
              p.state.modState(_.copy(label1 = v))
            }
          )),
          <.div(Style.label, <.input(
            ^.value := p.state.value.label2,
            ^.onChange ==> { (e: ReactEventFromInput) =>
              val v = e.target.value
              p.state.modState(_.copy(label2 = v))
            }
          ))
        )
      )

    /*def update = $.props >>= { props =>
      $.state >>= { state =>
        if (props.state.value == state) Callback.empty
        else props.state.setState(state)
      }
    }*/
  }

  val component = ScalaComponent.builder[Props]("Cell")
    //.initialStateFromProps[State](p => p.state.value)
    .renderBackend[Backend]
    //.componentDidMount(c => c.backend.setInterval(c.backend.update, 2.seconds))
    //.componentWillReceiveProps(c => c.setState(c.nextProps.state.value))
    .configure(extra.TimerSupport.install)
    .build
}