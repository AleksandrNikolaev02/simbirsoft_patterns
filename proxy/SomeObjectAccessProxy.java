package proxy;

import implem.SomeObjectAccess;
import inter.ObjectAccess;

public class SomeObjectAccessProxy implements ObjectAccess{

    private ObjectAccess objectAccess = new SomeObjectAccess();
    private String UserCache = null;

    @Override
    public String access(String role) {
        if(UserCache == null) {
            UserCache = objectAccess.access(role);
        }
        return UserCache;
    }

    public void clearCache() {
        UserCache = null;
    }
    
}
