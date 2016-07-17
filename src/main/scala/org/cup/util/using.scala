package org.cup.util

import scala.language.reflectiveCalls

object using {
  def apply[R <: { def close(): Unit }, T](resource: => R)(f: R => T): T = {
    var res: Option[R] = None
    try {
      res = Some(resource)
      f(res.get)
    } finally {
      if (res != None)
        res.get.close
    }
  }
}
