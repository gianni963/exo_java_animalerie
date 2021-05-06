package be.bxl.formation.models;
import java.util.Scanner;

public class Animal {
    Scanner sc = new Scanner(System.in);

    private java.lang.String nom;
    private int poids;
    private int taille;
    private int age;
    private java.lang.String dateArrivee;
    private boolean vie;

    public java.lang.String getNom() {
        return nom;
    }
    public int getPoids() {
        return poids;
    }
    public int getTaille() {
        return taille;
    }
    public int getAge() {
        return age;
    }
    public java.lang.String getDateArrivee() {
        return dateArrivee;
    }

    public boolean isVie() {
        return vie;
    }

    public void setVie(boolean vie) {
        this.vie = vie;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }
    public void setPoids(int poids) {
        this.poids = poids;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setdateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }


    public void crier() {
        System.out.println(nom+ " crie");
    }

    public Animal(java.lang.String nom, int poids, int taille, int age, java.lang.String dateArrivee, boolean vie
    ) {
        this.nom = nom;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.dateArrivee = dateArrivee;
        this.vie = vie;
    }
}
