package image.imageHiber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class GetFetch {

	public static void main(String ... m) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session= sf.openSession();
		Address ad =(Address)session.get(Address.class, 1);
		System.out.println(ad.getCity());
		
		Address st =  session.load(Address.class, 1);
		System.out.println(st.getStreet());
		System.out.println(st.getImage());
		
		
		sf.close();

	}

}
