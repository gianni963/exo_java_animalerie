package be.bxl.formation;

import be.bxl.formation.models.Animalerie;
import be.bxl.formation.models.Chat;
import be.bxl.formation.models.Chien;
import be.bxl.formation.models.Oiseau;

public class Main {

    public static void main(String[] args) {
	    Chat jeeg =  new Chat("Jeeg",7,45,6,"03/01/21",true,"energique",true,true);
	    jeeg.crier();
        Chat kiko =  new Chat("Kiko",5,38,12,"28/09/20",true,"farouche",true,true);
        kiko.crier();

        Oiseau calimero = new Oiseau("Calimero",1,15,2,"21/04/21",true,"noir",true);
        calimero.crier();
        Oiseau superquack = new Oiseau("Superquack",2,18,3,"26/01/21",true,"vert",false);
        superquack.crier();

        Chien rocky = new Chien("Rocky",40,60,8,"02/06/21",true,"bleu",true,"labrador");
        Chien gaston = new Chien("Gaston",16,43,8,"05/02/21",true,"rouge",true,"bulldog");
        rocky.crier();
        gaston.crier();

        /*
        gaston.displayParametre();
        kiko.displayParametre();
        calimero.displayParametre();
        */
        Animalerie clubAnimaux = new Animalerie("Club des Animaux");

        clubAnimaux.addChat(jeeg);
        clubAnimaux.addChat(kiko);

        clubAnimaux.addChien(rocky);
        clubAnimaux.addChien(gaston);

        clubAnimaux.addOiseau(calimero);
        clubAnimaux.addOiseau(superquack);

        System.out.println("Listing des animaux: ");
        clubAnimaux.listerAnimaux();
        clubAnimaux.checkDeces();
    }
}
