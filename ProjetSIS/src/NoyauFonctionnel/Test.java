/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NoyauFonctionnel;

import java.util.ArrayList;

/**
 *
 * @author Pauline KIEFER
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Date date = new Date(2015,12,31);
     Date d = new Date(2018,1,28,10,12);
     DICOM dic = new DICOM("type", "passif");
     Patient p = new Patient(dic,"Kiefer","Pauline",date,"18 avenue Pierre Semard 38400 SMH");
     Patient p1 = new Patient(dic,"K","Paul",date,"18 avenue Pierre Semard 38400 SMH");
     ArrayList liste = new ArrayList();
     TypeImagerie type=TypeImagerie.ANGIOIRM;
     TypeImagerie type1=TypeImagerie.ECHOGRAPHIE;
     Examen e =new Examen(d,"Fred",type,"tout va bien");
     Examen e1 =new Examen(d,"Freddy",type1,"tout va bien",21);
     Genre g = Genre.M;
     DMR dmr = new DMR(liste,dic,"K","Paul",date,g);
     dmr.ajouterExam(e1);
     dmr.ajouterExam(e);
     dmr.afficheListeExam();
    } 
}
