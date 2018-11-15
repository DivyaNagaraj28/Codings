package pojoClasses;

import javax.persistence.*;

@Entity
@Table(name="Phone_Details")
public class Phone {

	@Id@GeneratedValue
	private int id;

	private String UserName;
	private String productName;
	private String RegCode;
	@Embedded
	private Address address;


	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Phone(String name, String product,String regCode) {
		super();
		UserName = name;
		productName=product;
		RegCode = regCode;
	}
	public String getName() {
		return UserName;
	}
	public void setName(String name) {
		this.UserName = name;
	}

	public String getRegCode() {
		return RegCode;
	}
	public void setRegCode(String regCode) {
		RegCode = regCode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
