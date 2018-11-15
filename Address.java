package pojoClasses;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="Street_number")
	private int Number;
	private String Store;
	private int Contact_Number;
	
	public Address()
	{
		
	}

	public Address(int number,String store,int contact_Number) {
		super();
		Number = number;
		Store = store;
		Contact_Number = contact_Number;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public int getContact_Number() {
		return Contact_Number;
	}

	public void setContact_Number(int contact_Number) {
		Contact_Number = contact_Number;
	}

	public String getStore() {
		return Store;
	}

	public void setStore(String store) {
		Store = store;
	}

	@Override
	public String toString() {
		return "Address [Number=" + Number + ", Contact_Number=" + Contact_Number + ", Store=" + Store + "]";
	}

}