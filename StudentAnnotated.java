package pojoClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_info")
public class StudentAnnotated {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int student_Id;
	@Column(name="Name")
	private String student_Name;
	@Column(name="Phone_num")
	private int student_phone_num;
	
	public StudentAnnotated()
	{
		
	}

	public StudentAnnotated(/*int student_Id,*/ String student_Name, int student_phone_num) {
		super();
		//this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.student_phone_num = student_phone_num;
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public int getStudent_phone_num() {
		return student_phone_num;
	}

	public void setStudent_phone_num(int student_phone_num) {
		this.student_phone_num = student_phone_num;
	}

	@Override
	public String toString() {
		return "StudentAnnotated [student_Id=" + student_Id + ", student_Name=" + student_Name + ", student_phone_num=" + student_phone_num + "]";
	}
	
	

}
