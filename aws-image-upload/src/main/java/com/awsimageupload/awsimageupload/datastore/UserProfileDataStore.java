package com.awsimageupload.awsimageupload.datastore;

import com.awsimageupload.awsimageupload.model.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES =  new ArrayList<>();
    static{
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"Dilani Alvis",null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"Dilani Nanayakkara",null));
    }
    public  List<UserProfile> getUserProfiles(){
        System.out.println(" 4 dumy dta ");
        return USER_PROFILES;
    }
}
