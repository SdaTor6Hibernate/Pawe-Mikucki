import Util.HibernateUtil;
import model.Country;
import org.hibernate.Session;

public class przyklad1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Country country = session.find(Country.class,1);
        session.close();
        System.out.println(country.toString());
    }
}
