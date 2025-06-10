package com.dailypaper.backend;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller handles HTTP requests for the "/good-morning" endpoint
 * and returns a simple greeting message.
 */
@RestController
public class GoodMorningController {

    @RequestMapping("/goodm")
    public String goodMorning() {
        return "Good Morning!";
    }

}
