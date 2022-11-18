package com.lab_activity05_bank;

public class BookDetails {
	static void display(Book b) {
		System.out.println("Book type : " + b.getBookType());
		System.out.println("Book Author name : " + b.getAr());
		System.out.println("Book price : " + b.getPrice());
		System.out.println("Year of publictaion of Book: " + b.getYearOfPublication());

	}

	public static void main(String[] args) {
			
		Book b = new Book("romeo and juliet", 1597,4899.00, new Author("William Shakespeare ,", 66));
		display(b);
	}

}
