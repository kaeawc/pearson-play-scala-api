package com.pearson.brilliant.models

import play.api.libs.json._

case class PartialSection(
  title   : String,
  id      : Option[String],
  `type`  : Option[String],
  url     : Option[String],
  article : Option[PartialArticle],
  book    : Option[PartialBook]
)

object PartialSection extends ((
  String,
  Option[String],
  Option[String],
  Option[String],
  Option[PartialArticle],
  Option[PartialBook]
) => PartialSection) {
  
  implicit val r = Json.reads[PartialSection]
  implicit val w = Json.writes[PartialSection]

}