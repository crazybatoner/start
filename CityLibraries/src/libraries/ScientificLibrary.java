package libraries;

import java.util.HashSet;

import publications.ScientificPublication;

public class ScientificLibrary extends HashSet<ScientificPublication>{
private HashSet<ScientificPublication> ScienPubl;

public HashSet<ScientificPublication> getScienPubl() {
	return ScienPubl;
}

public void setScientificPublications(HashSet<ScientificPublication> ScienPubl) {
	this.ScienPubl = ScienPubl;
}
}
