package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class CurationsAuthor {
    protected String alias;

    @InterfaceC16127c("avatar")
    protected String avatarUrl;
    protected String channel;

    @InterfaceC16127c("profile")
    protected String profileUrl;
    protected String token;
    protected String username;

    public static final class Builder {
        private String alias;
        private String avatarUrl;
        private String profileUrl;
        private String token;

        public Builder avatarUrl(String str) {
            this.avatarUrl = str;
            return this;
        }

        public CurationsAuthor build() {
            return new CurationsAuthor(this);
        }

        public Builder profileUrl(String str) {
            this.profileUrl = str;
            return this;
        }

        public Builder(String str, String str2) {
            this.alias = str;
            this.token = str2;
        }
    }

    protected CurationsAuthor() {
    }

    public String getAlias() {
        return this.alias;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getProfileUrl() {
        return this.profileUrl;
    }

    public String getToken() {
        return this.token;
    }

    public String getUsername() {
        return this.username;
    }

    private CurationsAuthor(Builder builder) {
        this.alias = builder.alias;
        this.token = builder.token;
        this.profileUrl = builder.profileUrl;
        this.avatarUrl = builder.avatarUrl;
    }
}
