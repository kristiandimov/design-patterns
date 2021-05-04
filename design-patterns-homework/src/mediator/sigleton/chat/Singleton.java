package mediator.sigleton.chat;

public class Singleton {

	private static Singleton bot;
	private String message;
	private static int count = 0;
	private static Chat chat;

	private Singleton() {
		// TODO Auto-generated constructor stub

	}

	public static Singleton getInstance() {

		if (bot == null) {
			bot = new Singleton();

		}

		return bot;
	}

	public static boolean checkBannedWords(String message, User user) {
		// TODO Auto-generated method stub

		if (bot == null) {
			return false;
		}

		if (message.contains("cat")) {

			System.out.println(user.name + " KICKED from bot Reason: Word cat is banned from the chat");
			return true;
		}

		return false;

	}

}
