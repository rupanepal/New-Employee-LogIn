package emailapp;
import java.util.Scanner;
public class email {
	private String firstName;
	private  String lastName;
	private String pasword;
	private String department;
	private int mailboxCapacity;
	private int defaultpassword = 10;
	private int mailboxcapicity = 500;
	private String alternateEmail;
	private String email;
	private String conpanysufix = "abc.com";
	
	//create a constructor to receive first and last name from user
	public email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email Created: " + this.firstName +""+this.lastName );
//Call a method asking for department - return the department
		this.department= setDepartment();
		//System.out.println("Department is: " +this.department);
		
		//Call a method that generate rando Password
		this.pasword = randompassword(defaultpassword);
		System.out.println("Your password is: " + this.pasword);
		
		//Combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department + conpanysufix;
		//System.out.println("Your email is: " + email);
	}
	//Ask for the department
	private String setDepartment() {
		System.out.println("New employe: "+ firstName + ". department code\n1 for Sales\n2 for Account\n3 for DEV\n0 for non\nEnter department code: ");
		Scanner in = new Scanner(System.in);
	
		int depChoice = in.nextInt();
		if (depChoice ==1) {return  "sales";}
		else if(depChoice==2) {return "Accounting";}
		else if(depChoice==3) {return "dev";}
		else {return " ";}
	}
		//Generate random password
		private String randompassword(int length) {
			
			String passwordSet = "A-Za-z1-9!@#$%";
			char [] password = new char [length];
			for (int i = 0; i<length;i++) {
		int rand = (int)(Math.random()*passwordSet.length());	
		password [i] = passwordSet.charAt(rand);
				
		}
		return new String (password);
		
		}
		//set mailbox capacity
public void setMailboxCapasity(int capacity) {
	this.mailboxCapacity = capacity;
	}
//set the alternative email
	public void setAlternateEmail(String alternate) {
		this.alternateEmail = alternate;
		
	}
	//change password
	public void changePassword(String password) {
		this.pasword = password;
	}

public int getmailboxCapacity() {return mailboxCapacity;}
public String getalternateEmail() {return alternateEmail;}
public String getPassword() {return pasword;}

public String showInfo() {
	String MailboxCapacity;
	return "Displa Name: " + firstName + "Company Email"+ email+
			"Mail Box Capacity: "+ mailboxCapacity + "mb";
}}
	
	
	
