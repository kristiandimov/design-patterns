package observer.pattern.example;

public class PartBuyer implements Observer {

	public String name;
	private Observable buyedPart;

	public PartBuyer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		if (this.buyedPart == null) {
			System.out.println(this.getName() + " has no purcheses");
			return;
		}

		String newPart = this.buyedPart.getUpdate();
		System.out.println(this.getName() + " bought: " + newPart);

	}

	@Override
	public void setUser(Observable part) {
		// TODO Auto-generated method stub
		// this.buyedPart = part;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public void setPart(Observable part) {
		// TODO Auto-generated method stub
		this.buyedPart = part;
	}

}
