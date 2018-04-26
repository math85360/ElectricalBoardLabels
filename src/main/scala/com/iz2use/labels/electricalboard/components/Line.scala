package com.iz2use.labels.electricalboard.components

import com.iz2use.labels.electricalboard._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.extra.StateSnapshot
import scalacss.ScalaCssReact._

object Line {
  val component = ScalaComponent.builder[StateSnapshot[model.Line]]("Line")
    .render_P { props =>
      <.tr(
        Style.line,
        props.value.cells.toVdomArray { cell =>
          Cell.component.withKey(cell.id.toString)(
            StateSnapshot(cell)((ov, cb) =>
              props.modStateOption(t =>
                Some(t.update(ov.get)), cb))
          )
        },
        <.td(
          Style.notPrintable,
          <.button(^.key := "add", "+", ^.onClick --> props.modStateOption(t => Some(t.addNew())))
        )
      )
    }
    .build
}