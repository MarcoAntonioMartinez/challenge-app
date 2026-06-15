package com.marcoam.ChallengeApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//notation to tell this is a controller class
@RestController
public class ChallengeController {

    private ChallengeService challengeService;


    public ChallengeController(ChallengeService challengeService){
        this.challengeService = challengeService;
    }

            //when get request use the below method
     @GetMapping("/challenges")        
    //end point for challenge
    public List<Challenge> getAllChallenges(){
        return challengeService.getAllChallenges();
    }

    @PostMapping("/challenges")
    public String addChallenge(@RequestBody Challenge challenge){
        boolean isChallengeAdded = challengeService.addChallenge(challenge);

        if(isChallengeAdded)
        return "Challenge added succesfully";
        else
            return "Challenge not added succesfully";
    }
}
