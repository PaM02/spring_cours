package comopenclassroom.helloworld.service;

import org.springframework.stereotype.Component;

import comopenclassroom.helloworld.model.HelloWorld;


@Component
public class BusinessService {
	
	public HelloWorld getHelloWorld() {
		
		HelloWorld helloworld = new HelloWorld();
		
		return helloworld;
	}

}
