package br.com.nonatosantos.library.domain;

public class PublishingCompany {
	
	private String name;
	
	

	public PublishingCompany(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PublishingCompany [name=" + name + "]";
	}
	
	
	

}
