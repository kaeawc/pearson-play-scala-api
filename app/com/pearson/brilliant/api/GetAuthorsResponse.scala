package com.pearson.brilliant

import play.api.libs.json._
import com.pearson.brilliant.models._

case class GetAuthorsResponse(
  status  : Int,
  offset  : Int,
  limit   : Int,
  count   : Int,
  total   : Int,
  dataset : String,
  url     : String,
  authors : List[Author]
) extends com.pearson.PearsonResponse

object GetAuthorsResponse extends ((
  Int,
  Int,
  Int,
  Int,
  Int,
  String,
  String,
  List[Author]
) => GetAuthorsResponse) {
  
  implicit val r = Json.reads[GetAuthorsResponse]
  implicit val w = Json.writes[GetAuthorsResponse]

  def parse(data:String):Option[GetAuthorsResponse] = {
    try {
      Some(Json.fromJson(Json.parse(data)).get)
    } catch {
      case e:Exception => None
    }
  }

}

// {
//   "status": 200,
//   "dataset": "brilliant_sb",
//   "url": "https://api.pearson.com/pearson-education/brilliant/v1/authors/4yN8BtsZDvh0Zp?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//   "author": {
//     "id": "4yN8BtsZDvh0Zp",
//     "full_name": "Richard Hall",
//     "url": "https://api.pearson.com/pearson-education/brilliant/v1/authors/4yN8BtsZDvh0Zp?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//     "book_count": 1,
//     "books": [
//       {
//         "title": "Brilliant Business Creativity",
//         "isbn": "9780273745105",
//         "publisher": {
//           "name": "Pearson Education Limited"
//         },
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/4xr71NGzE8v0Jm?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       }
//     ]
//   }
// }