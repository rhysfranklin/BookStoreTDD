package com.fdmgroup.bookStoreTDD;

import java.util.ArrayList;

public class Basket {
	ArrayList<Book> listOfBooks = new ArrayList<Book>();

	public Integer getBooksInBasket() {
		Integer numberOfBooks = listOfBooks.size();
		return numberOfBooks;

	}

	public void addBook(Book value) {
		listOfBooks.add(value);
	}
}
