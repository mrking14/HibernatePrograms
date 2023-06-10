package Embadded.e1;

import javax.persistence.Embeddable;


// Here I am Embadding Certificate class in The Intern Table
@Embeddable
public class Certificate {
	private String certificate_Id;
	private String course;
	private String duration;
	private String Institute;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String certificate_Id, String course, String duration, String institute) {
		super();
		this.certificate_Id = certificate_Id;
		this.course = course;
		this.duration = duration;
		Institute = institute;
	}
	public String getCertificate_Id() {
		return certificate_Id;
	}
	public void setCertificate_Id(String certificate_Id) {
		this.certificate_Id = certificate_Id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getInstitute() {
		return Institute;
	}
	public void setInstitute(String institute) {
		Institute = institute;
	}
	
	
	

}
