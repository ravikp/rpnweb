package org.tw.rpn

/**
 * Created by ravikupin on 27/9/16.
 */

import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RpnCalculator extends CommandLineRunner {
  override def run(args: String*): Unit = {
    println("Hello from Command line runner!")
  }
}

object MainRpnCalculator {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[RpnCalculator]);
  }
}
