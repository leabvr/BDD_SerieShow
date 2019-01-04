package fr.lbouvier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDDProgram {
	
	private static final String Database_url = "jdbc:mysql://localhost:3306/Serie_show?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String Database_login = "root";
	private static final String Database_secret = "activ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	private static final void utiliserSelect() {
		try {
			// Ouvrir une connexion avec notre BDD sur mysql
			Connection connexion  = DriverManager.getConnection(Database_url, Database_login, Database_secret);
			String request = "Select * from Series";
			
			Statement executeur = connexion.createStatement();
			
			ResultSet resultat = executeur.executeQuery(request);
			
			//Afficher nos titres de notre BDD
			while (resultat.next()) {
				System.out.println(resultat.getString("S_titre"));
			}
			
			// Fermer la connexion ainsi que les autres ouvertures
			resultat.close();
			executeur.close();
			connexion.close();
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	private static final void utiliserInsert() {
//		try {
//			// Ouvrir une connexion avec notre BDD sur mysql
//			Connection connexion  = DriverManager.getConnection(Database_url, Database_login, Database_secret);
//			String request = "insert into realisateur (real_nom, real_prenom) VALUE (?,?)";
//			
//			PreparedStatement preparateur = connexion.prepareStatement(request);
//			
//			preparateur.setString(1, "Rhimes");
//			preparateur.setString(2, "Shonda");
//			
//			preparateur.execute();
//			
//			preparateur.close();
//			connexion.close();
//			
//	
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
