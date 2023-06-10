package image.imageHiber;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {

		System.out.println("Hello World!");

//		Configuration cfg = new Configuration();
//		cfg.configure();
//		
//		
//		SessionFactory sf = cfg.buildSessionFactory();
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();

		Student s1 = new Student();
		s1.setStudentName("Masoom Raza");
		s1.setCity("Muzaffarpur");
		s1.setS_Id(27);
		
		session.save(s1);
		
		Address ad = new Address();
		ad.setCity("Okhla");
		ad.setStreet("Shaheen Bagh");
		ad.setAddedDate(new Date());
		ad.setX(24687.35468);
		ad.setOpen(true);
		
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream("src/main/java/IMG.png");
		byte [] bimg = new byte[fis.available()];
		fis.read(bimg);
		ad.setImage(bimg);
		
		
		session.save(ad);

//		Here I am Getting data from Emp classs and printing on console.

//		Student stud = session.get(Student.class, 14);
//		System.out.println(stud);
		
		ts.commit();
		session.close();
		
//		GetFetch.getFetch();
	}
}
