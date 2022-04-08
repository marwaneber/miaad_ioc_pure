package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    // Couplage faible
    private IDao dao;

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp * 540 / Math.cos(temp * Math.PI);
        return res;
    }

    /*
       Injecteer dans la variable dao un objet
       d'une classe qui implèmente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
