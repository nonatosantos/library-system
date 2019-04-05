package br.com.nonatosantos.library.domain.operations;

import br.com.nonatosantos.library.domain.book.enums.Availability;
import br.com.nonatosantos.library.domain.books.Book;
import br.com.nonatosantos.library.domain.students.Student;

public class Donation extends Operation {

	private String donationReason;

	public Donation(Book book, Student student, String donationReason) {
		super(book, student);
		this.donationReason = donationReason;
	}

	public String getDonationReason() {
		return donationReason;
	}

	public void setDonationReason(String donationReason) {
		this.donationReason = donationReason;
	}

	public void validateDonation() {
		this.getBook().setAvailability(Availability.Doado);
	}

	@Override
	public String toString() {
		return "Donation [donationReason=" + donationReason + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((donationReason == null) ? 0 : donationReason.hashCode());
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
		Donation other = (Donation) obj;
		if (donationReason == null) {
			if (other.donationReason != null)
				return false;
		} else if (!donationReason.equals(other.donationReason))
			return false;
		return true;
	}

}
