package dao;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import domaine.Etudiant;


public class EtudiantDAO {
	

	    public static void main(String[] args) {
	        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	        //  session
	        Session session = sessionFactory.openSession();
	         // instance
	        Etudiant e1=new Etudiant();
	        e1.setId(106);
	        e1.setNom("foulenfoulen");

	        
	        Transaction transaction = session.beginTransaction();

	        // sauvegarde de letud
	        session.save(e1);

	        transaction.commit();

	        // Close session
	        session.close();

	        // la consultation
	        session = sessionFactory.openSession();
	        Etudiant etudiant = session.get(Etudiant.class, 106);
	        System.out.println("Etudiant with ID 104: " + etudiant.getNom());

	        // mise a jour de l'etud
	        transaction = session.beginTransaction();
	        etudiant.setNom("foulen");	
	        session.update(etudiant);
	        transaction.commit();
	        
	        System.out.println("Etudiant with ID 104: " + etudiant.getNom());

	        
	        
	        

	        // supp etudiant
	        transaction = session.beginTransaction();
	        session.delete(etudiant);
	        transaction.commit();
	        
	        System.out.println("Etudiant with ID 104: " + etudiant.getNom());


	        // terminer la session
	        session.close();
	        sessionFactory.close();
	    }
	}
