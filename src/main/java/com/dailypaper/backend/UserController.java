package com.dailypaper.backend;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    /**
     * This method handles HTTP GET requests for the "/users" endpoint
     * and returns a list of user names.
     *
     * @return a list of user names
     */
    @RequestMapping(method = RequestMethod.GET, path="/users")
    public ArrayList<String> getUsers() {
        ArrayList<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        return users;
    }
}
