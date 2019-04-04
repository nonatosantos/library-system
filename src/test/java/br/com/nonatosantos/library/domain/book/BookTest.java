package br.com.nonatosantos.library.domain.book;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.nonatosantos.library.domain.enums.Availability;

public class BookTest {

	private Book book;

	@Before
	public void newBook() {
		this.book = new Book("Java Programing", "Become a Java Expert", 122, new PublishingCompany("Sum"),
				new Genre("Programing"), new Author("Nonato Santos"), 2019, Availability.Disponivel);
	}

	@Test
	public void testPages() {

		assertTrue(book.getNumberOfPages() != null);
		assertEquals(122, book.getNumberOfPages(), 0);
	}

	@Test
	public void testYear() {
		assertTrue(book.getYearPublication() != null);
		assertTrue(book.getYearPublication() == 2019);
	}

	@Test
	public void testAuthor() {
		assertTrue(book.getAuthor() != null);
		assertEquals("Nonato Santos", book.getAuthor().getName());
	}

	@Test
	public void testPublishingCompany() {
		assertTrue(book.getPublishingCompany() != null);
		assertEquals("Sum", book.getPublishingCompany().getName());
	}

	@Test
	public void testTitle() {
		assertFalse(book.getTitle().isEmpty());
		assertEquals("Java Programing", book.getTitle());
	}

	@Test
	public void testDescription() {
		assertFalse(book.getSynopsis().isEmpty());
		assertEquals("Become a Java Expert", book.getSynopsis());
	}

	@Test
	public void testAvailability() {
		assertTrue(book.isAvailable());
	}

}
