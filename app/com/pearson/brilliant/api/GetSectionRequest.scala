package com.pearson.brilliant

import play.api.libs.json._

case class GetSectionRequest(
  id            : String,
  `content-fmt` : Option[String] = None,
  jsonp         : Option[String]        = None
) extends com.pearson.api.GetItem[GetSectionResponse] {

  `content-fmt` match {
    case Some("html") => {}
    case Some("json") => {}
    case Some("text") => {}
    case None => {}
    case _ => throw new Exception("Content format cannot be anything other than html, json, or text.")
  }

  val resource = "/sections/" + id
  def parse(data:String) = GetSectionResponse.parse(data)

// GET /sections/{Id} Get section from collection

// Parameters
// Parameter Value Description Data Type
// Id    ID of section to get  string
// content-fmt   Get the section content in the given format string
// jsonp   JSON callback wrapper name  string

}

object GetSectionRequest extends ((
  String,
  Option[String],
  Option[String]
) => GetSectionRequest) {
  
  implicit val r = Json.reads[GetSectionRequest]
  implicit val w = Json.writes[GetSectionRequest]

}
