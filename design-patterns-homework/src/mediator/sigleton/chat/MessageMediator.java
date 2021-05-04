package mediator.sigleton.chat;

public interface MessageMediator {

	void addUser(User user);

	void kickUser(User user);

	void sendMessage(String message, User user);

}
