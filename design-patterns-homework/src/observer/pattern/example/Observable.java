package observer.pattern.example;

public interface Observable {

	void buyPart(Observer observer);

	void sellPart(Observer observer);

	void notifyObservers();

	String getUpdate();

}
