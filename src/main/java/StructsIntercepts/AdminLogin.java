package StructsIntercepts;

import bank.BankAdmin;
import bank.DB;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author AF5024443
 */
public class AdminLogin extends ActionSupport{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String execute()
    {
        Integer id = DB.checkAdminLogin(username, password);
        
        Map session = ActionContext.getContext().getSession();
        
        if(id != null)
        {
            session.put("id", id);
            BankAdmin admin = DB.getAdmin(id);
            session.put("name", admin.getName());
            session.put("admin", admin);
        }
        else
        {
            addFieldError("username", "Invalid login credentials");            
        }
        
        return (id != null ? AdminResult.loginSuccess : AdminResult.loginFail).name();
    }
}
