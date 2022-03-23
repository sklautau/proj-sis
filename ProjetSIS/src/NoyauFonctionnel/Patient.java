package NoyauFonctionnel;

import static java.lang.Math.random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pauline KIEFER
 */
public class Patient {
    private DICOM id;
    private String nom;
    private String prenom;
    private Date datenais;
    private String adresse;
    
    public Patient(DICOM id, String nom, String prenom, Date date, String adresse){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.datenais=date;
        this.adresse=adresse;
    }
    
    public Patient(String nom, String prenom, Date date, String adresse){
        double m=Math.random();
        id=new DICOM();
        this.nom=nom;
        this.prenom=prenom;
        this.datenais=date;
        this.adresse=adresse;
    }
    
    public String getPassif(){
        return id.getPassif();
    }
    
    public String getType(){
        return id.getType();
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public Date getDatenais(){
        return datenais;
    }
    
    public String getAdresse(){
        return adresse;
    }
    
    public boolean equal(Patient p){
        return (p.id==id && p.nom==nom && p.prenom==prenom && p.datenais==datenais && p.adresse==adresse);
    }
    
    public String toString(){
        String s;
        s="";
        s+="nom : ";
        s+=nom+"\n";
        s+="prénom : ";
        s+=prenom+"\n";
        s+="date de naissance : ";
        s+=datenais+"\n";
        s+="adresse : ";
        s+=adresse;
        return s;
    }
}
