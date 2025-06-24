package com.dailypaper.backend;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public ArrayList<String> users;

    public UserService() {
        // Initialize the list of users
        users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
    }


    public ArrayList<String> getUsers() {
        return users;
    }
}
