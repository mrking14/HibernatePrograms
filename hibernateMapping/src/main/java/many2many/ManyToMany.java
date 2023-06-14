package many2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Worker w = new Worker();
		w.setName("Masoom");
		w.setWorker_Id(14);
		
		Worker w1 = new Worker();
		w1.setName("jawed");
		w1.setWorker_Id(15);
		
		Worker w2 = new Worker();
		w2.setName("Rehan");
		w2.setWorker_Id(16);
		
		Project p = new Project();
		p.setP_Id(88);
		p.setProject_Info("Software Devlopment");
		
		Project p2 = new Project();
		p2.setP_Id(89);
		p2.setProject_Info("Web Devlopment");
		
		Project p1 = new Project();
		p1.setP_Id(90);
		p1.setProject_Info("Testing");
		
		List<Worker> li = new ArrayList<Worker>();
		List<Project> li1 = new ArrayList<Project>();
		
		li.add(w);
		li.add(w1);
		li.add(w2);
		
		li1.add(p);
		li1.add(p1);
		li1.add(p2);
		
		w.setProjects(li1);
		w1.setProjects(li1);
		w2.setProjects(li1);
		
		p.setWorkers(li);
		p1.setWorkers(li);
		p2.setWorkers(li);
		
		session.save(w);
		session.save(w1);
		session.save(w2);
		
		session.save(p);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		sf.close();	
			

	}

}
