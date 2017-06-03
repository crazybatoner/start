package libraries;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import publications.KidBook;
import publications.Publicatoins;

public class ChildrenLibrary extends LinkedList<KidBook> {

	private LinkedList<KidBook> KidBooks = new LinkedList();
	private String librName;
	private int a;

	public ChildrenLibrary(String librName, int a) {
		this.librName = librName;
		this.a = a;
	}

	public ChildrenLibrary() {
		;
	}

	public LinkedList<KidBook> getKidBooks() {
		return KidBooks;
	}

	public void addBooks(KidBook book) {
		KidBooks.add(book);
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
