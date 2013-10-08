package com.pearson.vqs.models

import play.api.libs.json._

case class Publisher(
  name : String
)

object Publisher extends ((
  String
) => Publisher) {
  
  implicit val r = Json.reads[Publisher]
  implicit val w = Json.writes[Publisher]

}
