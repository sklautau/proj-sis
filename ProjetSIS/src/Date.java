/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author faysmnew
 */
public class Date {
    private int annee;
    private int mois;
    private int jour;
    private int heure;
    private int minute;

    public Date(int annee, int mois, int jour, int heure, int minute){
        if (mois>12){
            System.out.println("Erreur de données : \n mois > 12");
        }
        else if (mois<0){
            System.out.println("Erreur de données : \n mois < 0");
        }
        if (jour<1){
            System.out.println("Erreur de données : \n jour < 1");
        }
        if (mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois==10 || mois==12){
            if (jour>31){
                System.out.println("Erreur de données : \n jour > 31");
            }
        }
        else if (mois==2){
            if (annee%4==0 && (!(annee%100==0) || (annee%400==0))){
                if (jour>29){
                    System.out.println("Erreur de données : \n jour > 29");
                }
            }
            else{
                if (jour>28){
                    System.out.println("Erreur de données : \n jour > 28");
                }
            }
        }
        else{
            if (jour>30){
                System.out.println("Erreur de données : \n jour > 30");
            }
        }
        if (heure>23){
            System.out.println("Erreur de données : \n heure > 23");
        }
        if (heure<0){
            System.out.println("Erreur de données : \n heure < 0");
        }
        if (minute>59){
            System.out.println("Erreur de données : \n minute > 59");
        }
        if (minute<0){
            System.out.println("Erreur de données : \n minute < 0");
        }
        if(annee<1900){
            System.out.println("Erreur dedonnées : \n année < 1900");
        }
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
        this.heure = heure;
        this.minute = minute;
    }

    public Date(int annee, int mois, int jour){
        if (mois>12){
            System.out.println("Erreur de données : \n mois > 12");
        }
        else if (mois<0){
            System.out.println("Erreur de données : \n mois < 0");
        }
        if (jour<1){
            System.out.println("Erreur de données : \n jour < 1");
        }
        if (mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois==10 || mois==12){
            if (jour>31){
                System.out.println("Erreur de données : \n jour > 31");
            }
        }
        else if (mois==2){
            if (annee%4==0 && (!(annee%100==0) || (annee%400==0))){
                if (jour>29){
                    System.out.println("Erreur de données : \n jour > 29");
                }
            }
            else{
                if (jour>28){
                    System.out.println("Erreur de données : \n jour > 29");
                }
            }
        }
        else{
            if (jour>30){
                System.out.println("Erreur de données : \n jour > 30");
            }
        }
        if(annee<1900){
            System.out.println("Erreur dedonnées : \n année < 1900");
        }
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
        this.heure = 24;
        this.minute = 60;
    }

    public Date(int annee, int mois){
        if (mois>12){
            System.out.println("Erreur de données : \n mois > 12");
        }
        else if (mois<0){
            System.out.println("Erreur de données : \n mois < 0");
        }
        if(annee<1900){
            System.out.println("Erreur dedonnées : \n année < 1900");
        }
        this.annee = annee;
        this.mois = mois;
        this.jour = 32;
        this.heure = 24;
        this.minute = 60;
    }

    public Date(int annee){
        this.annee = annee;
        this.mois = 13;
        this.jour = 32;
        this.heure = 24;
        this.minute = 60;
    }
    
    public int getAnnee(){
        return annee;
    }

    public int getMois(){
        return mois;
    }

    public int getJour(){
        return jour;
    }

    public int getHeure(){
        return heure;
    }

    public int getMinute(){
        return minute;
    }

    public boolean equal(Date d){
        return (d.annee==annee && d.mois==mois && d.jour==jour && d.heure==heure && d.minute==minute);
    }
    
    public boolean inferieur(Date d){
        if (annee<d.annee){
            return true;
        }
        else if (mois<d.mois){
            return true;
        }
        else if (jour<d.jour){
            return true;
        }
        else if (heure<d.heure){
            return true;
        }
        else if (minute<d.minute){
            return true;
        }
        else{
            return false;
        }
    }
}
