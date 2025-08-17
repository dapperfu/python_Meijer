package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.Map;

/* loaded from: classes4.dex */
public interface ImaSdkSettings {
    public static final int DEFAULT_MAX_REDIRECTS = 4;

    boolean doesRestrictToCustomPlayer();

    boolean getAutoPlayAdBreaks();

    Map<String, String> getFeatureFlags();

    String getLanguage();

    int getMaxRedirects();

    String getPlayerType();

    String getPlayerVersion();

    String getPpid();

    String getSessionId();

    TestingConfiguration getTestingConfig();

    boolean isDebugMode();

    void setAutoPlayAdBreaks(boolean z10);

    void setDebugMode(boolean z10);

    void setFeatureFlags(Map<String, String> map);

    void setLanguage(String str);

    void setMaxRedirects(int i10);

    void setPlayerType(String str);

    void setPlayerVersion(String str);

    void setPpid(String str);

    void setRestrictToCustomPlayer(boolean z10);

    void setSessionId(String str);

    void setTestingConfig(TestingConfiguration testingConfiguration);

    String toString();
}
