package br.com.nonatosantos.library.domain.student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.nonatosantos.library.domain.student.enums.StudentStatus;

public class StudentTest {

	private Student student;

	@Before
	public void newStudent() {
		this.student = new Student("Nonato Santos", "nonatosantos1986@gmail.com", "(44)99116-5339",
				new Address("87033030", "Diogo Zuliani", 515, "A", "Maringá", "PR"), StudentStatus.Ativo);
	}

	@Test
	public void testStatus() {
		assertTrue(student.isActive());

	}

	@Test
	public void testName() {
		assertTrue(student.getName() != null);
		assertFalse(student.getName().isEmpty());
		assertEquals("Nonato Santos", student.getName());
	}

	@Test
	public void testEmail() {
		assertFalse(student.getEmail().isEmpty());
		assertEquals("nonatosantos1986@gmail.com", student.getEmail());
	}

	@Test
	public void testTelephone() {
		assertFalse(student.getTelephone().isEmpty());
		assertEquals("(44)99116-5339", student.getTelephone());
		assertNotEquals("44991165339", student.getTelephone());
	}

	@Test
	public void testAddress() {
		assertTrue(student.getAddress() != null);
		assertTrue(student.getAddress().getCep() != null);
		assertTrue(student.getAddress().getCity() != null);
		assertTrue(student.getAddress().getStreet() != null);
		assertTrue(student.getAddress().getState() != null);
		assertEquals("Maringá", student.getAddress().getCity());

	}

}
