package publications;

import java.io.Serializable;

public class Author implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8413811963373499784L;
	private String name;
	private String surname;
	
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author (String name,String surname){
		this.name=name;
		this.surname=surname;
	   
	  }
	Author (){
		
	   
	  }
	
	public void printAuthor() {
		System.out.println("-Name of Author-" +" "+name+" "+"-Surname of Author-"+" " + surname);
	}
}
