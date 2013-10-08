package controllers.brilliant

import play.api._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{Future,ExecutionContext}
import ExecutionContext.Implicits.global

object Authors extends Controller {

  def list = Action.async {

    com.pearson.brilliant.api.GetAuthors map {
      response =>

      response.map {
        list =>
        Ok(Json.toJson(list.authors))
      }.getOrElse {
        NotFound
      }
    }
  }
  
  def get(id:String) = Action.async {

    com.pearson.brilliant.api.GetAuthor(id) map {
      response =>

      response.map {
        one =>
        Ok(Json.toJson(one.author))
      }.getOrElse {
        NotFound
      }
    }
  }

}