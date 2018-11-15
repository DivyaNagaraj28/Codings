package pojoClasses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop_1_Many {
    @Id
	private int LaptopId;
	
	private String LaptopName;
    @ManyToOne
	private OneToManymap one2many;
	
	public OneToManymap getOne2many() {
		return one2many;
	}
	public void setOne2many(OneToManymap one2many) {
		this.one2many = one2many;
	}
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

