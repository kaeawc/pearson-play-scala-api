package com.pearson.brilliant

import play.api.libs.json._

case class GetBookRequest(
  id     : String,
  jsonp  : Option[String] = None
) extends com.pearson.api.GetItem[GetBookResponse] {

  val resource = "/books/" + id
  def parse(data:String) = GetBookResponse.parse(data)

// GET /books/{Id} Get book from collection

// Value Description Data Type Type
// Id    ID of book to get string
// jsonp   JSON callback wrapper name  string

}

object GetBookRequest extends ((
  String,
  Option[String]
) => GetBookRequest) {
  
  implicit val r = Json.reads[GetBookRequest]
  implicit val w = Json.writes[GetBookRequest]

}
