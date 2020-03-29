package Util;

import model.Country;
import org.hibernate.Session;

public class Przyklad2 {
    public static void main(String[] args) {
        userPersist();


    }

    public static void userPersist() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("India");
        newCountry.setAlias("IN");
        System.out.println("przed persist");
        session.persist(newCountry);
        System.out.println("po persist");
        session.flush();
        System.out.println("po flush");
session.getTransaction().commit();
        System.out.println("po commit");
        session.close();
    }
    public static void useMerge(){

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("Spain");
        newCountry.setAlias("ES");
        System.out.println("Before Merge");
        newCountry = (Country) session.merge(newCountry);
        newCountry.setName("SpainChanged");
        System.out.println("After Merge");
        session.flush();
        session.close();
        System.out.println("After Close");
    }


}
