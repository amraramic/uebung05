package ueb05;

import java.util.*;

class CorpusAnalyzer {
	private List<String> theses = new LinkedList<>();

	CorpusAnalyzer(Iterator<String> thesesIterator) {
		while (thesesIterator.hasNext()){
			theses.add(thesesIterator.next());
		}

		// TODO Alle Titel in die this.theses Liste übernehmen
	}

	/**
	 * Gibt die Anzahl der angefertigten Theses zurück
	 */
	int countTheses() {
		return theses.size();
	}

	/**
	 * Gibt die durchschnittliche Länge von Titeln in Worten zurück
	 */

	int averageThesisTitleLength() {
		int lengthG=0;

		for (int i = 0; i<theses.size(); i++){

			String[] woerter = theses.get(i).split(" ");
			lengthG += woerter.length;
		}
		return lengthG/theses.size();
	}

	/**
	 * Gibt eine alphabetisch absteigend sortierte und duplikatfreie
	 * Liste der ersten Wörter der Titel zurück.
	 */
	List<String> uniqueFirstWords() {
		for (int i = 0; i < theses.size(); i++) {
			String[] woerter = theses.get(i).split(" ");
			uniqueFirstWords().add(woerter[0]);
		}
		uniqueFirstWords().sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.compareTo(o2) < 0) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		return uniqueFirstWords();
	}
	/**
	 * Gibt einen Iterator auf Titel zurück; dabei werden alle Woerter, welche
	 * in `blackList` vorkommen durch Sternchen ersetzt (so viele * wie Buchstaben).
	 */
	Iterator<String> censoredIterator(Set<String> blackList) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gibt eine Liste von allen Titeln zurueck, wobei Woerter so ersetzt werden,
	 * wie sie in der Map abgebildet werden.
	 */
	List<String> normalizedTheses(Map<String, String> replace) {
		throw new UnsupportedOperationException();
	}
}
