package com.robomq.day2assgn;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Book> {
	
	@Override
	public int compare(Book i1, Book i2) {
	int r=i1.getquantity()-i2.getquantity();
			return r;
	

	
	}

}
