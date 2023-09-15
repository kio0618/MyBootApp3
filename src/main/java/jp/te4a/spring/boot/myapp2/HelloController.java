package jp.te4a.spring.boot.myapp2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* Hello world!
*
*/
   @RestController
    public class HelloController
{
      @RequestMapping("/taro")
      public String index() {
           return "Taro desu!";
     }
}
