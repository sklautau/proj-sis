package NoyauFonctionnel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author faysmnew
 */
public class DICOM {
    private int nbPatient=0;
    private String type;
    private String passif;

    public DICOM(String type, String passif){
        nbPatient+=1;
        this.type=type;
        this.passif=passif;
    }
    
    public DICOM(String type){
        nbPatient+=1;
        this.type=type;
        passif=String.valueOf(nbPatient);
    }
    
    public DICOM(){
        nbPatient+=1;
        type=String.valueOf(Math.random()*Math.random());
        passif=String.valueOf(nbPatient);
    }

    public String getType(){
        return type;
    }

    public String getPassif(){
        return passif;
    }
    
    public String toString(){
        String s;
        s="type : "+type+"           ";
        s+="passif : "+passif;
        return s;
    }

    /*public void manipuler(){

    }*/
}
