package test.brilliant

import org.specs2.mutable.Specification
import org.specs2.mock.Mockito
import scala.concurrent.{Future,ExecutionContext,Await}
import ExecutionContext.Implicits.global
import scala.concurrent.duration._

class GetBookSpec
  extends Specification {

  "" should {
    "expire the given user" in {

      val request = com.pearson.brilliant.api.GetBook("asdf")

      val result = Await.result(request, Duration(1000, MILLISECONDS))

      result must beSome
    }
  }
}
