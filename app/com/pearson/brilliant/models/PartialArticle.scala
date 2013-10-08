package com.pearson.brilliant.models

import play.api.libs.json._

case class PartialArticle(
  title    : String,
  id       : String,
  url      : String
)

object PartialArticle extends ((
  String,
  String,
  String
) => PartialArticle) {
  
  implicit val r = Json.reads[PartialArticle]
  implicit val w = Json.writes[PartialArticle]

}