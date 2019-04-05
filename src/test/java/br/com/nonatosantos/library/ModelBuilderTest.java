package br.com.nonatosantos.library;

import java.util.ArrayList;
import java.util.List;

import br.com.nonatosantos.library.domain.book.enums.Availability;
import br.com.nonatosantos.library.domain.books.Author;
import br.com.nonatosantos.library.domain.books.Book;
import br.com.nonatosantos.library.domain.books.Genre;
import br.com.nonatosantos.library.domain.books.PublishingCompany;
import br.com.nonatosantos.library.domain.student.enums.StudentStatus;
import br.com.nonatosantos.library.domain.students.Address;
import br.com.nonatosantos.library.domain.students.Student;
import br.com.nonatosantos.library.domain.students.Telephone;

public class ModelBuilderTest {

	public static Student newStudent() {

		Telephone cellPhone = new Telephone("44", "99116-5339");
		Telephone fixedTelephone = new Telephone("44", "3029-2444");
		List<Telephone> telephones = new ArrayList<Telephone>();
		telephones.add(cellPhone);
		telephones.add(fixedTelephone);
		Student student = new Student("Nonato Santos", "nonatosantos1986@gmail.com",
				new Address("87033030", "Diogo Zuliani", 515, "A", "Maringá", "PR"), StudentStatus.Ativo, telephones);

		return student;
	}
	
	public static Book newBook() {
		Author author = new Author("Nonato Santos");
		PublishingCompany company = new PublishingCompany("Brasport");
		Genre programming = new Genre("Programing");
		Book book = new Book("Java Programming", "Become a Java Expert", 125, company, programming, author, 2019, Availability.Disponivel);
		
		return book;
	}
}
