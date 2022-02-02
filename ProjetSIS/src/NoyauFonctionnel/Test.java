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
    
     Date date = new Date(2015,12,31,12,59);
     Date d = new Date(2015,1,31,12,59);
     System.out.println(d.equal(d));
     System.out.println(date.superieur(date));
     System.out.println(date.superieur(d));
     System.out.println(d.superieur(date));
     System.out.println(d.superieur(d));
    } 
}
