package publications;

public class Publicatoins  {
	private String name;
	 Author author;
	private int size;

	public String getBookName(){
		
		return name;
	}
	public void  setName(String name){
		this.name=name;
	}
	/*public String getAuthor(){
		return author;
	}
	public void  setAuthor(String author){	
		this.author=author;
	}*/
	public int getSize(){
		
		return size;
	}
	public void  setSize(int size){
		this.size=size;
	}
	Publicatoins (String name,Author author,int size){
		this.name=name;
		this.author=author;
	    this.size=size;
	  }
	  
	public Publicatoins() {
		
	}
	public void print() {
	System.out.println("Name of Book" +" " + name+" "+"Size of Book" +" " + size
			+" "+"Name of Author" +" " +author.getName()+" "+"SurName of Author" +" "+author.getSurname());
	
	}
	
	public Author getAuthor(){
		return author;
	}

}
