package model;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertUser {
    public static void main(String[] args) {
        Configuration cfg=new Configuration().configure();

        SessionFactory factory= cfg.buildSessionFactory();

        Session session=factory.openSession();

        session.beginTransaction();

        User user = new User();

        user.setUsername("king");
        user.setPassword("123");
        session.save(user);

//        User u=session.get(User.class,0);
//        System.out.println(u.getUsername());




        session.getTransaction().commit();

        if (session.isOpen()) {
            session.close();
        }
    }
}
