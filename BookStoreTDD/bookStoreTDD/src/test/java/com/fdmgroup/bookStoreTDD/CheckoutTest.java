package com.fdmgroup.bookStoreTDD;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {
	
//	@Before
//	public void setup() {
//		Checkout checkout = new Checkout();
//	}


	@Test
	public void CallTheCalculatePriceInAnEmptyBasketItShouldReturnZero(){
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		double price = checkout.calculatePrice(basket);
		assertEquals(0.0, price, 0.01);
		
	}
	
	@Test
	public void testCalculatorPriceReturnsPriceOfBookInBasketWithOneBook(){
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		checkout.setBookPrice(25.99);
		Book book1 =new Book();
		basket.addBook(book1);
		double price = checkout.calculatePrice(basket);
		assertEquals(25.99, price, 0.01);
	}
	@Test
	public void testCalculatorPriceReturnsPriceOfBookInBasketWithtwoBooks(){
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		checkout.setBookPrice(25.99);
		Book book1 =new Book();
		Book book2 = new Book();
		basket.addBook(book1);
		basket.addBook(book2);
		double price = checkout.calculatePrice(basket);
		assertEquals(51.98, price, 0.01);
	}
	
	@Test
	public void testCalculatorPriceReturnsPriceOfBookInBasketWithThreeBooksApplyingADiscount(){
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		checkout.setBookPrice(25.99);
		Book book1 =new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3);
		double price = checkout.calculatePrice(basket);
		assertEquals(77.19, price, 0.01);
	}
	
	
	

}
