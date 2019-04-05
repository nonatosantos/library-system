package br.com.nonatosantos.library.domain.student;

import java.util.List;

import br.com.nonatosantos.library.domain.student.enums.StudentStatus;

public class Student {

	private String name;
	private String email;
	private Address address;
	private StudentStatus status;
	private List<Telephone> telephones;

	public Student(String name, String email, Address address, StudentStatus status, List<Telephone> telephones) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.status = status;
		this.telephones = telephones;
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

	public List<Telephone> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}

	public Boolean isActive() {
		return this.status == StudentStatus.Ativo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", telephone=" + telephones + ", address=" + address
				+ ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((telephones == null) ? 0 : telephones.hashCode());
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
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (status != other.status)
			return false;
		if (telephones == null) {
			if (other.telephones != null)
				return false;
		} else if (!telephones.equals(other.telephones))
			return false;
		return true;
	}

}
