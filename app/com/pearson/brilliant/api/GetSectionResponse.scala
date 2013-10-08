package com.pearson.brilliant

import play.api.libs.json._
import com.pearson.brilliant.models._

case class GetSectionResponse(
  status  : Int,
  dataset : String,
  url     : String,
  section : Section
) extends com.pearson.PearsonResponse

object GetSectionResponse extends ((
  Int,
  String,
  String,
  Section
) => GetSectionResponse) {
  
  implicit val r = Json.reads[GetSectionResponse]
  implicit val w = Json.writes[GetSectionResponse]

  def parse(data:String):Option[GetSectionResponse] = {
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
//   "url": "https://api.pearson.com/pearson-education/brilliant/v1/sections/49gp8X0c0eJFcP?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh",
//   "section": {
//     "title": "In the beginning",
//     "id": "49gp8X0c0eJFcP",
//     "type": "section",
//     "content": [
//       {
//         "h3": [
//           {
//             "text": "In the beginning"
//           }
//         ]
//       },
//       {
//         "p": [
//           {
//             "text": "In the late 1890s a Canadian Mountie named John E. Kennedy hung up his hat, handed in his gun and did what any rock-jawed law enforcement operative would do in similar circumstances – he got into advertising. Not just any advertising, mind. Kennedy was concerned with copy. The advertising agencies of his day employed plenty of people called copywriters, but their craft was far from fully defined. Kennedy had thought long and hard about how words could be made to work harder. He realised the burgeoning advertising industry was missing a trick and that he was the man to put things right. So that’s exactly what he set out to do."
//           }
//         ]
//       },
//       {
//         "p": [
//           {
//             "text": "Fast-forward a few years to a May evening in 1904. Kennedy is seated in a Chicago saloon. He scribbles a brief note to the directors of an advertising agency that occupied the upper floors of the building. According to legend the note read:"
//           }
//         ]
//       },
//       {
//         "p": [
//           {
//             "span": [
//               {
//                 "text": "I am in the saloon downstairs. I can tell you what advertising is. I know you don’t know. It will mean much to me to have you know what it is and it will mean much to you. If you wish to know what advertising is, send the word ‘yes’ down by the bell boy."
//               }
//             ]
//           }
//         ]
//       },
//       {
//         "p": [
//           {
//             "text": "Somehow the note made it to Albert Lasker, one of the agency’s junior partners. Lasker was getting ready to go home for the evening but was sufficiently intrigued by its chutzpah to invite the impudent Kennedy upstairs for a chat. Most people would "
//           },
//           {
//             "text": "have written Kennedy off as an over-refreshed punter and asked security to have a quiet word. Not Lasker. To his credit (and indeed immense enrichment) he saw something in Kennedy’s scrawl worthy of investigation, and by the time the two of them parted in the early hours of the next day nothing in copywriting would be the same again."
//           }
//         ]
//       },
//       {
//         "img": [
//           {
//             "src": "images/9780273742227/f0xii-01.png",
//             "alt": "Cartoon"
//           }
//         ]
//       },
//       {
//         "p": [
//           {
//             "text": "During that meeting Kennedy revealed to Lasker his big insight – that copywriting is ‘salesmanship in print’. Nothing more, nothing less. He complained that adverts didn’t need to be ‘charming or amusing or necessarily pleasing to the eye’ but instead they should be a ‘rational, unadorned instrument of selling’. The copy should talk neither down nor up to its reader; instead it should address them in a way that left them ‘open to appeals made by sensible arguments’."
//           }
//         ]
//       },
//       {
//         "p": [
//           {
//             "text": "All of this sounds eminently sensible until you start to dig a little deeper. Kennedy’s hard-headed ‘salesmanship in print’ is a great start, but it’s only half the story. Take this approach too far and pretty soon copywriting becomes cold and unconvincing. People rarely buy for wholly rational reasons, and in many cases copywriting that is ‘charming or amusing’ "
//           },
//           {
//             "span": [
//               {
//                 "text": "can"
//               }
//             ]
//           },
//           {
//             "text": " outperform its rational relation. Not that you’d know it from the lacklustre copy put before today’s long-suffering public. The sad fact is that although selling and salesmanship derive much of their power from brilliant copywriting, most copywriting is far from brilliant. In fact most of it doesn’t really work. Why? Because no one reads it. Why? Because it’s boring. Or bad. Or just plain irrelevant."
//           }
//         ]
//       },
//       {
//         "p": [
//           {
//             "text": "Sorry, but it’s true."
//           }
//         ]
//       },
//       {
//         "p": [
//           {
//             "text": "Most copy isn’t written with the reader in mind. It doesn’t answer their questions, speak their language or tickle their fancy. And copy that isn’t written for its reader is almost certainly destined to fail."
//           }
//         ]
//       },
//       {
//         "p": [
//           {
//             "text": "Trying to browbeat your audience into submission through a toxic mix of dull writing and endless repetition is a desperate, wasteful strategy. The answer is to "
//           },
//           {
//             "span": [
//               {
//                 "text": "Make It Interesting"
//               }
//             ]
//           },
//           {
//             "text": ", my highly presumptuous update to Kennedy’s three-word formula for success. If this book has one main message it’s that brilliant copywriting almost always appeals to its readers for reasons other than pure reason – in other words Kennedy’s rationalist ‘reasons to believe’ approach must be tempered with whatever it takes to capture the reader’s imagination, and that usually means introducing something softer, more emotional, and above all "
//           },
//           {
//             "span": [
//               {
//                 "text": "interesting"
//               }
//             ]
//           },
//           {
//             "text": "."
//           }
//         ]
//       }
//     ],
//     "article": {
//       "title": "Preface",
//       "id": "49gnvqq5ff5BaT",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/articles/49gnvqq5ff5BaT?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//     },
//     "book": {
//       "title": "Brilliant Copywriting",
//       "id": "49gjNWACytS53a",
//       "url": "https://api.pearson.com/pearson-education/brilliant/v1/books/49gjNWACytS53a?apikey=W4WuxV3dQe8O9qVihyqELXWGtw7b0mEh"
//     }
//   }
// }