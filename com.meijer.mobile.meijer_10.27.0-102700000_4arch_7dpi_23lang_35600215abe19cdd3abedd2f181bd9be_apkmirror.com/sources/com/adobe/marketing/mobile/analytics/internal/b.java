package com.adobe.marketing.mobile.analytics.internal;

import Q5.C5072d;
import Q5.F;
import Q5.InterfaceC5073e;
import Q5.InterfaceC5080l;
import Q5.K;
import Q5.n;
import Q5.t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0010\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0014J+\u0010'\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00102R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00105R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00105R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108¨\u00069"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/b;", "", "LQ5/l;", "processor", "Lcom/adobe/marketing/mobile/analytics/internal/g;", "analyticsState", "<init>", "(LQ5/l;Lcom/adobe/marketing/mobile/analytics/internal/g;)V", "", "g", "()V", "", "", "additionalData", "LQ5/d;", "dataEntity", "a", "(Ljava/util/Map;LQ5/d;)LQ5/d;", "", "k", "()Z", "payload", "", "timestampSec", "eventIdentifier", "isBackdateHit", "h", "(Ljava/lang/String;JLjava/lang/String;Z)V", "ignoreBatchLimit", "e", "(Z)V", "i", "Lcom/adobe/marketing/mobile/analytics/internal/b$b;", "dataType", "b", "(Lcom/adobe/marketing/mobile/analytics/internal/b$b;)V", "j", "d", "data", "f", "(Lcom/adobe/marketing/mobile/analytics/internal/b$b;Ljava/util/Map;)V", "", "c", "()I", "LQ5/l;", "Lcom/adobe/marketing/mobile/analytics/internal/g;", "LQ5/n;", "LQ5/n;", "hitQueue", "LQ5/e;", "LQ5/e;", "mainQueue", "reorderQueue", "Z", "waitingForLifecycle", "waitingForReferrer", "Ljava/util/Map;", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5080l processor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g analyticsState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n hitQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5073e mainQueue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5073e reorderQueue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean waitingForLifecycle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean waitingForReferrer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Map<String, ? extends Object> additionalData;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.adobe.marketing.mobile.analytics.internal.b$b, reason: collision with other inner class name */
    public enum EnumC1227b {
        REFERRER,
        LIFECYCLE
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1227b.values().length];
            try {
                iArr[EnumC1227b.REFERRER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1227b.LIFECYCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(InterfaceC5080l processor, g analyticsState) {
        Intrinsics.j(processor, "processor");
        Intrinsics.j(analyticsState, "analyticsState");
        this.processor = processor;
        this.analyticsState = analyticsState;
        this.additionalData = MapsKt.k();
        InterfaceC5073e mainDataQueue = K.f().c().a("com.adobe.module.analytics");
        InterfaceC5073e reorderDataQueue = K.f().c().a("com.adobe.module.analyticsreorderqueue");
        Intrinsics.i(mainDataQueue, "mainDataQueue");
        this.mainQueue = mainDataQueue;
        Intrinsics.i(reorderDataQueue, "reorderDataQueue");
        this.reorderQueue = reorderDataQueue;
        this.hitQueue = new F(mainDataQueue, processor);
        g();
    }

    private final C5072d a(Map<String, ? extends Object> additionalData, C5072d dataEntity) {
        com.adobe.marketing.mobile.analytics.internal.c cVarA = com.adobe.marketing.mobile.analytics.internal.c.INSTANCE.a(dataEntity);
        Intrinsics.h(additionalData, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        String payload = i.b(additionalData, cVarA.getPayload());
        Intrinsics.i(payload, "payload");
        return new C5072d(new com.adobe.marketing.mobile.analytics.internal.c(payload, cVarA.getTimestampSec(), cVarA.getEventIdentifier()).d().a());
    }

    private final void g() {
        int iCount = this.reorderQueue.count();
        if (iCount <= 0) {
            t.e("Analytics", "AnalyticsDatabase", "moveHitsFromReorderQueue - No hits in reorder queue", new Object[0]);
            return;
        }
        t.e("Analytics", "AnalyticsDatabase", "moveHitsFromReorderQueue - Moving queued hits " + iCount + " from reorder queue -> main queue", new Object[0]);
        List<C5072d> listA = this.reorderQueue.a(iCount);
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                this.mainQueue.b((C5072d) it.next());
            }
        }
        this.reorderQueue.clear();
    }

    private final boolean k() {
        return this.waitingForReferrer || this.waitingForLifecycle;
    }

    public final void b(EnumC1227b dataType) {
        Intrinsics.j(dataType, "dataType");
        t.a("Analytics", "AnalyticsDatabase", "cancelWaitForAdditionalData - " + dataType, new Object[0]);
        f(dataType, null);
    }

    public final int c() {
        return this.mainQueue.count() + this.reorderQueue.count();
    }

    public final boolean d() {
        return this.reorderQueue.count() > 0;
    }

    public final void e(boolean ignoreBatchLimit) {
        t.e("Analytics", "AnalyticsDatabase", "Kick - ignoreBatchLimit " + ignoreBatchLimit + '.', new Object[0]);
        if (!this.analyticsState.s()) {
            t.e("Analytics", "AnalyticsDatabase", "Kick - Failed to kick database hits (Analytics is not configured).", new Object[0]);
            return;
        }
        if (!this.analyticsState.x()) {
            t.e("Analytics", "AnalyticsDatabase", "Kick - Failed to kick database hits (Privacy status is not opted-in).", new Object[0]);
            return;
        }
        int iCount = this.mainQueue.count();
        if (!this.analyticsState.getIsOfflineTrackingEnabled() || iCount > this.analyticsState.getBatchLimit() || ignoreBatchLimit) {
            t.e("Analytics", "AnalyticsDatabase", "Kick - Begin processing database hits", new Object[0]);
            this.hitQueue.a();
        }
    }

    public final void f(EnumC1227b dataType, Map<String, ? extends Object> data) {
        C5072d c5072dPeek;
        Intrinsics.j(dataType, "dataType");
        if (k()) {
            t.a("Analytics", "AnalyticsDatabase", "KickWithAdditionalData - " + dataType + " - " + data, new Object[0]);
            int i10 = c.$EnumSwitchMapping$0[dataType.ordinal()];
            if (i10 == 1) {
                this.waitingForReferrer = false;
            } else if (i10 == 2) {
                this.waitingForLifecycle = false;
            }
            if (data != null) {
                this.additionalData = MapsKt.u(this.additionalData, data);
            }
            if (!k()) {
                t.a("Analytics", "AnalyticsDatabase", "KickWithAdditionalData - done waiting for additional data", new Object[0]);
                if (d() && (c5072dPeek = this.reorderQueue.peek()) != null) {
                    this.mainQueue.b(a(this.additionalData, c5072dPeek));
                    this.reorderQueue.remove();
                }
                g();
                this.additionalData = MapsKt.k();
            }
            e(false);
        }
    }

    public final void h(String payload, long timestampSec, String eventIdentifier, boolean isBackdateHit) {
        Intrinsics.j(payload, "payload");
        Intrinsics.j(eventIdentifier, "eventIdentifier");
        t.a("Analytics", "AnalyticsDatabase", "queueHit - " + payload + " isBackdateHit:" + isBackdateHit, new Object[0]);
        String strA = new com.adobe.marketing.mobile.analytics.internal.c(payload, timestampSec, eventIdentifier).d().a();
        if (strA == null) {
            t.a("Analytics", "AnalyticsDatabase", "queueHit - Dropping Analytics hit, failed to encode AnalyticsHit", new Object[0]);
            return;
        }
        C5072d c5072d = new C5072d(strA);
        if (isBackdateHit) {
            if (k()) {
                t.a("Analytics", "AnalyticsDatabase", "queueHit - Queueing backdated hit", new Object[0]);
                this.mainQueue.b(c5072d);
            } else {
                t.a("Analytics", "AnalyticsDatabase", "queueHit - Dropping backdate hit, as processing has begun for this current session", new Object[0]);
            }
        } else if (k()) {
            t.a("Analytics", "AnalyticsDatabase", "queueHit - Queueing hit in reorder queue as a previous hit is waiting for additional data", new Object[0]);
            this.reorderQueue.b(c5072d);
        } else {
            t.a("Analytics", "AnalyticsDatabase", "queueHit - Queueing hit in main queue", new Object[0]);
            this.mainQueue.b(c5072d);
        }
        e(false);
    }

    public final void i() {
        this.hitQueue.f();
        this.mainQueue.clear();
        this.reorderQueue.clear();
        this.additionalData = MapsKt.k();
        this.waitingForLifecycle = false;
        this.waitingForReferrer = false;
    }

    public final void j(EnumC1227b dataType) {
        Intrinsics.j(dataType, "dataType");
        t.a("Analytics", "AnalyticsDatabase", "waitForAdditionalData - " + dataType, new Object[0]);
        int i10 = c.$EnumSwitchMapping$0[dataType.ordinal()];
        if (i10 == 1) {
            this.waitingForReferrer = true;
        } else {
            if (i10 != 2) {
                return;
            }
            this.waitingForLifecycle = true;
        }
    }
}
