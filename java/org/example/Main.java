package java.org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import src.main.java.org.example.Alien;


public class Main {
    public static void main(String[] args) {
        Alien abel = new Alien();
        abel.setId(1);
        abel.setName("abel");
        abel.setColor("black");

        Configuration con= new Configuration();

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();
        session.save(abel);
    }
}