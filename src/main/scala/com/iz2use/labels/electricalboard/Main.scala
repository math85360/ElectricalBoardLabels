package com.iz2use.labels.electricalboard

import scalatags.JsDom.all._
import org.scalajs.dom.document
import scalacss.Defaults._

object Main {
  def main(args: Array[String]): Unit = {
    val appNode = div(id := "app").render
    document.head.appendChild(Style.render)
    document.body.appendChild(appNode)
    components.Root().renderIntoDOM(appNode)
  }
}