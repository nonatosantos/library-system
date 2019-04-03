package br.com.nonatosantos.library.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.nonatosantos.library.domain.enums.Availability;

public class BookTest {	
	
	Book book = new Book("Java Programing", "Become a Java Expert", 122, new PublishingCompany("Sum"),
			new Genre("Programing"), new Author("Nonato Santos"), 2019, Availability.Disponivel);

	@Test
	public void testPages() {
		
		assertTrue(book.getNumberOfPages()==122);		
	}
	
	@Test
	public void testYear() {
		assertTrue(book.getYearPublication()==2019);
	}
	
	@Test
	public void testAuthor() {
		assertEquals("Nonato Santos", book.getAuthor().getName());
	}
	
	@Test
	public void testPublishingCompany() {
		assertEquals("Sum", book.getPublishingCompany().getName());
	}
	
	@Test
	public void testTitle() {
		assertEquals("Java Programing", book.getTitle());
	}
	
	@Test
	public void testDescription() {
		assertEquals("Become a Java Expert", book.getSynopsis());
	}
	
	@Test
	public void testAvailability() {
		assertEquals("Disponivel", book.getAvailability().toString());
	}

}
