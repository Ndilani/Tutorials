package com.awsimageupload.awsimageupload.bucket;

/*
 enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
 */
public enum BucketName {
    PROFILE_IMAGE("img-upload-s3-123");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
