package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.q5;
import com.medallia.digital.mobilesdk.s0;
import com.medallia.digital.mobilesdk.z6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observer;

/* loaded from: classes7.dex */
final class CollectorsInfrastructure implements p0, m8, LifeCycle.h {
    private static CollectorsInfrastructure instance;
    protected C11567c accountIdCollector;
    protected o appIdCollector;
    protected p appNameCollector;
    protected s appRatingLastAcceptedTimestampCollector;
    protected t appRatingLastDeclineTimestampCollector;
    protected u appRatingLastTriggerTimestampCollector;
    protected v appVersionCollector;
    protected a1 csatCollector;
    protected d1 customParametersCollector;
    protected q1 deviceVendorCollector;
    private boolean initialized;
    protected x2 interceptDisabledCollector;
    protected y2 interceptEnabledCollector;
    protected b3 invitationDisplayedCollector;
    protected g3 isOCQRulesValidCollector;
    protected h3 isOCQUserSetCollector;
    protected i3 isSessionSampledEventsCollector;
    protected q3 lastDeclineTimestampCollector;
    protected r3 lastSubmitTimestampCollector;
    protected w3 localNotificationsEnabledCollector;
    protected n5 npsCollector;
    protected b6 promptDisplayedCollector;
    protected c6 propertyIdCollector;
    protected s6 sdkFrameworkCollector;
    protected w6 sdkVersionCollector;
    protected z6 sessionCalculatedPercentageCollector;
    protected a7 sessionIdCollector;
    protected b7 sessionNumberCollector;
    protected c7 sessionPercentageSampledEventsCollector;
    protected y7 timeInBackgroundCollector;
    protected z7 timeInCurrentForegroundCollector;
    protected a8 timeInForegroundCollector;
    private final ArrayList<z1> feedCollectors = new ArrayList<>();
    private final ArrayList<y5> pollingCollectors = new ArrayList<>();
    private final ArrayList<w1> eventCollectors = new ArrayList<>();
    protected n1 deviceModelCollector = new n1(getPollType(s0.a.f92931b.getFrequency()), n0.DeviceModel);
    protected o1 deviceResolutionCollector = new o1(getPollType(s0.a.f92932c.getFrequency()), n0.DeviceResolution);
    protected p1 deviceUsedMemoryCollector = new p1(getPollType(s0.a.f92933d.getFrequency()), n0.DeviceUsedMemory);
    protected k1 deviceFreeMemoryCollector = new k1(getPollType(s0.a.f92930a.getFrequency()), n0.DeviceFreeMemoryCollector);
    protected r5 osNameCollector = new r5(getPollType(s0.a.f92935f.getFrequency()), n0.OsName);
    protected s5 osVersionCollector = new s5(getPollType(s0.a.f92936g.getFrequency()), n0.OsVersion);
    protected m5 networkProviderCollector = new m5(getPollType(s0.a.f92937h.getFrequency()), n0.NetworkProvider);
    protected k5 networkCarrierCollector = new k5(getPollType(s0.a.f92938i.getFrequency()), n0.NetworkCarrier);
    protected p3 languageCollector = new p3(getPollType(s0.a.f92939j.getFrequency()), n0.Language);
    protected b8 timezoneCollector = new b8(getPollType(s0.a.f92940k.getFrequency()), n0.Timezone);
    protected v2 ipCollector = new v2(getPollType(s0.a.f92941l.getFrequency()), n0.IP);
    protected q5 orientationCollector = new q5(n0.Orientation);
    protected l1 deviceIdCollector = new l1(getPollType(s0.a.f92943n.getFrequency()), n0.DeviceId);
    protected r8 userIdCollector = new r8(n0.UserId);
    protected w8 userNameCollector = new w8(n0.UserName);
    protected q8 userEmailCollector = new q8(n0.UserEmail);

    private CollectorsInfrastructure() {
        d1 d1Var = new d1(n0.CustomParameters);
        this.customParametersCollector = d1Var;
        d1Var.a(true);
        this.appNameCollector = new p(getPollType(s0.a.f92944o.getFrequency()), n0.AppName);
        this.appIdCollector = new o(getPollType(s0.a.f92945p.getFrequency()), n0.AppId);
        this.appVersionCollector = new v(getPollType(s0.a.f92946q.getFrequency()), n0.AppVersion);
        this.sdkVersionCollector = new w6(getPollType(s0.a.f92947r.getFrequency()), n0.SdkVersion);
        this.sessionCalculatedPercentageCollector = new z6(getPollType(s0.a.f92948s.getFrequency()), n0.SessionCalculatedPercentage);
        this.sessionNumberCollector = new b7(n0.SessionNumber);
        this.sessionIdCollector = new a7(n0.SessionId);
        this.lastDeclineTimestampCollector = new q3(n0.LastDeclineTimestamp);
        this.lastSubmitTimestampCollector = new r3(n0.LastSubmitTimestamp);
        this.deviceVendorCollector = new q1(getPollType(s0.a.f92934e.getFrequency()), n0.DeviceVendor);
        this.invitationDisplayedCollector = new b3(n0.InvitationDisplayed);
        y2 y2Var = new y2(n0.InterceptEnabled);
        this.interceptEnabledCollector = y2Var;
        y2Var.a(true);
        x2 x2Var = new x2(n0.InterceptDisabled);
        this.interceptDisabledCollector = x2Var;
        x2Var.a(true);
        this.propertyIdCollector = new c6(n0.PropertyId);
        this.accountIdCollector = new C11567c(n0.AccountId);
        this.timeInBackgroundCollector = new y7(n0.TimeInBackground);
        this.timeInForegroundCollector = new a8(n0.TimeInForeground);
        this.timeInCurrentForegroundCollector = new z7(n0.TimeInCurrentForeground);
        this.npsCollector = new n5(n0.NPS);
        this.csatCollector = new a1(n0.CSAT);
        this.appRatingLastDeclineTimestampCollector = new t(n0.AppRatingLastDeclineTimestamp);
        this.promptDisplayedCollector = new b6(n0.PromptDisplayed);
        this.appRatingLastAcceptedTimestampCollector = new s(n0.AppRatingLastAcceptedTimestamp);
        s6 s6Var = new s6(n0.SDKFramework);
        this.sdkFrameworkCollector = s6Var;
        s6Var.a(true);
        this.appRatingLastTriggerTimestampCollector = new u(n0.AppRatingLastTriggerTimestamp);
        this.localNotificationsEnabledCollector = new w3(getPollType(s0.a.f92924R.getFrequency()), n0.LocalNotificationsEnabled);
        h3 h3Var = new h3(n0.IsOCQUserSet);
        this.isOCQUserSetCollector = h3Var;
        h3Var.a(true);
        this.isOCQRulesValidCollector = new g3(n0.IsOCQRulesValid);
        c7 c7Var = new c7(n0.SessionPercentageSampledEvents);
        this.sessionPercentageSampledEventsCollector = c7Var;
        c7Var.a(true);
        i3 i3Var = new i3(n0.IsSessionSampledEvents);
        this.isSessionSampledEventsCollector = i3Var;
        i3Var.a(true);
        initCollectorsCollections();
        LifeCycle.b().a(this);
    }

    private boolean addObserver(m0 m0Var, Observer observer, n0 n0Var) {
        if (m0Var.a() != n0Var) {
            return false;
        }
        m0Var.addObserver(observer);
        return true;
    }

    protected static CollectorsInfrastructure getInstance() {
        if (instance == null && i4.c().a() != null) {
            instance = new CollectorsInfrastructure();
        }
        return instance;
    }

    private x5 getPollType(Integer num) {
        return new x5(num.intValue());
    }

    private void initCollectorsCollections() {
        this.feedCollectors.add(this.userIdCollector);
        this.feedCollectors.add(this.userEmailCollector);
        this.feedCollectors.add(this.userNameCollector);
        this.feedCollectors.add(this.customParametersCollector);
        this.feedCollectors.add(this.interceptEnabledCollector);
        this.feedCollectors.add(this.interceptDisabledCollector);
        this.feedCollectors.add(this.sessionPercentageSampledEventsCollector);
        this.feedCollectors.add(this.isSessionSampledEventsCollector);
        this.feedCollectors.add(this.sdkFrameworkCollector);
        this.eventCollectors.add(this.orientationCollector);
        this.eventCollectors.add(this.lastDeclineTimestampCollector);
        this.eventCollectors.add(this.lastSubmitTimestampCollector);
        this.eventCollectors.add(this.sessionNumberCollector);
        this.eventCollectors.add(this.sessionIdCollector);
        this.eventCollectors.add(this.invitationDisplayedCollector);
        this.eventCollectors.add(this.propertyIdCollector);
        this.eventCollectors.add(this.accountIdCollector);
        this.eventCollectors.add(this.npsCollector);
        this.eventCollectors.add(this.csatCollector);
        this.eventCollectors.add(this.appRatingLastDeclineTimestampCollector);
        this.eventCollectors.add(this.promptDisplayedCollector);
        this.eventCollectors.add(this.appRatingLastAcceptedTimestampCollector);
        this.eventCollectors.add(this.appRatingLastTriggerTimestampCollector);
        this.eventCollectors.add(this.isOCQUserSetCollector);
        this.eventCollectors.add(this.isOCQRulesValidCollector);
        this.pollingCollectors.add(this.deviceModelCollector);
        this.pollingCollectors.add(this.deviceResolutionCollector);
        this.pollingCollectors.add(this.deviceUsedMemoryCollector);
        this.pollingCollectors.add(this.deviceFreeMemoryCollector);
        this.pollingCollectors.add(this.osNameCollector);
        this.pollingCollectors.add(this.osVersionCollector);
        this.pollingCollectors.add(this.networkProviderCollector);
        this.pollingCollectors.add(this.networkCarrierCollector);
        this.pollingCollectors.add(this.languageCollector);
        this.pollingCollectors.add(this.timezoneCollector);
        this.pollingCollectors.add(this.ipCollector);
        this.pollingCollectors.add(this.deviceIdCollector);
        this.pollingCollectors.add(this.appNameCollector);
        this.pollingCollectors.add(this.appIdCollector);
        this.pollingCollectors.add(this.appVersionCollector);
        this.pollingCollectors.add(this.sdkVersionCollector);
        this.pollingCollectors.add(this.sessionCalculatedPercentageCollector);
        this.pollingCollectors.add(this.deviceVendorCollector);
        this.pollingCollectors.add(this.localNotificationsEnabledCollector);
    }

    private void removeAllObservers() {
        Iterator<z1> it = this.feedCollectors.iterator();
        while (it.hasNext()) {
            it.next().deleteObservers();
        }
        Iterator<y5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().deleteObservers();
        }
        Iterator<w1> it3 = this.eventCollectors.iterator();
        while (it3.hasNext()) {
            it3.next().deleteObservers();
        }
        this.timeInBackgroundCollector.deleteObservers();
        this.timeInForegroundCollector.deleteObservers();
        this.timeInCurrentForegroundCollector.deleteObservers();
    }

    private void setEventOrFeedCollectorConfiguration(CollectorContract collectorContract, m0 m0Var) {
        if (collectorContract == null) {
            collectorContract = m0Var.c();
        }
        if (collectorContract.getLifetime() != null) {
            m0Var.a(collectorContract.getLifetime());
        }
        if (collectorContract.isEnabled() != null) {
            m0Var.a(collectorContract.isEnabled().booleanValue());
        }
    }

    private void setPollingCollectorConfiguration(CollectorContract collectorContract, y5 y5Var) {
        if (collectorContract == null) {
            collectorContract = y5Var.c();
        }
        if (collectorContract.getFrequency() != null) {
            y5Var.a(getPollType(collectorContract.getFrequency()));
        }
        if (collectorContract.getLifetime() != null) {
            y5Var.a(collectorContract.getLifetime());
        }
        if (collectorContract.isEnabled() != null) {
            y5Var.a(collectorContract.isEnabled().booleanValue());
        }
    }

    private void updateEventCollectors(CollectorsConfigurationContract collectorsConfigurationContract) {
        if (collectorsConfigurationContract != null) {
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getOrientationCollector(), this.orientationCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getLastDeclineTimestampCollector(), this.lastDeclineTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getLastSubmitTimestampCollector(), this.lastSubmitTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getInvitationDisplayedCollector(), this.invitationDisplayedCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getSessionNumberCollector(), this.sessionNumberCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getSessionIdCollector(), this.sessionIdCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getPropertyIdCollector(), this.propertyIdCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getAccountIdCollector(), this.accountIdCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getNpsCollector(), this.npsCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getCsatCollector(), this.csatCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getAppRatingLastDeclineTimestampCollector(), this.appRatingLastDeclineTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getPromptDisplayedCollector(), this.promptDisplayedCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getAppRatingLastAcceptedTimestampCollector(), this.appRatingLastAcceptedTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getAppRatingLastTriggerTimestampCollector(), this.appRatingLastTriggerTimestampCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getIsOCQUserSetCollector(), this.isOCQUserSetCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getIsOCQRulesValidCollector(), this.isOCQRulesValidCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getTimeInBackgroundCollector(), this.timeInBackgroundCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getTimeInForegroundCollector(), this.timeInForegroundCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getTimeInCurrentForegroundCollector(), this.timeInCurrentForegroundCollector);
        }
    }

    private void updatedFeedCollectors(CollectorsConfigurationContract collectorsConfigurationContract) {
        if (collectorsConfigurationContract != null) {
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getUserIdCollector(), this.userIdCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getUserEmailCollector(), this.userEmailCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getUserNameCollector(), this.userNameCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getCustomParametersCollector(), this.customParametersCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getInterceptEnabledCollector(), this.interceptEnabledCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getInterceptDisabledCollector(), this.interceptDisabledCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getSessionPercentageSampledEventsCollector(), this.sessionPercentageSampledEventsCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getIsSessionSampledEventsCollector(), this.isSessionSampledEventsCollector);
            setEventOrFeedCollectorConfiguration(collectorsConfigurationContract.getSdkFrameworkCollector(), this.sdkFrameworkCollector);
        }
    }

    private void updatedPollingCollectors(CollectorsConfigurationContract collectorsConfigurationContract) {
        if (collectorsConfigurationContract != null) {
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceModelCollector(), this.deviceModelCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceResolutionCollector(), this.deviceResolutionCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceUsedMemoryCollector(), this.deviceUsedMemoryCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceFreeMemoryCollector(), this.deviceFreeMemoryCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getOsNameCollector(), this.osNameCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getOsVersionCollector(), this.osVersionCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getNetworkProviderCollector(), this.networkProviderCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getNetworkCarrierCollector(), this.networkCarrierCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getLanguageCollector(), this.languageCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getTimezoneCollector(), this.timezoneCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getIpCollector().setEnabled(false), this.ipCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceIdCollector(), this.deviceIdCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getAppNameCollector(), this.appNameCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getAppIdCollector(), this.appIdCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getAppVersionCollector(), this.appVersionCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getSdkVersionCollector(), this.sdkVersionCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getSessionCalculatedPercentageCollector(), this.sessionCalculatedPercentageCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getDeviceVendorCollector(), this.deviceVendorCollector);
            setPollingCollectorConfiguration(collectorsConfigurationContract.getLocalNotificationsEnabledCollector(), this.localNotificationsEnabledCollector);
        }
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void addObserverToCollector(Observer observer, n0 n0Var) {
        Iterator<z1> it = this.feedCollectors.iterator();
        while (it.hasNext()) {
            if (addObserver(it.next(), observer, n0Var)) {
                return;
            }
        }
        Iterator<y5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            if (addObserver(it2.next(), observer, n0Var)) {
                return;
            }
        }
        Iterator<w1> it3 = this.eventCollectors.iterator();
        while (it3.hasNext()) {
            if (addObserver(it3.next(), observer, n0Var)) {
                return;
            }
        }
        if (addObserver(this.timeInBackgroundCollector, observer, n0Var) || addObserver(this.timeInForegroundCollector, observer, n0Var)) {
            return;
        }
        addObserver(this.timeInCurrentForegroundCollector, observer, n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void addObserverToCollectors(Observer observer) {
        Iterator<z1> it = this.feedCollectors.iterator();
        while (it.hasNext()) {
            it.next().addObserver(observer);
        }
        Iterator<y5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().addObserver(observer);
        }
        Iterator<w1> it3 = this.eventCollectors.iterator();
        while (it3.hasNext()) {
            it3.next().addObserver(observer);
        }
        this.timeInBackgroundCollector.addObserver(observer);
        this.timeInForegroundCollector.addObserver(observer);
        this.timeInCurrentForegroundCollector.addObserver(observer);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a("Collectors");
        removeAllObservers();
        unregister();
        instance = null;
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Integer getAccountId() {
        return this.accountIdCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getAppId() {
        return this.appIdCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getAppName() {
        return this.appNameCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getAppRatingLastAcceptedTimestamp() {
        return this.appRatingLastAcceptedTimestampCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getAppRatingLastDeclineTimestamp() {
        return this.appRatingLastDeclineTimestampCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getAppRatingLastTriggerTimestamp() {
        return this.appRatingLastTriggerTimestampCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getAppVersion() {
        return this.appVersionCollector.f();
    }

    Object getByName(String str) {
        try {
            m0 m0Var = (m0) CollectorsInfrastructure.class.getDeclaredField(str.replaceFirst(String.valueOf(str.charAt(0)), String.valueOf(str.toLowerCase().charAt(0))) + "Collector").get(this);
            if (m0Var == null) {
                return null;
            }
            return m0Var.f();
        } catch (Exception e10) {
            a4.f(e10.getMessage());
            return null;
        }
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Integer getCSAT() {
        return this.csatCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public ArrayList<CustomParameter> getCustomParameters() {
        return new ArrayList<>(this.customParametersCollector.k().values());
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public HashMap<String, CustomParameter> getCustomParametersMap() {
        return this.customParametersCollector.k();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getDeviceFreeMemory() {
        return this.deviceFreeMemoryCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getDeviceId() {
        return this.deviceIdCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getDeviceModel() {
        return this.deviceModelCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getDeviceResolution() {
        return this.deviceResolutionCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getDeviceUsedMemory() {
        return this.deviceUsedMemoryCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getDeviceVendor() {
        return this.deviceVendorCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getIp() {
        return this.ipCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getLanguage() {
        return this.languageCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getLastDeclineTimestamp() {
        return this.lastDeclineTimestampCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getLastSubmitTimestamp() {
        return this.lastSubmitTimestampCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Integer getNPS() {
        return this.npsCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getNetworkCarrier() {
        return this.networkCarrierCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getNetworkProvider() {
        return this.networkProviderCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Double getNetworkSpeed() {
        return Double.valueOf(0.0d);
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getOSName() {
        return this.osNameCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getOSVersion() {
        return this.osVersionCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public q5.b getOrientation() {
        return this.orientationCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getPropertyId() {
        return this.propertyIdCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public MDSdkFrameworkType getSDKFramework() {
        return this.sdkFrameworkCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getSDKVersion() {
        return this.sdkVersionCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Object getSessionCalculatedPercentage() {
        return this.sessionCalculatedPercentageCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getSessionId() {
        return this.sessionIdCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Integer getSessionNumber() {
        return this.sessionNumberCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Integer getSessionPercentageSampledEvents() {
        return this.sessionPercentageSampledEventsCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getTimeInBackground() {
        return this.timeInBackgroundCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getTimeInCurrentForeground() {
        return this.timeInForegroundCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public Long getTimeInForeground() {
        return this.timeInForegroundCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getTimezone() {
        return this.timezoneCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getUserEmail() {
        return this.userEmailCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getUserID() {
        return this.userIdCollector.f();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String getUserName() {
        return this.userNameCollector.f();
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String isInvitationDisplayed() {
        return String.valueOf(this.invitationDisplayedCollector.f());
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String isOCQRulesValid() {
        return String.valueOf(this.isOCQRulesValidCollector.f());
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String isOCQUserSet() {
        return String.valueOf(this.isOCQUserSetCollector.f());
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String isPromptDisplayed() {
        return String.valueOf(this.promptDisplayedCollector.f());
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public String isSessionSampledEventsCollector() {
        return String.valueOf(this.isSessionSampledEventsCollector.f());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        unregister();
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        register();
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void pollAll() {
        Iterator<y5> it = this.pollingCollectors.iterator();
        while (it.hasNext()) {
            it.next().m();
        }
        Iterator<w1> it2 = this.eventCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().k();
        }
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void register() {
        Iterator<w1> it = this.eventCollectors.iterator();
        while (it.hasNext()) {
            it.next().l();
        }
        Iterator<y5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().n();
        }
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setAccountId(Integer num) {
        this.accountIdCollector.a(num);
    }

    public void setInitialized(boolean z10) {
        this.initialized = z10;
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setIsSessionSampledEventsCollector(boolean z10) {
        this.isSessionSampledEventsCollector.a(Boolean.valueOf(z10));
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setPropertyId(Long l10) {
        this.propertyIdCollector.a((c6) l10);
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setSDKFramework(MDSdkFrameworkType mDSdkFrameworkType) {
        this.sdkFrameworkCollector.a(mDSdkFrameworkType);
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setSessionId(String str) {
        this.sessionIdCollector.a((a7) str);
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setSessionNumber(Integer num) {
        this.sessionNumberCollector.a((b7) num);
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setSessionPercentageSampledEventsCollector(int i10) {
        this.sessionPercentageSampledEventsCollector.a(Integer.valueOf(i10));
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setUserEmail(String str) {
        this.userEmailCollector.a(str);
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setUserID(String str) {
        this.userIdCollector.a(str);
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void setUserName(String str) {
        this.userNameCollector.a(str);
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void stopCollectors() {
        Iterator<w1> it = this.eventCollectors.iterator();
        while (it.hasNext()) {
            it.next().a(false);
        }
        Iterator<y5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().a(false);
        }
        Iterator<z1> it3 = this.feedCollectors.iterator();
        while (it3.hasNext()) {
            it3.next().a(false);
        }
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void unregister() {
        Iterator<w1> it = this.eventCollectors.iterator();
        while (it.hasNext()) {
            it.next().m();
        }
        Iterator<y5> it2 = this.pollingCollectors.iterator();
        while (it2.hasNext()) {
            it2.next().q();
        }
    }

    @Override // com.medallia.digital.mobilesdk.p0
    public void updateConfiguration(CollectorsConfigurationContract collectorsConfigurationContract, boolean z10) {
        if (collectorsConfigurationContract == null) {
            collectorsConfigurationContract = new CollectorsConfigurationContract();
        }
        a8 a8Var = this.timeInForegroundCollector;
        if (a8Var != null) {
            a8Var.r();
        }
        y7 y7Var = this.timeInBackgroundCollector;
        if (y7Var != null) {
            y7Var.p();
        }
        updateEventCollectors(collectorsConfigurationContract);
        updatedPollingCollectors(collectorsConfigurationContract);
        updatedFeedCollectors(collectorsConfigurationContract);
        this.sessionCalculatedPercentageCollector.a(z10 ? z6.a.DOUBLE : z6.a.INTEGER);
    }
}
