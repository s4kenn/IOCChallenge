package org.aditya.ioc;

public class MongoDB implements UserDataProvider {

    @Override
    public String getDetails() {
        return "Data fetched from MongoDB";
    }

}
