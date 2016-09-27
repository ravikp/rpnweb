package org.tw.rpn

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by ravikupin on 27/9/16.
 */
@RestController
class HelloController {

  @RequestMapping(path = Array("/"))
  def index : String = "Greetings from Spring Boot!"

}
