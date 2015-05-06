/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminSystemClasses;

import bank.BankATM;
import bank.DB;
import com.opensymphony.xwork2.ActionSupport;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author DD5024435
 */
public class EditATM extends ActionSupport implements java.io.Serializable{
    private Integer atmId;
    private Integer branchid;
    private BigDecimal till=null;
     private List<BankATM> atm=null;

    /**
     * @return the atmId
     */
    public Integer getAtmId() {
        return atmId;
    }

    /**
     * @param atmId the atmId to set
     */
    public void setAtmId(Integer atmId) {
        this.atmId = atmId;
    }

    /**
     * @return the branchid
     */
    public Integer getBranchid() {
        return branchid;
    }

    /**
     * @param branchid the branchid to set
     */
    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }

    /**
     * @return the till
     */
    public BigDecimal getTill() {
        return till;
    }

    /**
     * @param till the till to set
     */
    public void setTill(BigDecimal till) {
        this.till = till;
    }
    @Override
    public String execute() 
    {
        String msg = null;
        Session sf = DB.getSession();
        Transaction tx = sf.beginTransaction();
       // atm = (BankATM)sf.load(BankATM.class, getAtmId());
        Criteria cr =sf.createCriteria(BankATM.class);
        cr.add(Restrictions.eq("id", getAtmId()));
        if(cr.list().size() >0)
        { 
            atm=cr.list();
        
            msg="success";
        }
        else
        {
            msg="failed";
        }
        
        return msg;
      
    }
    
    public String editTable()
    {
       Boolean ret;
       String msg;
             
          ret=AtmDB.edit(this);
          
          if(ret)
              msg="success";
          else
              msg = "failed";
              
        
        return msg;
    }

    /**
     * @return the atm
     */
    public List<BankATM> getAtm() {
        return atm;
    }

    /**
     * @param atm the atm to set
     */
    public void setAtm(List<BankATM>  atm) {
        this.atm = atm;
    }
}
