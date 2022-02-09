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
// A CHANGER JE VEUX POUVOIR LE FAIRE AUTOMATIQUEMENT AVEC LE BOUTON//
String Nom = "Vasson";//getnom
String Prenom = "Arthur";//getprenom
Date Datenais = new Date(2000,02,29);//getdatenais
String Adresse = "21 rue de Verlande";//getadresse
String Type = "testType";
String Passif ="testPassif";
String id =""+Passif+""+Type;
// ATTENTION DOUBLONS//
////
String update ="INSERT INTO personne(Id,Nom,prenom,Datenais,Adresse,Type,Passif) VALUES('"+id+"','"+Nom+"','"+Prenom+"','"+Datenais+"','"+Adresse+"','"+Type+"','"+Passif+"')";
int nb = st.executeUpdate(update);
System.out.println("Nombre de lignes insérées = " + nb);//retours du nombre de lignes, secondaire
st.close();
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

public static void AjoutDMR(Connection conn) throws SQLException {
// Get a statement from the connection
Statement st = conn.createStatement();
// A CHANGER JE VEUX POUVOIR LE FAIRE AUTOMATIQUEMENT AVEC LE BOUTON//
Date date = new Date(2000,02,29);//getdate
String PH = "Arthur";//getprenom
String type = "Cardiologie";//getdatenais
String PACS = "UID";//getadresse
////
String update ="INSERT INTO DMR(date,PH,type,PACS) VALUES('"+date+"','"+PH+"','"+type+"','"+PACS+"',')";
int nb = st.executeUpdate(update);
System.out.println("Nombre de lignes insérées = " + nb);//retours du nombre de lignes, secondaire
st.close();
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
