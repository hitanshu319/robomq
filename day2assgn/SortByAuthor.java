package com.robomq.day2assgn;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Book> {
	 
	@Override
	public int compare(Book i1 , Book i2) {
		 String author1=i1.getauthor();
		 String author2=i2.getauthor(); 
		 int r=author1.compareTo(author2);
		 return r;
		
	}
	
}


