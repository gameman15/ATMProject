package AdminSystemClasses;

import bank.*;
import static com.opensymphony.xwork2.Action.*;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

/**
 * Action Class
 *
 * @author MB5024473
 */
public class CustomerActions implements SessionAware {

    private Integer customerId;
    private String customerName;
    private String customerEmail;
    private String customerAddress;
    private String customerCity;
    private String customerState;
    private Integer accountId;
    private BigDecimal balance;
    private String pin;
    private String cardnumber;

    /**
     * Action for addCustomer form
     *
     * @return SUCCESS or ERROR
     */
    public String add() {
        System.out.println("print working");
        BankCustomer cus = new BankCustomer(getCustomerId(), getCustomerName(), getCustomerEmail(), getCustomerAddress(), getCustomerCity(), getCustomerState());
        Session s = DB.getSession();

        BankAccount acct = CustomerInfoGenerator.generate(cus);
        this.setAccountId(acct.getAccountid());
        this.setPin(acct.getPin());
        this.setCardnumber(acct.getCardnumber());
        this.customerId = cus.getId();

        Transaction t = s.beginTransaction();
        try {
            s.save(cus);
            s.save(acct);
            t.commit();
        } catch (HibernateException e) {
            t.rollback();
            s.close();
            System.out.println(e.getMessage());
            return ERROR;
        }
        
        s.close();
        return SUCCESS;
    }

    /**
     * Action for editCustomer form
     *
     * @return SUCCESS or ERROR
     */
    public String edit() {
         System.out.println("action called");
        BankCustomer cus = new BankCustomer(this.customerId, getCustomerName(), getCustomerEmail(), getCustomerAddress(), getCustomerCity(), getCustomerState());
        Session s = DB.getSession();
        Criteria cr = s.createCriteria(BankAccount.class);
        // check that accountId isn't null here.
        System.out.println(this.accountId);
        System.out.println(this.customerId);
        cr.add(Restrictions.eq("accountid", this.accountId));
          System.out.println("criteria returns something");

          System.out.println("list created");
        BankAccount acct = (BankAccount) cr.uniqueResult();
        System.out.println("*********************************Hello From Edit************************************************");
        System.out.println(this.accountId);
        System.out.println("*************************************Goodbye From Edit********************************************");
        acct.setPin(this.pin);

       // Iterator iterator = results.iterator();
        // acct = (BankAccount) iterator.next();
        cus.addBankAccount(acct);

        Transaction t = s.beginTransaction();

        try {
            s.update(cus);
            s.update(acct);
            t.commit();
        } catch (HibernateException e) {
            t.rollback();
            s.close();
            return ERROR;
        }

        s.close();
        return SUCCESS;
    }

    /**
     * Unused action that seemed useful to make
     *
     * @return SUCCESS or ERROR
     */
    public String getCustomerInfo() {
        //System.out.println("println testing works");
        Session s = DB.getSession();
        Criteria cr = s.createCriteria(BankCustomer.class);
        cr.add(Restrictions.eq("id", getCustomerId()));
        List l = cr.list();
        BankCustomer cus;
        BankAccount acct;

        try {
            cus = (BankCustomer) l.get(0);
            acct = (BankAccount) cus.getBankaccounts().toArray()[0];
            assert acct != null;

        } catch (HibernateException e) {
            return ERROR;
        }
         
        this.sessionMap.put("sessionAccount", acct);
        this.sessionMap.put("sessionCustomer", cus);
        
        this.setAccountId(acct.getAccountid());

        this.setPin(acct.getPin());

        this.setCardnumber(acct.getCardnumber());

        this.setCustomerName(cus.getName());

        this.setCustomerEmail(cus.getEmail());

        this.setCustomerAddress(cus.getAddress());

        this.setCustomerCity(cus.getCity());

        this.setCustomerState(cus.getState());

        this.setAccountId(acct.getAccountid());

        this.setBalance(acct.getBalance());
                System.out.println("*********************************Hello From GetInfo************************************************");
        System.out.println(this.accountId);
        System.out.println("*************************************Goodbye From GetInfo********************************************");
        return SUCCESS;
    }

    /**
     * @return the customerId
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * @param customerEmail the customerEmail to set
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return the customerCity
     */
    public String getCustomerCity() {
        return customerCity;
    }

    /**
     * @param customerCity the customerCity to set
     */
    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    /**
     * @return the customerState
     */
    public String getCustomerState() {
        return customerState;
    }

    /**
     * @param customerState the customerState to set
     */
    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    /**
     * @return the accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return the cardnumber
     */
    public String getCardnumber() {
        return cardnumber;
    }

    /**
     * @param cardnumber the cardnumber to set
     */
    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
     private Map sessionMap;
    @Override
    public void setSession(Map<String, Object> map) {
       this.sessionMap = map;
    }
}
