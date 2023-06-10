package Embadded.e1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
         Transaction tx =  session.beginTransaction();
        
//         Here I've Created Certificate object and set the data 
        Certificate cr = new Certificate();
        cr.setCertificate_Id("java14");
        cr.setCourse("Java");
        cr.setDuration("6 Month");
        cr.setInstitute("Ducat");
        
        Intern intern = new Intern();
        intern.setName("MR King");
        intern.setCity("Muzaffarpur");
        intern.setExperience(1);
        intern.setCertificate(cr); // Here I am inserting Certificate object in Inser certificate Field
        
        session.save(intern);
        
         Intern in = session.get(Intern.class, 3);
         System.out.println(in);
        tx.commit();
        sf.close();
        
    }
}
