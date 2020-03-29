import Util.HibernateUtil;
import model.*;
import org.hibernate.Session;

public class przyklad1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Order country = session.find(Order.class, 1);
        session.close();
        System.out.println(country.toString());
    }
}
