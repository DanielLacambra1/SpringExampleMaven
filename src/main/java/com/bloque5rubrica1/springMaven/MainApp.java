package com.bloque5rubrica1.springMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainApp {

	@GetMapping("/")
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      
	      HelloWorld objHello = (HelloWorld) context.getBean("helloWorld");
	      objHello.getMessage();
	      
	      GoodByeWorld objGoodBye = (GoodByeWorld) context.getBean("goodByeWorld");
	      objGoodBye.getMessage();
	      
	}
}
