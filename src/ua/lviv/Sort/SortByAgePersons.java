package ua.lviv.Sort;

import java.util.Comparator;

import ua.lviv.people.Persons;

public class SortByAgePersons implements Comparator<Persons>{
	@Override
	public int compare(Persons p1, Persons p2) {
		if (p1.getAge() < p2.getAge()) {
			return -1;
		} else if (p1.getAge() > p2.getAge()) {
			return 1;
		} else {
			return 0;
		}
	}

}
