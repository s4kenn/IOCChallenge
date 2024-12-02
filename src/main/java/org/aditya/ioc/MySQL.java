package org.aditya.ioc;

public class MySQL implements UserDataProvider {

    @Override
    public String getDetails() {
        return "Data fetched from MySQL";
    }

}
