package com.iz2use.labels.electricalboard.model

sealed abstract class Icon(val label: String)
object Icon {
  case object heater extends Icon("convecteur")
  case object boiler extends Icon("CE")
  case object light extends Icon("Lumière")
  case object hotplate extends Icon("Cuisson")
  case object power extends Icon("PC")
  case object rollerBlind extends Icon("VR")

  val list = Seq(heater, boiler, light, hotplate, power, rollerBlind)
}