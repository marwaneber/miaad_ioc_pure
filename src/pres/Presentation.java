package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main (String[] args){
        /*
         Injection des dépendances par
         instanciation statique => new
        */


        // L'implimation 1 d'interface Dao
        // DaoImpl dao = new DaoImpl();

        // L'implimation 2 d'interface Dao
        DaoImpl2 dao = new DaoImpl2();


        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resultat = " + metier.calcul());
    }
}
