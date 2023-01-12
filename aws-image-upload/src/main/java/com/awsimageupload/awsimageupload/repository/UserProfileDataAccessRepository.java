package com.awsimageupload.awsimageupload.repository;

import com.awsimageupload.awsimageupload.datastore.UserProfileDataStore;
import com.awsimageupload.awsimageupload.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessRepository {

    private final UserProfileDataStore userProfileDataStore;

    @Autowired
    public UserProfileDataAccessRepository(UserProfileDataStore userProfileDataStore) {
        this.userProfileDataStore = userProfileDataStore;
    }

    public List<UserProfile> getUserProfiles() {
        return userProfileDataStore.getUserProfiles();
    }
}
