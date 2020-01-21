package com.robomq.day2assgn;

import java.util.*;
import java.util.ArrayList;
public class BookList {
	public static void main(String[] args) {
	
ArrayList<Book> Bookdata=new ArrayList<Book>();

        Bookdata.add(new Book(1,"abc","cs","csp",5)); 
        Bookdata.add(new Book(11,"def","mech","mechp",13));
        Bookdata.add(new Book(2,"ghi","ece","ecep",9)); 
        Bookdata.add(new Book(05,"cdw","civil","civilp",2)); 
      
	
        System.out.println(Bookdata);
        Iterator itr=Bookdata.iterator();
        		while(itr.hasNext())
        		{
        			System.out.println(itr.next());
        		}
        System.out.println("sort by Member name");
        SortByName n = new SortByName();
        Bookdata.sort(n);
        System.out.println(Bookdata);

	
        System.out.println("sort by id");
        SortById r = new SortById();
        Bookdata.sort(r);
        System.out.println(Bookdata);
	    
        System.out.println("sort by Author name");
        SortByAuthor a = new SortByAuthor();
        Bookdata.sort(a);
        System.out.println(Bookdata);
        
        
        System.out.println("sort by Publisher name");
        SortByPublisher p = new SortByPublisher();
        Bookdata.sort(p);
        System.out.println(Bookdata);
        
        System.out.println("sort by quantity");
        SortByQuantity q = new SortByQuantity();
        Bookdata.sort(q);
        System.out.println(Bookdata);

}
}
