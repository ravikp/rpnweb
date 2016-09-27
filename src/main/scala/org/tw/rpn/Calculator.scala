package org.tw.rpn

import scala.collection.mutable.Stack

/**
 * Created by ravikupin on 27/9/16.
 */
case class Calculator(formule: String) {
  lazy val evaluate: Double = {
    val stack = formule.split(" ").foldLeft(new Stack[Double]())((acc, token) => {

      if (!isOperator(token))
        acc.push(token.toDouble)
      else {
        val x:Double = acc.pop()
        acc.push(x + acc.pop())
      }
      acc
    })

    stack.pop

  }

  def isOperator(token: String): Boolean = {
    token == "+"
  }
}
