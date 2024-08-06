package entities;

public class Rooms {
	private String names, emails;
	
	public Rooms(String names, String emails) {
		this.names = names;
		this.emails = emails;
	}
	
	public Rooms() {
		
	}
	
 	public String getnames() {
		return names;
	}
	
	public void setNames(String names) {
		this.names = names;
	}
	
	public String getEmails() {
		return emails;
	}
	
	public void setEmails(String emails) {
		this.emails = emails;
	}
	
}
