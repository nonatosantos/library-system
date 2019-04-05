package br.com.nonatosantos.library.domain.book;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.nonatosantos.library.ModelBuilderTest;

public class BookTest {

	private Book book;

	@Before
	public void newBook() {
		this.book = ModelBuilderTest.newBook();
	}

	@Test
	public void testPages() {

		assertTrue(book.getNumberOfPages() != null);
		assertEquals(125, book.getNumberOfPages(), 0);
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
		assertEquals("Brasport", book.getPublishingCompany().getName());
	}

	@Test
	public void testTitle() {
		assertFalse(book.getTitle().isEmpty());
		assertEquals("Java Programming", book.getTitle());
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

	@Test
	public void testGenre() {
		assertTrue(book.getGenre() != null);
		assertFalse(book.getGenre().getName().isEmpty());
	}

}
