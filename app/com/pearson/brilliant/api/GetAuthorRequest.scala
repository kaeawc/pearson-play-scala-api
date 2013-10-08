package com.pearson.brilliant

import play.api.libs.json._

case class GetAuthorRequest(
  id         : String,
  jsonp      : Option[String] = None
) extends com.pearson.api.GetItem[GetAuthorResponse] {

  val resource = "/author/" + id
  def parse(data:String) = GetAuthorResponse.parse(data)
  
// GET /articles/{Id} Get article from collection

// Parameter Value Description Data Type
// Id    ID of author to get string
// jsonp   JSON callback wrapper name  string

}


object GetAuthorRequest extends ((
  String,
  Option[String]
) => GetAuthorRequest) {
  
  implicit val r = Json.reads[GetAuthorRequest]
  implicit val w = Json.writes[GetAuthorRequest]

}


