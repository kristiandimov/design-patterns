package observer.pattern.example;

import java.util.ArrayList;
import java.util.List;

public class Part implements Observable {

	private List<Observer> buyer;
	private String part;

	public Part() {
		// TODO Auto-generated constructor stub
		this.buyer = new ArrayList<>();
	}

	@Override
	public void buyPart(Observer observer) {
		// TODO Auto-generated method stub
		this.buyer.add(observer);
		observer.setPart(this);

	}

	@Override
	public void sellPart(Observer observer) {
		// TODO Auto-generated method stub
		this.buyer.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : this.buyer) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		// TODO Auto-generated method stub
		return this.part;
	}

	public void setPart(String part) {
		this.part = part;
		this.notifyObservers();
	}

}
