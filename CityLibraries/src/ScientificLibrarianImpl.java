
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import libraries.ScientificLibrary;

import publications.Publicatoins;
import publications.ScientificPublication;

public class ScientificLibrarianImpl extends ScientificLibrary implements Librarian {
	private Set<ScientificLibrary> allScientificLibrary = new TreeSet();

	@Override
	public void searchBook(String s) {
		for (Iterator<ScientificLibrary> it = allScientificLibrary.iterator(); it.hasNext();) {

			for (Iterator<ScientificPublication> its = it.next().getScienPubl().iterator(); its.hasNext();) {
				if (its.next().getBookName() == s) {
					System.out.println("We have this book");
				}
			}
		}
	}

	@Override
	public void searchAuth(String s, String f) {
		for (Iterator<ScientificLibrary> it = allScientificLibrary.iterator(); it.hasNext();) {

			for (Iterator<ScientificPublication> its = it.next().getScienPubl().iterator(); its.hasNext();) {
				// System.out.println(its.next().getAuthor().getSurname());
				if (s == its.next().getAuthor()
						.getName() /*
									 * && f==its.next().getAuthor().getSurname()
									 */) {
					System.out.println("We have this author");
				}
			}
		}

	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBook(String nameLibr, Publicatoins a) {
		for (Iterator<ScientificLibrary> it = allScientificLibrary.iterator(); it.hasNext();) {

			it.next().addScienPubl(a);

		}

	}

	@Override
	public void delete(Publicatoins a) {
		System.out.println("-Book removed-" + "  " + a.getBookName());
		for (Iterator<ScientificLibrary> it = allScientificLibrary.iterator(); it.hasNext();) {
			for (Iterator<ScientificPublication> its = it.next().getScienPubl().iterator(); its.hasNext();) {
				if (its.next() == a) {
					its.remove();

				}
			}
		}

	}

	@Override
	public void printAll() {
		ScientificLibrary m = new ScientificLibrary();
		for (Iterator<ScientificLibrary> it = allScientificLibrary.iterator(); it.hasNext();) {
			m = it.next();
			System.out.println(m.getLibrName());

			for (Iterator<ScientificPublication> its = m.getScienPubl().iterator(); its.hasNext();) {

				its.next().print();

			}
		}

	}

	public void addLibrary(ScientificLibrary lb) {
		allScientificLibrary.add(lb);
	}

}
