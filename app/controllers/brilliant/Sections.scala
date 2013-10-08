package controllers.brilliant

import play.api._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{Future,ExecutionContext}
import ExecutionContext.Implicits.global

object Sections extends Controller {

  def list = Action.async {

    com.pearson.brilliant.api.GetSections map {
      response =>

      response.map {
        list =>
        Ok(Json.toJson(list.sections))
      }.getOrElse {
        NotFound
      }
    }
  }
  
  def get(id:String) = Action.async {

    com.pearson.brilliant.api.GetSection(id) map {
      response =>

      response.map {
        one =>
        Ok(Json.toJson(one.section))
      }.getOrElse {
        NotFound
      }
    }
  }

}