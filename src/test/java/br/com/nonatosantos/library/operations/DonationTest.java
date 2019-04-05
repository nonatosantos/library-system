package br.com.nonatosantos.library.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.nonatosantos.library.ModelBuilderTest;

public class DonationTest {

	private Donation donation;

	@Before
	public void newOpeation() {

		this.donation = new Donation(ModelBuilderTest.newBook(), ModelBuilderTest.newStudent(),
				"Doado para utilização em projetos filatrópicos");
	}

	@Test
	public void testDonation() {
		assertTrue(donation.getDateOperation() != null);
		assertTrue(donation.getStudent() != null);
		assertFalse(donation.getDonationReason().isEmpty());
		assertEquals("Disponivel", donation.getBook().getAvailability().toString());
	}

	@Test
	public void testValidateDonation() {
		this.donation.validateDonation();
		assertEquals("Doado", donation.getBook().getAvailability().toString());
	}

}
