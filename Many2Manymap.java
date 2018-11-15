package pojoClasses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee_many2many")
public class Many2Manymap {
	@Id
	private int EmployeeId;
	
	private String EmployeeName;
	@ManyToMany(mappedBy="many2many")
	private List<Laptop_Many2Many> laptop = new ArrayList<>();
	
	public Many2Manymap()
	{
		
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public List<Laptop_Many2Many> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop_Many2Many> laptop) {
		this.laptop = laptop;
	}
	

}
