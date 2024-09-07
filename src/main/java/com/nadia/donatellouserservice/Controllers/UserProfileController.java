package com.nadia.donatellouserservice.Controllers;

import com.nadia.donatellouserservice.Entities.UserProfile;
import com.nadia.donatellouserservice.Services.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user_profiles")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    //skapa profil
    @PostMapping ("/newprofile")
    public ResponseEntity<UserProfile> createUserProfile(@RequestBody UserProfile userProfile) {
        return new ResponseEntity<>(userProfileService.createUserProfile(userProfile), HttpStatus.CREATED);
    }

    //hämta profil med id
    @GetMapping("/getprofile{id}")
    public ResponseEntity<UserProfile> getUserProfileById(@PathVariable Long id) {
        return userProfileService.getUserProfileById(id)
                .map(profile -> new ResponseEntity<>(profile, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
