package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import android.content.Context;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class WN implements Hc.c, InterfaceC10243zD, InterfaceC4376a, ZB, InterfaceC9706uC, InterfaceC9813vC, PC, InterfaceC7784cC, C80 {

    /* renamed from: a, reason: collision with root package name */
    private final List f71917a;

    /* renamed from: b, reason: collision with root package name */
    private final KN f71918b;

    /* renamed from: c, reason: collision with root package name */
    private long f71919c;

    @Override // Oc.InterfaceC4376a
    public final void v() throws IOException {
        Z(InterfaceC4376a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void z0(C8733l60 c8733l60) {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zza() throws IOException {
        Z(ZB.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzb() throws IOException {
        Z(ZB.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() throws IOException {
        Z(ZB.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zze() throws IOException {
        Z(ZB.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzf() throws IOException {
        Z(ZB.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final void zzr() throws IOException {
        Z(InterfaceC9706uC.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
    public final void C(Oc.W0 w02) throws IOException {
        Z(InterfaceC7784cC.class, "onAdFailedToLoad", Integer.valueOf(w02.f23346a), w02.f23347b, w02.f23348c);
    }

    public WN(KN kn2, AbstractC9135ou abstractC9135ou) {
        this.f71918b = kn2;
        this.f71917a = Collections.singletonList(abstractC9135ou);
    }

    private final void Z(Class cls, String str, Object... objArr) throws IOException {
        this.f71918b.a(this.f71917a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void J(EnumC9806v80 enumC9806v80, String str) throws IOException {
        Z(InterfaceC9699u80.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void L(Context context) throws IOException {
        Z(InterfaceC9813vC.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void N(EnumC9806v80 enumC9806v80, String str) throws IOException {
        Z(InterfaceC9699u80.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void a(EnumC9806v80 enumC9806v80, String str, Throwable th2) throws IOException {
        Z(InterfaceC9699u80.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void d0(C9978wo c9978wo) throws IOException {
        this.f71919c = Nc.v.c().c();
        Z(InterfaceC10243zD.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void i(EnumC9806v80 enumC9806v80, String str) throws IOException {
        Z(InterfaceC9699u80.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void j(Context context) throws IOException {
        Z(InterfaceC9813vC.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(InterfaceC6963Io interfaceC6963Io, String str, String str2) throws IOException {
        Z(ZB.class, "onRewarded", interfaceC6963Io, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9813vC
    public final void q(Context context) throws IOException {
        Z(InterfaceC9813vC.class, "onPause", context);
    }

    @Override // Hc.c
    public final void s(String str, String str2) throws IOException {
        Z(Hc.c.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() throws IOException {
        Rc.p0.k("Ad Request Latency : " + (Nc.v.c().c() - this.f71919c));
        Z(PC.class, "onAdLoaded", new Object[0]);
    }
}
