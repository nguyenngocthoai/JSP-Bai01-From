package com.haru.entities;

public class Student {
	private String firstname;
	private String lastname;
	private String birthday;
	private String email;
	private String mobileNumber;
	private String gender;
	private String address;
	private String city;
	private String pincode;
	private String state;
	private String country;
	private String hobbiles;
	private String qualification;
	private String courseApplies;

	public Student() {
		super();
	}

	public Student(String firstname, String lastname, String birthday, String email, String mobileNumber, String gender,
			String address, String city, String pincode, String state, String country, String hobbiles,
			String qualification, String courseApplies) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.hobbiles = hobbiles;
		this.qualification = qualification;
		this.courseApplies = courseApplies;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHobbiles() {
		return hobbiles;
	}

	public void setHobbiles(String hobbiles) {
		this.hobbiles = hobbiles;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourseApplies() {
		return courseApplies;
	}

	public void setCourseApplies(String courseApplies) {
		this.courseApplies = courseApplies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((courseApplies == null) ? 0 : courseApplies.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((hobbiles == null) ? 0 : hobbiles.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (courseApplies == null) {
			if (other.courseApplies != null)
				return false;
		} else if (!courseApplies.equals(other.courseApplies))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hobbiles == null) {
			if (other.hobbiles != null)
				return false;
		} else if (!hobbiles.equals(other.hobbiles))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Course [firstname=" + firstname + ", lastname=" + lastname + ", birthday=" + birthday + ", email="
				+ email + ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", address=" + address + ", city="
				+ city + ", pincode=" + pincode + ", state=" + state + ", country=" + country + ", hobbiles=" + hobbiles
				+ ", qualification=" + qualification + ", courseApplies=" + courseApplies + "]";
	}

}
