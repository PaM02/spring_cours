package comopenclassroom.helloworld.model;

public class HelloWorld {
	private String value = "Hello World!";

	public String getvalue() {
		return value;
	}

	public void setvalue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {

		return value;
	}
}
