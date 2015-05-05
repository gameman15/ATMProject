/**
 *
 * Handles Login Validation
 *
 */
package StructsIntercepts;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.Map;

public class LoginValidatior implements Interceptor {

    private static final long serialVersionUID = 1L;

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        Map sessionAttributes = invocation.getInvocationContext().getSession();

        if (sessionAttributes == null || sessionAttributes.get("id") == null) {
            return "login";
        } else {
            return invocation.invoke();
        }
    }
}
