package be.bxl.formation.models;

public class Oiseau extends Animal {
    private java.lang.String couleur;
    private boolean voliere;
    private double ProbDeces = 0.03;

    public java.lang.String getCouleur() {
        return couleur;
    }

    public void displayParametre() {
        System.out.println("nom: "+ getNom() + " -  poids: " +  getPoids() + " - taille: " + getTaille() +  " - en vie? : "+ isVie() + " -  date d'arrivée: " + getDateArrivee() +" - couleur: " + getCouleur() + " - volière? : " + isVoliere() + " - probabilité de décès :" + getProbDeces() +"%");
    }

    public boolean isVoliere() {
        return voliere;
    }

    public double getProbDeces() {
        return ProbDeces;
    }

    public void setCouleur(java.lang.String couleur) {
        this.couleur = couleur;
    }

    public void setVoliere(boolean voliere) {
        this.voliere = voliere;
    }

    public void setProbDeces(double probDeces) {
        ProbDeces = probDeces;
    }

    public void crier() {
        System.out.println(getNom() + " fait quick");
    }

    //constructeur
    public Oiseau(java.lang.String nom, int poids, int taille, int age, java.lang.String dateArrivee, boolean vie, java.lang.String couleur, boolean voliere) {
        super(nom, poids, taille, age, dateArrivee, vie);
        this.couleur = couleur;
        this.voliere = voliere;
    }
}
