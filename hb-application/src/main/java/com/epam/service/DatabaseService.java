package com.epam.service;

// DO NOT CHANGE THIS CLASS
public class DatabaseService {

    public String getRealNameById(String id) {
        if ("BBB".equals(id)) {
            return "Tobias Reaper";
        } else {
            throw new RuntimeException("Invalid or empty name!");
        }
    }

}
