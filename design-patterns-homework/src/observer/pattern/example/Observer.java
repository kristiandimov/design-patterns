package observer.pattern.example;

public interface Observer {

	void update();

	void setUser(Observable observable);

	void setPart(Observable observable);

}
