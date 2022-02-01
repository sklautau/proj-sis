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
    
    TypeImagerie(String TypeImagerie) {
        this.typeImagerie = typeImagerie;
    }

    public String getTypeImagerie() {
        return typeImagerie;
    } 
}
