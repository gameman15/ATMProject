/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminSystemClasses;

import bank.BankAccount;
import bank.BankCustomer;
import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 * A thing that generates values for autofill info
 * @author MB5024473
 */
public class CustomerInfoGenerator {

    /**
     * A thing that generates values for autofill info for a BankCustomer
     * 
     * @param cus BankCustomer to be autofilled
     * @return BankAccount generated and now associated to cus
     * @throws HibernateException 
     */
    public static BankAccount generate(BankCustomer cus) throws HibernateException {
        Random rand = new Random(System.currentTimeMillis());
        Integer cusId;
        Session s = bank.DB.getSession();
        Criteria cr;
        List l;

        //cus.setId(1000);
        do {
            cusId = rand.nextInt(100000000);
            cr = s.createCriteria(BankCustomer.class);
            cr.add(Restrictions.eq("id", cusId));
            l = cr.list();
        } while (!l.isEmpty());
        
        cus.setId(cusId);
        
        return generateAccount(cus);
    }
        /**
         * A thing that generates a BankAccount for a BankCustomer
         * I made this a separate method because it would be useful to
         * have if a customer could have multiple accounts.
         * 
         * @param cus BankCustomer to generate BankAccount for
         * @return BankAccount generated and now associated to cus
         * @throws HibernateException 
         */
        private static BankAccount generateAccount(BankCustomer cus) throws HibernateException {
        Random rand = new Random(System.currentTimeMillis());
        Integer c1, c2, acctId, pin;
        String card;
        BankAccount acct;
        Session s = bank.DB.getSession();
        Criteria cr;
        List l;

        do {
            acctId = rand.nextInt(100000000);
            cr = s.createCriteria(BankAccount.class);
            cr.add(Restrictions.eq("accountid", acctId));
            l = cr.list();
        } while (!l.isEmpty());

        do {
            c1 = rand.nextInt(100000000);
            c2 = rand.nextInt(100000000);
            card = String.format("%08d", c1) + String.format("%08d", c2);
            cr = s.createCriteria(BankAccount.class);
            cr.add(Restrictions.eq("cardnumber", card));
            l = cr.list();
        } while (!l.isEmpty());

        pin = rand.nextInt(10000);

        acct = new BankAccount(acctId, cus, new BigDecimal(0), String.format("%04d", pin), card);

        cus.addBankAccount(acct);
        return acct;
    }
}
