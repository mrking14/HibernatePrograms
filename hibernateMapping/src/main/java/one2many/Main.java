package one2many;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Question q = new Question();
		q.setqId(91);
		q.setQuestion("Which languages can be used as backend language?");
		
		
		Answer a = new Answer();
		a.setaId(11);
		a.setQuestion(q);
		a.setAnswer("1.  Java");
		
		
		Answer a1 = new Answer();
		a1.setaId(12);
		a1.setQuestion(q);
		a1.setAnswer("2. Python");
		
		Answer a2 = new Answer();
		a2.setaId(13);
		a2.setQuestion(q);
		a2.setAnswer("3. javaScript");
	
//		Here We need to create a list of answers.
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		
//		Here I am passing answes's list in Question' Answer.
		
		q.setAnswer(list);
		
		session.save(a);
		session.save(a1);
		session.save(a2);
		session.save(q);
		tx.commit();
		
		
//		From Here I am Fetching data from sql.
		Question qs= (Question) session.get(Question.class, 91);
		System.out.println(qs.getqId());
		System.out.println(qs.getQuestion());
		for(Answer ans :qs.getAnswer()) {
			System.out.println(ans.getAnswer());
		}
		
		session.close();
		sf.close();
		

	}

}
