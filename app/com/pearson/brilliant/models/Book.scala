package com.pearson.brilliant.models

import play.api.libs.json._

case class Book(
  title         : String,
  id            : String,
  isbn          : String,
  url           : String,
  authors       : List[Author],
  publisher     : Publisher,
  articles      : Option[List[Article]],
  article_count : Option[Int]
)

object Book extends ((
  String,
  String,
  String,
  String,
  List[Author],
  Publisher,
  Option[List[Article]],
  Option[Int]
) => Book) {
  
  implicit val r = Json.reads[Book]
  implicit val w = Json.writes[Book]

}
