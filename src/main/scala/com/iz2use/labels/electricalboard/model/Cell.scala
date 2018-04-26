package com.iz2use.labels.electricalboard.model

import java.util.UUID
import io.circe.generic.JsonCodec

@JsonCodec
case class Cell(id: UUID = UUID.randomUUID(), label1: String = "", label2: String = "", icon: String = "", span: Int = 1)
