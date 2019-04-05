package br.com.nonatosantos.library.domain.books;

import br.com.nonatosantos.library.domain.book.enums.Availability;

public class Book {

	private String title;
	private String synopsis;
	private Integer numberOfPages;
	private PublishingCompany publishingCompany;
	private Genre genre;
	private Author author;
	private Integer yearPublication;
	private Availability availability;

	public Book(String title, String synopsis, Integer numberOfPages, PublishingCompany publishingCompany, Genre genre,
			Author author, Integer yearPublication, Availability availability) {
		super();
		this.title = title;
		this.synopsis = synopsis;
		this.numberOfPages = numberOfPages;
		this.publishingCompany = publishingCompany;
		this.genre = genre;
		this.author = author;
		this.yearPublication = yearPublication;
		this.availability = availability;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public PublishingCompany getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(PublishingCompany publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Integer getYearPublication() {
		return yearPublication;
	}

	public void setYearPublication(Integer yearPublication) {
		this.yearPublication = yearPublication;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Availability getAvailability() {
		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;
	}

	public Boolean isAvailable() {
		return this.availability == Availability.Disponivel;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", synopsis=" + synopsis + ", numberOfPages=" + numberOfPages
				+ ", publishingCompany=" + publishingCompany + ", genre=" + genre + ", author=" + author
				+ ", yearPublication=" + yearPublication + ", availability=" + availability + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((availability == null) ? 0 : availability.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((numberOfPages == null) ? 0 : numberOfPages.hashCode());
		result = prime * result + ((publishingCompany == null) ? 0 : publishingCompany.hashCode());
		result = prime * result + ((synopsis == null) ? 0 : synopsis.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((yearPublication == null) ? 0 : yearPublication.hashCode());
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (availability != other.availability)
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (numberOfPages == null) {
			if (other.numberOfPages != null)
				return false;
		} else if (!numberOfPages.equals(other.numberOfPages))
			return false;
		if (publishingCompany == null) {
			if (other.publishingCompany != null)
				return false;
		} else if (!publishingCompany.equals(other.publishingCompany))
			return false;
		if (synopsis == null) {
			if (other.synopsis != null)
				return false;
		} else if (!synopsis.equals(other.synopsis))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearPublication == null) {
			if (other.yearPublication != null)
				return false;
		} else if (!yearPublication.equals(other.yearPublication))
			return false;
		return true;
	}

}
