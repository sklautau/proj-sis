/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NoyauFonctionnel;

/**
 *
 * @author Pauline KIEFER
 */
public enum TypeImagerie {
    ANGIOCTSCANNER("Angio CT Scanner"),
    ANGIOIRM("Angio IRM"),
    ANDIODIGITALISEE("Angiographie Digitalisée"),
    ARTHROSCANNER("Arthroscanner"),
    BIOPSIESEIN("Biopsie du sein"),
    BIOPSIEFLUOROSCANNER("Biopsie sous fluoroscanner"),
    CHOLANGIOIRM("Cholangio IRM"),
    COLONLAVEMENT("Colon par lavement"),
    CTCOLONOGRAPHIE("CT Colonographie"),
    CTCORONOGRAPHIE("CT Coronarographie"),
    CTSCANNERVOLUMIQUE("CT Scanner Volumique ou multibarrette"),
    CYSTOGRAPHIESUSPUBIENNE("Cystographie sus-pubienne"),
    DEFECOIRM("Defeco IRM"),
    DENTASCANNER("Dentascanner"),
    ECHOGRAPHIEREFLUXPEDIATRIQUE("Echographie de reflux pédiatrique"),
    ECHOGRAPHIEDOPPLER("Echographie Döppler"),
    ECHOGRAPHIE("Echographie"),
    ENTEROCTSCANNER("Entero CT Scanner"),
    HYSTEROGRAPHIE("Hysterographie"),
    INFILTRATIONINTERAPOPHYSAIRE("Infiltration Interapophysaire"),
    INFILTRATIONPERIRADICULAIRE("Infiltration Periradiculaire sous fluoroscanner"),
    IRM("IRM"),
    MAMMOTEST("Mammotest"),
    OEDTRANSIT("OED & transit"),
    OSTEODENSITOMETRIE("Ostéodensitométrie"),
    PELVIMETRIE("Pelvimétrie"),
    PONCTIONTHYROIDE("Ponction de la thyroïde"),
    RADIOLOGIECONVENTIONNELLE("Radiologie conventionnelle"),
    SENOLOGIE("Sénologie"),
    UROGRAPHIEIV ("Urographie IV");
    
    private String typeImagerie;
    
    TypeImagerie(String typeImagerie) {
        this.typeImagerie = typeImagerie;
    }

    public String getTypeImagerie() {
        return typeImagerie;
    } 
    
    public TypeImagerie getTypeImagerie(String type){
        TypeImagerie t=TypeImagerie.ANDIODIGITALISEE;
        if (type.equals("ANGIOCTSCANNER")){
                    t=t.ANGIOCTSCANNER;
                }
                else if (type.equals("ANGIOIRM")){
                    t=t.ANGIOIRM;
                }
                else if (type.equals("ANDIODIGITALISEE")){
                    t=t.ANDIODIGITALISEE;
                }
                else if (type.equals("ARTHROSCANNER")){
                    t=t.ARTHROSCANNER;
                }
                else if (type.equals("BIOPSIESEIN")){
                    t=t.BIOPSIESEIN;
                }
                else if (type.equals("BIOPSIEFLUOROSCANNER")){
                    t=t.BIOPSIEFLUOROSCANNER;
                }
                else if (type.equals("CHOLANGIOIRM")){
                    t=t.CHOLANGIOIRM;
                }
                else if (type.equals("COLONLAVEMENT")){
                    t=t.COLONLAVEMENT;
                }
                else if (type.equals("CTCOLONOGRAPHIE")){
                    t=t.CTCOLONOGRAPHIE;
                }
                else if (type.equals("CTCORONOGRAPHIE")){
                    t=t.CTCORONOGRAPHIE;
                }
                else if (type.equals("CTSCANNERVOLUMIQUE")){
                   t=t.CTSCANNERVOLUMIQUE; 
                }
                else if (type.equals("CYSTOGRAPHIESUSPUBIENNE")){
                    t=t.CYSTOGRAPHIESUSPUBIENNE;
                }
                else if (type.equals("DEFECOIRM")){
                    t=t.DEFECOIRM;
                }
                else if (type.equals("DentascannerDENTASCANNER")){
                    t=t.DENTASCANNER;
                }
                else if (type.equals("ECHOGRAPHIEREFLUXPEDIATRIQUE")){
                    t=t.ECHOGRAPHIEREFLUXPEDIATRIQUE;
                }
                else if (type.equals("ECHOGRAPHIEDOPPLER")){
                    t=t.ECHOGRAPHIEDOPPLER;
                }
                else if (type.equals("ECHOGRAPHIE")){
                    t=t.ECHOGRAPHIE;
                }
                else if (type.equals("ENTEROCTSCANNER")){
                    t=t.ENTEROCTSCANNER;
                }
                else if (type.equals("HYSTEROGRAPHIE")){
                    t=t.HYSTEROGRAPHIE;
                }
                else if (type.equals("INFILTRATIONINTERAPOPHYSAIRE")){
                   t=t.INFILTRATIONINTERAPOPHYSAIRE; 
                }
                else if (type.equals("INFILTRATIONPERIRADICULAIRE")){
                   t=t.INFILTRATIONPERIRADICULAIRE; 
                }
                else if (type.equals("IRM")){
                   t=t.IRM; 
                }
                else if (type.equals("MAMMOTEST")){
                    t=t.MAMMOTEST;
                }
                else if (type.equals("OEDTRANSIT")){
                    t=t.OEDTRANSIT;
                }
                else if (type.equals("OSTEODENSITOMETRIE")){
                   t=t.OSTEODENSITOMETRIE; 
                }
                else if (type.equals("PELVIMETRIE")){
                    t=t.PELVIMETRIE;
                }
                else if (type.equals("PONCTIONTHYROIDE")){
                    t=t.PONCTIONTHYROIDE;
                }
                else if (type.equals("RADIOLOGIECONVENTIONNELLE")){
                    t=t.RADIOLOGIECONVENTIONNELLE;
                }
                else if (type.equals("SENOLOGIE")){
                    t=t.SENOLOGIE;
                }
                else {
                    t=t.UROGRAPHIEIV;
                }
        return t;
    }
public TypeImagerie getTypeImagerie2(String type){
        TypeImagerie t=TypeImagerie.ANDIODIGITALISEE;
        if (type.equals("Angio CT Scanner")){
                    t=t.ANGIOCTSCANNER;
                }
                else if (type.equals("Angio IRM")){
                    t=t.ANGIOIRM;
                }
                else if (type.equals("Angiographie Digitalisée")){
                    t=t.ANDIODIGITALISEE;
                }
                else if (type.equals("Arthroscanner")){
                    t=t.ARTHROSCANNER;
                }
                else if (type.equals("Biopsie du sein")){
                    t=t.BIOPSIESEIN;
                }
                else if (type.equals("Biopsie sous fluoroscanner")){
                    t=t.BIOPSIEFLUOROSCANNER;
                }
                else if (type.equals("Cholangio IRM")){
                    t=t.CHOLANGIOIRM;
                }
                else if (type.equals("Colon par lavement")){
                    t=t.COLONLAVEMENT;
                }
                else if (type.equals("CT Colonographie")){
                    t=t.CTCOLONOGRAPHIE;
                }
                else if (type.equals("CT Coronarographie")){
                    t=t.CTCORONOGRAPHIE;
                }
                else if (type.equals("CT Scanner Volumique ou multibarrette")){
                   t=t.CTSCANNERVOLUMIQUE; 
                }
                else if (type.equals("Cystographie sus-pubienne")){
                    t=t.CYSTOGRAPHIESUSPUBIENNE;
                }
                else if (type.equals("Defeco IRM")){
                    t=t.DEFECOIRM;
                }
                else if (type.equals("Dentascanner")){
                    t=t.DENTASCANNER;
                }
                else if (type.equals("Echographie de reflux pédiatrique")){
                    t=t.ECHOGRAPHIEREFLUXPEDIATRIQUE;
                }
                else if (type.equals("Echographie Döppler")){
                    t=t.ECHOGRAPHIEDOPPLER;
                }
                else if (type.equals("Echographie")){
                    t=t.ECHOGRAPHIE;
                }
                else if (type.equals("Entero CT Scanner")){
                    t=t.ENTEROCTSCANNER;
                }
                else if (type.equals("Hysterographie")){
                    t=t.HYSTEROGRAPHIE;
                }
                else if (type.equals("Infiltration Interapophysaire")){
                   t=t.INFILTRATIONINTERAPOPHYSAIRE; 
                }
                else if (type.equals("Infiltration Periradiculaire sous fluoroscanner")){
                   t=t.INFILTRATIONPERIRADICULAIRE; 
                }
                else if (type.equals("IRM")){
                   t=t.IRM; 
                }
                else if (type.equals("Mammotest")){
                    t=t.MAMMOTEST;
                }
                else if (type.equals("OED & transit")){
                    t=t.OEDTRANSIT;
                }
                else if (type.equals("Ostéodensitométrie")){
                   t=t.OSTEODENSITOMETRIE; 
                }
                else if (type.equals("Pelvimétrie")){
                    t=t.PELVIMETRIE;
                }
                else if (type.equals("Ponction de la thyroïde")){
                    t=t.PONCTIONTHYROIDE;
                }
                else if (type.equals("Radiologie conventionnelle")){
                    t=t.RADIOLOGIECONVENTIONNELLE;
                }
                else if (type.equals("Sénologie")){
                    t=t.SENOLOGIE;
                }
                else {
                    t=t.UROGRAPHIEIV;
                }
        return t;
    }
}
