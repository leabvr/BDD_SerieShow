package fr.lbouvier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Saison_Episode {

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/SerieShow?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DATABASE_LOGIN = "root";
	private static final String DATABASE_SECRET = "activ";
	
	
	public static void ajouterEpisode (int nombreepisode)
	{
		Connection connection;
		try {
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "INSERT INTO episode (ep_ID_serie, ep_ID_Saison, ep_temps, ep_vu) VALUE(?,?,?,?)";
			PreparedStatement preparateur = connection.prepareStatement(requete);
			for (int i=1; i<=nombreepisode; i++)
			{
				preparateur.setString(1, "");
				preparateur.setString(2, "");
				preparateur.setString(3, "");
				//episode non vu par defaut
				preparateur.setString(4, "0");
				preparateur.execute();
				
			}
			preparateur.close();
			connection.close();
						
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	
	public static void ajouterSaison (int nombresaison)
	{

		Connection connection;
		try {
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_LOGIN, DATABASE_SECRET);
			String requete = "INSERT INTO episode (Sa_ID_serie) VALUE(?)";
			PreparedStatement preparateur = connection.prepareStatement(requete);
			for (int i=1; i<=nombresaison; i++)
			{
				preparateur.setString(1, "");
				preparateur.execute();
			}
			
			preparateur.close();
			connection.close();
						

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
