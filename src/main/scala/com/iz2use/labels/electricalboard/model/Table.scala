package com.iz2use.labels.electricalboard.model

import java.util.UUID
import io.circe.generic.JsonCodec

@JsonCodec
case class Table(title: String = "Tableau", lines: Seq[Line] = Nil) {
  def update(line: Line) = {
    val id = line.id
    this.copy(lines = lines.map {
      case Line(`id`, _) => line
      case l             => l
    })
  }
  def addNew() = this.copy(lines = lines :+ Line())
}
