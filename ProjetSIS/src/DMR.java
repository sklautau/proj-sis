

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pauline KIEFER
 */
import java.util.ArrayList;

public class DMR {
    private ArrayList listeExam;
    private DICOM idPatient;
    private String nomPatient;
    private String prenomPatient;
    private Date datenais;
    private Genre genre;
    
    public DMR(ArrayList liste, DICOM idPatient, String nomPatient, String prenomPatient, Date datenais, Genre genre){
       this.listeExam=liste;
       this.idPatient=idPatient;
       this.nomPatient=nomPatient;
       this.prenomPatient=prenomPatient;
       this.datenais=datenais;
       this.genre=genre;
    }
    
    public void afficheListeExam(){
        for(int i=0;i<listeExam.size();i++){
            System.out.println(listeExam.get(i));
        }
    }
    
    public DICOM getIdPatient(){
        return idPatient;
    }
    
    public String getNomPatient(){
        return nomPatient;
    }
    
    public String getPrenomPatient(){
        return prenomPatient;
    }
    
    public Date datenais(){
        return datenais;
    }
    
    public Genre getGenre(){
        return genre;
    }
    
    public void ajouterExam(Examen examen){
        listeExam.add(examen);
    }
}
