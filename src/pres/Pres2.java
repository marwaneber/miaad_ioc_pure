package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        // Implémenter class Dao
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao oDao = (IDao) cDao.newInstance();

        // Implémenter class Metier
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier oMetier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao", IDao.class);
        // metier.setDao(dao);
        method.invoke(oMetier, oDao);

        System.out.println("Resultat => " +  oMetier.calcul());
    }
}
