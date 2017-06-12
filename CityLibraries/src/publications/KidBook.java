package publications;

import java.io.Serializable;

public class KidBook extends Publicatoins implements Serializable, Comparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1815360494897178274L;
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


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}



		
	


	

}
