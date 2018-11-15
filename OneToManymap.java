package pojoClasses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name="Employee_1_many")
public class OneToManymap {
	@Id
	private int EmployeeId;
	
	private String EmployeeName;
	@OneToMany(mappedBy="one2many")
	private List<Laptop_1_Many> laptop = new ArrayList<>();
	
	public OneToManymap()
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
	public List<Laptop_1_Many> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop_1_Many> laptop) {
		this.laptop = laptop;
	}
	

}
