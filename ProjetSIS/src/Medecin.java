/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author faysmnew
 */
public class Medecin {
    private int nbMedecin=0;
    private int id;
    private String nom;
    private String prenom;
    private String mdp;
    private String specialite;

    public Medecin(String nom, String prenom, String mdp, String specialite){
        nbMedecin+=1;
        this.id = nbMedecin;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.specialite = specialite;
    }

    public int getId(){
        return id;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public String getMdp(){
        return mdp;
    }

    public String getSpecialite(){
        return specialite;
    }
    
    public boolean verifieId(int id){
        if (this.id==id){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean verifieMdp(String mdp){
        if(this.mdp.equals(mdp)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        String s;
        s="identifiant : ";
        s+=id+"\n";
        s+="nom : ";
        s+=nom+"\n";
        s+="prénom : ";
        s+=prenom+"\n";
        s+="spécialité : ";
        s+=specialite+"\n";
        return s;
    }
}
