package com.pearson.api

import com.pearson._

trait GetItem[Response<:PearsonResponse] extends com.pearson.PearsonRequest[Response] {

  val method = "get"

}
