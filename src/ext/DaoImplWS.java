package ext;

import dao.IDao;

public class DaoImplWS implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double temp = 60;
        return temp;
    }
}
