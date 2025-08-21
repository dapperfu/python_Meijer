package com.adobe.marketing.mobile.analytics.internal;

import R5.A;
import R5.C5117d;
import R5.InterfaceC5125l;
import R5.K;
import R5.m;
import R5.o;
import R5.r;
import R5.t;
import R5.w;
import R5.x;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import g6.C14334g;
import g6.l;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&¨\u0006)"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/d;", "LR5/l;", "Lcom/adobe/marketing/mobile/analytics/internal/g;", "analyticsState", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/analytics/internal/g;Lcom/adobe/marketing/mobile/m;)V", "", "payload", "", "oldTs", "newTs", "g", "(Ljava/lang/String;JJ)Ljava/lang/String;", "state", "d", "(Lcom/adobe/marketing/mobile/analytics/internal/g;)Ljava/lang/String;", "e", "LR5/d;", "dataEntity", "", "b", "(LR5/d;)I", "entity", "LR5/m;", "processingResult", "", "a", "(LR5/d;LR5/m;)V", "Lcom/adobe/marketing/mobile/analytics/internal/g;", "Lcom/adobe/marketing/mobile/m;", "LR5/A;", "c", "LR5/A;", "networkService", "J", "lastHitTimestamp", "Ljava/lang/String;", "version", "f", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements InterfaceC5125l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g analyticsState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6579m extensionApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final A networkService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long lastHitTimestamp;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String version;

    @Override // R5.InterfaceC5125l
    public int b(C5117d dataEntity) {
        Intrinsics.j(dataEntity, "dataEntity");
        return 30;
    }

    public d(g analyticsState, AbstractC6579m extensionApi) {
        Intrinsics.j(analyticsState, "analyticsState");
        Intrinsics.j(extensionApi, "extensionApi");
        this.analyticsState = analyticsState;
        this.extensionApi = extensionApi;
        A aH = K.f().h();
        Intrinsics.i(aH, "getInstance().networkService");
        this.networkService = aH;
        this.version = t5.f.b(t5.f.f162267a, null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(m processingResult, String url, Ref.ObjectRef payload, String eventIdentifier, Ref.LongRef timestamp, d this$0, o oVar) throws IOException {
        Intrinsics.j(processingResult, "$processingResult");
        Intrinsics.j(url, "$url");
        Intrinsics.j(payload, "$payload");
        Intrinsics.j(eventIdentifier, "$eventIdentifier");
        Intrinsics.j(timestamp, "$timestamp");
        Intrinsics.j(this$0, "this$0");
        boolean z10 = false;
        if (oVar == null) {
            t.a("Analytics", "AnalyticsHitProcessor", "processHit - Retrying Analytics hit, there is currently no network connectivity", new Object[0]);
            processingResult.a(false);
            return;
        }
        int iD = oVar.d();
        if (iD == 200) {
            t.a("Analytics", "AnalyticsHitProcessor", "processHit - Analytics hit request with url (" + url + ") and payload (" + ((String) payload.f143742a) + ") sent successfully", new Object[0]);
            Map<String, Object> mapO = MapsKt.o(TuplesKt.a("analyticsserverresponse", C14334g.a(oVar.c())), TuplesKt.a("headers", MapsKt.o(TuplesKt.a("ETag", oVar.b("ETag")), TuplesKt.a("Server", oVar.b("Server")), TuplesKt.a("Content-Type", oVar.b("Content-Type")))), TuplesKt.a("hitHost", url), TuplesKt.a("hitUrl", payload.f143742a), TuplesKt.a("requestEventIdentifier", eventIdentifier));
            if (timestamp.f143741a > this$0.analyticsState.getLastResetIdentitiesTimestampSec()) {
                t.a("Analytics", "AnalyticsHitProcessor", "processHit - Dispatching Analytics hit response for request event id %s.", eventIdentifier);
                this$0.extensionApi.c(new C6574h.b("AnalyticsResponse", "com.adobe.eventType.analytics", "com.adobe.eventSource.responseContent").d(mapO).a());
            } else {
                t.a("Analytics", "AnalyticsHitProcessor", "processHit - Ignoring response for request event id %s as it was received while processing a resetIdentities event.", eventIdentifier);
            }
            this$0.lastHitTimestamp = timestamp.f143741a;
        } else {
            if (ArraysKt.Y(new Integer[]{Integer.valueOf(HttpResponseStatus.ERROR_REQUEST_TIMEOUT), Integer.valueOf(HttpResponseStatus.ERROR_GATEWAY_TIMEOUT), Integer.valueOf(HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE), -1}, Integer.valueOf(iD))) {
                t.a("Analytics", "AnalyticsHitProcessor", "processHit - Retrying Analytics hit, request with url " + url + " failed with recoverable status code " + oVar.d(), new Object[0]);
                oVar.close();
                processingResult.a(z10);
            }
            t.f("Analytics", "AnalyticsHitProcessor", "processHit - Dropping Analytics hit, request with url " + url + " failed with error and unrecoverable status code " + oVar.d() + ": " + C14334g.a(oVar.a()), new Object[0]);
        }
        z10 = true;
        oVar.close();
        processingResult.a(z10);
    }

    private final String g(String payload, long oldTs, long newTs) {
        return StringsKt.S(payload, "&ts=" + oldTs, "&ts=" + newTs, false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
    @Override // R5.InterfaceC5125l
    public void a(C5117d entity, final m processingResult) {
        Intrinsics.j(entity, "entity");
        Intrinsics.j(processingResult, "processingResult");
        c cVarA = c.INSTANCE.a(entity);
        final String eventIdentifier = cVarA.getEventIdentifier();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f143742a = cVarA.getPayload();
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.f143741a = cVarA.getTimestampSec();
        if (((CharSequence) objectRef.f143742a).length() == 0) {
            t.a("Analytics", "AnalyticsHitProcessor", "processHit - Dropping Analytics hit, payload is empty.", new Object[0]);
            processingResult.a(true);
            return;
        }
        if (longRef.f143741a < this.analyticsState.getLastResetIdentitiesTimestampSec()) {
            t.a("Analytics", "AnalyticsHitProcessor", "processHit - Dropping Analytics hit, resetIdentities API was called after this request.", new Object[0]);
            processingResult.a(true);
            return;
        }
        if (!this.analyticsState.getIsOfflineTrackingEnabled() && longRef.f143741a < g6.j.h() - 60) {
            t.a("Analytics", "AnalyticsHitProcessor", "processHit - Dropping Analytics hit, timestamp exceeds offline disabled wait threshold", new Object[0]);
            processingResult.a(true);
            return;
        }
        if (this.analyticsState.getIsOfflineTrackingEnabled()) {
            long j10 = longRef.f143741a;
            long j11 = this.lastHitTimestamp;
            if (j10 - j11 < 0) {
                long j12 = j11 + 1;
                t.a("Analytics", "AnalyticsHitProcessor", "processHit - Adjusting out of order hit timestamp " + cVarA + ".timestamp -> " + j12, new Object[0]);
                objectRef.f143742a = g((String) objectRef.f143742a, longRef.f143741a, j12);
                longRef.f143741a = j12;
            }
        }
        final String strD = d(this.analyticsState);
        if (strD == null) {
            t.a("Analytics", "AnalyticsHitProcessor", "processHit - Retrying Analytics hit, error generating base url.", new Object[0]);
            processingResult.a(false);
            return;
        }
        if (this.analyticsState.getIsAssuranceSessionActive()) {
            objectRef.f143742a = ((String) objectRef.f143742a) + "&p.&debug=true&.p";
        }
        Map mapG = MapsKt.g(TuplesKt.a("Content-Type", "application/x-www-form-urlencoded"));
        r rVar = r.POST;
        byte[] bytes = ((String) objectRef.f143742a).getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
        this.networkService.a(new x(strD, rVar, bytes, mapG, 5, 5), new w() { // from class: t5.b
            @Override // R5.w
            public final void a(o oVar) throws IOException {
                com.adobe.marketing.mobile.analytics.internal.d.f(processingResult, strD, objectRef, eventIdentifier, longRef, this, oVar);
            }
        });
    }

    private final String d(g state) {
        if (!state.s()) {
            t.a("Analytics", "AnalyticsHitProcessor", "getAnalyticsBaseUrl - The Analytics configuration for RSID or host is not found. RSID and host must not be null or empty.", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://");
        sb2.append(state.getHost());
        sb2.append("/b/ss/");
        String rsids = state.getRsids();
        if (rsids == null) {
            rsids = "";
        }
        sb2.append(rsids);
        sb2.append('/');
        sb2.append(e(state));
        sb2.append('/');
        sb2.append(this.version);
        sb2.append("/s");
        sb2.append(RangesKt.u(new IntRange(0, 100000000), Random.INSTANCE));
        String string = sb2.toString();
        if (!l.a(string)) {
            t.a("Analytics", "AnalyticsHitProcessor", "getAnalyticsBaseUrl - Error building Analytics base URL, returning null", new Object[0]);
            return null;
        }
        return string;
    }

    private final String e(g state) {
        if (state.getIsAnalyticsForwardingEnabled()) {
            return "10";
        }
        return "0";
    }
}
