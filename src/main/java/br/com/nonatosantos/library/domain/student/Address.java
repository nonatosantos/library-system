package br.com.nonatosantos.library.domain.student;

public class Address {

	private String cep;
	private String street;
	private Integer number;
	private String complement;
	private String city;
	private String state;

	public Address(String cep, String street, Integer number, String complement, String city, String state) {
		super();
		this.cep = cep;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.city = city;
		this.state = state;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
