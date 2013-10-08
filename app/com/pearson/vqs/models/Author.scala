package com.pearson.vqs.models

import play.api.libs.json._

case class Author(
  full_name  : String
)

object Author extends ((
  String
) => Author) {
  
  implicit val r = Json.reads[Author]
  implicit val w = Json.writes[Author]

}
