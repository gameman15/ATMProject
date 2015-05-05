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
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DD5024435
 */
public class EditATM extends ActionSupport{
    private Integer atmId;
    private Integer branchid;
    private BigDecimal till=null;
     private BankATM atm=null;

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
        Session sf = DB.getSession();
        Transaction tx = sf.beginTransaction();
        //atm = (BankATM)sf.load(BankATM.class, getAtmId());
       
     
          
            atm = (BankATM)sf.load(BankATM.class, getAtmId());
        sf.close();
        return "success";
    }
    
    public String editTable()
    {
         atm=atmDB.edit(this);
        
        return "success";
    }

    /**
     * @return the atm
     */
    public BankATM getAtm() {
        return atm;
    }

    /**
     * @param atm the atm to set
     */
    public void setAtm(BankATM atm) {
        this.atm = atm;
    }
}
