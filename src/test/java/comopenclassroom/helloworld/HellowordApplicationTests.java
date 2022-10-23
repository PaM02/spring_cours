package comopenclassroom.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import comopenclassroom.helloworld.service.BusinessService;

@SpringBootTest
class HellowordApplicationTests {

	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld() {

		String expected = "Hello World!";

		String result = bs.getHelloWorld().getvalue();
		assertEquals(expected, result);
	}

}
