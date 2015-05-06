package AdminSystemClasses;

import bank.*;
import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.*;

/**
 * Action Class
 *
 * @author MB5024473
 */
public class AdminActions extends ActionSupport {

     private Integer adminId;
     private BankBranch adminBranch;
     private String adminName;
     private String adminUsername;
     private String adminPass;
     private String adminAddress;
     private String adminCity;
     private String adminState;

    /**
     * Action for addCustomer form
     *
     * @return SUCCESS or ERROR
     */
    public String add() {
        BankAdmin admin = new BankAdmin(getAdminId(), getAdminBranch(), getAdminName(), getAdminUsername(), getAdminPass(), getAdminAddress(), getAdminCity(), getAdminState());
        Session s = DB.getSession();

        BankBranch bran = (BankBranch)s.get(BankBranch.class, 1);
        admin.setBankbranch(bran);

        Transaction t = s.beginTransaction();
        try {
            s.save(admin);
            t.commit();
        } catch (Exception e) {
            t.rollback();
            s.close();
            System.out.println(e.getMessage());
            return ERROR;
        }
        addActionMessage("Admin added!");
        s.close();
        return SUCCESS;
    }

    /**
     * @return the adminId
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * @param adminId the adminId to set
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * @return the adminBranch
     */
    public BankBranch getAdminBranch() {
        return adminBranch;
    }

    /**
     * @param adminBranch the adminBranch to set
     */
    public void setAdminBranch(BankBranch adminBranch) {
        this.adminBranch = adminBranch;
    }

    /**
     * @return the adminName
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * @param adminName the adminName to set
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * @return the adminUsername
     */
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * @param adminUsername the adminUsername to set
     */
    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * @return the adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    /**
     * @param adminPass the adminPass to set
     */
    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    /**
     * @return the adminAddress
     */
    public String getAdminAddress() {
        return adminAddress;
    }

    /**
     * @param adminAddress the adminAddress to set
     */
    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    /**
     * @return the adminCity
     */
    public String getAdminCity() {
        return adminCity;
    }

    /**
     * @param adminCity the adminCity to set
     */
    public void setAdminCity(String adminCity) {
        this.adminCity = adminCity;
    }

    /**
     * @return the adminState
     */
    public String getAdminState() {
        return adminState;
    }

    /**
     * @param adminState the adminState to set
     */
    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }

}
