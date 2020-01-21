package com.robomq.day2assgn;

import java.util.Comparator;

public class SortById implements Comparator<Book> {

	@Override
	public int compare(Book i0, Book i1) {
		int r=i0.getid()-i1.getid();
		return r;
	}
     
	
	
	}

