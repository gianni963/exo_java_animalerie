package be.bxl.formation.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Animalerie {
    private java.lang.String nomAnimalerie;
    private ArrayList<Animal> animaux;

    public java.lang.String getNomAnimalerie() {
        return nomAnimalerie;
    }

    public void setNomAnimalerie(String nomAnimalerie) {
        this.nomAnimalerie = nomAnimalerie;
    }

    public List<Animal> getAnimaux() {
        return Collections.unmodifiableList(animaux);
    }

    //constructeur
    public Animalerie(String nomAnimalerie) {
        setNomAnimalerie(nomAnimalerie);

        this.animaux = new ArrayList<>();
    }

    public void addChat(Chat chat) {

        this.animaux.add(chat);
    }

    public void addChien(Chien chien) {

        this.animaux.add(chien);
    }

    public void addOiseau(Oiseau Oiseau) {

        this.animaux.add(Oiseau);
    }

    public void listerAnimaux() {
        int nbrChat = 0;
        int nbrChien = 0;
        int nbrOiseau = 0;
        for(Animal a : this.animaux) {
            if(a instanceof Chat) {
                ((Chat) a).displayParametre();
                nbrChat++;
            }else if(a instanceof Chien){
                nbrChien++;
                ((Chien) a).displayParametre();
            }else if(a instanceof Oiseau) {
                nbrOiseau++;
                ((Oiseau) a).displayParametre();
            }
        }
        System.out.println("Il y a " + nbrChat + " chats, " + nbrChien + " chiens et " + nbrOiseau + " d'oiseaux");

    }

  public void checkDeces(){
      for(Animal a : this.animaux) {
          if(a instanceof Chat) {
              if(a.isVie() == true && Math.random() <= ((Chat) a).getProbDeces() ) {
                  a.setVie(false);
                  System.out.println(a.getNom() + " est mort!");
              }else {
                  System.out.println(a.getNom() + " est toujours en vie.");

              }

          }else if(a instanceof Chien){

            if( a.isVie() == true && Math.random() <= ((Chien) a).getProbDeces() ) {
                a.setVie(false);
                System.out.println(a.getNom() + " est mort!");

            }else{
              System.out.println(a.getNom() + " est toujours en vie.");
            }
            }else if(a instanceof Oiseau) {

              if( a.isVie() == true && Math.random() <= ((Oiseau) a).getProbDeces() ) {
                  a.setVie(false);
                  System.out.println(a.getNom() + " est mort!");
              }else {

                  System.out.println(a.getNom() + " est toujours en vie.");
              }
          }
      }
  }

}
