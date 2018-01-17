package utilTool;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    /*定义一个全局的sessionFactory属性*/
    private static SessionFactory sessionFactory;
    /*初始化sessionFactotry属性*/
    static {
        Configuration cfg=new Configuration().configure();
        sessionFactory=cfg.buildSessionFactory();
    }
    /*定义sessionFactory的获取函数*/
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    /*定义session的获取函数*/
    public static Session getSession() {
        return sessionFactory.openSession();
    }
    /*定义session的关闭函数*/
    public static void closeSession(Session session) {
        if (session != null) {
            if (session.isOpen()) {
                session.close();
            }
        }
    }
}
