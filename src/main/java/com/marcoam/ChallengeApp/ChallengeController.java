package com.marcoam.ChallengeApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//notation to tell this is a controller class
@RestController
public class ChallengeController {
    private List<Challenge> challenges = 
            new ArrayList<>();

    public ChallengeController(){
        Challenge challenge1 =
                new Challenge(1L, "January", "Learn a new programming language");
        challenges.add(challenge1);
    }
            //when get request use the below method
     @GetMapping("/challenges")        
    //end point for challenge
    public List<Challenge> getAllChallenges(){
        return challenges;
    }
}
