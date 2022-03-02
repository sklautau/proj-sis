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



public static void LecturePatient(DICOM id) throws SQLException {

            RequeteType requeteType = new RequeteType();
            String query = "SELECT * FROM " + tablepat + " where NIP = '" + id + "'";
            System.out.println(query);
            ResultSet resultat = requeteType.select(query);
            System.out.println("test");
            Patient p = null;
            while (resultat.next()) {
                String nom = resultat.getString(2);
                String prenom = resultat.getString(3);
                String datenais = resultat.getString(4);
                String adresse = resultat.getString(5); 
                Date date=toDate(datenais);
                p = new Patient(id, nom, prenom, date, adresse);
            }
            requeteType.close();
            p.toString();

}

public static void AjoutExamen(Examen examen) throws SQLException {
RequeteType requeteType = new RequeteType();

String update ="dicom,dateexam,ph,type,cr,pacs";
PreparedStatement prepupdate = requeteType.insert(tableexam, update);
prepupdate.setString(1, examen.getId());
prepupdate.setString(2, examen.getDate());
prepupdate.setString(3, examen.getNomDocteur());
prepupdate.setString(4, examen.getTypeExamen().getTypeImagerie());
prepupdate.setString(5, examen.getCompteRendu());
prepupdate.setString(6, examen.getCodePACS());
prepupdate.executeUpdate();
requeteType.close();
}
/**
public static void LectureExamen(DICOM id) throws SQLException {
RequeteType requeteType = new RequeteType();
            String query = "SELECT * FROM " + tableexam + " where id = '" + id + "'";
            System.out.println(query);
            ResultSet resultat = requeteType.select(query);
            System.out.println("test");
            Examen e = null;
            while (resultat.next()) {
                String dateString = resultat.getString(1);
                String nomdocteur = resultat.getString(2);
                String type = resultat.getString(3);
                String compterendu = resultat.getString(4);   
                String PACS = resultat.getString(5);
                Date date=toDate(dateString);
                TypeImagerie t=TypeImagerie.ANDIODIGITALISEE;
                if (type.equals("ANGIOCTSCANNER")){
                    t=t.ANGIOCTSCANNER;
                }
                else if (type.equals("ANGIOIRM")){
                    t=t.ANGIOIRM;
                }
                else if (type.equals("ARTHROSCANNER")){
                    t=t.ARTHROSCANNER;
                }
                else if (type.equals("BIOPSIESEIN")){
                    t=t.BIOPSIESEIN;
                }
                else if (type.equals("BIOPSIEFLUOROSCANNER")){
                    t=t.BIOPSIEFLUOROSCANNER;
                }
                else if (type.equals("CHOLANGIOIRM")){
                    t=t.CHOLANGIOIRM;
                }
                else if (type.equals("COLONLAVEMENT")){
                    t=t.COLONLAVEMENT;
                }
                else if (type.equals("CTCOLONOGRAPHIE")){
                    t=t.CTCOLONOGRAPHIE;
                }
                else if (type.equals("CTCORONOGRAPHIE")){
                    t=t.CTCORONOGRAPHIE;
                }
                else if (type.equals("CTSCANNERVOLUMIQUE")){
                   t=t.CTSCANNERVOLUMIQUE; 
                }
                else if (type.equals("CYSTOGRAPHIESUSPUBIENNE")){
                    t=t.CYSTOGRAPHIESUSPUBIENNE;
                }
                else if (type.equals("DEFECOIRM")){
                    t=t.DEFECOIRM;
                }
                else if (type.equals("DENTASCANNER")){
                    t=t.DENTASCANNER;
                }
                else if (type.equals("ECHOGRAPHIEREFLUXPEDIATRIQUE")){
                    t=t.ECHOGRAPHIEREFLUXPEDIATRIQUE;
                }
                else if (type.equals("ECHOGRAPHIEDOPPLER")){
                    t=t.ECHOGRAPHIEDOPPLER;
                }
                else if (type.equals("ECHOGRAPHIE")){
                    t=t.ECHOGRAPHIE;
                }
                else if (type.equals("ENTEROCTSCANNER")){
                    t=t.ENTEROCTSCANNER;
                }
                else if (type.equals("HYSTEROGRAPHIE")){
                    t=t.HYSTEROGRAPHIE;
                }
                else if (type.equals("INFILTRATIONINTERAPOPHYSAIRE")){
                   t=t.INFILTRATIONINTERAPOPHYSAIRE; 
                }
                else if (type.equals("INFILTRATIONPERIRADICULAIRE")){
                   t=t.INFILTRATIONPERIRADICULAIRE; 
                }
                else if (type.equals("IRM")){
                   t=t.IRM; 
                }
                else if (type.equals("IMAMMOTEST")){
                    t=t.MAMMOTEST;
                }
                else if (type.equals("OEDTRANSIT")){
                    t=t.OEDTRANSIT;
                }
                else if (type.equals("OSTEODENSITOMETRIE")){
                   t=t.OSTEODENSITOMETRIE; 
                }
                else if (type.equals("PELVIMETRIE")){
                    t=t.PELVIMETRIE;
                }
                else if (type.equals("PONCTIONTHYROIDE")){
                    t=t.PONCTIONTHYROIDE;
                }
                else if (type.equals("RADIOLOGIECONVENTIONNELLE")){
                    t=t.RADIOLOGIECONVENTIONNELLE;
                }
                else if (type.equals("SENOLOGIE")){
                    t=t.SENOLOGIE;
                }
                else {
                    t=t.UROGRAPHIEIV;
                }
                e = new Examen(date, nomdocteur, t, compterendu, Integer.valueOf(PACS));
            }
            requeteType.close();
            e.toString();
}
*/
public static Date toDate(String s){
        String[] parts = s.split("/");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        Date date = new Date(Integer.valueOf(part3),Integer.valueOf(part2),Integer.valueOf(part1));
        return date;
    }
}
