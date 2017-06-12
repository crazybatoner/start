import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import libraries.ChildrenLibrary;
import publications.Author;
import publications.KidBook;
import publications.Publicatoins;

public class ChildrenLibrarianImpl extends ChildrenLibrary implements Librarian {
	Set<ChildrenLibrary> AllChildrenLibrary = new LinkedHashSet();

	@Override
	public void sort() {
		Set<ChildrenLibrary> sort = new TreeSet();
		for (Iterator<ChildrenLibrary> it = AllChildrenLibrary.iterator(); it.hasNext();) {
			ChildrenLibrary a = it.next();
			a.sortByTitle();
			for (Iterator<KidBook> its = a.getKidBooks().iterator(); its.hasNext();) {

				its.next().print();

			}
		}

	}

	@Override
	public void addBook(String nameLibr, Publicatoins a) {
		System.out.println("-Book added-" + "  " + a.getBookName());
		for (Iterator<ChildrenLibrary> it = AllChildrenLibrary.iterator(); it.hasNext();) {
			// if (it.next().getLibrName()==nameLibr) {

			it.next().addBooks(a);

			// }
		}

	}

	@Override
	public void delete(Publicatoins a) {
		System.out.println("-Book removed-" + "  " + a.getBookName());
		for (Iterator<ChildrenLibrary> it = AllChildrenLibrary.iterator(); it.hasNext();) {
			for (Iterator<KidBook> its = it.next().getKidBooks().iterator(); its.hasNext();) {
				if (its.next() == a) {
					its.remove();

				}
			}
		}

	}

	@Override
	public void printAll() {
		ChildrenLibrary m = new ChildrenLibrary();
		for (Iterator<ChildrenLibrary> it = AllChildrenLibrary.iterator(); it.hasNext();) {
			m = it.next();
			System.out.println(m.getLibrName());

			for (Iterator<KidBook> its = m.getKidBooks().iterator(); its.hasNext();) {

				its.next().print();

			}
		}

	}

	@Override
	public void searchBook(String s) {

		for (Iterator<ChildrenLibrary> it = AllChildrenLibrary.iterator(); it.hasNext();) {

			for (Iterator<KidBook> its = it.next().getKidBooks().iterator(); its.hasNext();) {

				if (its.next().getBookName() == s) {
					System.out.println("We have this book");
				}
			}
		}
	}

	public Set<ChildrenLibrary> getAllChildrenLibrary() {
		return AllChildrenLibrary;
	}

	public void addLibrary(ChildrenLibrary lb) {
		AllChildrenLibrary.add(lb);
	}

	@Override
	public void searchAuth(String s, String f) {

		for (Iterator<ChildrenLibrary> it = AllChildrenLibrary.iterator(); it.hasNext();) {

			for (Iterator<KidBook> its = it.next().getKidBooks().iterator(); its.hasNext();) {

				if (its.next().getAuthor().getName() == s && its.next().getAuthor().getSurname() == f) {
					System.out.println("We have this author");
				}
			}
		}

	}

}
