package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.q5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observer;

/* loaded from: classes7.dex */
interface p0 {
    void addObserverToCollector(Observer observer, n0 n0Var);

    void addObserverToCollectors(Observer observer);

    Integer getAccountId();

    String getAppId();

    String getAppName();

    Long getAppRatingLastAcceptedTimestamp();

    Long getAppRatingLastDeclineTimestamp();

    Long getAppRatingLastTriggerTimestamp();

    String getAppVersion();

    Integer getCSAT();

    ArrayList<CustomParameter> getCustomParameters();

    HashMap<String, CustomParameter> getCustomParametersMap();

    String getDeviceFreeMemory();

    String getDeviceId();

    String getDeviceModel();

    String getDeviceResolution();

    Long getDeviceUsedMemory();

    String getDeviceVendor();

    String getIp();

    String getLanguage();

    Long getLastDeclineTimestamp();

    Long getLastSubmitTimestamp();

    Integer getNPS();

    String getNetworkCarrier();

    String getNetworkProvider();

    Double getNetworkSpeed();

    String getOSName();

    String getOSVersion();

    q5.b getOrientation();

    Long getPropertyId();

    MDSdkFrameworkType getSDKFramework();

    String getSDKVersion();

    Object getSessionCalculatedPercentage();

    String getSessionId();

    Integer getSessionNumber();

    Integer getSessionPercentageSampledEvents();

    Long getTimeInBackground();

    Long getTimeInCurrentForeground();

    Long getTimeInForeground();

    String getTimezone();

    String getUserEmail();

    String getUserID();

    String getUserName();

    String isInvitationDisplayed();

    String isOCQRulesValid();

    String isOCQUserSet();

    String isPromptDisplayed();

    String isSessionSampledEventsCollector();

    void pollAll();

    void register();

    void setAccountId(Integer num);

    void setIsSessionSampledEventsCollector(boolean z10);

    void setPropertyId(Long l10);

    void setSDKFramework(MDSdkFrameworkType mDSdkFrameworkType);

    void setSessionId(String str);

    void setSessionNumber(Integer num);

    void setSessionPercentageSampledEventsCollector(int i10);

    void setUserEmail(String str);

    void setUserID(String str);

    void setUserName(String str);

    void stopCollectors();

    void unregister();

    void updateConfiguration(CollectorsConfigurationContract collectorsConfigurationContract, boolean z10);
}
