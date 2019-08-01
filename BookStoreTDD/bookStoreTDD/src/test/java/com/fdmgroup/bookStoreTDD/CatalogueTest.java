package com.fdmgroup.bookStoreTDD;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Test;




public class CatalogueTest {
	
	
	@Test
	public void testThatIfWeAskTheCatalogueForAlistOfAllItemsWhenThereAreNoneReturnEmptyList(){
		
		//arrange
		ReadItemCommand readItem = mock(ReadItemCommand.class);
		Catalogue catalogue = new Catalogue(readItem);
		ArrayList<Book> booklist = catalogue.getAllBooks();
		
		//act
		booklist = catalogue.getAllBooks();
		
		//assert
		assertEquals(0, booklist.size());
	}
	
	@Test
	public void getAllBooksCallsReadAllMethodOfReadItemCommandWhenCalled(){
		
		//Arrange
		ReadItemCommand readItem = mock(ReadItemCommand.class);
		Catalogue catalogue = new Catalogue(readItem);
		
		//act
		catalogue.getAllBooks();
		
		//verify
		verify(readItem, times(1)).readAll();
		
	}
	@Test
	public void GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
		
		//Arrange
		ReadItemCommand readItem = mock(ReadItemCommand.class);
		Catalogue catalogue = new Catalogue(readItem);
		ArrayList<Book> listOfBooks = (ArrayList<Book>)mock(ArrayList.class);
		listOfBooks = readItem.readAll();
		when(readItem.readAll()).thenReturn(listOfBooks);
		
		//Act
		ArrayList<Book> retrievedBooks =catalogue.getAllBooks();
		
		//assert
		assertEquals(listOfBooks, retrievedBooks);
		
		
		
		
		
	}

}
