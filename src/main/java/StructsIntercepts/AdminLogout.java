package StructsIntercepts;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author AF5024443
 */
public class AdminLogout extends ActionSupport {

    @Override
    public String execute() {
        ActionContext.getContext().getSession().clear();
        return SUCCESS;
    }
}
