package com.robomq.day2assgn;

import java.util.Comparator;

public class SortByName implements Comparator<Book> {

	@Override
	public int compare(Book c1, Book c2) {
		// TODO Auto-generated method stub
		String name1=c1.getname();
		String name2=c2.getname();
		int r=name1.compareTo(name2);
		return r;
	}


}

