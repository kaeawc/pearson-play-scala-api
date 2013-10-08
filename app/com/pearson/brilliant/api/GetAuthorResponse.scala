package com.pearson.brilliant

import play.api.libs.json._
import com.pearson.brilliant.models._

case class GetAuthorResponse(
  status  : Int,
  dataset : String,
  url     : String,
  author  : Author
) extends com.pearson.PearsonResponse

object GetAuthorResponse extends ((
  Int,
  String,
  String,
  Author
) => GetAuthorResponse) {
  
  implicit val r = Json.reads[GetAuthorResponse]
  implicit val w = Json.writes[GetAuthorResponse]

  def parse(data:String):Option[GetAuthorResponse] = {
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
//   "limit": 25,
//   "count": 25,
//   "total": 37,
//   "dataset": "brilliant_sb",
//   "url": "https://api.pearson.com/pearson-education/brilliant/v1/authors?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//   "authors": [
//     {
//       "full_name": "Alex Blyth",
//       "id": "5n7eA0KaA3DZke",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/authors/5n7eA0KaA3DZke?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//       "book_count": 1,
//       "books": [
//         {
//           "title": "Brilliant Online Marketing",
//           "isbn": "9780273776352",
//           "publisher": {
//             "name": "Pearson Education Limited"
//           },
//           "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/5mjZnvewDfGybR?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//         }
//       ]
//     },
//     {
//       "full_name": "Angela Fagan",
//       "id": "4fRWAf8RK8zqd0",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/authors/4fRWAf8RK8zqd0?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//       "book_count": 1,
//       "books": [
//         {
//           "title": "Brilliant Job Hunting",
//           "isbn": "9780273744009",
//           "publisher": {
//             "name": "Pearson Education Limited"
//           },
//           "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/4eryJ653Njncqa?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//         }
//       ]
//     }
//   ]
// }