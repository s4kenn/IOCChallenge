package org.aditya.ioc;

public class UserManager {

    UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getInfo() {
        return userDataProvider.getDetails();
    }

}
