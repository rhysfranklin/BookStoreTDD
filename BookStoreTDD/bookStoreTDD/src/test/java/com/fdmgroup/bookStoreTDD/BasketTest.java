package com.fdmgroup.bookStoreTDD;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {
	private Basket basket;

	@Before
	public void setup() {
		basket = new Basket();
	}

	@Test
	public void TestGetBooksAndReturnEmptyBookListIfNoBooksHaveBeenAdded() {
		Integer booksInBasket = basket.getBooksInBasket();
		assertEquals(0, booksInBasket.intValue());
	}

	@Test
	public void TestGetBooksAndReturnArrayLengthOfOneAfterAddBookMethodIsCalledWithOneBook() {
		Book book1 = new Book();
		basket.addBook(book1);
		Integer booksInBasket = basket.getBooksInBasket();
		assertEquals(1, booksInBasket.intValue());
	}

	@Test
	public void TestGetBooksAndReturnArrayLengthOfTwoAfterAddBookMethodIsCalledWithTwoBooks() {
		Book book1 = new Book();
		basket.addBook(book1);
		Book book2 = new Book();
		basket.addBook(book2);
		Integer booksInBasket = basket.getBooksInBasket();
		assertEquals(2, booksInBasket.intValue());
	}

}
