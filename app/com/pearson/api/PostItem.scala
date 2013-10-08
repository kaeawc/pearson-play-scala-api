package com.pearson.api

import com.pearson._

trait PostItem[Response<:PearsonResponse] extends com.pearson.PearsonRequest[Response] {

  val method = "post"

}
