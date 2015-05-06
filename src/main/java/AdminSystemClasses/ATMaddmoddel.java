/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminSystemClasses;
import bank.BankATM;
import com.opensymphony.xwork2.ActionSupport;
import java.math.BigDecimal;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class ATMaddmoddel extends ActionSupport implements java.io.Serializable{
    private Integer atmId;
    private BigDecimal till;
    private Integer branchid; 
    private BankATM atm=null;
    
    public ATMaddmoddel()
    {
        
    }
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
   @Override
    public String execute() throws Exception
    { 
        String msg=null;
        if((getAtmId().intValue()<1) || (getBranchid().intValue()<1) || (getTill().intValue()<0))
             msg= "failed";
        else
        {
           atm=AtmDB.addAtm(this);
           if(atm != null)
           {       
            msg = "success";
           }
           else
               msg = "failedexist";
        }
           
        return msg;
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
