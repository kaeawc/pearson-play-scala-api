package com.pearson.brilliant

import play.api.libs.json._
import com.pearson.brilliant.models._

case class GetBookResponse(
  status  : Int,
  dataset : String,
  url     : String,
  book    : Book
) extends com.pearson.PearsonResponse

object GetBookResponse extends ((
  Int,
  String,
  String,
  Book
) => GetBookResponse) {
  
  implicit val r = Json.reads[GetBookResponse]
  implicit val w = Json.writes[GetBookResponse]

  def parse(data:String):Option[GetBookResponse] = {
    try {
      Some(Json.fromJson(Json.parse(data)).get)
    } catch {
      case e:Exception => None
    }
  }
}
