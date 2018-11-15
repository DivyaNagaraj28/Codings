package pojoClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
    @Id
	private int LaptopId;
	
	private String LaptopName;
	
	public int getLaptopId() {
		return LaptopId;
	}
	public void setLaptopId(int laptopId) {
		LaptopId = laptopId;
	}
	public String getLaptopName() {
		return LaptopName;
	}
	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}
}

