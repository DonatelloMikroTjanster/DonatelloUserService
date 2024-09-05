package com.nadia.donatellouserservice.Services;

import com.nadia.donatellouserservice.Entities.UserProfile;
import com.nadia.donatellouserservice.Repositories.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public UserProfile createUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public Optional<UserProfile> getUserProfile(Long id) {
        return userProfileRepository.findById(id);
    }
}
