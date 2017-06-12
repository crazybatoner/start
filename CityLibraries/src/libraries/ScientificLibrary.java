package libraries;

import java.util.HashSet;
import java.util.Set;

import publications.Publicatoins;
import publications.ScientificPublication;

public class ScientificLibrary extends Library implements Comparable{
private Set<ScientificPublication> ScienPubl = new HashSet<ScientificPublication>();
private int a;
private String librName;

public ScientificLibrary (String librName, int a) {
	this.setLibrName(librName);
	this.a = a;
}
public ScientificLibrary () {
	
}

public Set<ScientificPublication> getScienPubl() {
	return ScienPubl;
}

public void setScientificPublications(Set<ScientificPublication> ScienPubl) {
	this.ScienPubl = ScienPubl;
}

public void addScienPubl(Publicatoins a) {
	ScienPubl.add((ScientificPublication) a);
	
}

@Override
public int hashCode() {
	return a;
}
public String getLibrName() {
	return librName;
}
public void setLibrName(String librName) {
	this.librName = librName;
}
@Override
public int compareTo(Object o) {
	
	return -1;
}
}
