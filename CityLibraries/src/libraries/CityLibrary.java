package libraries;

import java.util.HashMap;
import java.util.Map;

import publications.Publicatoins;
import publications.ScientificPublication;

public class CityLibrary extends Library implements Comparable {
	private Map<Publicatoins, Integer> CitLibrPubl = new HashMap();
	private String librName;

	public CityLibrary() {
	}
	
	public CityLibrary(String librName){
		this.librName=librName;
	}
	public Map<Publicatoins, Integer> getCitLibrPubl() {
		return CitLibrPubl;
	}

	public void setCitLibrPubl(Map<Publicatoins, Integer> citLibrPubl) {
		CitLibrPubl = citLibrPubl;
	}

	public void addCityBook(Publicatoins a) {
		if (CitLibrPubl.containsKey(a)) {
			CitLibrPubl.put(a, CitLibrPubl.get(a) + 1);
		}
		CitLibrPubl.put(a, 1);

	}

	public String getLibrName() {
		return librName;
	}

	public void setLibrName(String librName) {
		this.librName = librName;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}
}
