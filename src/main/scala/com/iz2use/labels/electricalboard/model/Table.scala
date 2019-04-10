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
  def move(source: UUID, target: Option[UUID] = None): Table = {
    if (target.contains(source)) this
    else {
      def addTarget(cells: Seq[Cell], originCells: Seq[Cell], sourceCell: Option[Cell] = None): Seq[Cell] = target.fold(cells) { targetId =>
        val targetIdx = originCells.indexWhere(_.id == targetId)
        if (targetIdx == -1) cells
        else sourceCell.orElse {
          lines.flatMap { line =>
            line.cells.collectFirst {
              case c if c.id == source => c
            }
          }.headOption
        }.fold(cells)(source => cells.patch(targetIdx, Seq(source), 0))
      }
      val updated = lines.map { line =>
        val sourceIdx = line.cells.indexWhere(_.id == source)
        val (cells, sourceCell) =
          if (sourceIdx == -1) (line.cells, None)
          else (line.cells.patch(sourceIdx, Nil, 1), Some(line.cells(sourceIdx)))
        line.copy(cells = addTarget(cells, line.cells, sourceCell))
      }
      this.copy(lines = updated)
    }
  }
  def addNew() = this.copy(lines = lines :+ Line())
}
