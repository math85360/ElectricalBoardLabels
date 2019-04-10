package com.iz2use.labels.electricalboard.components

import com.iz2use.labels.electricalboard._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.extra.StateSnapshot
import java.util.UUID
import scalacss.ScalaCssReact._

object Table {
  type Props = StateSnapshot[model.Table]
  type State = Unit

  val cols = <.colgroup((1 to 13).toVdomArray(i => <.col(^.key := i.toString, Style.column)))

  final class Backend($: BackendScope[Props, Unit]) {
    val moveCell = new Function2[UUID, Option[UUID], Callback] {
      def apply(source: UUID, target: Option[UUID] = None): Callback =
        $.props.runNow().modState { table =>
          table.move(source, target)
        }
    }

    def render(props: Props) = {
      <.table(
        Style.table,
        cols,
        <.tbody(
          props.value.lines.map({ line =>
            Line.withKey(line.id.toString)(
              StateSnapshot(line)(
                (ov, cb) =>
                  props.modStateOption(t =>
                    Some(t.update(ov.get)), cb)
              ),
              moveCell
            )
          }).mkTagMod(<.tr(Style.printableOnly, Style.empty)),
          <.tr(Style.notPrintable, <.td(
            <.button(^.key := "add", <.div("Nouvelle"), <.div("ligne"), ^.onClick --> props.modStateOption(t => Some(t.addNew())))
          ))
        )
      )
    }
  }
  val component = ScalaComponent.builder[Props]("Table")
    .renderBackend[Backend]
    .build
}