package pojoClasses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Laptop_Many2Many {
    @Id
	private int LaptopId;
	
	private String LaptopName;
    @ManyToMany
    private List<Many2Manymap> many2many = new ArrayList<>();
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
	public List<Many2Manymap> getMany2many() {
		return many2many;
	}
	public void setMany2many(List<Many2Manymap> many2many) {
		this.many2many = many2many;
	}
    
    
}

	