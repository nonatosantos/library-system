package br.com.nonatosantos.library.domain.student;

import br.com.nonatosantos.library.domain.student.enums.StudentStatus;

public class Student {

	private String name;
	private String email;
	private String telephone;
	private Address address;
	private StudentStatus status;

	public Student(String name, String email, String telephone, Address address, StudentStatus status) {
		super();
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.address = address;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public StudentStatus getStatus() {
		return status;
	}

	public void setStatus(StudentStatus status) {
		this.status = status;
	}

	public Boolean isActive() {
		return this.status == StudentStatus.Ativo;
	}

}
