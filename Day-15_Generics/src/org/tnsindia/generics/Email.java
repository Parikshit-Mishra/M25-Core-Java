package org.tnsindia.generics;
//1.Email 2.Sender 3.Executor
public class Email 
{
	// Email format
	private  String from;
	private  String to;
	private  String subject;
	private  String body;
	//Getter and setter method for private class
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
