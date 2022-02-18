package NoyauFonctionnel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pauline KIEFER
 * @author Arthur VASSON
 * @HELLO WORLD
 */
public class Examen {
    private DICOM id;
    private Date date;
    private String nomDocteur;
    private TypeImagerie typeExamen;
    private String compteRendu;
    private int PACScode;
    private boolean dmrpapier;
    
    public Examen(DICOM id,Date date, String nomDocteur, TypeImagerie typeExamen, String compteRendu, int PACScode){
        this.id=id;
        this.date=date;
        this.nomDocteur=nomDocteur;
        this.typeExamen=typeExamen;
        this.compteRendu=compteRendu;
        this.PACScode=PACScode;
        dmrpapier=false;
    }
    
    public Examen(Date date, String nomDocteur, TypeImagerie typeExamen, String compteRendu){
        this.date=date;
        this.nomDocteur=nomDocteur;
        this.typeExamen=typeExamen;
        this.compteRendu=compteRendu;
        dmrpapier=true;
    }
    
    public String getDate(){
        return date.toString();
    }
    
    public String getNomDocteur(){
        return nomDocteur;
    }
    
    public TypeImagerie getTypeExamen(){
        return typeExamen;
    }
    
    public String getCompteRendu(){
        return compteRendu;
    }
    
    public String getCodePACS(){
        if(dmrpapier=true){
            System.out.println("Erreur, DMR papier donc pas de code PACS");
            return "false";
        }
        else{
            return ""+PACScode;
        }
    }
    
    public boolean getDossierPapier(){
        return dmrpapier;
    }
    
    public String PACScodeToString(){
        String s ="";
        s+=PACScode;
        return s;
    }
    
    public int TointPACS(String s){
        int pacs = Integer.valueOf(s);
        return pacs;
    }
    
    public String toString(){
        String s;
        s="date de l'examen : ";
        s+=date.toString()+"\n";
        s+="nom du médecin qui a rélisé l'examen : ";
        s+=nomDocteur+"\n";
        s+="type d'examen : ";
        s+=typeExamen+"\n";
        s+="compte rendu : ";
        s+=compteRendu+"\n";
        s+="DMR en format papier : ";
        if(dmrpapier==true){
            s+="oui";
        }
        else{
            s+="non"+"\n";
            s+="code dans le PACS : ";
            s+=PACScode;
        }
        return s;
    }
}
