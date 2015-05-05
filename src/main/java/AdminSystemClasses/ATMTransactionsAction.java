package AdminSystemClasses;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class ATMTransactionsAction extends ActionSupport {
    
    private Integer atmId;
    private String beginDate;
    private String endDate;
    private List transactions;
    
    public ATMTransactionsAction() {
    }
    
    public String execute() throws Exception {
        if (getAtmId() == null) {
            addFieldError("invalidInput", "Please enter a valid ATM ID");
        }
        setTransactions(ATMTransactions.viewTransactions(getAtmId(), getBeginDate(), getEndDate()));
        return "success";
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
     * @return the beginDate
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * @param beginDate the beginDate to set
     */
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the transactions
     */
    public List getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List transactions) {
        this.transactions = transactions;
    }   
}