
import model.UserDaoFactory;
import model.UserDao;

import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        UserDao dao= UserDaoFactory.getUserDaoInstance();

       for (Iterator iterator=dao.queryAll().iterator();iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
