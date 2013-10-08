package com.pearson.brilliant

import play.api.libs.json._
import com.pearson.brilliant.models._

case class GetArticlesResponse(
  status   : Int,
  offset   : Int,
  limit    : Int,
  count    : Int,
  total    : Int,
  dataset  : String,
  url      : String,
  articles : List[Article]
) extends com.pearson.PearsonResponse

object GetArticlesResponse extends ((
  Int,
  Int,
  Int,
  Int,
  Int,
  String,
  String,
  List[Article]
) => GetArticlesResponse) {
  
  implicit val r = Json.reads[GetArticlesResponse]
  implicit val w = Json.writes[GetArticlesResponse]

  def parse(data:String):Option[GetArticlesResponse] = {
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
//   "total": 538,
//   "dataset": "brilliant_sb",
//   "url": "https://api.pearson.com/pearson-education/brilliant/v1/articles?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh&limit=2",
//   "articles": [
//     {
//       "title": "Cover page: Brilliant Copywriting",
//       "id": "49gkKQ9wEMpBjw",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/articles/49gkKQ9wEMpBjw?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//       "sections": [],
//       "book": {
//         "title": "Brilliant Copywriting",
//         "id": "49gjNWACytS53a",
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/49gjNWACytS53a?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       }
//     },
//     {
//       "title": "Title page: Brilliant Copywriting",
//       "id": "49gkysY75907eA",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/articles/49gkysY75907eA?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//       "sections": [],
//       "book": {
//         "title": "Brilliant Copywriting",
//         "id": "49gjNWACytS53a",
//         "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/49gjNWACytS53a?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//       }
//     }
//   ]
// }