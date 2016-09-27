package org.tw.rpn

import org.scalatest.{FunSpec, Matchers}

/**
 * Created by ravikupin on 27/9/16.
 */

class ReversePolishNotationTest extends FunSpec with Matchers{
  describe("RPN Calculator") {
    it("should evaluate two operands with '+' operator"){
      Calculator("2 3 +").evaluate should equal(25)
    }
  }
}
