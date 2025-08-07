package com.arise.principles.SOLID;


/*
 * LSP -> Liskov substitution principle
 * 	if s is a subType of T, thwn objects of T may be replaced with objects s without altering any of the desirable properties of that programs.
 * */
class Parent{
	
}

class Child extends Parent{
	
}


// Example 2.

class Notification{
	public void sendNotification() {
		System.out.println("Notification send");
	}
}

class EmailNotification extends Notification{
	@Override
	public void sendNotification() {
		System.out.println("Email Notification send");
	}
}

class TextNotification extends Notification{
	
	@Override
	public void sendNotification() {
		System.out.println("Text Notication send");
	}
}

public class LSP {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		// instead of above use below
		Parent child = new Child();
		
		
		Notification _note = new EmailNotification();
		_note.sendNotification();
		Notification _notes = new TextNotification();
		_notes.sendNotification();
	}

}
