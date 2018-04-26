package com.iz2use.labels.electricalboard

import scalacss.Defaults._

object Style extends StyleSheet.Inline {
  import dsl._

  val unsafeTop = style(
    unsafeRoot("BODY")(fontFamily := "'Gill Sans MT Condensed'", fontSize := "11pt"),
    unsafeRoot("INPUT, SELECT")(width(100.%%), boxSizing.borderBox, fontFamily.inherit, fontSize.inherit)
  )

  val table = style(borderCollapse.collapse)
  val column = style(width(1.76.cm))
  val line = style(media.print(height(2.cm)))
  val empty = style(height(1.cm))
  //val test = &.not
  val cell = style(border(1.px, solid, black), media.print(overflow.hidden, position.relative, verticalAlign.top, textAlign.left))
  val notPrintable = style(media.print(display.none))
  val printableOnly = style(media.not.print(display.none))
  val cellContent = style(display.flex, flexDirection.column,
    media.print(position.absolute, overflow.hidden, width(100.%%), height(100.%%), left(0.px), top(0.px)))
  val icon = style(media.print(flex := "1"), textAlign.center)
  val label = style(media.print(flex := "2"), textAlign.center, media.not.print(display.flex, flexDirection.row, justifyContent.spaceBetween))
  val title = style(marginBottom(1.cm), textAlign.center, fontWeight.bold)
}