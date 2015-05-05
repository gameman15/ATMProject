package AdminSystemClasses;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class CustomerTransactionsAction extends ActionSupport {
    
    private Integer accountNumber;
    private String beginDate;
    private String endDate;
    private List transactions;
    
    public CustomerTransactionsAction() {
    }
    
    @Override
    public String execute() throws Exception
    {
        if (getAccountNumber() == null) {
            addFieldError("invalidInput", "Please enter a valid Account Number");
        }
        transactions = CustomerTransactions.viewTransactions(getAccountNumber(), getBeginDate(), getEndDate());
        return "success";
    }

    /**
     * @return the accountNumber
     */
    public Integer getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
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
