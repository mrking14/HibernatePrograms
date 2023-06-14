package many2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int p_Id;
	private String project_Info;
	@ManyToMany( mappedBy = "projects")
	private List<Worker> workers;
	
	public Project(int p_Id, String project_Info, List<Worker> workers) {
		super();
		this.p_Id = p_Id;
		this.project_Info = project_Info;
		this.workers = workers;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getP_Id() {
		return p_Id;
	}
	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}
	public String getProject_Info() {
		return project_Info;
	}
	public void setProject_Info(String project_Info) {
		this.project_Info = project_Info;
	}
	public List<Worker> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}
	
	
	
	

}
