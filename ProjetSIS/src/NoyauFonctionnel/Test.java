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
    
     Medecin med = new Medecin("Frédéric","Muller","12janvier22","radiologie");
     Medecin decin = new Medecin("Jeanne","Létoile","124563","radiologie");
     System.out.println(med.equals(med));
     System.out.println(med.equals(decin));
    } 
}
