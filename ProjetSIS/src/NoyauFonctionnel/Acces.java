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
private static final String tableexam = "EXAMEN";
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



public static void LecturePatient(DICOM id) throws SQLException {

            RequeteType requeteType = new RequeteType();
            String query = "SELECT * FROM " + tablepat + " where NIP = '" + id + "'";
            System.out.println(query);
            ResultSet resultat = requeteType.select(query);
            System.out.println("test");
            Patient p = null;
            Date date = new Date(2000,02,29);
            while (resultat.next()) {
                String nom = resultat.getString(2);
                String prenom = resultat.getString(3);
                String datenais = resultat.getString(4);
                String adresse = resultat.getString(5);              
                p = new Patient(id, nom, prenom, date, adresse);
            }
            requeteType.close();
            p.toString();

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
public static void AjoutExamen(Examen examen) throws SQLException {
RequeteType requeteType = new RequeteType();

String update ="date,PH,type,PACS";
PreparedStatement prepupdate = requeteType.insert(tablepat, update);
prepupdate.setString(1, examen.getDate());
prepupdate.setString(2, examen.getNomDocteur());
prepupdate.setString(3, examen.getTypeExamen().getTypeImagerie());
prepupdate.setString(4, examen.getCompteRendu());
prepupdate.setString(5, examen.getCodePACS());
prepupdate.executeUpdate();
requeteType.close();
}

public static void LectureExamen(DICOM id) throws SQLException {
RequeteType requeteType = new RequeteType();
            String query = "SELECT * FROM " + tableexam + " where id = '" + id + "'";
            System.out.println(query);
            ResultSet resultat = requeteType.select(query);
            System.out.println("test");
            Examen e = null;
            
            while (resultat.next()) {
                
                String date = resultat.getString(1);
               
                
                String nomdocteur = resultat.getString(2);
                String type = resultat.getString(3);
                String compterendu = resultat.getString(4);   
                String PACS = resultat.getString(5);
                //e = new Examen(date, nomdocteur, type, compterendu, PACS);
            }
            requeteType.close();
            e.toString();
}
}
