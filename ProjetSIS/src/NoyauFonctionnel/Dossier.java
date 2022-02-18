package NoyauFonctionnel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pauline KIEFER
 */
public class Dossier {
    private Patient patient;
    private DMR dmr;
    
    public Dossier(Patient patient, DMR dmr){
        this.patient=patient;
        this.dmr=dmr;
    }
    
    public Patient getPatient(){
        return patient;
    }
    
    public DMR getDmr(){
        return dmr;
    }
    
    public String patientToString(){
        String s;
        s="identifiant : ";
        s+=patient.getPassif()+" "+patient.getType()+"\n";
        s+="nom : ";
        s+=patient.getNom()+"\n";
        s+="prénom : ";
        s+=patient.getPrenom()+"\n";
        s+="date de naissance : ";
        s+=patient.getDatenais()+"\n";
        s+="adresse : ";
        s+=patient.getAdresse();
        return s;
    }
}
