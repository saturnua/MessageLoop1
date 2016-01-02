package myPack;

public class Main {
	public static void main(String[] args){
		Runnable thread = new MessageLoop();
		Thread messageloop = new Thread(thread);
		
		messageloop.start();
		
	}

}
