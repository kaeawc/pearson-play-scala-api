package com.pearson.brilliant
import scala.concurrent.{Future,ExecutionContext}
import ExecutionContext.Implicits.global

package object api {
  def GetBook(id:String):Future[Option[GetBookResponse]] =
    GetBookRequest(id).execute
  def GetBooks:Future[Option[GetBooksResponse]] =
    GetBooksRequest().execute
  def GetArticle(id:String):Future[Option[GetArticleResponse]] =
    GetArticleRequest(id).execute
  def GetArticles:Future[Option[GetArticlesResponse]] =
    GetArticlesRequest().execute
  def GetAuthor(id:String):Future[Option[GetAuthorResponse]] =
    GetAuthorRequest(id).execute
  def GetAuthors:Future[Option[GetAuthorsResponse]] =
    GetAuthorsRequest().execute
  def GetSection(id:String):Future[Option[GetSectionResponse]] =
    GetSectionRequest(id).execute
  def GetSections:Future[Option[GetSectionsResponse]] =
    GetSectionsRequest().execute
}