package br.com.nonatosantos.library.domain.students;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.nonatosantos.library.ModelBuilderTest;
import br.com.nonatosantos.library.domain.students.Student;

public class StudentTest {

	private Student student;

	@Before
	public void newStudent() {

		this.student = ModelBuilderTest.newStudent();
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
		assertFalse(student.getTelephones().isEmpty());
		assertTrue(student.getTelephones().size() == 2);
		assertFalse(student.getTelephones().size() == 1);

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
