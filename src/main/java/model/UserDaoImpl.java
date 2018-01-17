package model;

import org.hibernate.Session;
import org.hibernate.query.Query;
import utilTool.HibernateUtil;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        HibernateUtil.closeSession(session);
    }

    @Override
    public void delete(int id) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        String hql = "delete User where id =?1";
        Query q = session.createQuery(hql);
        q.setParameter(1, id);
        q.executeUpdate();
        session.getTransaction().commit();
        HibernateUtil.closeSession(session);
    }

    @Override
    public void update(User user) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        HibernateUtil.closeSession(session);
    }

    @Override
    public List queryAll() {
        Session session = HibernateUtil.getSession();
        String hql = "From User as user order by id";
        Query q = session.createQuery(hql);
        List list = q.list();
        HibernateUtil.closeSession(session);
        return list;
    }

    @Override
    public User queryByID(int id) {
        Session session = HibernateUtil.getSession();
        String hql = "from User as user where id=?1";
        Query q = session.createQuery(hql);
        List list = q.setParameter(1, id).list();
        User user = null;

        if (list.iterator().hasNext()) {
            user = (User)list.iterator().next();
        }
        HibernateUtil.closeSession(session);
        return user;
    }
}
