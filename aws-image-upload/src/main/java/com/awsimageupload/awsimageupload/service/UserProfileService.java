package com.awsimageupload.awsimageupload.service;

import com.awsimageupload.awsimageupload.model.UserProfile;
import com.awsimageupload.awsimageupload.repository.UserProfileDataAccessRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {


    private final UserProfileDataAccessRepository userProfileDataAccessRepository;

    @Autowired
    public UserProfileService(UserProfileDataAccessRepository userProfileDataAccessRepository) {
         this.userProfileDataAccessRepository = userProfileDataAccessRepository;
    }

    public List<UserProfile> getUserProfileDataStore() {

        return userProfileDataAccessRepository.getUserProfiles();
    }
}
