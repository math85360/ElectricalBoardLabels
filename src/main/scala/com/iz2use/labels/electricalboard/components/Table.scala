package com.iz2use.labels.electricalboard.components

import com.iz2use.labels.electricalboard._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.extra.StateSnapshot
import scalacss.ScalaCssReact._

object Table {
  val cols = <.colgroup((1 to 13).toVdomArray(i => <.col(^.key := i.toString, Style.column)))
  val component = ScalaComponent.builder[StateSnapshot[model.Table]]("Table")
    .render_P { props =>
      <.table(
        Style.table,
        cols,
        <.tbody(
          props.value.lines.map({ line =>
            Line.component.withKey(line.id.toString)(
              StateSnapshot(line)((ov, cb) =>
                props.modStateOption(t =>
                  Some(t.update(ov.get)), cb))
            )
          }).mkTagMod(<.tr(Style.printableOnly, Style.empty)),
          <.tr(Style.notPrintable, <.td(
            <.button(^.key := "add", <.div("Nouvelle"), <.div("ligne"), ^.onClick --> props.modStateOption(t => Some(t.addNew())))
          ))
        )
      )
    }
    .build
}