package com.bloque5rubrica1.springMaven;

import org.springframework.stereotype.Controller;

@Controller
public class GoodByeWorld {
	private String message;

	public void setMessage(String message){
		this.message  = message;
	}
	   
	public void getMessage(){
		System.out.println("Your Message : " + message);
	}
}
