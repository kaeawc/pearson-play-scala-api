package controllers.brilliant

import play.api._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{Future,ExecutionContext}
import ExecutionContext.Implicits.global

object Books extends Controller {

  def list = Action.async {

    com.pearson.brilliant.api.GetBooks map {
      response =>

      response.map {
        list =>
        Ok(Json.toJson(list.books))
      }.getOrElse {
        NotFound
      }
    }
  }
  
  def get(id:String) = Action.async {

    com.pearson.brilliant.api.GetBook(id) map {
      response =>

      response.map {
        one =>
        Ok(Json.toJson(one.book))
      }.getOrElse {
        NotFound
      }
    }
  }

}
