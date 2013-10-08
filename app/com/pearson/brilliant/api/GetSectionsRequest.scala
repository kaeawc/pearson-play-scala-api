package com.pearson.brilliant

import play.api.libs.json._

case class GetSectionsRequest(
  title   : Option[String] = None,
  content : Option[String] = None,
  offset  : Option[Int] = None,
  limit   : Option[Int] = None,
  jsonp   : Option[String] = None
) extends com.pearson.api.GetItem[GetSectionsResponse] {

  val resource = "/sections"
  def parse(data:String) = GetSectionsResponse.parse(data)
  
// GET /sections Get section from collection

// Parameter Value Description Data Type
// title   Search for sections with matching text in their title string
// content   Search for sections with matching text in their content string
// offset    Zero based index of where to start in the collection  int
// limit   Set the limit of the number of items returned in the collection int
// jsonp   JSON callback wrapper name  string

}


object GetSectionsRequest extends ((
  Option[String],
  Option[String],
  Option[Int],
  Option[Int],
  Option[String]
) => GetSectionsRequest) {
  
  implicit val r = Json.reads[GetSectionsRequest]
  implicit val w = Json.writes[GetSectionsRequest]

}
