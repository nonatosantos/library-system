package br.com.nonatosantos.library.operations;

import java.util.Calendar;

import br.com.nonatosantos.library.domain.book.Book;
import br.com.nonatosantos.library.domain.student.Student;

public abstract class Operation {

	protected Calendar dateOperation;
	protected Book book;
	protected Student student;

	public Operation(Book book, Student student) {
		super();
		this.dateOperation = Calendar.getInstance();
		this.book = book;
		this.student = student;
	}

	public Calendar getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Calendar dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Operation [dateOperation=" + dateOperation + ", book=" + book + ", student=" + student + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((dateOperation == null) ? 0 : dateOperation.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operation other = (Operation) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (dateOperation == null) {
			if (other.dateOperation != null)
				return false;
		} else if (!dateOperation.equals(other.dateOperation))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}

}
