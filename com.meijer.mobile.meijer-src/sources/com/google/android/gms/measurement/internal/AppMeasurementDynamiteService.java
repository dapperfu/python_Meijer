package com.google.android.gms.measurement.internal;

import Z.C5603a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC10659u0;
import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.net.MalformedURLException;
import java.util.Map;

@DynamiteApi
/* loaded from: classes6.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC10659u0 {

    /* renamed from: a, reason: collision with root package name */
    X2 f85720a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f85721b = new C5603a();

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setConsent(Bundle bundle, long j10) throws RemoteException {
    }

    private final void zzb() {
        if (this.f85720a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void initialize(com.google.android.gms.dynamic.b bVar, com.google.android.gms.internal.measurement.H0 h02, long j10) throws RemoteException {
        X2 x22 = this.f85720a;
        if (x22 == null) {
            this.f85720a = X2.M((Context) com.google.android.gms.common.internal.r.l((Context) com.google.android.gms.dynamic.d.c2(bVar)), h02, Long.valueOf(j10));
        } else {
            x22.a().p().a("Attempting to initialize multiple times");
        }
    }

    private final void a2(InterfaceC10695y0 interfaceC10695y0, String str) {
        zzb();
        this.f85720a.A().Y(interfaceC10695y0, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void beginAdUnitExposure(String str, long j10) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.K().g(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.z().M(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void clearMeasurementEnabled(long j10) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.z().l0(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void endAdUnitExposure(String str, long j10) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.K().h(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void generateEventId(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        zzb();
        long jN0 = this.f85720a.A().n0();
        zzb();
        this.f85720a.A().Z(interfaceC10695y0, jN0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getAppInstanceId(InterfaceC10695y0 interfaceC10695y0) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.b().r(new U2(this, interfaceC10695y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getCachedAppInstanceId(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        zzb();
        a2(interfaceC10695y0, this.f85720a.z().B());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getConditionalUserProperties(String str, String str2, InterfaceC10695y0 interfaceC10695y0) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.b().r(new K4(this, interfaceC10695y0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getCurrentScreenClass(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        zzb();
        a2(interfaceC10695y0, this.f85720a.z().P());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getCurrentScreenName(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        zzb();
        a2(interfaceC10695y0, this.f85720a.z().O());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getGmpAppId(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        zzb();
        a2(interfaceC10695y0, this.f85720a.z().Q());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getMaxUserProperties(String str, InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        zzb();
        this.f85720a.z().J(str);
        zzb();
        this.f85720a.A().a0(interfaceC10695y0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getSessionId(InterfaceC10695y0 interfaceC10695y0) throws IllegalStateException, RemoteException {
        zzb();
        C11393x4 c11393x4Z = this.f85720a.z();
        c11393x4Z.f85708a.b().r(new RunnableC11223a4(c11393x4Z, interfaceC10695y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getTestFlag(InterfaceC10695y0 interfaceC10695y0, int i10) throws RemoteException {
        zzb();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        this.f85720a.A().c0(interfaceC10695y0, this.f85720a.z().g0().booleanValue());
                        return;
                    }
                    this.f85720a.A().a0(interfaceC10695y0, this.f85720a.z().j0().intValue());
                    return;
                }
                z6 z6VarA = this.f85720a.A();
                double dDoubleValue = this.f85720a.z().k0().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", dDoubleValue);
                try {
                    interfaceC10695y0.P(bundle);
                    return;
                } catch (RemoteException e10) {
                    z6VarA.f85708a.a().p().b("Error returning double value to wrapper", e10);
                    return;
                }
            }
            this.f85720a.A().Z(interfaceC10695y0, this.f85720a.z().i0().longValue());
            return;
        }
        this.f85720a.A().Y(interfaceC10695y0, this.f85720a.z().h0());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void getUserProperties(String str, String str2, boolean z10, InterfaceC10695y0 interfaceC10695y0) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.b().r(new O3(this, interfaceC10695y0, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void isDataCollectionEnabled(InterfaceC10695y0 interfaceC10695y0) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.b().r(new RunnableC11304k5(this, interfaceC10695y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.z().o(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC10695y0 interfaceC10695y0, long j10) throws IllegalStateException, RemoteException {
        Bundle bundle2;
        zzb();
        com.google.android.gms.common.internal.r.f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f85720a.b().r(new RunnableC11378v3(this, interfaceC10695y0, new G(str2, new E(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void logHealthData(int i10, String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) throws IllegalStateException, SecurityException, RemoteException {
        Object objC2;
        Object objC22;
        zzb();
        Object objC23 = null;
        if (bVar == null) {
            objC2 = null;
        } else {
            objC2 = com.google.android.gms.dynamic.d.c2(bVar);
        }
        if (bVar2 == null) {
            objC22 = null;
        } else {
            objC22 = com.google.android.gms.dynamic.d.c2(bVar2);
        }
        if (bVar3 != null) {
            objC23 = com.google.android.gms.dynamic.d.c2(bVar3);
        }
        this.f85720a.a().w(i10, true, false, str, objC2, objC22, objC23);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityCreated(com.google.android.gms.dynamic.b bVar, Bundle bundle, long j10) throws RemoteException {
        zzb();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.B((Activity) com.google.android.gms.common.internal.r.l((Activity) com.google.android.gms.dynamic.d.c2(bVar))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle, long j10) {
        zzb();
        C11310l4 c11310l4 = this.f85720a.z().f86846c;
        if (c11310l4 != null) {
            this.f85720a.z().f0();
            c11310l4.e(j02, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityDestroyed(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException {
        zzb();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.B((Activity) com.google.android.gms.common.internal.r.l((Activity) com.google.android.gms.dynamic.d.c2(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) throws RemoteException {
        zzb();
        C11310l4 c11310l4 = this.f85720a.z().f86846c;
        if (c11310l4 != null) {
            this.f85720a.z().f0();
            c11310l4.b(j02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityPaused(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException {
        zzb();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.B((Activity) com.google.android.gms.common.internal.r.l((Activity) com.google.android.gms.dynamic.d.c2(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) throws RemoteException {
        zzb();
        C11310l4 c11310l4 = this.f85720a.z().f86846c;
        if (c11310l4 != null) {
            this.f85720a.z().f0();
            c11310l4.a(j02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityResumed(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException {
        zzb();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.B((Activity) com.google.android.gms.common.internal.r.l((Activity) com.google.android.gms.dynamic.d.c2(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) throws RemoteException {
        zzb();
        C11310l4 c11310l4 = this.f85720a.z().f86846c;
        if (c11310l4 != null) {
            this.f85720a.z().f0();
            c11310l4.d(j02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.b bVar, InterfaceC10695y0 interfaceC10695y0, long j10) throws RemoteException {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.J0.B((Activity) com.google.android.gms.common.internal.r.l((Activity) com.google.android.gms.dynamic.d.c2(bVar))), interfaceC10695y0, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, InterfaceC10695y0 interfaceC10695y0, long j10) throws RemoteException {
        zzb();
        C11310l4 c11310l4 = this.f85720a.z().f86846c;
        Bundle bundle = new Bundle();
        if (c11310l4 != null) {
            this.f85720a.z().f0();
            c11310l4.c(j02, bundle);
        }
        try {
            interfaceC10695y0.P(bundle);
        } catch (RemoteException e10) {
            this.f85720a.a().p().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityStarted(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException {
        zzb();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.B((Activity) com.google.android.gms.common.internal.r.l((Activity) com.google.android.gms.dynamic.d.c2(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) throws RemoteException {
        zzb();
        if (this.f85720a.z().f86846c != null) {
            this.f85720a.z().f0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityStopped(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException {
        zzb();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.B((Activity) com.google.android.gms.common.internal.r.l((Activity) com.google.android.gms.dynamic.d.c2(bVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) throws RemoteException {
        zzb();
        if (this.f85720a.z().f86846c != null) {
            this.f85720a.z().f0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void performAction(Bundle bundle, InterfaceC10695y0 interfaceC10695y0, long j10) throws RemoteException {
        zzb();
        interfaceC10695y0.P(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.E0 e02) throws RemoteException {
        Qd.A a62;
        zzb();
        Map map = this.f85721b;
        synchronized (map) {
            try {
                a62 = (Qd.A) map.get(Integer.valueOf(e02.zzf()));
                if (a62 == null) {
                    a62 = new A6(this, e02);
                    map.put(Integer.valueOf(e02.zzf()), a62);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f85720a.z().H(a62);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void resetAnalyticsData(long j10) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.z().E(j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.B0 b02) throws IllegalStateException, MalformedURLException {
        zzb();
        this.f85720a.z().p0(new Runnable() { // from class: com.google.android.gms.measurement.internal.K5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    b02.zze();
                } catch (RemoteException e10) {
                    ((X2) com.google.android.gms.common.internal.r.l(this.f85933a.f85720a)).a().p().b("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setConditionalUserProperty(Bundle bundle, long j10) throws IllegalStateException, RemoteException {
        zzb();
        if (bundle == null) {
            this.f85720a.a().m().a("Conditional user property must not be null");
        } else {
            this.f85720a.z().L(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setConsentThirdParty(Bundle bundle, long j10) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.z().m0(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setCurrentScreen(com.google.android.gms.dynamic.b bVar, String str, String str2, long j10) throws IllegalStateException, RemoteException {
        zzb();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.J0.B((Activity) com.google.android.gms.common.internal.r.l((Activity) com.google.android.gms.dynamic.d.c2(bVar))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, String str, String str2, long j10) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.G().r(j02, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setDataCollectionEnabled(boolean z10) throws IllegalStateException, RemoteException {
        zzb();
        C11393x4 c11393x4Z = this.f85720a.z();
        c11393x4Z.h();
        c11393x4Z.f85708a.b().r(new M3(c11393x4Z, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setDefaultEventParameters(Bundle bundle) throws IllegalStateException {
        final Bundle bundle2;
        zzb();
        final C11393x4 c11393x4Z = this.f85720a.z();
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        c11393x4Z.f85708a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.t4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c11393x4Z.S(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setEventInterceptor(com.google.android.gms.internal.measurement.E0 e02) throws IllegalStateException, RemoteException {
        zzb();
        C11297j6 c11297j6 = new C11297j6(this, e02);
        if (this.f85720a.b().n()) {
            this.f85720a.z().G(c11297j6);
        } else {
            this.f85720a.b().r(new RunnableC11324n4(this, c11297j6));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.G0 g02) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setMeasurementEnabled(boolean z10, long j10) throws IllegalStateException, RemoteException {
        zzb();
        this.f85720a.z().l0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setMinimumSessionDuration(long j10) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setSessionTimeoutDuration(long j10) throws IllegalStateException, RemoteException {
        zzb();
        C11393x4 c11393x4Z = this.f85720a.z();
        c11393x4Z.f85708a.b().r(new P3(c11393x4Z, j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        zzb();
        C11393x4 c11393x4Z = this.f85720a.z();
        Uri data = intent.getData();
        if (data == null) {
            c11393x4Z.f85708a.a().s().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter != null && queryParameter.equals("1")) {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                X2 x22 = c11393x4Z.f85708a;
                x22.a().s().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
                x22.u().O(queryParameter2);
                return;
            }
            return;
        }
        X2 x23 = c11393x4Z.f85708a;
        x23.a().s().a("[sgtm] Preview Mode was not enabled.");
        x23.u().O(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setUserId(final String str, long j10) throws IllegalStateException, RemoteException {
        zzb();
        final C11393x4 c11393x4Z = this.f85720a.z();
        if (str != null && TextUtils.isEmpty(str)) {
            c11393x4Z.f85708a.a().p().a("User ID must be non-empty or null");
        } else {
            c11393x4Z.f85708a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.u4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    X2 x22 = c11393x4Z.f85708a;
                    if (x22.J().v(str)) {
                        x22.J().n();
                    }
                }
            });
            c11393x4Z.x(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void setUserProperty(String str, String str2, com.google.android.gms.dynamic.b bVar, boolean z10, long j10) throws IllegalStateException, SecurityException, RemoteException {
        zzb();
        this.f85720a.z().x(str, str2, com.google.android.gms.dynamic.d.c2(bVar), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.E0 e02) throws RemoteException {
        Qd.A a62;
        zzb();
        Map map = this.f85721b;
        synchronized (map) {
            a62 = (Qd.A) map.remove(Integer.valueOf(e02.zzf()));
        }
        if (a62 == null) {
            a62 = new A6(this, e02);
        }
        this.f85720a.z().I(a62);
    }
}
