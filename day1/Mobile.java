package Week1.day1;

public class Mobile {
	
	public void sendMessage() {
		System.out.println("send Message");
	}
	public void shareDocument() {
		System.out.println("share Document");
	}
	public void makeCall() {
		System.out.println("make Call");
}
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.sendMessage();
		mobile.shareDocument();
		mobile.makeCall();
	}

}
