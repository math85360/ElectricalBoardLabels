package com.iz2use.labels.electricalboard.components

import monocle.macros._
import com.iz2use.labels.electricalboard._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react.MonocleReact._
import japgolly.scalajs.react.extra.StateSnapshot
import scalacss.ScalaCssReact._
import io.circe._
import io.circe.parser._
import io.circe.syntax._
import org.scalajs.dom
import scala.concurrent.duration._

object Root {
  val key = "electricalboard-last"
  type State = model.Table

  class Backend($: BackendScope[Unit, State]) extends extra.TimerSupport {

    def render(s: State) = {
      <.div(
        <.input(Style.notPrintable, ^.value := s.title, ^.onChange ==> { (e: ReactEventFromInput) =>
          val text = e.target.value
          $.modState(v => v.copy(title = text))
        }),
        <.div(Style.printableOnly, Style.title, s.title),
        Table.component(StateSnapshot(s).setStateVia($))
      )
    }

    def save = $.state >>= { s =>
      Callback(dom.window.localStorage.setItem(key, s.asJson.toString()))
    }
  }

  val component = ScalaComponent.builder[Unit]("Root")
    .initialState[State](
      (for {
        last <- Option(dom.window.localStorage.getItem(key))
        json <- parse(last).toOption
        r <- json.as[model.Table].toOption
      } yield r).getOrElse(model.Table())
    )
    .renderBackend[Backend]
    .configure(extra.LogLifecycle.default)
    .componentDidMount(c => c.backend.setInterval(c.backend.save, 5.seconds))
    .configure(
      extra.TimerSupport.install,
      extra.EventListener[dom.raw.BeforeUnloadEvent].install("beforeunload", c => _ => c.backend.save, _ => dom.window)
    )
    .build

  //dom.window.onbeforeunload

  def apply() = component()
}