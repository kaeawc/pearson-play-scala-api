package com.pearson.brilliant

import play.api.libs.json._

case class GetArticlesRequest(
  title   : Option[String] = None,
  content : Option[String] = None,
  offset  : Option[Int] = None,
  limit   : Option[Int] = None,
  jsonp   : Option[String] = None
) extends com.pearson.api.GetItem[GetArticlesResponse] {

  val resource = "/articles"
  def parse(data:String) = GetArticlesResponse.parse(data)
  
// GET /articles List articles available in collection

// Parameter Value Description Data Type
// title   Search for articles with matching text in their title string
// content   Search for articles with matching text in their content string
// offset    Zero based index of where to start in the collection  int
// limit   Set the limit of the number of items returned in the collection int
// jsonp   JSON callback wrapper name  string
}


object GetArticlesRequest extends ((
  Option[String],
  Option[String],
  Option[Int],
  Option[Int],
  Option[String]
) => GetArticlesRequest) {
  
  implicit val r = Json.reads[GetArticlesRequest]
  implicit val w = Json.writes[GetArticlesRequest]

}
