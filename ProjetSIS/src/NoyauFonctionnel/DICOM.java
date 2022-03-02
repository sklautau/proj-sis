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
    private String type;
    private String passif;

    public DICOM(String type, String passif){
        this.type=type;
        this.passif=passif;
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

    public void manipuler(){

    }
}
