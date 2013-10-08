package com.pearson.brilliant.models

import play.api.libs.json._

case class Article(
  title    : String,
  id       : String,
  url      : String,
  sections : Option[List[Section]],
  book     : PartialBook
)

object Article extends ((
  String,
  String,
  String,
  Option[List[Section]],
  PartialBook
) => Article) {
  
  implicit val r = Json.reads[Article]
  implicit val w = Json.writes[Article]

}


//       "title": "Cover page: Brilliant Copywriting",
//       "id": "49gkKQ9wEMpBjw",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/articles/49gkKQ9wEMpBjw?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//       "sections": [],
//       "book": {
//         "title": "Brilliant Copywriting",
//         "id": "49gjNWACytS53a",
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/49gjNWACytS53a?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       }