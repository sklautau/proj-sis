/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NoyauFonctionnel;

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
     DICOM dic = new DICOM("type", "passif");
     Patient p = new Patient(dic,"Kiefer","Pauline",date,"18 avenue Pierre Semard 38400 SMH");
        System.out.println(p.toString());
    } 
}
