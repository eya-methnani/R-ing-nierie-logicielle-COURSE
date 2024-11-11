package Logique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionBD {
	
	Connection connexion;
	Statement instruction;
	ResultSet resultat;

	
	
	
	
	public ConnexionBD() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			//2/ouverture la cnx
			connexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionetudiantss","root","root");
			//3/Pour executer 2 types de requetes : modification + consultation
			instruction= connexion.createStatement();
			
			System.out.println("Connexion reussite");
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Probleme de pilote");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Echec de connexion");
		}
	}
	
	public void miseAJour(String req) {
		
		try {
		
			instruction.executeUpdate(req);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
		/*	e.printStackTrace();
			System.err.println("Requ�te incorrecte"+req);*/
			
		}
	}
	
public void supp(String req) {
		
		try {
		
			instruction.executeUpdate(req);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
		/*	e.printStackTrace();
			System.err.println("Requ�te incorrecte"+req);*/
			
		}
	}
	
	
	public void arret() {
        try {
            if (resultat != null) resultat.close();
            if (instruction != null) instruction.close();
            if (connexion != null) connexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
	public void lire(String req) {
		
		try {
			resultat = instruction.executeQuery(req);
			int i=0;
			
			while (resultat.next()) {
				int num=resultat.getInt("ID");
				String nom=resultat.getString("name");
				System.out.println("ID = "+num +", name ="+nom);
				i++;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.err.println("Requ�te incorrecte"+req);
			
		}
		
	}
	
}
