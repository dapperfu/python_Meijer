package com.adobe.marketing.mobile.analytics.internal;

import Q5.t;
import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.analytics.internal.a;
import com.adobe.marketing.mobile.util.DataReaderException;
import f6.C13845a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010%\n\u0002\b\u000e\u0018\u0000 92\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ%\u0010\r\u001a\u00020\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\tJ%\u0010\u000f\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\tJ%\u0010\u0011\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J3\u0010\u0014\u001a\u00020\u00072\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00040\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\tJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0003R(\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R$\u0010(\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b'\u0010%R$\u0010-\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020)8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R$\u00102\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020.8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R$\u00105\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020)8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R$\u00108\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%R\"\u0010<\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b9\u0010%\"\u0004\b:\u0010;R(\u0010?\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b=\u0010\u0017\u001a\u0004\b>\u0010\u0019R(\u0010A\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b@\u0010\u0019R(\u0010C\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\bB\u0010\u0019R(\u0010F\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bD\u0010\u0017\u001a\u0004\bE\u0010\u0019R(\u0010I\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bG\u0010\u0017\u001a\u0004\bH\u0010\u0019R(\u0010K\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\bJ\u0010\u0019R(\u0010M\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u0010\u0017\u001a\u0004\bL\u0010\u0019R(\u0010N\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b@\u0010\u0017\u001a\u0004\b6\u0010\u0019R&\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010P\u001a\u0004\b=\u0010QR\u0016\u0010T\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010*R$\u0010U\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\bD\u0010\u001eR$\u0010V\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b7\u0010\u001c\u001a\u0004\bG\u0010\u001eR\u001d\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b3\u0010QR\u0011\u0010X\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bS\u0010%R\u0011\u0010Z\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bY\u0010%R\u0011\u0010\\\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b[\u0010%¨\u0006]"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/g;", "", "<init>", "()V", "", "", "configuration", "", "c", "(Ljava/util/Map;)V", "identityInfo", "d", "placesInfo", "f", "lifecycleData", "e", "assuranceInfo", "b", "a", "dataMap", "B", "z", "<set-?>", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "host", "", "J", "l", "()J", "A", "(J)V", "lastResetIdentitiesTimestampSec", "", "Z", "t", "()Z", "isAnalyticsForwardingEnabled", "w", "isOfflineTrackingEnabled", "", "I", "i", "()I", "batchLimit", "Lcom/adobe/marketing/mobile/D;", "Lcom/adobe/marketing/mobile/D;", "o", "()Lcom/adobe/marketing/mobile/D;", "privacyStatus", "g", "p", "referrerTimeout", "h", "u", "isAssuranceSessionActive", "v", "setBackdateSessionInfoEnabled$analytics_phoneRelease", "(Z)V", "isBackdateSessionInfoEnabled", "j", "getMarketingCloudOrganizationID$analytics_phoneRelease", "marketingCloudOrganizationID", "q", "rsids", "getMarketingCloudId$analytics_phoneRelease", "marketingCloudId", "m", "getLocationHint$analytics_phoneRelease", "locationHint", "n", "getAdvertisingIdentifier$analytics_phoneRelease", "advertisingIdentifier", "getBlob$analytics_phoneRelease", "blob", "r", "serializedVisitorIDsList", "applicationID", "", "Ljava/util/Map;", "()Ljava/util/Map;", "defaultData", "s", "sessionTimeout", "lifecycleMaxSessionLength", "lifecycleSessionStartTimestamp", "analyticsIdVisitorParameters", "isAnalyticsConfigured", "y", "isVisitorIDServiceEnabled", "x", "isOptIn", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String host;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long lastResetIdentitiesTimestampSec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isAnalyticsForwardingEnabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isOfflineTrackingEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int batchLimit;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int referrerTimeout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isAssuranceSessionActive;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isBackdateSessionInfoEnabled;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String marketingCloudOrganizationID;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String rsids;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String marketingCloudId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String locationHint;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String advertisingIdentifier;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String blob;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String serializedVisitorIDsList;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private String applicationID;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long lifecycleMaxSessionLength;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long lifecycleSessionStartTimestamp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private D privacyStatus = a.C1226a.f62056a.a();

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> defaultData = new HashMap();

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int sessionTimeout = 300000;

    private final void a() {
        this.defaultData.remove("a.loc.poi.id");
        this.defaultData.remove("a.loc.poi");
    }

    private final void b(Map<String, ? extends Object> assuranceInfo) {
        this.isAssuranceSessionActive = !f6.i.a(C13845a.o(assuranceInfo, "sessionid", null));
    }

    private final void c(Map<String, ? extends Object> configuration) {
        this.host = C13845a.o(configuration, "analytics.server", null);
        this.rsids = C13845a.o(configuration, "analytics.rsids", null);
        this.isAnalyticsForwardingEnabled = C13845a.l(configuration, "analytics.aamForwardingEnabled", false);
        this.isOfflineTrackingEnabled = C13845a.l(configuration, "analytics.offlineEnabled", false);
        this.batchLimit = C13845a.m(configuration, "analytics.batchLimit", 0);
        int iM = C13845a.m(configuration, "analytics.launchHitDelay", 0);
        if (iM >= 0) {
            this.referrerTimeout = iM;
        }
        this.marketingCloudOrganizationID = C13845a.o(configuration, "experienceCloud.org", null);
        this.isBackdateSessionInfoEnabled = C13845a.l(configuration, "analytics.backdatePreviousSessionInfo", false);
        D dB = D.b(C13845a.o(configuration, "global.privacy", a.C1226a.f62056a.a().e()));
        Intrinsics.i(dB, "fromString(\n            …)\n            )\n        )");
        this.privacyStatus = dB;
        this.sessionTimeout = C13845a.m(configuration, "lifecycle.sessionTimeout", 300000);
    }

    private final void d(Map<String, ? extends Object> identityInfo) {
        this.marketingCloudId = C13845a.o(identityInfo, "mid", null);
        this.blob = C13845a.o(identityInfo, "blob", null);
        this.locationHint = C13845a.o(identityInfo, "locationhint", null);
        this.advertisingIdentifier = C13845a.o(identityInfo, "advertisingidentifier", null);
        if (identityInfo.containsKey("visitoridslist")) {
            try {
                this.serializedVisitorIDsList = f.INSTANCE.b(C13845a.i(Object.class, identityInfo, "visitoridslist"));
            } catch (DataReaderException e10) {
                t.a("Analytics", "AnalyticsState", "extractIdentityInfo - The format of the serializedVisitorIDsList list is invalid: %s", e10);
            }
        }
    }

    private final void e(Map<String, ? extends Object> lifecycleData) {
        this.lifecycleSessionStartTimestamp = C13845a.n(lifecycleData, "starttimestampmillis", 0L);
        this.lifecycleMaxSessionLength = C13845a.n(lifecycleData, "maxsessionlength", 0L);
        Map mapT = C13845a.t(String.class, lifecycleData, "lifecyclecontextdata", null);
        if (mapT == null || mapT.isEmpty()) {
            return;
        }
        String str = (String) mapT.get("osversion");
        if (!f6.i.a(str)) {
            Map<String, String> map = this.defaultData;
            if (str == null) {
                str = "";
            }
            map.put("a.OSVersion", str);
        }
        String str2 = (String) mapT.get("devicename");
        if (!f6.i.a(str2)) {
            Map<String, String> map2 = this.defaultData;
            if (str2 == null) {
                str2 = "";
            }
            map2.put("a.DeviceName", str2);
        }
        String str3 = (String) mapT.get("resolution");
        if (!f6.i.a(str3)) {
            Map<String, String> map3 = this.defaultData;
            if (str3 == null) {
                str3 = "";
            }
            map3.put("a.Resolution", str3);
        }
        String str4 = (String) mapT.get("carriername");
        if (!f6.i.a(str4)) {
            Map<String, String> map4 = this.defaultData;
            if (str4 == null) {
                str4 = "";
            }
            map4.put("a.CarrierName", str4);
        }
        String str5 = (String) mapT.get("runmode");
        if (!f6.i.a(str5)) {
            Map<String, String> map5 = this.defaultData;
            if (str5 == null) {
                str5 = "";
            }
            map5.put("a.RunMode", str5);
        }
        String str6 = (String) mapT.get("appid");
        if (f6.i.a(str6)) {
            return;
        }
        this.defaultData.put("a.AppID", str6 != null ? str6 : "");
        this.applicationID = str6;
    }

    private final void f(Map<String, ? extends Object> placesInfo) {
        Map mapT = C13845a.t(Object.class, placesInfo, "currentpoi", null);
        if (mapT == null) {
            return;
        }
        Object obj = mapT.get("regionid");
        String str = obj instanceof String ? (String) obj : null;
        if (!f6.i.a(str)) {
            Map<String, String> map = this.defaultData;
            if (str == null) {
                str = "";
            }
            map.put("a.loc.poi.id", str);
        }
        Object obj2 = mapT.get("regionname");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (f6.i.a(str2)) {
            return;
        }
        this.defaultData.put("a.loc.poi", str2 != null ? str2 : "");
    }

    public final void A(long j10) {
        this.lastResetIdentitiesTimestampSec = j10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void B(Map<String, ? extends Map<String, ? extends Object>> dataMap) {
        Intrinsics.j(dataMap, "dataMap");
        for (Map.Entry<String, ? extends Map<String, ? extends Object>> entry : dataMap.entrySet()) {
            String key = entry.getKey();
            Map<String, ? extends Object> value = entry.getValue();
            if (value != null) {
                switch (key.hashCode()) {
                    case -1763874718:
                        if (key.equals("com.adobe.module.places")) {
                            f(value);
                            break;
                        } else {
                            break;
                        }
                    case -762198124:
                        if (key.equals("com.adobe.module.lifecycle")) {
                            e(value);
                            break;
                        } else {
                            break;
                        }
                    case -566238380:
                        if (key.equals("com.adobe.module.identity")) {
                            d(value);
                            break;
                        } else {
                            break;
                        }
                    case 1431260033:
                        if (key.equals("com.adobe.assurance")) {
                            b(value);
                            break;
                        } else {
                            break;
                        }
                    case 1940533280:
                        if (key.equals("com.adobe.module.configuration")) {
                            c(value);
                            break;
                        } else {
                            break;
                        }
                }
            } else {
                t.e("Analytics", "AnalyticsState", "update - Unable to extract data for %s, it was null.", key);
            }
        }
    }

    public final Map<String, String> g() {
        HashMap map = new HashMap();
        if (!f6.i.a(this.marketingCloudId)) {
            String str = this.marketingCloudId;
            if (str == null) {
                str = "";
            }
            map.put("mid", str);
            if (!f6.i.a(this.blob)) {
                String str2 = this.blob;
                if (str2 == null) {
                    str2 = "";
                }
                map.put("aamb", str2);
            }
            if (!f6.i.a(this.locationHint)) {
                String str3 = this.locationHint;
                map.put("aamlh", str3 != null ? str3 : "");
            }
        }
        return map;
    }

    /* renamed from: h, reason: from getter */
    public final String getApplicationID() {
        return this.applicationID;
    }

    /* renamed from: i, reason: from getter */
    public final int getBatchLimit() {
        return this.batchLimit;
    }

    public final Map<String, String> j() {
        return this.defaultData;
    }

    /* renamed from: k, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: l, reason: from getter */
    public final long getLastResetIdentitiesTimestampSec() {
        return this.lastResetIdentitiesTimestampSec;
    }

    /* renamed from: m, reason: from getter */
    public final long getLifecycleMaxSessionLength() {
        return this.lifecycleMaxSessionLength;
    }

    /* renamed from: n, reason: from getter */
    public final long getLifecycleSessionStartTimestamp() {
        return this.lifecycleSessionStartTimestamp;
    }

    /* renamed from: o, reason: from getter */
    public final D getPrivacyStatus() {
        return this.privacyStatus;
    }

    /* renamed from: p, reason: from getter */
    public final int getReferrerTimeout() {
        return this.referrerTimeout;
    }

    /* renamed from: q, reason: from getter */
    public final String getRsids() {
        return this.rsids;
    }

    /* renamed from: r, reason: from getter */
    public final String getSerializedVisitorIDsList() {
        return this.serializedVisitorIDsList;
    }

    public final boolean s() {
        return (f6.i.a(this.rsids) || f6.i.a(this.host)) ? false : true;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsAnalyticsForwardingEnabled() {
        return this.isAnalyticsForwardingEnabled;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsAssuranceSessionActive() {
        return this.isAssuranceSessionActive;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsBackdateSessionInfoEnabled() {
        return this.isBackdateSessionInfoEnabled;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsOfflineTrackingEnabled() {
        return this.isOfflineTrackingEnabled;
    }

    public final boolean x() {
        return this.privacyStatus == D.OPT_IN;
    }

    public final boolean y() {
        return !f6.i.a(this.marketingCloudOrganizationID);
    }

    public final void z() {
        a();
        this.marketingCloudId = null;
        this.locationHint = null;
        this.blob = null;
        this.serializedVisitorIDsList = null;
        this.applicationID = null;
        this.advertisingIdentifier = null;
    }
}
