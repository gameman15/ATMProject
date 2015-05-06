/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminSystemClasses;

import bank.BankTransaction;
import java.util.List;

/**
 *
 * @author DD5024435
 */
public class DepositedChecks implements java.io.Serializable {
    private Integer atmId;
    private Integer branchid;
    private List<BankTransaction> bank;
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
    
    public String viewChecks() throws Exception
    {
        bank=AtmDB.viewChecks(this);
       if(bank.isEmpty())
         return "failed";
        else 
         return "success";
    }
    /**
     * @return the bank
     */
    public List<BankTransaction> getBank() {
        return bank;
    }

    /**
     * @param bank the bank to set
     */
    public void setBank(List<BankTransaction> bank) {
        this.bank = bank;
    }
}

    
    

