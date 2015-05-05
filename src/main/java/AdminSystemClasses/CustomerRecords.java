package AdminSystemClasses;

import bank.BankCustomer;
import bank.DB;
import org.hibernate.*;

/**
 *
 * @author MB5024473
 */
public class CustomerRecords {

    /**
     * Adds a customer to the database throws HibernateException if
     * unsuccessful.
     *
     * @param cust BankCustomer to add
     */
    public static void add(BankCustomer cust) throws HibernateException {
        Session s = DB.getSession();
        Transaction t = s.beginTransaction();
        s.save(cust);
        t.commit();
        s.close();
    }

    /**
     * Deletes a customer in the database throws HibernateException if
     * unsuccessful.
     *
     * @param cust BankCustomer to delete
     */
    public static void delete(BankCustomer cust) throws HibernateException {
        Session s = DB.getSession();
        Transaction t = s.beginTransaction();
        s.delete(cust);
        t.commit();
        s.close();
    }

    /**
     * Updates a customer in the database throws HibernateException if
     * unsuccessful.
     *
     * @param cust BankCustomer to update
     */
    public static void edit(BankCustomer cust) throws HibernateException {
        Session s = DB.getSession();
        Transaction t = s.beginTransaction();
        s.update(cust);
        t.commit();
        s.close();
    }

    /**
     * Returns a customer from the database throws HibernateException if
     * unsuccessful.
     *
     * @param custID BankCustomer ID number
     * @return BankCustomer object
     */
    public static BankCustomer getRecord(int custID) throws HibernateException {
        Session s = DB.getSession();
        Transaction t = s.beginTransaction();
        BankCustomer cust = (BankCustomer) s.load(BankCustomer.class, custID);
        t.commit();
        s.close();
        return cust;
    }
}
