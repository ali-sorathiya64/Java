package PracticeProject;

import java.util.Set;

public class Users {
    private  String userName;
    private boolean isActive;
    private Set <String> roles;


    public Users(String userName, boolean isActive, Set<String> roles) {
        this.userName = userName;
        this.isActive = isActive;
        this.roles = roles;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isActive() {
        return isActive;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
