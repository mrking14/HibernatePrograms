package Embadded.e1;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Intern {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Intern_id;
	
	private String name;
	
	private int experience;
	
	private String city;
	
	private Certificate certificate;
	
	
	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Intern(String name, int experience, String city, Certificate certificate) {
		super();
		this.name = name;
		this.experience = experience;
		this.city = city;
		this.certificate = certificate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Intern [Intern_id=" + Intern_id + ", name=" + name + ", experience=" + experience + ", city=" + city
				+ ", certificate=" + certificate + "]";
	}
	
	
	
	

}
