package one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		
		Questions q = new Questions();
		q.setqId(20);
		q.setQuestion("Where are you from?");
		
		Answers a = new Answers();
		a.setaId(95);
		a.setAnswer("I am from Muzaffarour Bihar.");
		
		q.setAnswer(a);
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(q);
		session.save(a);
		tx.commit();
		
		Questions que = (Questions) session.get(Questions.class, 15);
//	
//		System.out.println(que.getQuestion());
//		System.out.println(que.getAnswer().getAnswer());
		
		System.out.println(que);
		
		session.close();
		sf.close();
		
		
		
		

	}

}
