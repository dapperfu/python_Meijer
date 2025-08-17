package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.PhotoUpload;
import com.bazaarvoice.bvandroidsdk.VideoUpload;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class ConversationsSubmissionRequest extends ConversationsRequest {
    private final Action action;
    private final Boolean agreedToTermsAndConditions;
    private final AuthenticationProvider authenticationProvider;
    private final Builder builder;
    private final String campaignId;
    private final String fingerPrint;
    private boolean forcePreview;
    private final List<FormPair> formPairs;
    private final String hostedAuthenticationCallback;
    private final String hostedAuthenticationEmail;
    private final String locale;
    private final List<PhotoUpload> photoUploads;
    private List<Photo> photos;
    private final Boolean sendEmailAlertWhenPublished;
    private final String user;
    private final String userEmail;
    private final String userId;
    private final String userLocation;
    private final String userNickname;
    private final List<VideoUpload> videoUploads;
    private List<Video> videos;

    public static abstract class Builder<BuilderChildType extends Builder> {
        private final Action action;
        private Boolean agreedToTermsAndConditions;
        private AuthenticationProvider authenticationProvider;
        private String campaignId;
        private String fingerPrint;
        private String hostedAuthenticationCallback;
        private String hostedAuthenticationEmail;
        private String locale;
        private Boolean sendEmailAlertWhenPublished;
        private String user;
        private String userEmail;
        private String userId;
        private String userLocation;
        private String userNickname;
        final transient List<PhotoUpload> photoUploads = new ArrayList();
        final transient List<VideoUpload> videoUploads = new ArrayList();
        private final List<FormPair> formPairs = new ArrayList();

        abstract PhotoUpload.ContentType getPhotoContentType();

        abstract VideoUpload.ContentType getVideoContentType();

        public BuilderChildType addCustomSubmissionParameter(String str, String str2) {
            this.formPairs.add(new FormPair(str, str2));
            return this;
        }

        public BuilderChildType addPhoto(File file, String str) {
            this.photoUploads.add(new PhotoUpload(file, str, getPhotoContentType()));
            return this;
        }

        public BuilderChildType addVideo(File file, String str) {
            this.videoUploads.add(new VideoUpload(file, str, getVideoContentType()));
            return this;
        }

        public BuilderChildType agreedToTermsAndConditions(Boolean bool) {
            this.agreedToTermsAndConditions = bool;
            return this;
        }

        public BuilderChildType authenticationProvider(AuthenticationProvider authenticationProvider) {
            this.authenticationProvider = authenticationProvider;
            return this;
        }

        public BuilderChildType campaignId(String str) {
            this.campaignId = str;
            return this;
        }

        public BuilderChildType fingerPrint(String str) {
            this.fingerPrint = str;
            return this;
        }

        public BuilderChildType hostedAuthenticationCallback(String str) {
            this.hostedAuthenticationCallback = str;
            return this;
        }

        public BuilderChildType hostedAuthenticationEmail(String str) {
            this.hostedAuthenticationEmail = str;
            return this;
        }

        public BuilderChildType locale(String str) {
            this.locale = str;
            return this;
        }

        public BuilderChildType sendEmailAlertWhenPublished(Boolean bool) {
            this.sendEmailAlertWhenPublished = bool;
            return this;
        }

        public BuilderChildType user(String str) {
            this.user = str;
            return this;
        }

        public BuilderChildType userEmail(String str) {
            this.userEmail = str;
            return this;
        }

        public BuilderChildType userId(String str) {
            this.userId = str;
            return this;
        }

        public BuilderChildType userLocation(String str) {
            this.userLocation = str;
            return this;
        }

        public BuilderChildType userNickname(String str) {
            this.userNickname = str;
            return this;
        }

        Builder(Action action) {
            this.action = action;
        }
    }

    static class FormPair {
        private final String key;
        private final String value;

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public FormPair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    Action getAction() {
        return this.action;
    }

    Boolean getAgreedToTermsAndConditions() {
        return this.agreedToTermsAndConditions;
    }

    AuthenticationProvider getAuthenticationProvider() {
        return this.authenticationProvider;
    }

    Builder getBuilder() {
        return this.builder;
    }

    String getCampaignId() {
        return this.campaignId;
    }

    String getFingerPrint() {
        return this.fingerPrint;
    }

    boolean getForcePreview() {
        return this.forcePreview;
    }

    List<FormPair> getFormPairs() {
        return this.formPairs;
    }

    String getHostedAuthenticationCallback() {
        return this.hostedAuthenticationCallback;
    }

    String getHostedAuthenticationEmail() {
        return this.hostedAuthenticationEmail;
    }

    String getLocale() {
        return this.locale;
    }

    List<PhotoUpload> getPhotoUploads() {
        return this.photoUploads;
    }

    List<Photo> getPhotos() {
        return this.photos;
    }

    Boolean getSendEmailAlertWhenPublished() {
        return this.sendEmailAlertWhenPublished;
    }

    String getUser() {
        return this.user;
    }

    String getUserEmail() {
        return this.userEmail;
    }

    String getUserId() {
        return this.userId;
    }

    String getUserLocation() {
        return this.userLocation;
    }

    String getUserNickname() {
        return this.userNickname;
    }

    List<VideoUpload> getVideoUploads() {
        return this.videoUploads;
    }

    List<Video> getVideos() {
        return this.videos;
    }

    boolean isForcePreview() {
        return this.forcePreview;
    }

    void setForcePreview(boolean z10) {
        this.forcePreview = z10;
    }

    void setPhotos(List<Photo> list) {
        this.photos = list;
    }

    void setVideos(List<Video> list) {
        this.videos = list;
    }

    ConversationsSubmissionRequest(Builder builder) {
        this.builder = builder;
        this.campaignId = builder.campaignId;
        this.fingerPrint = builder.fingerPrint;
        this.authenticationProvider = builder.authenticationProvider;
        this.hostedAuthenticationEmail = builder.hostedAuthenticationEmail;
        this.hostedAuthenticationCallback = builder.hostedAuthenticationCallback;
        this.locale = builder.locale;
        this.user = builder.user;
        this.userEmail = builder.userEmail;
        this.userId = builder.userId;
        this.userLocation = builder.userLocation;
        this.userNickname = builder.userNickname;
        this.sendEmailAlertWhenPublished = builder.sendEmailAlertWhenPublished;
        this.agreedToTermsAndConditions = builder.agreedToTermsAndConditions;
        this.action = builder.action;
        this.formPairs = builder.formPairs;
        this.photoUploads = builder.photoUploads;
        this.videoUploads = builder.videoUploads;
    }
}
