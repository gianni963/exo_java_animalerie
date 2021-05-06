package be.bxl.formation.models;



public class Chat extends Animal {
    private java.lang.String caractere;
    private boolean griffeCoupee;
    private boolean poilLong;
    private double ProbDeces = 0.005;

    public void crier() {
        System.out.println(getNom() + " fait miaouw");
    }

    public void displayParametre() {
        System.out.println("nom: "+ getNom() + " -  poids: " +  getPoids() + " - taille: " + getTaille() + " -  date d'arrivée: " + getDateArrivee() + " -  en vie?: " + isVie() + " - caractère: " + getCaractere() + " -  griffe coupée?: " + isGriffeCoupee() + " - poilLong? : " + isPoilLong() + " - probabilité de décès :" + getProbDeces() +"%");
    }

    public java.lang.String getCaractere() {
        return caractere;
    }

    public boolean isGriffeCoupee() {
        return griffeCoupee;
    }

    public boolean isPoilLong() {
        return poilLong;
    }

    public double getProbDeces() {
        return ProbDeces;
    }

    public void setCaractere(java.lang.String caractere) {
        this.caractere = caractere;
    }

    public void setGriffeCoupee(boolean griffeCoupee) {
        this.griffeCoupee = griffeCoupee;
    }

    public void setPoilLong(boolean poilLong) {
        this.poilLong = poilLong;
    }

    public void setProbDeces(double probDeces) {
        ProbDeces = probDeces;
    }

    //constucteur
    public Chat(java.lang.String nom, int poids, int taille, int age,  java.lang.String dateArrivee, boolean vie,java.lang.String caractere, boolean griffeCoupee, boolean poilLong) {
        super(nom, poids, taille, age, dateArrivee, vie);
        this.caractere = caractere;
        this.griffeCoupee = griffeCoupee;
        this.poilLong = poilLong;

    }
}
