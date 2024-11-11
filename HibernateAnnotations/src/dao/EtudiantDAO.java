package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import domaine.Etudiant;
import java.util.List;

public class EtudiantDAO {

    private SessionFactory factory;

    public EtudiantDAO() {
        // Creating configuration object
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); // Populates the data of the configuration file

        // Creating session factory object
        factory = cfg.buildSessionFactory();
    }

    // Create
    public void ajouterEtudiant(Etudiant etudiant) {
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        session.persist(etudiant);
        t.commit();
        session.close();
        System.out.println("Étudiant ajouté avec succès : " + etudiant);
    }

    // Read (Single)
    public Etudiant consulterEtudiant(int id) {
        Session session = factory.openSession();
        Etudiant etudiant = session.get(Etudiant.class, id);
        session.close();
        return etudiant;
    }

    // Read (All)
    public List<Etudiant> consulterTousLesEtudiants() {
        Session session = factory.openSession();
        List<Etudiant> listeEtudiants = session.createQuery("from Etudiant", Etudiant.class).list();
        session.close();
        return listeEtudiants;
    }

    // Update
    public void mettreAJourEtudiant(Etudiant etudiant) {
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        session.update(etudiant);
        t.commit();
        session.close();
        System.out.println("Étudiant mis à jour avec succès : " + etudiant);
    }

    // Delete
    public void supprimerEtudiant(int id) {
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Etudiant etudiant = session.get(Etudiant.class, id);
        if (etudiant != null) {
            session.delete(etudiant);
            System.out.println("Étudiant supprimé avec succès : " + etudiant);
        } else {
            System.out.println("Aucun étudiant trouvé avec l'ID : " + id);
        }
        t.commit();
        session.close();
    }

    public static void main(String[] args) {
        EtudiantDAO dao = new EtudiantDAO();

        // Exemple d'ajout d'étudiants
        dao.ajouterEtudiant(new Etudiant(103, "etudiant3"));
        dao.ajouterEtudiant(new Etudiant(204, "etudiant4"));

        // Exemple de consultation d'un étudiant
        Etudiant etudiant = dao.consulterEtudiant(103);
        System.out.println("Étudiant consulté : " + etudiant);

        // Exemple de consultation de tous les étudiants
        List<Etudiant> tousLesEtudiants = dao.consulterTousLesEtudiants();
        for (Etudiant e : tousLesEtudiants) {
            System.out.println(e);
        }

        // Exemple de mise à jour d'un étudiant
        if (etudiant != null) {
            etudiant.setNom("etudiant3 modifié");
            dao.mettreAJourEtudiant(etudiant);
        }

        // Exemple de suppression d'un étudiant
        dao.supprimerEtudiant(202);
    }
}
