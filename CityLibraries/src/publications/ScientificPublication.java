package publications;

public class ScientificPublication extends Publicatoins {
	private int id;
	
	
	public ScientificPublication(String name, Author author, int size,int id) {
		super(name,author,size);
		this.id=id;
	}
}
