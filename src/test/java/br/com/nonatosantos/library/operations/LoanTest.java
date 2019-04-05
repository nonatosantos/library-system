package br.com.nonatosantos.library.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.nonatosantos.library.ModelBuilderTest;
import br.com.nonatosantos.library.domain.book.enums.Availability;

public class LoanTest {

	private Loan loan;

	@Before
	public void newOpeation() {

		this.loan = new Loan(ModelBuilderTest.newBook(), ModelBuilderTest.newStudent(), 2);
	}

	@Test
	public void testLoan() {
		assertEquals(2, loan.getDaysToReturn(), 0);
		assertTrue(loan.getReturnTerm() != null);
		assertTrue(loan.getBook() != null);
		assertFalse(loan.getBook().getTitle().isEmpty());
		assertEquals("Disponivel", loan.getBook().getAvailability().toString());
	}

	@Test
	public void testValidateLoan() {
		this.loan.validateLoan();
		assertTrue(loan.getBook().getAvailability() == Availability.Emprestado);
	}

	@Test
	public void TestAvailability() {
		this.loan.returnBook();
		assertTrue(loan.getBook().getAvailability() == Availability.Disponivel);
	}

}
