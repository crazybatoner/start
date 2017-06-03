package publications;

public class KidBook extends Publicatoins {
	private int 
	quantityOfIllustration;
	
	
	public KidBook(String name, Author author, int size,int illustration) {
		super(name,author,size);
		this.setQuantityOfIllustration(illustration);
	}


	public KidBook() {
		
	}


	public int getQuantityOfIllustration() {
		return quantityOfIllustration;
	}


	public void setQuantityOfIllustration(int quantityOfIllustration) {
		this.quantityOfIllustration = quantityOfIllustration;
	}



		
	


	

}
