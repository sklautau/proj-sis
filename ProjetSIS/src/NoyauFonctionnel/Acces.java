package NoyauFonctionnel;

/**
 *
 * @author Arthur
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Acces {

public static void AjoutPatient(Connection conn) throws SQLException {
// Get a statement from the connection
Statement st = conn.createStatement();
// A CHANGER JE VEUX POUVOIR LE FAIRE AUTOMATIQUEMENT//
String update ="";
String Nom = "Vasson";
String Prenom = "Arthur";
Date datenais = Date(2000,02,29);
int nb = st.executeUpdate("INSERT INTO personne(Id,Nom,prenom,Datenais,Adresse) VALUES(‘id’, ‘prenom’,'nom','datenais','adresse')");
////
System.out.println("Nombre de lignes insérées = " + nb);
st.close();
}
public static void LecturePatient(Connection conn) throws SQLException {
try {
// create new statement
Statement st = conn.createStatement();
String query = "SELECT Nom,Prenom,Datenais,Adresse FROM personne";
ResultSet rs = st.executeQuery(query);
while (rs.next()) {
String nom = rs.getString(1);
String prenom = rs.getString(2);
java.sql.Date DateNais = rs.getDate(3);//format d'une date à chercher 
String adresse = rs.getString(4);   

System.out.printf("%-20s | %-20s | %3d\n", nom, prenom, DateNais,adresse);
}
} finally {
// close statement and connection
if (conn != null)
conn.close();
}
}




}
