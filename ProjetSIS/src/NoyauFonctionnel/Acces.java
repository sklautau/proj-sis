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
private static final String tablesejour = "SEJOUR";
private static final String tablemedecin = "MEDECIN";
private static final String adresseBD = "jdbc:mysql://localhost:3306/sir";

public static Connection Identification(String utilisateur,String motDePasse) throws SQLException {
    RequeteType requeteType = new RequeteType(utilisateur,motDePasse);
    return requeteType.getConn();
}

public static void AjoutPatient(Patient P, Session s) throws SQLException {

RequeteType requeteType = new RequeteType(s);
String Type = P.getType();
String Passif =P.getPassif();
String id =""+Passif+""+Type;
// ATTENTION DOUBLONS//

String update ="id,nom,prenom,datenais,adresse";
PreparedStatement prepupdate = requeteType.insert(tablepat, update);
prepupdate.setString(1, id);
prepupdate.setString(2, P.getNom());
prepupdate.setString(3, P.getPrenom());
prepupdate.setString(4, P.getDatenais().toString());
prepupdate.setString(5, P.getAdresse());
prepupdate.executeUpdate();
requeteType.close();
}



public static String LecturePatient(String nom,String prenom,String datenais, Session s) throws SQLException {

            RequeteType requeteType = new RequeteType(s);
            String query = "SELECT * FROM " + tablepat + " where nom = '" + nom +"'AND prenom = '"+prenom+"'";//AND datenais ='"+datenais+"'";
            System.out.println(query);
            ResultSet resultat = requeteType.select(query);
            System.out.println("test");
            Patient p = null;
            while (resultat.next()) {
                String id = resultat.getString(1);
                //String nomp = resultat.getString(2);
                //String prenom = resultat.getString(3);
                //String datenais = resultat.getString(4);
                String adresse = resultat.getString(5); 
                Date date=toDate(datenais);
                DICOM idp = new DICOM(""+id);
                p = new Patient(idp, nom, prenom, date, adresse);
                System.out.println(p);
            }
            requeteType.close();
            return p.toString();

}

public static void AjoutExamen(Examen examen, Session s) throws SQLException {
RequeteType requeteType = new RequeteType(s);

String update ="dicom,k,dateexam,ph,type,cr,pacs";
PreparedStatement prepupdate = requeteType.insert(tableexam, update);
prepupdate.setString(1, examen.getId());
prepupdate.setString(2, examen.getNom());
prepupdate.setString(3, examen.getDate());
prepupdate.setString(4, examen.getNomDocteur());
prepupdate.setString(5, examen.getTypeExamen().getTypeImagerie());
prepupdate.setString(6, examen.getCompteRendu());
prepupdate.setString(7, examen.getCodePACS());
prepupdate.executeUpdate();
requeteType.close();
}

public static String LectureExamen(String type,String dateexam, Session s,String k) throws SQLException {
RequeteType requeteType = new RequeteType(s);
            String query = "SELECT * FROM " + tableexam + " where type = '" + type + "'AND prenom = '"+k+"'";
            System.out.println(query);
            ResultSet resultat = requeteType.select(query);
            Examen e = null;
            int temp = 0;
            while (resultat.next()) {
                String id = resultat.getString(1);
                //String dateexam2 = resultat.getString(3);
                String nomdocteur = resultat.getString(4);
                //String type = resultat.getString(5);
                String compterendu = resultat.getString(6);   
                String PACS = resultat.getString(7);
                Date date=toDate(dateexam);
                TypeImagerie t=TypeImagerie.ANDIODIGITALISEE;
                t=t.getTypeImagerie(type);
                DICOM ide = new DICOM(""+id);
                if (PACS.equals("false")){
                    temp = 0;
                }
                else{
                   temp =Integer.valueOf(PACS);
                }
                e = new Examen(ide,k,date, nomdocteur, t, compterendu, temp);
            }
            requeteType.close();
            return(e.toString());
}
public static String Sejour(String CPS) throws SQLException {

            RequeteType requeteType = new RequeteType(CPS,"macarel");
            String query = "SELECT * FROM " + tablesejour + " where idsej = '" + CPS +"'"; //AND datenais ='"+datenais+"'";
            System.out.println(query);
            ResultSet resultat = requeteType.select(query);
            System.out.println("test");
            Patient p = null;
            String date ="";
            while (resultat.next()) {
                String d = resultat.getString(2);
                date=d;
            }
           
            requeteType.close();
            return date;

}
public static Date toDate(String x){
        String[] parts =x.split("/");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        Date date = new Date(Integer.valueOf(part3),Integer.valueOf(part2),Integer.valueOf(part1));
        return date;
    }
}
