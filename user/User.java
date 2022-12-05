package user;

import inter.ObjectAccess;
import proxy.SomeObjectAccessProxy;

public class User {
    private String role = "";
    private ObjectAccess objectAccess = new SomeObjectAccessProxy();

    public User(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void TestAccess() {
        String data = objectAccess.access(role);
        System.out.println(data);
    }
}
