package br.com.nonatosantos.library.domain.students;

public class Telephone {
	
	private String ddd;
	private String number;
	
	
	
	public Telephone(String ddd, String number) {
		super();
		this.ddd = ddd;
		this.number = number;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	

}
