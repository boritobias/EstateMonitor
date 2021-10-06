package org.djna.asynch.estate.data;

public class ListOfUsers {

    public enum UserRoles {
        OWNER ("owner"),
        TENANT ("tenant");
        private String userRole;

       private UserRoles(String initName){ userRole= initName;}
    }


    private String username;
    private String password;


    public ListOfUsers(String username, String password, UserRoles userRoles) {
        this.username = username;
        this.password = password;

    }
}
