package libraries;

import java.io.Serializable;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import publications.KidBook;
import publications.Publicatoins;

public class ChildrenLibrary extends Library implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5732499643509380472L;

	private LinkedList<KidBook> KidBooks = new LinkedList<KidBook>();
	private String librName;
	private int a;

	public ChildrenLibrary(String librName, int a) {
		this.librName = librName;
		this.a = a;
	}

	public ChildrenLibrary() {
		
	}

	public LinkedList<KidBook> getKidBooks() {
		return KidBooks;
	}

	public void addBooks(Publicatoins a2) {
		KidBooks.add((KidBook) a2);
	}

	public String getLibrName() {
		return librName;
	}

	public void setLibrName(String librName) {
		this.librName = librName;
	}

	public void sortByTitle() {
		Set<KidBook> sort = new TreeSet<KidBook>(new ComparatorTitle());
		sort.addAll(KidBooks);
	}

	@Override
	public int hashCode() {
		return a;
	}

}
