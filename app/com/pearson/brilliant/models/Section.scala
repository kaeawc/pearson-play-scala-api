package com.pearson.brilliant.models

import play.api.libs.json._

case class Section(
  title   : String,
  id      : Option[String],
  `type`  : Option[String],
  content : Option[JsArray]
)

object Section extends ((
  String,
  Option[String],
  Option[String],
  Option[JsArray]
) => Section) {
  
  implicit val r = Json.reads[Section]
  implicit val w = Json.writes[Section]

}



//       "title": "In the beginning",
//       "id": "49gp8X0c0eJFcP",
//       "type": "section",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/sections/49gp8X0c0eJFcP?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//       "article": {
//         "title": "Preface",
//         "id": "49gnvqq5ff5BaT",
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/articles/49gnvqq5ff5BaT?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       },
//       "book": {
//         "title": "Brilliant Copywriting",
//         "id": "49gjNWACytS53a",
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/49gjNWACytS53a?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       }