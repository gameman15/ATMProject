/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminSystemClasses;

import bank.BankATM;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.math.BigDecimal;

;

/**
 *
 * @author DD5024435
 */
public class DeleteATM extends ActionSupport implements java.io.Serializable {

    private BigDecimal atmId;
    private BigDecimal branchid;
    private Integer till;
    private BankATM atm = null;

    /**
     * @return the atmId
     */
    public BigDecimal getAtmId() {
        return atmId;
    }

    /**
     * @param atmId the atmId to set
     */
    public void setAtmId(BigDecimal atmId) {
        this.atmId = atmId;
    }

    /**
     * @return the branchid
     */
    public BigDecimal getBranchid() {
        return branchid;
    }

    /**
     * @param branchid the branchid to set
     */
    public void setBranchid(BigDecimal branchid) {
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
    public String execute() throws Exception {
        String msg;
        atm = AtmDB.delete(this);
        if (atm != null) {
            msg = "success";
        } else {
            msg = "failed";
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
