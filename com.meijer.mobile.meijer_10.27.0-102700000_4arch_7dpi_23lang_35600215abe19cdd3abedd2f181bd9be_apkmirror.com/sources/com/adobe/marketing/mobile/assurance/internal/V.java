package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.InterfaceC6418a;
import com.adobe.marketing.mobile.assurance.internal.W;
import com.google.maps.android.BuildConfig;
import f6.C13851g;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u001e B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010$R*\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0019\u001a\u0004\b*\u0010+R6\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010.2\f\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010.8\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010/\u0012\u0004\b2\u0010\u0019\u001a\u0004\b0\u00101R6\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u0001042\f\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u0001048\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b\u0016\u00105\u0012\u0004\b8\u0010\u0019\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/V;", "", "Lcom/adobe/marketing/mobile/assurance/internal/E;", "assuranceSharedStateManager", "Ljava/util/concurrent/ScheduledExecutorService;", "executorService", "Lcom/adobe/marketing/mobile/assurance/internal/N;", "quickConnectCallback", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/E;Ljava/util/concurrent/ScheduledExecutorService;Lcom/adobe/marketing/mobile/assurance/internal/N;)V", "", "orgId", "clientId", "Lcom/adobe/marketing/mobile/assurance/internal/W;", "LQ5/o;", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "response", "", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/assurance/internal/W;)V", "jsonString", "Lcom/adobe/marketing/mobile/assurance/internal/V$b;", "g", "(Ljava/lang/String;)Lcom/adobe/marketing/mobile/assurance/internal/V$b;", "f", "()V", "i", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "a", "Lcom/adobe/marketing/mobile/assurance/internal/E;", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "Lcom/adobe/marketing/mobile/assurance/internal/N;", "", "I", "retryCount", "", "<set-?>", "e", "Z", "isActive$assurance_phoneRelease", "()Z", "isActive$assurance_phoneRelease$annotations", "isActive", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future;", "getDeviceCreationTaskHandle$assurance_phoneRelease", "()Ljava/util/concurrent/Future;", "getDeviceCreationTaskHandle$assurance_phoneRelease$annotations", "deviceCreationTaskHandle", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ScheduledFuture;", "getDeviceStatusTaskHandle$assurance_phoneRelease", "()Ljava/util/concurrent/ScheduledFuture;", "getDeviceStatusTaskHandle$assurance_phoneRelease$annotations", "deviceStatusTaskHandle", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final E assuranceSharedStateManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService executorService;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final N quickConnectCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile int retryCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isActive;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Future<?> deviceCreationTaskHandle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ScheduledFuture<?> deviceStatusTaskHandle;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/V$b;", "", "", "sessionId", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.adobe.marketing.mobile.assurance.internal.V$b, reason: from toString */
    public static final /* data */ class QuickConnectSessionDetails {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String token;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuickConnectSessionDetails)) {
                return false;
            }
            QuickConnectSessionDetails quickConnectSessionDetails = (QuickConnectSessionDetails) other;
            return Intrinsics.e(this.sessionId, quickConnectSessionDetails.sessionId) && Intrinsics.e(this.token, quickConnectSessionDetails.token);
        }

        public int hashCode() {
            return (this.sessionId.hashCode() * 31) + this.token.hashCode();
        }

        public String toString() {
            return "QuickConnectSessionDetails(sessionId=" + this.sessionId + ", token=" + this.token + ')';
        }

        public QuickConnectSessionDetails(String sessionId, String token) {
            Intrinsics.j(sessionId, "sessionId");
            Intrinsics.j(token, "token");
            this.sessionId = sessionId;
            this.token = token;
        }

        /* renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* renamed from: b, reason: from getter */
        public final String getToken() {
            return this.token;
        }
    }

    public V(E assuranceSharedStateManager, ScheduledExecutorService executorService, N quickConnectCallback) {
        Intrinsics.j(assuranceSharedStateManager, "assuranceSharedStateManager");
        Intrinsics.j(executorService, "executorService");
        Intrinsics.j(quickConnectCallback, "quickConnectCallback");
        this.assuranceSharedStateManager = assuranceSharedStateManager;
        this.executorService = executorService;
        this.quickConnectCallback = quickConnectCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(V this$0, String orgId, String clientId, W response) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(orgId, "$orgId");
        Intrinsics.j(clientId, "$clientId");
        Intrinsics.i(response, "response");
        this$0.h(orgId, clientId, response);
    }

    private final void f() {
        Future<?> future = this.deviceCreationTaskHandle;
        if (future != null) {
            future.cancel(true);
            Q5.t.e("Assurance", "QuickConnectManager", "QuickConnect device creation task cancelled", new Object[0]);
            Unit unit = Unit.f142422a;
        }
        this.deviceCreationTaskHandle = null;
        ScheduledFuture<?> scheduledFuture = this.deviceStatusTaskHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            Q5.t.a("Assurance", "QuickConnectManager", "QuickConnect device status task cancelled", new Object[0]);
            Unit unit2 = Unit.f142422a;
        }
        this.deviceStatusTaskHandle = null;
        this.retryCount = 0;
        this.isActive = false;
    }

    private final QuickConnectSessionDetails g(String jsonString) {
        if (jsonString != null && jsonString.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(new JSONTokener(jsonString));
                String sessionUUID = jSONObject.optString("sessionUuid");
                String token = jSONObject.optString("token");
                if (!f6.i.a(sessionUUID) && !f6.i.a(token) && !StringsKt.H(BuildConfig.TRAVIS, sessionUUID, true) && !StringsKt.H(BuildConfig.TRAVIS, token, true)) {
                    Intrinsics.i(sessionUUID, "sessionUUID");
                    Intrinsics.i(token, "token");
                    return new QuickConnectSessionDetails(sessionUUID, token);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private final void h(String orgId, String clientId, W<Q5.o, EnumC6425g> response) {
        if (!(response instanceof W.b)) {
            if (response instanceof W.a) {
                Q5.t.e("Assurance", "QuickConnectManager", "Device status check request failed.", new Object[0]);
                this.quickConnectCallback.b((EnumC6425g) ((W.a) response).a());
                f();
                return;
            }
            return;
        }
        QuickConnectSessionDetails quickConnectSessionDetailsG = g(C13851g.a(((Q5.o) ((W.b) response).a()).c()));
        if (quickConnectSessionDetailsG != null) {
            Q5.t.e("Assurance", "QuickConnectManager", "Received session details.", new Object[0]);
            this.quickConnectCallback.a(quickConnectSessionDetailsG.getSessionId(), quickConnectSessionDetailsG.getToken());
            f();
        } else {
            if (!this.isActive) {
                Q5.t.e("Assurance", "QuickConnectManager", "Will not retry. QuickConnect workflow already cancelled.", new Object[0]);
                return;
            }
            this.retryCount++;
            if (this.retryCount < 300) {
                Q5.t.e("Assurance", "QuickConnectManager", "Will retry device status check.", new Object[0]);
                d(orgId, clientId);
            } else {
                Q5.t.e("Assurance", "QuickConnectManager", "Will not retry. Maximum allowed retries for status check have been reached.", new Object[0]);
                this.quickConnectCallback.b(EnumC6425g.RETRY_LIMIT_REACHED);
                f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(V this$0, String orgId, String clientId, W w10) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(orgId, "$orgId");
        Intrinsics.j(clientId, "$clientId");
        if (w10 instanceof W.b) {
            this$0.d(orgId, clientId);
        } else if (w10 instanceof W.a) {
            this$0.quickConnectCallback.b((EnumC6425g) ((W.a) w10).a());
            this$0.f();
        }
    }

    public final void d(final String orgId, final String clientId) {
        Intrinsics.j(orgId, "orgId");
        Intrinsics.j(clientId, "clientId");
        this.deviceStatusTaskHandle = this.executorService.schedule(new S(orgId, clientId, new InterfaceC6418a() { // from class: com.adobe.marketing.mobile.assurance.internal.U
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) {
                V.e(this.f62195a, orgId, clientId, (W) obj);
            }
        }), C6427i.f62263a.c(), TimeUnit.MILLISECONDS);
    }

    public final void i() {
        if (this.isActive) {
            return;
        }
        this.isActive = true;
        final String strE = this.assuranceSharedStateManager.e(false);
        final String strC = this.assuranceSharedStateManager.c();
        String deviceName = Q5.K.f().e().q();
        Q5.t.e("Assurance", "QuickConnectManager", "Attempting to register device with deviceName:" + deviceName + ", orgId: " + strE + ", clientId: " + strC + '.', new Object[0]);
        Intrinsics.i(deviceName, "deviceName");
        this.deviceCreationTaskHandle = this.executorService.submit(new P(strE, strC, deviceName, new InterfaceC6418a() { // from class: com.adobe.marketing.mobile.assurance.internal.T
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) {
                V.j(this.f62192a, strE, strC, (W) obj);
            }
        }));
    }

    public final void c() {
        f();
    }
}
