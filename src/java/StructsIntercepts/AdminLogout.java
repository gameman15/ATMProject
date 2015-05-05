package StructsIntercepts;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author AF5024443
 */
public class AdminLogout extends ActionSupport
{
    @Override
    public String execute()
    {
        ActionContext.getContext().getSession().remove("id");
        ActionContext.getContext().getSession().remove("name");
        ActionContext.getContext().getSession().remove("admin");
        
        return "success";
    }
}
