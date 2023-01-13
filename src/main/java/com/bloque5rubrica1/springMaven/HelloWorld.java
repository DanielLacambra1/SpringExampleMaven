package com.bloque5rubrica1.springMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorld {
	   private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
}
