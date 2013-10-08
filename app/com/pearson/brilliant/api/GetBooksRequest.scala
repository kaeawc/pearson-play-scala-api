package com.pearson.brilliant

import play.api.libs.json._

case class GetBooksRequest(
  title  : Option[String] = None,
  offset : Option[Int] = None,
  limit  : Option[Int] = None,
  jsonp  : Option[String] = None
) extends com.pearson.api.GetItem[GetBooksResponse] {

  val resource = "/books"
  def parse(data:String) = GetBooksResponse.parse(data)
  
//GET /books List books available in collection

// Value Description Data Type
// title   Search for books with matching title in their title string
// offset    Zero based index of where to start in the collection  int
// limit   Set the limit of the number of items returned in the collection int
// jsonp   JSON callback wrapper name  string

}


object GetBooksRequest extends ((
  Option[String],
  Option[Int],
  Option[Int],
  Option[String]
) => GetBooksRequest) {
  
  implicit val r = Json.reads[GetBooksRequest]
  implicit val w = Json.writes[GetBooksRequest]

}