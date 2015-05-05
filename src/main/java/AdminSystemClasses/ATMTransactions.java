package AdminSystemClasses;

import bank.BankTransaction;
import bank.DB;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

public class ATMTransactions {
    
    public static List viewTransactions(Integer atmId, String beginDate, String endDate) throws HibernateException {
        Date bd = null;
        Date ed = null;
        
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            bd = format.parse(beginDate);
            ed = format.parse(endDate);
        } catch (ParseException e) {
        }
        
        Session s = DB.getSession();
        Criteria cr = s.createCriteria(BankTransaction.class);
        cr.add(Restrictions.eq("bankatm.id", atmId));
        
        if (bd != null && ed == null) {
            cr.add(Restrictions.gt("time", bd));
        } else if (bd == null && ed != null) {
            cr.add(Restrictions.lt("time", ed));
        }
        else if (bd != null && ed != null) {
            cr.add(Restrictions.between("time", bd, ed));
        }
                
        List list = cr.list();
        s.close();
        return list;
    }
    
}
