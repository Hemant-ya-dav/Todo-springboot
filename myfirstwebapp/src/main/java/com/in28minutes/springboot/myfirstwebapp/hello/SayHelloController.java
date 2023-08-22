package com.in28minutes.springboot.myfirstwebapp.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {
  //Say-hello => "Hello! what are you learning today?"
  // http://localhost:8080/Say-hello
	
	@RequestMapping("Say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! what are you learning today?";
	}
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	@RequestMapping("Say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
