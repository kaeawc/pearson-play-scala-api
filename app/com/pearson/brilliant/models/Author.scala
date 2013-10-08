package com.pearson.brilliant.models

import play.api.libs.json._

case class Author(
  full_name  : String,
  id         : Option[String],
  url        : Option[String],
  book_count : Option[Int],
  books      : Option[List[PartialBook]]
)

object Author extends ((
  String,
  Option[String],
  Option[String],
  Option[Int],
  Option[List[PartialBook]]
) => Author) {
  
  implicit val r = Json.reads[Author]
  implicit val w = Json.writes[Author]

}