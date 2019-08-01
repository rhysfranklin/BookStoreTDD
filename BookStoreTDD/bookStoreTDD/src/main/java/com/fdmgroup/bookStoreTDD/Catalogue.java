package com.fdmgroup.bookStoreTDD;

import java.util.ArrayList;

public class Catalogue implements ReadItemCommand {
	private ReadItemCommand readItemCommand;
	ArrayList<Book> bookList = new ArrayList<Book>();

	public ArrayList<Book> getAllBooks() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		readItemCommand.readAll();
		return bookList;
	}

	public ReadItemCommand getReadItemCommand() {
		return readItemCommand;
	}

	public Catalogue(ReadItemCommand readItemCommand) {
		this.readItemCommand = readItemCommand;
	}

	public ArrayList<Book> readAll() {

		return bookList;
	}

}
