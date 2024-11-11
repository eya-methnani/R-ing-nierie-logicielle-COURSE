package dao;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import domaine.Etudiant;


public class EtudiantDAO {
	
public static void main(String[] args) {
		
		//creating configuration object
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		
		//creating session factory object
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();
		
		//creating transaction object
		Transaction t=session.beginTransaction();
		
		//insert first student
		Etudiant e1=new Etudiant();
		e1.setId(10);
		e1.setNom("etudiant1");
		session.persist(e1);//persisting the object		
		
		//insert second student
		Etudiant e2=new Etudiant();
		e2.setId(20);
		e2.setNom("etudiant2");
		session.persist(e2);//persisting the object	
		
		t.commit();//transaction is commited
                System.out.println("successfully saved");
		
                //list all students
        		List<?> list = session.createQuery("from Etudiant").list();
        		Iterator<?> it = list.iterator();
        		while(it.hasNext())
        		{
        		 Etudiant e = (Etudiant)it.next();
        		 System.out.println(e.getId()+" "+ e.getNom());
        		}		
        		session.close();		
        	}
        }
