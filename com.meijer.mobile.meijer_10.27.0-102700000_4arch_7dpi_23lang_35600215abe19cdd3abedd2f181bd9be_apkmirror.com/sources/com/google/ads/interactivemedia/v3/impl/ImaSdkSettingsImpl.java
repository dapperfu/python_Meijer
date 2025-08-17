package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ImaSdkSettingsImpl implements ImaSdkSettings {
    private Map<String, String> featureFlags;
    private String playerType;
    private String playerVersion;
    private String ppid;
    private transient boolean restrictToCustomPlayer;
    private String sessionId;
    private TestingConfiguration testingConfig;
    private final boolean supportsMultipleVideoDisplayChannels = true;
    private int numRedirects = 4;
    private boolean autoPlayAdBreaks = true;
    private boolean debugMode = false;
    private transient String language = "en";

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public boolean doesRestrictToCustomPlayer() {
        return this.restrictToCustomPlayer;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public boolean getAutoPlayAdBreaks() {
        return this.autoPlayAdBreaks;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public Map<String, String> getFeatureFlags() {
        return this.featureFlags;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getLanguage() {
        return this.language;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public int getMaxRedirects() {
        return this.numRedirects;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getPlayerType() {
        return this.playerType;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getPlayerVersion() {
        return this.playerVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getPpid() {
        return this.ppid;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public TestingConfiguration getTestingConfig() {
        return this.testingConfig;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public boolean isDebugMode() {
        return this.debugMode;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setAutoPlayAdBreaks(boolean z10) {
        this.autoPlayAdBreaks = z10;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setDebugMode(boolean z10) {
        this.debugMode = z10;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setFeatureFlags(Map<String, String> map) {
        this.featureFlags = map;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setLanguage(String str) {
        this.language = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setMaxRedirects(int i10) {
        this.numRedirects = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setPlayerType(String str) {
        this.playerType = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setPlayerVersion(String str) {
        this.playerVersion = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setPpid(String str) {
        this.ppid = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setRestrictToCustomPlayer(boolean z10) {
        this.restrictToCustomPlayer = z10;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setSessionId(String str) {
        this.sessionId = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setTestingConfig(TestingConfiguration testingConfiguration) {
        this.testingConfig = testingConfiguration;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String toString() {
        return "ImaSdkSettings [ppid=" + this.ppid + ", numRedirects=" + this.numRedirects + ", playerType=" + this.playerType + ", playerVersion=" + this.playerVersion + ", language=" + this.language + ", restrictToCustom=" + this.restrictToCustomPlayer + ", autoPlayAdBreaks=" + this.autoPlayAdBreaks + ", sessionId=" + this.sessionId + "]";
    }
}
