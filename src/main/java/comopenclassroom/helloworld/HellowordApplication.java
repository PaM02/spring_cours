package comopenclassroom.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import comopenclassroom.helloworld.model.HelloWorld;
import comopenclassroom.helloworld.service.BusinessService;

@SpringBootApplication
public class HellowordApplication  implements CommandLineRunner  {
	
	@Autowired
	private BusinessService businessService ;

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
	}
	
    @Override
    public void run(String... args) throws Exception {
       
    	HelloWorld helloworld = businessService.getHelloWorld();
    	
    	System.out.println(helloworld);

    	
    }


}
