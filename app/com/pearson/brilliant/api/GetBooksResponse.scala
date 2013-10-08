package com.pearson.brilliant

import play.api.libs.json._
import com.pearson.brilliant.models._

case class GetBooksResponse(
  status   : Int,
  offset   : Int,
  limit    : Int,
  count    : Int,
  total    : Int,
  dataset  : String,
  url      : String,
  books    : List[Book]
) extends com.pearson.PearsonResponse

object GetBooksResponse extends ((
  Int,
  Int,
  Int,
  Int,
  Int,
  String,
  String,
  List[Book]
) => GetBooksResponse) {
  
  implicit val r = Json.reads[GetBooksResponse]
  implicit val w = Json.writes[GetBooksResponse]

  def parse(data:String):Option[GetBooksResponse] = {
    try {
      Some(Json.fromJson(Json.parse(data)).get)
    } catch {
      case e:Exception => None
    }
  }

}