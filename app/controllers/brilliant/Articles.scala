package controllers.brilliant

import play.api._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{Future,ExecutionContext}
import ExecutionContext.Implicits.global

object Articles extends Controller {

  def list = Action.async {

    com.pearson.brilliant.api.GetArticles map {
      response =>

      response.map {
        list =>
        Ok(Json.toJson(list.articles))
      }.getOrElse {
        NotFound
      }
    }
  }
  
  def get(id:String) = Action.async {

    com.pearson.brilliant.api.GetArticle(id) map {
      response =>

      response.map {
        one =>
        Ok(Json.toJson(one.article))
      }.getOrElse {
        NotFound
      }
    }
  }

}