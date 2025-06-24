package com.dailypaper.backend;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class UserController {
    UserService userService = new UserService();


    /**
     * This method handles HTTP GET requests for the "/users" endpoint
     * and returns a list of user names.
     *
     * @return a list of user names
     */
    @RequestMapping(method = RequestMethod.GET, path="/users")
    public ArrayList<String> getUsers() {
        System.out.println("Received request for users in UserController");
        return userService.getUsers();
    }
}
