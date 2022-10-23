package comopenclassroom.helloworld.model;

public class HelloWorld {
	private String valeur = "Hello world";

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {

		return valeur;
	}
}
