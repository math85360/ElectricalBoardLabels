package com.iz2use.labels.electricalboard.model

import java.util.UUID
import io.circe.generic.JsonCodec

@JsonCodec
case class Line(id: UUID = UUID.randomUUID(), cells: Seq[Cell] = Nil) {
  def update(cell: Cell) = {
    val id = cell.id
    this.copy(cells = cells.map {
      case c if c.id == id => cell
      case c               => c
    })
  }
  def addNew() = this.copy(cells = cells :+ Cell())
}
