package br.com.nonatosantos.library.domain.operations;

import java.util.Calendar;

import br.com.nonatosantos.library.domain.book.enums.Availability;
import br.com.nonatosantos.library.domain.books.Book;
import br.com.nonatosantos.library.domain.students.Student;

public class Loan extends Operation {

	private Calendar returnTerm;
	private Calendar returnDate;
	private Integer daysToReturn;

	public Loan(Book book, Student student, Integer daysToReturn) {
		super(book, student);
		this.returnTerm = Calendar.getInstance();
		returnTerm.add(Calendar.DATE, daysToReturn);
		this.daysToReturn = daysToReturn;
	}

	public Calendar getReturnTerm() {
		return returnTerm;
	}

	public void setReturnTerm(Calendar returnTerm) {
		this.returnTerm = returnTerm;
	}

	public Calendar getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Calendar returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getDaysToReturn() {
		return daysToReturn;
	}

	public void setDaysToReturn(Integer daysToReturn) {
		this.daysToReturn = daysToReturn;
	}

	public void validateLoan() {
		this.book.setAvailability(Availability.Emprestado);
	}

	public void returnBook() {
		this.returnDate = Calendar.getInstance();
		this.getBook().setAvailability(Availability.Disponivel);
	}

	@Override
	public String toString() {
		return "Loan [returnTerm=" + returnTerm + ", returnDate=" + returnDate + ", daysToReturn=" + daysToReturn + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((daysToReturn == null) ? 0 : daysToReturn.hashCode());
		result = prime * result + ((returnDate == null) ? 0 : returnDate.hashCode());
		result = prime * result + ((returnTerm == null) ? 0 : returnTerm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (daysToReturn == null) {
			if (other.daysToReturn != null)
				return false;
		} else if (!daysToReturn.equals(other.daysToReturn))
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		if (returnTerm == null) {
			if (other.returnTerm != null)
				return false;
		} else if (!returnTerm.equals(other.returnTerm))
			return false;
		return true;
	}

}
