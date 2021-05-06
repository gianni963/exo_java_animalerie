package be.bxl.formation.models;

public class Chien extends Animal {


    private java.lang.String couleurCollier;
    private boolean dresse;
    private java.lang.String race;
    private double ProbDeces = 0.01;

    public java.lang.String getCouleurCollier() {
        return couleurCollier;
    }

    public boolean isDresse() {
        return dresse;
    }

    public java.lang.String getRace() {
        return race;
    }

    public double getProbDeces() {
        return ProbDeces;
    }

    public void crier() {
        System.out.println(getNom() + " fait waf");
    }

    public void displayParametre() {
        System.out.println("nom: "+ getNom() + " -  poids: " +  getPoids() + " - taille: " + getTaille() + " -  date d'arrivée: " + getDateArrivee() + " -  en vie?: " + isVie() + " - couleur du collier: " + getCouleurCollier() + " -  dressé?: " + isDresse() + " - race: " + race + " - probabilité de décès :" + getProbDeces() +"%");
    }

    public void setCouleurCollier(java.lang.String couleurCollier) {
        this.couleurCollier = couleurCollier;
    }

    public void setDresse(boolean dresse) {
        this.dresse = dresse;
    }

    public void setRace(java.lang.String race) {
        this.race = race;
    }

    public void setProbDeces(double probDeces) {
        ProbDeces = probDeces;
    }

    //constructeur
    public Chien(java.lang.String nom, int poids, int taille, int age, java.lang.String dateArrivee, boolean vie, java.lang.String couleurCollier, boolean dresse, java.lang.String race) {
        super(nom, poids, taille, age, dateArrivee, vie);
        this.couleurCollier = couleurCollier;
        this.dresse = dresse;
        this.race = race;

    }
}
