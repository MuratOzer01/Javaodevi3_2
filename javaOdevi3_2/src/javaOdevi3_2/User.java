package javaOdevi3_2;

public class User {
   
	int id;
	String firstName;
	String lastName;
	
	public User() {
		
	}

		
	public User (int id, String firstName, String lastName) {
		
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getfirstName() {
		return firstName;
	}


	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getlastName() {
		return lastName;
	}


	public void setlastName(String lastName) {
		this.lastName = lastName;
	}	
}
