/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminSystemClasses;

import bank.BankAdmin;
import bank.BankBranch;
import bank.BankTransaction;
import bank.BankATM;
import bank.DB;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.antlr.HqlSqlTokenTypes;

/**
 *
 * @author DD5024435
 */
public class AtmDB extends ActionSupport implements java.io.Serializable{
    
      //static  BankATM bank=null;
    
    public static BankATM addAtm(ATMaddmoddel atm) throws Exception
    {
      
     Session sf = DB.getSession();
     Transaction tx = sf.beginTransaction(); 
     
     Criteria cr =sf.createCriteria(BankATM.class);
     cr.add(Restrictions.eq("id", atm.getAtmId()));
     
     if(cr.list().isEmpty())
     {
     BankBranch bb = (BankBranch)sf.load(BankBranch.class, atm.getBranchid()); 
     BankATM myatm = new BankATM();
     myatm.setId(atm.getAtmId());
     myatm.setBankbranch(bb);
     myatm.setTill(atm.getTill());
     sf.save(myatm);
     tx.commit();
     return myatm;
     }

     return null;
    }
    
    public static BankATM delete(DeleteATM atm) throws Exception
    {
      Session sf = DB.getSession();
     Transaction tx = sf.beginTransaction();
     
       Criteria cr =sf.createCriteria(BankATM.class);
       cr.add(Restrictions.eq("id", atm.getAtmId()));
       BankATM bank;
       if(cr.list().size() > 0)
       {
            bank = (BankATM)sf.load(BankATM.class,atm.getAtmId());
            sf.delete(bank);
            tx.commit();
       }
       else
       {
           return null;
       }

        
        return bank;
    }
    public static boolean edit(EditATM edit)
    {
         
     
        Session sf = DB.getSession();
        Transaction tx = sf.beginTransaction();
 
         BankATM bank = new BankATM();

           BankBranch bb = (BankBranch)sf.load(BankBranch.class,edit.getBranchid());
           bank.setId(edit.getAtmId());
            bank.setBankbranch(bb);
            if(edit.getTill().intValue()<0)
            {
                return false;
            }
            else
            {
            bank.setTill(edit.getTill());
            }
            sf.saveOrUpdate(bank);
            tx.commit();
       return true;
    }
    
    public static List<BankTransaction> viewChecks(DepositedChecks dep) throws Exception
    {
        
        Session sf = DB.getSession();
        Transaction tx = sf.beginTransaction();

     
         Query q = sf.createQuery("from bank.BankTransaction bt where atmid = ? and description =? and checknumber is not null");
         q.setParameter(0, dep.getAtmId());
         q.setString(1, "deposit");
         
              
        List <BankTransaction> bt = q.list();
 
        return bt;
        
        
    }
    
    
}
