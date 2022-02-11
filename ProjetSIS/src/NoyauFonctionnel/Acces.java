package NoyauFonctionnel;

/**
 *
 * @author Arthur
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class Acces {
    
private static final String tablepat = "PATIENT";

public static void AjoutPatient(Patient P) throws SQLException {

RequeteType requeteType = new RequeteType();
String Type = P.getType();
String Passif =P.getPassif();
String id =""+Passif+""+Type;
// ATTENTION DOUBLONS//

String update ="Id,Nom,prenom,Datenais,Adresse,Type,Passif";
PreparedStatement prepupdate = requeteType.insert(tablepat, update);
prepupdate.setString(1, id);
prepupdate.setString(2, P.getNom());
prepupdate.setString(3, P.getPrenom());
prepupdate.setString(4, P.getDatenais().toString());
prepupdate.setString(5, P.getAdresse());
prepupdate.executeUpdate();
requeteType.close();
}



public static void LecturePatient(Connection conn) throws SQLException {
try {
// create new statement
Statement st = conn.createStatement();
///à obtenir automatiquement aussi
String Nom = "Vasson";//getnom
String Prenom = "Arthur";//getprenom
Date Datenais = new Date(2000,02,29);//getdatenais
String Adresse = "21 rue de Verlande";//getadresse
////
String query = "SELECT "+Nom+","+Prenom+","+Datenais+","+Adresse+" FROM personne";
//String query = "SELECT Nom,Prenom,Datenais,Adresse FROM personne";

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

public static void AjoutDMR(DMR dmr) throws SQLException {
RequeteType requeteType = new RequeteType();

String update ="date,PH,type,PACS";
PreparedStatement prepupdate = requeteType.insert(tablepat, update);
prepupdate.setString(1, dmr.getIdPatient().toString());
prepupdate.setString(2, dmr.getNomPatient());
prepupdate.setString(3, dmr.getPrenomPatient());
prepupdate.setString(4, dmr.getDatenais().toString());
prepupdate.setString(5, dmr.getGenre().toString());
prepupdate.executeUpdate();
requeteType.close();
}
public static void LectureDMR(Connection conn) throws SQLException {
try {
// create new statement
Statement st = conn.createStatement();
///à obtenir automatiquement aussi
String Nom = "Vasson";//getnom
String Prenom = "Arthur";//getprenom
Date Datenais = new Date(2000,02,29);//getdatenais
String Adresse = "21 rue de Verlande";//getadresse
////
String query = "SELECT "+Nom+","+Prenom+","+Datenais+","+Adresse+" FROM personne";
//String query = "SELECT Nom,Prenom,Datenais,Adresse FROM personne";

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

public static void AjoutExamen(Connection conn) throws SQLException {
// Get a statement from the connection
Statement st = conn.createStatement();
// A CHANGER JE VEUX POUVOIR LE FAIRE AUTOMATIQUEMENT AVEC LE BOUTON//
String Nom = "Vasson";//getnom
String Prenom = "Arthur";//getprenom
Date Datenais = new Date(2000,02,29);//getdatenais
String Adresse = "21 rue de Verlande";//getadresse
////
String update ="INSERT INTO personne(Id,Nom,prenom,Datenais,Adresse) VALUES('1','"+Nom+"','"+Prenom+"','"+Datenais+"','"+Adresse+"')";
int nb = st.executeUpdate(update);
System.out.println("Nombre de lignes insérées = " + nb);//retours du nombre de lignes, secondaire
st.close();
}

public static void LectureExamen(Connection conn) throws SQLException {
try {
// create new statement
Statement st = conn.createStatement();
///à obtenir automatiquement aussi
String Nom = "Vasson";//getnom
String Prenom = "Arthur";//getprenom
Date Datenais = new Date(2000,02,29);//getdatenais
String Adresse = "21 rue de Verlande";//getadresse
////
String query = "SELECT "+Nom+","+Prenom+","+Datenais+","+Adresse+" FROM personne";
//String query = "SELECT Nom,Prenom,Datenais,Adresse FROM personne";

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
