package ua.lviv.clientbase;

import java.util.HashMap;

import java.util.Map;

import sklads.Koshuk;
import ua.lviv.people.Persons;

public class Base {
	private Map<Persons, Koshuk> base=new HashMap<>();

	public Map<Persons, Koshuk> getBase() {
		return base;
	}

	public void setBase(Map<Persons, Koshuk> base) {
		this.base = base;
	}
	
}
