package bank;

//import java.math.BigDecimal;
import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
//import org.hibernate.criterion.Restrictions;

/**
 *
 * @author AF5024443
 */
public class DB
{
    static SessionFactory sessionFactory = null;
    
    public static Session getSession()
    {
        if(sessionFactory == null)
        {
            Configuration conf = new Configuration().configure();
            sessionFactory = conf.buildSessionFactory();
        }
        return sessionFactory.openSession();
    }
    
    /**
     * Check login and returns the ID of the user if successful. Returns null
     * if the username does not exist or password is not valid.
     * @param user username
     * @param pass password
     * @return the user ID or null
     */
    public static Integer checkAdminLogin(String user, String pass)
    {
        Session s = getSession();
        
        Query q = s.createQuery("from BankAdmin where username=?");
        q.setParameter(0, user);
        List<BankAdmin> users = q.list();
        s.close();
        
        if(users.size() > 1){
            System.out.println("Warning, non-unique username: " + user);
        }
        
        if(users.isEmpty() || !users.get(0).getPass().equals(pass)){
            return null;
        }
        return users.get(0).getId();
    }
    
    public static BankAdmin getAdmin(Integer id)
    {
        Session s = getSession();
        BankAdmin b = (BankAdmin) s.get(BankAdmin.class, id);
        s.close();
        return b;
    }
    

}
