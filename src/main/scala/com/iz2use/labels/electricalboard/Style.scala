package com.iz2use.labels.electricalboard

import scalacss.Defaults._

object Style extends StyleSheet.Inline {
  import dsl._

  val unsafeTop = style(
    unsafeRoot("BODY")(fontFamily := "'Gill Sans MT Condensed'", fontSize := "11pt"),
    unsafeRoot("INPUT, SELECT")(width(100.%%), boxSizing.borderBox, fontFamily.inherit, fontSize.inherit, border.`0`, borderBottom(1.px, dotted, lightgray)),
    unsafeRoot("TD")(border(.25.pt, solid, transparent)),
    unsafeRoot("BUTTON")(border.`0`, backgroundColor.transparent)
  )

  val table = style(borderCollapse.collapse)
  val column = style(width(1.76.cm))
  val line = style(media.print(height(2.cm)))
  val empty = style(height(1.cm))
  //val test = &.not
  val cell = style(border(.25.pt, solid, gray), media.print(overflow.hidden, position.relative, verticalAlign.top, textAlign.left))
  val notPrintable = style(media.print(display.none))
  val printableOnly = style(media.not.print(display.none))
  val cellContent = style(display.flex, flexDirection.column,
    media.print(position.absolute, overflow.hidden, width(100.%%), height(100.%%), left(0.px), top(0.px)))
  val icon = style(media.print(flex := "1"), textAlign.center, unsafeExt(_ + ">*")(height(28.px), 
      /*, filter := "drop-shadow(1px 1px 1px
  gray)"*/),
  marginTop(4.px))
  val label = style(media.print(flex := "2"), textAlign.center, media.not.print(display.flex, flexDirection.row, justifyContent.spaceBetween))
  val title = style(marginBottom(1.cm), textAlign.center, fontWeight.bold)
}