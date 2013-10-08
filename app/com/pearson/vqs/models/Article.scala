package com.pearson.vqs.models

import play.api.libs.json._

case class Article(
  title    : String,
  id       : String,
  url      : String
)

object Article extends ((
  String,
  String,
  String
) => Article) {
  
  implicit val r = Json.reads[Article]
  implicit val w = Json.writes[Article]

}
