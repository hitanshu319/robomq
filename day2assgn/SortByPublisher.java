package com.robomq.day2assgn;

import java.util.Comparator;

public class SortByPublisher implements Comparator<Book> {
	
	@Override
	public int compare(Book i1 , Book i2) {
		String Pub1=i1.getpublisher();
		String Pub2=i2.getpublisher();
		int r= Pub1.compareTo(Pub2);
		return r;


	}

}
