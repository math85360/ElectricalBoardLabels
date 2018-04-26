package com.iz2use.labels.electricalboard.components

import com.iz2use.labels.electricalboard._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.extra.StateSnapshot
import scalacss.ScalaCssReact._
import scala.concurrent.duration._

object Cell {
  type Props = StateSnapshot[model.Cell]
  type State = model.Cell

  final class Backend($: BackendScope[Props, State]) extends extra.TimerSupport {
    def render(p: Props, s: State) =
      <.td(
        Style.cell,
        ^.colSpan := s.span,
        <.div(
          Style.printableOnly,
          Style.cellContent,
          <.div(Style.icon, s.icon),
          <.div(Style.label, s.label1, <.br(), s.label2)
        ),
        <.div(
          Style.notPrintable,
          Style.cellContent,
          <.div(
            Style.label,
            <.button("<", ^.onClick --> $.setState(s.copy(span = Math.max(1, s.span - 1)))),
            s.span,
            <.button(">", ^.onClick --> $.setState(s.copy(span = s.span + 1)))
          ),
          <.div(Style.icon, <.select(
            ^.value := s.icon,
            ^.onChange ==> { (e: ReactEventFromInput) =>
              val v = e.target.value
              $.setState(s.copy(icon = v))
            },
            <.option(^.value := "", ""),
            <.option(^.value := "PC", "PC")
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
        if (props.value == state) Callback.empty
        else props.setState(state)
      }
    }
  }

  val component = ScalaComponent.builder[Props]("Cell")
    .initialStateFromProps[State](p => p.value)
    .renderBackend[Backend]
    .componentDidMount(c => c.backend.setInterval(c.backend.update, 2.seconds))
    .configure(extra.TimerSupport.install)
    .build
}