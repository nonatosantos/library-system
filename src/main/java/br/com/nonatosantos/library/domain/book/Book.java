package br.com.nonatosantos.library.domain.book;

import br.com.nonatosantos.library.domain.enums.Availability;

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

}
