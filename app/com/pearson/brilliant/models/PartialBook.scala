package com.pearson.brilliant.models

import play.api.libs.json._

case class PartialBook(
  title         : String,
  url           : String,
  id            : Option[String],
  isbn          : Option[String]
)

object PartialBook extends ((
  String,
  String,
  Option[String],
  Option[String]
) => PartialBook) {
  
  implicit val r = Json.reads[PartialBook]
  implicit val w = Json.writes[PartialBook]

}
