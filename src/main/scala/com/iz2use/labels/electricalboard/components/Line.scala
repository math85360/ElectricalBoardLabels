package com.iz2use.labels.electricalboard.components

import com.iz2use.labels.electricalboard._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.extra.StateSnapshot
import scalacss.ScalaCssReact._
import java.util.UUID

object Line {
  type Props = StateSnapshot[model.Line]
  type State = Unit

  final class Backend($: BackendScope[Props, State]) {
    val remove = new Function1[UUID, Callback] {
      def apply(id: UUID): Callback =
        $.props.runNow().modState { line =>
          line.copy(cells = line.cells.filterNot(_.id == id))
        }
    }
    val move = new Function2[UUID, UUID, Callback] {
      def apply(id: UUID, to: UUID): Callback = {
        $.props.runNow().modState { line =>
          if (id == to) line
          else {
            val sourceIdx = line.cells.indexWhere(_.id == id)
            val targetIdx = line.cells.indexWhere(_.id == to)
            if (sourceIdx == -1 || targetIdx == -1 || sourceIdx == targetIdx) line
            else {
              val count = targetIdx - sourceIdx
              line.copy(cells =
                line.cells
                  .patch(sourceIdx, Nil, 1)
                  .patch(sourceIdx + count, Seq(line.cells(sourceIdx)), 0))
            }
          }
        }
      }
    }

    def render(props: Props) = {
      <.tr(
        Style.line,
        props.value.cells.toVdomArray { cell =>
          Cell.component.withKey(cell.id.toString)(
            Cell.Props(
              StateSnapshot(cell)((ov, cb) =>
                props.modStateOption(t =>
                  Some(t.update(ov.get)), cb)),
              move,
              remove
            )
          )
        },
        <.td(
          Style.notPrintable,
          <.button(^.key := "add", "+", ^.onClick --> props.modStateOption(t => Some(t.addNew())))
        )
      )
    }
  }

  val component = ScalaComponent.builder[StateSnapshot[model.Line]]("Line")
    .renderBackend[Backend]
    .build
}