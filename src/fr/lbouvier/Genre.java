package fr.lbouvier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Genre {

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/SerieShow?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DATABASE_LOGIN = "root";
	private static final String DATABASE_SECRET = "1906RCLens20061998";

	
	private static final void utiliserInsertGenre() {
		try {
			Connection connexion = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "INSERT INTO Genre (G_type) VALUE (?)";
			PreparedStatement preparateur = connexion.prepareStatement(requete);
			preparateur.setString(1, "Drame");
			preparateur.execute();
			
			preparateur.setString(1, "Thriller");
			preparateur.execute();
			
			preparateur.setString(1, "Tragi-comique");
			preparateur.execute();
			
			preparateur.setString(1, "Comédie dramatique");
			preparateur.execute();
			
			preparateur.setString(1, "Médical");
			preparateur.execute();
						
			preparateur.setString(1, "Sitcom");
			preparateur.execute();
			
			
			preparateur.setString(1, "Fantastique");
			preparateur.execute();
			
			
			preparateur.setString(1, "Mystères");
			preparateur.execute();
			
			
			preparateur.setString(1, "Aventure");
			preparateur.execute();
			
			
			preparateur.setString(1, "Drame Historique");
			preparateur.execute();
			
			
			preparateur.setString(1, "Policier");
			preparateur.execute();
			
			
			preparateur.setString(1, "Action");
			preparateur.execute();
			
			
			preparateur.setString(1, "Science-Fiction");
			preparateur.execute();
			
			
			preparateur.setString(1, "Supernaturel");
			preparateur.execute();
			
			
			preparateur.setString(1, "Judiciaire");
			preparateur.execute();
			
			preparateur.setString(1, "Musical");
			preparateur.execute();
			
			preparateur.setString(1, "Horreur");
			preparateur.execute();
			
			preparateur.close();
			connexion.close();
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
