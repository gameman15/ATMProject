/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminSystemClasses;

import bank.BankATM;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;;

/**
 *
 * @author DD5024435
 */
public class DeleteATM extends ActionSupport{
     private Integer atmId;
    private Integer branchid;
    private Integer till;
    private BankATM atm= null;

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
    public Integer getTill() {
        return till;
    }

    /**
     * @param till the till to set
     */
    public void setTill(Integer till) {
        this.till = till;
    }
    @Override
    public String execute() throws Exception
    {
       atm = atmDB.delete(this);
        
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
