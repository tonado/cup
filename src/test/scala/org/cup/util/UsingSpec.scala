package org.cup.util

import org.cup.collection.immutable.ListWrapper
import org.scalatest.Matchers._
import org.scalatest._

import scala.io.Source

class UsingSpec extends FunSpec {
  describe("using") {
    it("should install JDK") {
      using(Source.fromFile(System.getProperty("user.dir") + "/README.md")) { file =>
        file.getLines.exists(_.contains("JAVA_HOME")) should be(true)
      }
    }
  }
}
