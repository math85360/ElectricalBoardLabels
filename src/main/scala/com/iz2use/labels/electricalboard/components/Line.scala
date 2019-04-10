package com.iz2use.labels.electricalboard.components

import com.iz2use.labels.electricalboard._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.extra.StateSnapshot
import scalacss.ScalaCssReact._
import java.util.UUID

object Line {
  case class Props(line: StateSnapshot[model.Line], moveCell: Function2[UUID, Option[UUID], Callback])
  type State = Unit

  final class Backend($: BackendScope[Props, State]) {
    def render(props: Props) = {
      <.tr(
        Style.line,
        props.line.value.cells.toVdomArray { cell =>
          Cell.component.withKey(cell.id.toString)(
            Cell.Props(
              StateSnapshot(cell)((ov, cb) =>
                props.line.modStateOption(t =>
                  Some(t.update(ov.get)), cb)),
              props.moveCell
            )
          )
        },
        <.td(
          Style.notPrintable,
          <.button(^.key := "add", "+", ^.onClick --> props.line.modStateOption(t => Some(t.addNew())))
        )
      )
    }
  }

  val component = ScalaComponent.builder[Props]("model.Line")
    .renderBackend[Backend]
    .build

  def withKey(key: String)(line: StateSnapshot[model.Line], moveCell: Function2[UUID, Option[UUID], Callback]) =
    component.withKey(key)(Props(line, moveCell))
}