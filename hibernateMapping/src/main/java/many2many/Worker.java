package many2many;

import java.util.List;
import javax.persistence.ManyToMany ;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Worker {
	@Id
	private int worker_Id;
	private String name;
	
	@ManyToMany
	private List<Project> projects;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(int worker_Id, String name, List<Project> projects) {
		super();
		this.worker_Id = worker_Id;
		this.name = name;
		this.projects = projects;
	}

	public int getWorker_Id() {
		return worker_Id;
	}

	public void setWorker_Id(int worker_Id) {
		this.worker_Id = worker_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
	

}
