package mediator.sigleton.chat;

public class SigletonMediatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MessageMediator chat = new Chat();

		User user1 = new ChatUser(chat, "Nevelia");
		User user2 = new ChatUser(chat, "Nikolay");
		User user3 = new ChatUser(chat, "Gosho");

		user2.send("cat");
		user2.send("pls addBot");
		user2.send("test cat");

		user3.send("you deserve it");
		user1.send("yeahh");

	}

}
