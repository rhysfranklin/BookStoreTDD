package com.fdmgroup.bookStoreTDD;

public class Checkout {
	private double bookPrice;
	
	//getters and setters
	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	//calculate price based on how many books
	public double calculatePrice(Basket basket) {
		if (basket.getBooksInBasket() < 3) {
			double price = bookPrice * basket.getBooksInBasket();
			return price;
		} else if (basket.getBooksInBasket() == 3) {
			double initialPrice = bookPrice * basket.getBooksInBasket();
			double discount = initialPrice * 0.01;
			double price = initialPrice - discount;
			return price;

		} else if (basket.getBooksInBasket() == 7) {
			double initialPrice = bookPrice * basket.getBooksInBasket();
			double discount = initialPrice * 0.02;
			double price = initialPrice - discount;
			return price;
		} else {
			return 0;
		}

	}

}
