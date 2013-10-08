package com.pearson.brilliant

import play.api.libs.json._
import com.pearson.brilliant.models._

case class GetArticleResponse(
  status   : Int,
  offset   : Int,
  limit    : Int,
  count    : Int,
  total    : Int,
  dataset  : String,
  url      : String,
  article  : Article
) extends com.pearson.PearsonResponse

object GetArticleResponse extends ((
  Int,
  Int,
  Int,
  Int,
  Int,
  String,
  String,
  Article
) => GetArticleResponse) {
  
  implicit val r = Json.reads[GetArticleResponse]
  implicit val w = Json.writes[GetArticleResponse]

  def parse(data:String):Option[GetArticleResponse] = {
    try {
      Some(Json.fromJson(Json.parse(data)).get)
    } catch {
      case e:Exception => None
    }
  }

}