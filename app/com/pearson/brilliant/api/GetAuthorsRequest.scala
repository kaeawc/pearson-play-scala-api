package com.pearson.brilliant

import play.api.libs.json._

case class GetAuthorsRequest(
  name   : Option[String] = None,
  offset : Option[Int] = None,
  limit  : Option[Int] = None,
  jsonp  : Option[String] = None
) extends com.pearson.api.GetItem[GetAuthorsResponse] {

  val resource = "/authors"
  def parse(data:String) = GetAuthorsResponse.parse(data)
  
// GET /authors List authors available in collection

// Parameter Value Description Data Type
// name    Search for authors with matching text in their name string
// offset    Zero based index of where to start in the collection  int
// limit   Set the limit of the number of items returned in the collection int
// jsonp   JSON callback wrapper name  string

}


object GetAuthorsRequest extends ((
  Option[String],
  Option[Int],
  Option[Int],
  Option[String]
) => GetAuthorsRequest) {
  
  implicit val r = Json.reads[GetAuthorsRequest]
  implicit val w = Json.writes[GetAuthorsRequest]

}
