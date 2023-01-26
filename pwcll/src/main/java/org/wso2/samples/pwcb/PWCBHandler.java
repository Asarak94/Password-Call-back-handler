package org.wso2.samples.pwcb;
import org.apache.ws.security.WSPasswordCallback;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

public class PWCBHandler implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {

        for (Callback callback : callbacks) {
            WSPasswordCallback pwcb = (WSPasswordCallback)callback;
            String id = pwcb.getIdentifier();
            int usage = pwcb.getUsage();
            if (usage == 2) {
                if ("admin".equals(id))
                    pwcb.setPassword("admin");
            } else if (usage == 3 || usage == 1) {
                if ("wso2carbon".equals(id))
                    pwcb.setPassword("wso2carbon");
                if ("test".equals(id))
                    pwcb.setPassword("wso2carbon");
            }
        }
    }
}