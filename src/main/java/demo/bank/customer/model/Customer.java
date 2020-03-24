package demo.bank.customer.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "tbl_customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cif;
	
	@NotEmpty(message = "Customer name must not be empty")
	private String name;
  
  @NotEmpty(message = "Date of birth must not be empty")
	private Date dob;
  
  @NotEmpty(message = "Address must not be empty")
	private String address;
  
  @NotEmpty(message = "Gender must not be empty")
	private String gender;
	
  @NotEmpty(message = "Phone must not be empty")
	private String phone;
  
  
  @NotEmpty(message = "Credit rating must not be empty")
	private int credit_rating;
  
  
  @NotEmpty(message = "Bank must not be empty")
	private String bank;
  
    @NotEmpty(message = "IC must not be empty")
	private String ic;
  
	@NotEmpty(message = "Email must not be empty")
	@Email(message = "Email must be a valid email address")
	private String email;

	public Customer() {
	}

	public String getCIF() {
		return cif;
	}

	public void setCIF(String cif) {
		this.cif = cif;
	}

  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
  
  public Date getDOB() {
		return dob;
	}

	public void setDOB(Date dob) {
		this.dob = dob;
	}

  public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
  
  public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
  
  public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
  public int getCreditRating() {
		return credit_rating;
	}

	public void setCreditRating(int credit_rating) {
		this.credit_rating = credit_rating;
	}

  public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getIC() {
		return ic;
	}

	public void setIC(String ic) {
		this.ic = ic;
	}

  public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "CustomerVO [CIF=" + cif + ", Name=" + name + ", DOB=" + dob.toString() + ", Address=" + address + ", Gender=" + gender + ", Phone=" + phone + ", Credit Rating=" + credit_rating + ", Bank=" + bank + ", Email=" + email
				+ "]";
	}
}
