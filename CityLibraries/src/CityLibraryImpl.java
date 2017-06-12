import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import libraries.ChildrenLibrary;
import libraries.CityLibrary;
import libraries.ScientificLibrary;
import publications.KidBook;
import publications.Publicatoins;
import publications.ScientificPublication;

public class CityLibraryImpl /* extends PriorityQueue */ implements Librarian {
	Queue<CityLibrary> cityLibrQueue = new PriorityQueue<>();

	@Override
	public void searchBook(String s) {
		for (Iterator<CityLibrary> it = cityLibrQueue.iterator(); it.hasNext();) {
			for (Iterator<Publicatoins> its = it.next().getCitLibrPubl().keySet().iterator(); its.hasNext();) {
				if (its.next().getBookName() == s) {
					System.out.println("We have this book");

				}
			}
		}
	}

	@Override
	public void searchAuth(String s, String f) {
		for (Iterator<CityLibrary> it = cityLibrQueue.iterator(); it.hasNext();) {
			for (Iterator<Publicatoins> its = it.next().getCitLibrPubl().keySet().iterator(); its.hasNext();) {
				if (its.next().getAuthor().getName() == s) {
					System.out.println("We have this book");

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
		for (Iterator<CityLibrary> it = cityLibrQueue.iterator(); it.hasNext();) {

			it.next().addCityBook(a);
		}

	}

	@Override
	public void delete(Publicatoins a) {
		System.out.println("-Book removed-" + "  " + a.getBookName());
		for (Iterator<CityLibrary> it = cityLibrQueue.iterator(); it.hasNext();) {
			for (Iterator<Publicatoins> its = it.next().getCitLibrPubl().keySet().iterator(); its.hasNext();) {
				if (its.next() == a) {
					its.remove();
				}
			}
		}

	}

	@Override
	public void printAll() {
		CityLibrary m = new CityLibrary();
		for (Iterator<CityLibrary> it = cityLibrQueue.iterator(); it.hasNext();) {
			m = it.next();
			System.out.println(m.getLibrName());

			for (Iterator<Publicatoins> its = m.getCitLibrPubl().keySet().iterator(); its.hasNext();) {

				its.next().print();
			}
		}

	}

	public void addLibrary(CityLibrary lb) {
		cityLibrQueue.add(lb);
	}

}
