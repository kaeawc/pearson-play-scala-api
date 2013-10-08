package com.pearson.brilliant

import play.api.libs.json._
import com.pearson.brilliant.models._

case class GetSectionsResponse(
  status   : Int,
  offset   : Int,
  limit    : Int,
  count    : Int,
  total    : Int,
  dataset  : String,
  url      : String,
  sections    : List[Section]
) extends com.pearson.PearsonResponse

object GetSectionsResponse extends ((
  Int,
  Int,
  Int,
  Int,
  Int,
  String,
  String,
  List[Section]
) => GetSectionsResponse) {
  
  implicit val r = Json.reads[GetSectionsResponse]
  implicit val w = Json.writes[GetSectionsResponse]

  def parse(data:String):Option[GetSectionsResponse] = {
    try {
      Some(Json.fromJson(Json.parse(data)).get)
    } catch {
      case e:Exception => None
    }
  }

}

// {
//   "status": 200,
//   "offset": 0,
//   "limit": 2,
//   "count": 2,
//   "total": 1747,
//   "dataset": "brilliant_sb",
//   "url": "https://api.pearson.com/pearson-education/brilliant/v1/sections?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh&limit=2",
//   "sections": [
//     {
//       "title": "In the beginning",
//       "id": "49gp8X0c0eJFcP",
//       "type": "section",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/sections/49gp8X0c0eJFcP?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//       "article": {
//         "title": "Preface",
//         "id": "49gnvqq5ff5BaT",
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/articles/49gnvqq5ff5BaT?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       },
//       "book": {
//         "title": "Brilliant Copywriting",
//         "id": "49gjNWACytS53a",
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/49gjNWACytS53a?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       }
//     },
//     {
//       "title": "About this book",
//       "id": "49gpM3tYG6AX6g",
//       "type": "section",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/sections/49gpM3tYG6AX6g?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//       "article": {
//         "title": "Preface",
//         "id": "49gnvqq5ff5BaT",
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/articles/49gnvqq5ff5BaT?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       },
//       "book": {
//         "title": "Brilliant Copywriting",
//         "id": "49gjNWACytS53a",
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/49gjNWACytS53a?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       }
//     }
//   ]
// }