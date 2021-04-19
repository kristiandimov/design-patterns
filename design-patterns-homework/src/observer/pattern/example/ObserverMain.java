package observer.pattern.example;

public class ObserverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Part part = new Part();

		Observer obs1 = new PartBuyer("Buyer 1");
		Observer obs2 = new PartBuyer("Buyer 2");
		Observer obs3 = new PartBuyer("Buyer 3");

		part.buyPart(obs1);
		part.buyPart(obs2);
		part.buyPart(obs3);

		part.setPart(" Cluch ");
		part.setPart(" Engine ");
	}

}
