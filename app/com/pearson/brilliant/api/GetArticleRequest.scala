package com.pearson.brilliant

import play.api.libs.json._

case class GetArticleRequest(
  id            : String,
  `content-fmt` : Option[String] = None,
  jsonp         : Option[String] = None
) extends com.pearson.api.GetItem[GetArticleResponse] {

  `content-fmt` match {
    case Some("html") => {}
    case Some("json") => {}
    case Some("text") => {}
    case None => {}
    case _ => throw new Exception("Content format cannot be anything other than html, json, or text.")
  }

  val resource = "/article/" + id
  def parse(data:String) = GetArticleResponse.parse(data)
  
// GET /articles/{Id} Get article from collection

// Parameter Value Description Data Type
// Id    ID of article to get  string
// content-fmt   Get the article content in the given format string
// jsonp   JSON callback wrapper name  string

}


object GetArticleRequest extends ((
  String,
  Option[String],
  Option[String]
) => GetArticleRequest) {
  
  implicit val r = Json.reads[GetArticleRequest]
  implicit val w = Json.writes[GetArticleRequest]

}
