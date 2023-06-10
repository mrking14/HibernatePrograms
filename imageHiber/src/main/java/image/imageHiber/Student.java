package image.imageHiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int s_Id;
	private String studentName;
	private String city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getS_Id() {
		return s_Id;
	}

	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [s_Id=" + s_Id + ", studentName=" + studentName + ", city=" + city + "]";
	}

}
