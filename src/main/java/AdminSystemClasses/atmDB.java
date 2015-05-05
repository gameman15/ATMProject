/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminSystemClasses;

import AdminSystemClasses.ATMaddmoddel;
import AdminSystemClasses.DeleteATM;
import AdminSystemClasses.EditATM;
import bank.BankATM;
import bank.BankBranch;
import bank.DB;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DD5024435
 */
public class atmDB extends ActionSupport {
    
      //static  BankATM bank=null;
    
    public static BankATM addAtm(ATMaddmoddel atm) throws Exception
    {
      Integer id;
      BankBranch bankbranch=null;
      BigDecimal till;
      
     //BankBranch bb = (BankBranch)sf.load(BankATM.class, edit.getAtmId());   
     //BankATM myatm = new BankATM(atm.getAtmId(),BankBranch ,atm.getTill());   
     Session sf = DB.getSession();
     Transaction tx = sf.beginTransaction(); 
//     
//     Query q = sf.createQuery("insert into BankATM(id,bankbranch,till)");
//     q.setParameter("test", atm.getAtmId());
//     List<BankATM> li = q.list();
//     for(BankATM bk:li)
//     {
//         id = (Integer)bk.getId();
//         bankbranch= bk.getBankbranch();
//     }
     BankBranch bb = (BankBranch)sf.load(BankBranch.class, atm.getBranchid()); 
     BankATM myatm = new BankATM();
     myatm.setId(atm.getAtmId());
     myatm.setBankbranch(bb);
     myatm.setTill(atm.getTill());
     
       sf.save(myatm);
        tx.commit();
        sf.close();
      return myatm;
    }
    
    public static BankATM delete(DeleteATM atm) throws Exception
    {
      Session sf = DB.getSession();
     Transaction tx = sf.beginTransaction();
     
      BankATM bank = (BankATM)sf.load(BankATM.class,atm.getAtmId());
     
      sf.delete(bank);
      
        tx.commit();
        sf.close();
        
        return bank;
    }
    public static BankATM edit(EditATM edit)
    {
         
        //Map session = ActionContext.getContext().getSession();
        Session sf = DB.getSession();
        Transaction tx = sf.beginTransaction();
          
       // if(bank == null)
       // {
         BankATM bank = new BankATM();//(BankATM)sf.load(BankATM.class,edit.getAtmId());
       // }
//        else
//        {
           BankBranch bb = (BankBranch)sf.load(BankBranch.class,edit.getBranchid());
           bank.setId(edit.getAtmId());
            bank.setBankbranch(bb);
            bank.setTill(edit.getTill());
            sf.saveOrUpdate(bank);
            tx.commit();
//        }
        sf.close();

        return bank;
    }
    
    
}
