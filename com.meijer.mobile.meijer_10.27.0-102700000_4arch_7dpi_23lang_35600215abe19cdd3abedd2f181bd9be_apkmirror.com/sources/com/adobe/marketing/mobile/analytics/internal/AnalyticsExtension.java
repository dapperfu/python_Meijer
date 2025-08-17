package com.adobe.marketing.mobile.analytics.internal;

import Q5.EnumC5071c;
import Q5.K;
import Q5.t;
import Q5.v;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.F;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6456o;
import com.adobe.marketing.mobile.analytics.internal.AnalyticsExtension;
import com.adobe.marketing.mobile.analytics.internal.b;
import com.adobe.marketing.mobile.util.DataReaderException;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import f6.C13845a;
import f6.C13849e;
import io.constructor.data.local.PreferencesHelper;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 e2\u00020\u0001:\u0001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\rJ%\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\rJ?\u0010$\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010\rJ\u001d\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0002¢\u0006\u0004\b,\u0010-J-\u0010/\u001a\u00020\u000b2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100J%\u00103\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001601H\u0002¢\u0006\u0004\b3\u00104J-\u00105\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0002¢\u0006\u0004\b5\u00106J=\u00109\u001a\u00020\u000b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b9\u0010:J9\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160<2\u0006\u00107\u001a\u00020\u001f2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0002¢\u0006\u0004\b=\u0010>J9\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160<2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0006\u0010@\u001a\u00020\u001fH\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000bH\u0002¢\u0006\u0004\bC\u0010\u0011J\u000f\u0010D\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010\u0011J1\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0016H\u0014¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0016H\u0014¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u00020\u0016H\u0014¢\u0006\u0004\bJ\u0010HJ\u000f\u0010K\u001a\u00020\u000bH\u0014¢\u0006\u0004\bK\u0010\u0011J\u0017\u0010L\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\bN\u0010\rJ\u0017\u0010O\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\bO\u0010\rJ\u0017\u0010P\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\bP\u0010\rJ\u0017\u0010Q\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\bQ\u0010\rR\u0014\u0010S\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010c¨\u0006g"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/AnalyticsExtension;", "Lcom/adobe/marketing/mobile/l;", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/m;)V", "Lcom/adobe/marketing/mobile/analytics/internal/b;", "database", "(Lcom/adobe/marketing/mobile/m;Lcom/adobe/marketing/mobile/analytics/internal/b;)V", "Lcom/adobe/marketing/mobile/h;", "event", "", "y", "(Lcom/adobe/marketing/mobile/h;)V", "w", "A", "N", "()V", "t", "v", "u", "", "", "", "eventData", "", "F", "(Ljava/util/Map;)Z", "J", "K", "previousSessionLength", "", "previousSessionPauseTimestamp", "previousOSVersion", "previousAppIdVersion", "eventUniqueIdentifier", "m", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "timeout", "M", "(J)V", "B", "s", "()Ljava/util/Map;", "data", "q", "(Ljava/util/Map;Lcom/adobe/marketing/mobile/h;)V", "", "dependencies", "L", "(Lcom/adobe/marketing/mobile/h;Ljava/util/List;)V", "E", "(Lcom/adobe/marketing/mobile/h;Ljava/util/Map;)V", "timeStampInSeconds", "isBackdatedHit", "I", "(Ljava/util/Map;JZLjava/lang/String;)V", "trackEventData", "", "G", "(JLjava/util/Map;)Ljava/util/Map;", "trackData", "timestamp", "H", "(Ljava/util/Map;J)Ljava/util/Map;", "p", "n", "o", "(Ljava/util/Map;)Ljava/util/Map;", "e", "()Ljava/lang/String;", "b", "f", "g", "i", "(Lcom/adobe/marketing/mobile/h;)Z", "z", "C", "D", "x", "Lcom/adobe/marketing/mobile/analytics/internal/b;", "analyticsDatabase", "Lcom/adobe/marketing/mobile/analytics/internal/e;", "c", "Lcom/adobe/marketing/mobile/analytics/internal/e;", "analyticsProperties", "Lcom/adobe/marketing/mobile/analytics/internal/g;", "d", "Lcom/adobe/marketing/mobile/analytics/internal/g;", "analyticsState", "LQ5/v;", "LQ5/v;", "dataStore", "Lcom/adobe/marketing/mobile/o;", "Lcom/adobe/marketing/mobile/o;", "eventHandler", "Ls5/e;", "Ls5/e;", "analyticsTimer", "h", "a", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AnalyticsExtension extends AbstractC6453l {

    /* renamed from: i, reason: collision with root package name */
    private static final List<String> f62044i = CollectionsKt.p("com.adobe.module.configuration", "com.adobe.module.identity");

    /* renamed from: j, reason: collision with root package name */
    private static final List<String> f62045j = CollectionsKt.p("com.adobe.module.lifecycle", "com.adobe.assurance", "com.adobe.module.places");

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.adobe.marketing.mobile.analytics.internal.b analyticsDatabase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e analyticsProperties;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g analyticsState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v dataStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6456o eventHandler;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final s5.e analyticsTimer;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            t.f("Analytics", "AnalyticsExtension", "waitForAcquisitionData - Launch hit delay has expired without referrer data.", new Object[0]);
            AnalyticsExtension.this.analyticsDatabase.b(b.EnumC1227b.REFERRER);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            t.f("Analytics", "AnalyticsExtension", "waitForLifecycleData - Lifecycle timeout has expired without Lifecycle data", new Object[0]);
            AnalyticsExtension.this.analyticsDatabase.b(b.EnumC1227b.LIFECYCLE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalyticsExtension(AbstractC6454m extensionApi) {
        this(extensionApi, null);
        Intrinsics.j(extensionApi, "extensionApi");
    }

    private final void B(C6449h event) {
        t.a("Analytics", "AnalyticsExtension", "handleOptOut - Privacy status is opted-out. Queued Analytics hits, stored state data, and properties will be cleared.", new Object[0]);
        this.analyticsDatabase.i();
        this.analyticsProperties.e();
        a().b(s(), event);
    }

    private final void N() {
        t.a("Analytics", "AnalyticsExtension", "waitForLifecycleData - Lifecycle timer scheduled with timeout 1000", new Object[0]);
        this.analyticsDatabase.j(b.EnumC1227b.LIFECYCLE);
        this.analyticsTimer.h(1000L, new c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsExtension(AbstractC6454m extensionApi, com.adobe.marketing.mobile.analytics.internal.b bVar) {
        super(extensionApi);
        Intrinsics.j(extensionApi, "extensionApi");
        g gVar = new g();
        this.analyticsState = gVar;
        v vVarA = K.f().d().a("AnalyticsDataStorage");
        Intrinsics.i(vVarA, "getInstance().dataStoreS…Constants.DATASTORE_NAME)");
        this.dataStore = vVarA;
        this.eventHandler = new InterfaceC6456o() { // from class: s5.a
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                AnalyticsExtension.r(this.f160193a, c6449h);
            }
        };
        this.analyticsTimer = new s5.e();
        this.analyticsProperties = new e(vVarA);
        this.analyticsDatabase = bVar == null ? new com.adobe.marketing.mobile.analytics.internal.b(new d(gVar, extensionApi), gVar) : bVar;
    }

    private final boolean F(Map<String, ? extends Object> eventData) {
        return eventData.containsKey("state") || eventData.containsKey("action") || eventData.containsKey("contextdata");
    }

    private final Map<String, String> G(long timeStampInSeconds, Map<String, ? extends Object> trackEventData) {
        HashMap map = new HashMap();
        map.putAll(this.analyticsState.j());
        Map<String, ? extends Object> mapT = C13845a.t(String.class, trackEventData, "contextdata", null);
        if (mapT != null) {
            map.putAll(o(mapT));
        }
        String actionName = C13845a.o(trackEventData, "action", null);
        boolean zL = C13845a.l(trackEventData, "trackinternal", false);
        if (!f6.i.a(actionName)) {
            String str = zL ? "a.internalaction" : "a.action";
            Intrinsics.i(actionName, "actionName");
            map.put(str, actionName);
        }
        long lifecycleSessionStartTimestamp = this.analyticsState.getLifecycleSessionStartTimestamp();
        if (lifecycleSessionStartTimestamp > 0) {
            long seconds = timeStampInSeconds - TimeUnit.MILLISECONDS.toSeconds(lifecycleSessionStartTimestamp);
            if (1 <= seconds && seconds <= this.analyticsState.getLifecycleMaxSessionLength()) {
                map.put("a.TimeSinceLaunch", String.valueOf(seconds));
            }
        }
        if (this.analyticsState.getPrivacyStatus() == D.UNKNOWN) {
            map.put("a.privacy.mode", zzbz.UNKNOWN_CONTENT_TYPE);
        }
        String strO = C13845a.o(trackEventData, "requestEventIdentifier", null);
        if (strO != null) {
            map.put("a.DebugEventIdentifier", strO);
        }
        return map;
    }

    private final Map<String, String> H(Map<String, ? extends Object> trackData, long timestamp) {
        HashMap map = new HashMap();
        String strO = C13845a.o(trackData, "action", null);
        String stateName = C13845a.o(trackData, "state", null);
        if (!f6.i.a(strO)) {
            map.put("pe", "lnk_o");
            map.put("pev2", (C13845a.l(trackData, "trackinternal", false) ? "ADBINTERNAL:" : "AMACTION:") + strO);
        }
        String applicationID = this.analyticsState.getApplicationID();
        if (applicationID != null) {
            map.put("pageName", applicationID);
        }
        if (!f6.i.a(stateName)) {
            Intrinsics.i(stateName, "stateName");
            map.put("pageName", stateName);
        }
        String strB = this.analyticsProperties.b();
        if (strB != null) {
            map.put("aid", strB);
        }
        String strD = this.analyticsProperties.d();
        if (strD != null) {
            map.put("vid", strD);
        }
        map.put("ce", e.INSTANCE.a());
        String TIMESTAMP_TIMEZONE_OFFSET = j.f62115a;
        Intrinsics.i(TIMESTAMP_TIMEZONE_OFFSET, "TIMESTAMP_TIMEZONE_OFFSET");
        map.put("t", TIMESTAMP_TIMEZONE_OFFSET);
        if (this.analyticsState.getIsOfflineTrackingEnabled()) {
            map.put("ts", String.valueOf(timestamp));
        }
        if (this.analyticsState.y()) {
            map.putAll(this.analyticsState.g());
        }
        map.put("cp", "foreground");
        if (K.f().a() == null) {
            t.e("Analytics", "AnalyticsExtension", "processAnalyticsVars - Unable to access platform services to retrieve foreground/background state. Defaulting customer perspective to foreground.", new Object[0]);
            return map;
        }
        EnumC5071c enumC5071cE = K.f().a().e();
        Intrinsics.i(enumC5071cE, "getInstance().appContextService.appState");
        if (enumC5071cE == EnumC5071c.BACKGROUND) {
            map.put("cp", "background");
        }
        return map;
    }

    private final void I(Map<String, ? extends Object> eventData, long timeStampInSeconds, boolean isBackdatedHit, String eventUniqueIdentifier) {
        if (D.OPT_OUT == this.analyticsState.getPrivacyStatus()) {
            t.f("Analytics", "AnalyticsExtension", "track - Dropping the Analytics track request, privacy status is opted out.", new Object[0]);
            return;
        }
        if (!this.analyticsState.s()) {
            t.f("Analytics", "AnalyticsExtension", "track - Dropping the Analytics track request, Analytics is not configured.", new Object[0]);
            return;
        }
        this.analyticsProperties.g(timeStampInSeconds);
        this.analyticsDatabase.h(f.INSTANCE.a(this.analyticsState, G(timeStampInSeconds, eventData), H(eventData, timeStampInSeconds)), timeStampInSeconds, eventUniqueIdentifier, isBackdatedHit);
    }

    private final void L(C6449h event, List<String> dependencies) {
        List<String> list = dependencies;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
        for (Object obj : list) {
            H hE = a().e((String) obj, event, true, F.ANY);
            linkedHashMap.put(obj, hE != null ? hE.b() : null);
        }
        this.analyticsState.B(linkedHashMap);
    }

    private final void M(long timeout) {
        t.a("Analytics", "AnalyticsExtension", "waitForAcquisitionData - Referrer timer scheduled with timeout " + timeout, new Object[0]);
        this.analyticsDatabase.j(b.EnumC1227b.REFERRER);
        this.analyticsTimer.j(timeout, new b());
    }

    private final void l(String previousOSVersion, String previousAppIdVersion, String eventUniqueIdentifier) {
        HashMap map = new HashMap();
        map.put("a.CrashEvent", "CrashEvent");
        if (previousOSVersion != null && previousOSVersion.length() > 0) {
            map.put("a.OSVersion", previousOSVersion);
        }
        if (previousAppIdVersion != null && previousAppIdVersion.length() > 0) {
            map.put("a.AppID", previousAppIdVersion);
        }
        HashMap map2 = new HashMap();
        map2.put("action", "Crash");
        map2.put("contextdata", map);
        map2.put("trackinternal", Boolean.TRUE);
        I(map2, this.analyticsProperties.c() + 1, true, eventUniqueIdentifier);
    }

    private final void m(String previousSessionLength, Long previousSessionPauseTimestamp, String previousOSVersion, String previousAppIdVersion, String eventUniqueIdentifier) {
        HashMap map = new HashMap();
        if (previousSessionLength != null) {
            map.put("a.PrevSessionLength", previousSessionLength);
        }
        if (previousOSVersion != null && previousOSVersion.length() > 0) {
            map.put("a.OSVersion", previousOSVersion);
        }
        if (previousAppIdVersion != null && previousAppIdVersion.length() > 0) {
            map.put("a.AppID", previousAppIdVersion);
        }
        HashMap map2 = new HashMap();
        map2.put("action", "SessionInfo");
        map2.put("contextdata", map);
        map2.put("trackinternal", Boolean.TRUE);
        I(map2, RangesKt.g(this.analyticsProperties.c(), previousSessionPauseTimestamp != null ? previousSessionPauseTimestamp.longValue() : 0L) + 1, true, eventUniqueIdentifier);
    }

    private final Map<String, String> o(Map<String, ? extends Object> eventData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : eventData.entrySet()) {
            if (entry.getValue() instanceof String) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.f(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.h(value, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap2.put(key, (String) value);
        }
        return linkedHashMap2;
    }

    private final void p() {
        C13849e.a("ADBMobileDataCache.sqlite");
    }

    private final void q(Map<String, ? extends Object> data, C6449h event) {
        a().c(new C6449h.b("TrackingIdentifierValue", "com.adobe.eventType.analytics", "com.adobe.eventSource.responseIdentity").d(data).c(event).a());
        t.e("Analytics", "AnalyticsExtension", "Dispatching Analytics paired response identity event with eventdata: %s.", data);
        a().c(new C6449h.b("TrackingIdentifierValue", "com.adobe.eventType.analytics", "com.adobe.eventSource.responseIdentity").d(data).a());
        t.e("Analytics", "AnalyticsExtension", "Dispatching Analytics unpaired response identity event with eventdata: %s.", data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AnalyticsExtension this$0, C6449h it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        this$0.z(it);
    }

    private final Map<String, Object> s() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strB = this.analyticsProperties.b();
        if (strB != null) {
            linkedHashMap.put("aid", strB);
        }
        String strD = this.analyticsProperties.d();
        if (strD != null) {
            linkedHashMap.put("vid", strD);
        }
        return linkedHashMap;
    }

    private final void w(C6449h event) {
        L(event, CollectionsKt.P0(f62044i, f62045j));
        if (this.analyticsState.getPrivacyStatus() == D.OPT_OUT) {
            B(event);
        } else if (this.analyticsState.getPrivacyStatus() == D.OPT_IN) {
            this.analyticsDatabase.e(false);
        }
    }

    public final void C(C6449h event) {
        Intrinsics.j(event, "event");
        if (!Intrinsics.e(event.w(), "com.adobe.eventType.generic.identity") || !Intrinsics.e(event.t(), "com.adobe.eventSource.requestReset")) {
            t.a("Analytics", "AnalyticsExtension", "handleResetIdentitiesEvent - Ignoring reset event (event is of unexpected type or source).", new Object[0]);
            return;
        }
        t.a("Analytics", "AnalyticsExtension", "handleResetIdentitiesEvent - Resetting all identifiers.", new Object[0]);
        this.analyticsDatabase.i();
        this.analyticsProperties.e();
        this.analyticsState.z();
        this.analyticsState.A(event.v());
        a().b(s(), event);
    }

    public final void D(C6449h event) {
        Intrinsics.j(event, "event");
        Map<String, Object> mapO = event.o();
        if (mapO == null) {
            t.e("Analytics", "AnalyticsExtension", "handleRuleEngineResponse - Event with id %s contained no data, ignoring.", event.x());
            return;
        }
        Map mapT = C13845a.t(Object.class, mapO, "triggeredconsequence", null);
        if (mapT == null || mapT.isEmpty()) {
            t.e("Analytics", "AnalyticsExtension", "handleRuleEngineResponse - Missing consequence data, ignoring event %s.", event.x());
            return;
        }
        String strO = C13845a.o(mapT, "type", null);
        if (f6.i.a(strO)) {
            t.e("Analytics", "AnalyticsExtension", "handleRuleEngineResponse - No consequence type received, ignoring event %s.", event.x());
            return;
        }
        if (!Intrinsics.e("an", strO)) {
            t.e("Analytics", "AnalyticsExtension", "handleRuleEngineResponse - Consequence type is not Analytics, ignoring event %s.", event.x());
            return;
        }
        if (f6.i.a(C13845a.o(mapT, PreferencesHelper.PREF_ID, null))) {
            t.e("Analytics", "AnalyticsExtension", "handleRuleEngineResponse - Consequence id is missing, ignoring event  %s.", event.x());
            return;
        }
        t.e("Analytics", "AnalyticsExtension", "handleRuleEngineResponse - Submitting Rules Engine Track response content event (%s) for processing.", event.x());
        L(event, CollectionsKt.P0(f62044i, f62045j));
        Map<String, ? extends Object> consequenceDetail = C13845a.t(Object.class, mapT, "detail", MapsKt.k());
        Intrinsics.i(consequenceDetail, "consequenceDetail");
        E(event, consequenceDetail);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String b() {
        return "Analytics";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String e() {
        return "com.adobe.module.analytics";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String f() {
        return "3.0.2";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    public boolean i(C6449h event) {
        Intrinsics.j(event, "event");
        AbstractC6454m abstractC6454mA = a();
        F f10 = F.ANY;
        H hE = abstractC6454mA.e("com.adobe.module.configuration", event, false, f10);
        H hE2 = a().e("com.adobe.module.identity", event, false, f10);
        I iA = hE != null ? hE.a() : null;
        I i10 = I.SET;
        if (iA == i10) {
            if ((hE2 != null ? hE2.a() : null) == i10) {
                return true;
            }
        }
        return false;
    }

    public final void x(C6449h event) {
        Intrinsics.j(event, "event");
        if (Intrinsics.e(event.w(), "com.adobe.eventType.generic.lifecycle") && Intrinsics.e(event.t(), "com.adobe.eventSource.requestContent")) {
            Map<String, Object> mapO = event.o();
            Object obj = mapO != null ? mapO.get("action") : null;
            if (!Intrinsics.e(obj, "start")) {
                if (Intrinsics.e(obj, "pause")) {
                    this.analyticsTimer.c();
                    this.analyticsTimer.d();
                    return;
                }
                return;
            }
            if (this.analyticsTimer.getIsTimerRunning()) {
                t.a("Analytics", "AnalyticsExtension", "handleGenericLifecycleEvents - Exiting, Lifecycle timer is already running and this is a duplicate request", new Object[0]);
                return;
            }
            this.analyticsDatabase.b(b.EnumC1227b.REFERRER);
            this.analyticsDatabase.b(b.EnumC1227b.LIFECYCLE);
            N();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void z(C6449h event) {
        Intrinsics.j(event, "event");
        String strW = event.w();
        if (strW != null) {
            switch (strW.hashCode()) {
                case -1916134322:
                    if (strW.equals("com.adobe.eventType.generic.track")) {
                        y(event);
                        break;
                    }
                    break;
                case -1784231328:
                    if (strW.equals("com.adobe.eventType.analytics")) {
                        String strT = event.t();
                        if (!Intrinsics.e(strT, "com.adobe.eventSource.requestIdentity")) {
                            if (Intrinsics.e(strT, "com.adobe.eventSource.requestContent")) {
                                u(event);
                                break;
                            }
                        } else {
                            v(event);
                            break;
                        }
                    }
                    break;
                case -553401637:
                    if (strW.equals("com.adobe.eventType.generic.identity")) {
                        C(event);
                        break;
                    }
                    break;
                case -485068825:
                    if (strW.equals("com.adobe.eventType.acquisition")) {
                        t(event);
                        break;
                    }
                    break;
                case -393537980:
                    if (strW.equals("com.adobe.eventType.lifecycle")) {
                        A(event);
                        break;
                    }
                    break;
                case -364259091:
                    if (strW.equals("com.adobe.eventType.generic.lifecycle")) {
                        x(event);
                        break;
                    }
                    break;
                case 972859088:
                    if (strW.equals("com.adobe.eventType.configuration")) {
                        w(event);
                        break;
                    }
                    break;
                case 1388788339:
                    if (strW.equals("com.adobe.eventType.rulesEngine")) {
                        D(event);
                        break;
                    }
                    break;
            }
        }
    }

    private final void A(C6449h event) {
        if (Intrinsics.e(event.w(), "com.adobe.eventType.lifecycle") && Intrinsics.e(event.t(), "com.adobe.eventSource.responseContent")) {
            L(event, CollectionsKt.P0(f62044i, f62045j));
            K(event);
        }
    }

    private final void E(C6449h event, Map<String, ? extends Object> data) {
        if (data.isEmpty()) {
            t.a("Analytics", "AnalyticsExtension", "handleTrackRequest - event data is null or empty.", new Object[0]);
        } else if (F(data)) {
            long jV = event.v();
            String strX = event.x();
            Intrinsics.i(strX, "event.uniqueIdentifier");
            I(data, jV, false, strX);
        }
    }

    private final void J(C6449h event) {
        Map<String, ? extends Object> mapT = C13845a.t(String.class, event.o(), "contextdata", MapsKt.k());
        Intrinsics.i(mapT, "optTypedMap(\n           …     emptyMap()\n        )");
        if (this.analyticsTimer.f()) {
            t.a("Analytics", "AnalyticsExtension", "trackAcquisition - Cancelling referrer timer", new Object[0]);
            this.analyticsTimer.d();
        }
        if (this.analyticsDatabase.d()) {
            t.a("Analytics", "AnalyticsExtension", "trackAcquisition - Append referrer data to pending hit", new Object[0]);
            this.analyticsDatabase.f(b.EnumC1227b.REFERRER, mapT);
            return;
        }
        this.analyticsDatabase.b(b.EnumC1227b.REFERRER);
        t.a("Analytics", "AnalyticsExtension", "trackAcquisition - Sending referrer data as separate tracking hit", new Object[0]);
        HashMap map = new HashMap();
        map.put("action", "AdobeLink");
        map.put("contextdata", mapT);
        map.put("trackinternal", Boolean.TRUE);
        long jV = event.v();
        String strX = event.x();
        Intrinsics.i(strX, "event.uniqueIdentifier");
        I(map, jV, false, strX);
    }

    private final void K(C6449h event) {
        Long lValueOf = null;
        Map mapT = C13845a.t(String.class, event.o(), "lifecyclecontextdata", null);
        if (mapT == null) {
            t.a("Analytics", "AnalyticsExtension", "trackLifecycle - Failed to track lifecycle event (context data was null or empty)", new Object[0]);
            return;
        }
        HashMap map = new HashMap(mapT);
        HashMap map2 = new HashMap();
        String str = (String) map.remove("previousosversion");
        String str2 = (String) map.remove("previousappid");
        for (Map.Entry<String, String> entry : a.f62054a.a().entrySet()) {
            String str3 = (String) map.get(entry.getKey());
            if (str3 != null && str3.length() > 0) {
                map2.put(entry.getValue(), str3);
                map.remove(entry.getKey());
            }
        }
        map2.putAll(map);
        if (map2.containsKey("a.InstallEvent")) {
            M(TimeUnit.SECONDS.toMillis(this.analyticsState.getReferrerTimeout()));
        } else if (map2.containsKey("a.LaunchEvent")) {
            M(500L);
        }
        if (this.analyticsState.getIsBackdateSessionInfoEnabled() && this.analyticsState.getIsOfflineTrackingEnabled()) {
            if (map2.containsKey("a.CrashEvent")) {
                map2.remove("a.CrashEvent");
                String strX = event.x();
                Intrinsics.i(strX, "event.uniqueIdentifier");
                l(str, str2, strX);
            }
            if (map2.containsKey("a.PrevSessionLength")) {
                String str4 = (String) map2.remove("a.PrevSessionLength");
                String str5 = (String) map.remove("previoussessionpausetimestampmillis");
                if (str5 != null) {
                    lValueOf = Long.valueOf(Long.parseLong(str5));
                }
                String strX2 = event.x();
                Intrinsics.i(strX2, "event.uniqueIdentifier");
                m(str4, lValueOf, str, str2, strX2);
            }
        }
        if (this.analyticsTimer.e()) {
            t.a("Analytics", "AnalyticsExtension", "trackLifecycle - Cancelling lifecycle timer", new Object[0]);
            this.analyticsTimer.c();
        }
        if (this.analyticsDatabase.d()) {
            t.a("Analytics", "AnalyticsExtension", "trackLifecycle - Append lifecycle data to pending hit", new Object[0]);
            this.analyticsDatabase.f(b.EnumC1227b.LIFECYCLE, map2);
            return;
        }
        this.analyticsDatabase.b(b.EnumC1227b.LIFECYCLE);
        t.a("Analytics", "AnalyticsExtension", "trackLifecycle - Sending lifecycle data as separate tracking hit", new Object[0]);
        HashMap map3 = new HashMap();
        map3.put("action", "Lifecycle");
        map3.put("contextdata", map2);
        map3.put("trackinternal", Boolean.TRUE);
        long jV = event.v();
        String strX3 = event.x();
        Intrinsics.i(strX3, "event.uniqueIdentifier");
        I(map3, jV, false, strX3);
    }

    private final void n() {
        a().b(s(), null);
        t.e("Analytics", "AnalyticsExtension", "Analytics boot-up complete, published initial shared state.", new Object[0]);
    }

    private final void t(C6449h event) {
        if (Intrinsics.e(event.w(), "com.adobe.eventType.acquisition") && Intrinsics.e(event.t(), "com.adobe.eventSource.responseContent")) {
            L(event, CollectionsKt.P0(f62044i, f62045j));
            J(event);
        }
    }

    private final void u(C6449h event) {
        Map<String, Object> eventData = event.o();
        if (eventData != null && (!eventData.isEmpty())) {
            if (eventData.containsKey("clearhitsqueue")) {
                this.analyticsDatabase.i();
                return;
            }
            Intrinsics.i(eventData, "eventData");
            if (F(eventData)) {
                L(event, CollectionsKt.P0(f62044i, f62045j));
                long jV = event.v();
                String strX = event.x();
                Intrinsics.i(strX, "event.uniqueIdentifier");
                I(eventData, jV, false, strX);
                return;
            }
            if (eventData.containsKey("getqueuesize")) {
                Map<String, Object> mapG = MapsKt.g(TuplesKt.a("queuesize", Integer.valueOf(this.analyticsDatabase.c())));
                t.a("Analytics", "AnalyticsExtension", "Dispatching Analytics hit queue size response event with eventdata " + mapG, new Object[0]);
                a().c(new C6449h.b("QueueSizeValue", "com.adobe.eventType.analytics", "com.adobe.eventSource.responseContent").c(event).d(mapG).a());
                return;
            }
            if (eventData.containsKey("forcekick")) {
                this.analyticsDatabase.e(true);
                return;
            }
            return;
        }
        t.f("Analytics", "AnalyticsExtension", "handleAnalyticsRequestContentEvent - Returning early, event data is null or empty.", new Object[0]);
    }

    private final void v(C6449h event) {
        Map<String, Object> mapO = event.o();
        if (mapO != null && mapO.containsKey("vid")) {
            if (this.analyticsState.getPrivacyStatus() == D.OPT_OUT) {
                t.a("Analytics", "AnalyticsExtension", "handleAnalyticsRequestIdentityEvent - Privacy is opted out, ignoring the update visitor identifier request.", new Object[0]);
                return;
            }
            try {
                this.analyticsProperties.h(C13845a.e(event.o(), "vid"));
                Map<String, Object> mapS = s();
                a().b(mapS, event);
                q(mapS, event);
                return;
            } catch (DataReaderException unused) {
                t.a("Analytics", "AnalyticsExtension", "handleAnalyticsRequestIdentityEvent - Failed to parse the visitor identifier to string, ignoring the update visitor identifier request.", new Object[0]);
                return;
            }
        }
        q(s(), event);
    }

    private final void y(C6449h event) {
        if (Intrinsics.e(event.w(), "com.adobe.eventType.generic.track") && Intrinsics.e(event.t(), "com.adobe.eventSource.requestContent")) {
            L(event, CollectionsKt.P0(f62044i, f62045j));
            Map<String, Object> mapO = event.o();
            if (mapO == null) {
                t.a("Analytics", "AnalyticsExtension", "handleGenericTrackEvent - event data is null or empty.", new Object[0]);
                return;
            } else {
                E(event, mapO);
                return;
            }
        }
        t.a("Analytics", "AnalyticsExtension", "handleAnalyticsTrackEvent - Ignoring track event (event is of unexpected type or source).", new Object[0]);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected void g() {
        a().h("com.adobe.eventType.rulesEngine", "com.adobe.eventSource.responseContent", this.eventHandler);
        a().h("com.adobe.eventType.analytics", "com.adobe.eventSource.requestContent", this.eventHandler);
        a().h("com.adobe.eventType.analytics", "com.adobe.eventSource.requestIdentity", this.eventHandler);
        a().h("com.adobe.eventType.configuration", "com.adobe.eventSource.responseContent", this.eventHandler);
        a().h("com.adobe.eventType.generic.lifecycle", "com.adobe.eventSource.requestContent", this.eventHandler);
        a().h("com.adobe.eventType.lifecycle", "com.adobe.eventSource.responseContent", this.eventHandler);
        a().h("com.adobe.eventType.acquisition", "com.adobe.eventSource.responseContent", this.eventHandler);
        a().h("com.adobe.eventType.generic.track", "com.adobe.eventSource.requestContent", this.eventHandler);
        a().h("com.adobe.eventType.generic.identity", "com.adobe.eventSource.requestReset", this.eventHandler);
        p();
        n();
    }
}
