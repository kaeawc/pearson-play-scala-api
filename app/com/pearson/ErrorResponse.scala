package com.pearson

import play.api.libs.json._

case class ErrorResponse(
  status   : Int,
  url      : String,
  message  : String

) extends com.pearson.PearsonResponse {

}

object ErrorResponse extends ((
  Int,
  String,
  String
) => ErrorResponse) {
  
  implicit val r = Json.reads[ErrorResponse]
  implicit val w = Json.writes[ErrorResponse]

  def parse(data:String):Option[ErrorResponse] = {
    try {
      Some(Json.fromJson(Json.parse(data)).get)
    } catch {
      case e:Exception => None
    }
  }

}