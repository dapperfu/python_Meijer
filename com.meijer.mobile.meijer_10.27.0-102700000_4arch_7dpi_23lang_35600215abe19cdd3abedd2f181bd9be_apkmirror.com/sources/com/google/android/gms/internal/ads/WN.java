package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import android.content.Context;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class WN implements Fc.c, InterfaceC10118zD, InterfaceC4098a, ZB, InterfaceC9581uC, InterfaceC9688vC, PC, InterfaceC7659cC, C80 {

    /* renamed from: a, reason: collision with root package name */
    private final List f71077a;

    /* renamed from: b, reason: collision with root package name */
    private final KN f71078b;

    /* renamed from: c, reason: collision with root package name */
    private long f71079c;

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void A0(C8608l60 c8608l60) {
    }

    @Override // Mc.InterfaceC4098a
    public final void v() throws IOException {
        Z(InterfaceC4098a.class, "onAdClicked", new Object[0]);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final void zzr() throws IOException {
        Z(InterfaceC9581uC.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
    public final void g0(Mc.W0 w02) throws IOException {
        Z(InterfaceC7659cC.class, "onAdFailedToLoad", Integer.valueOf(w02.f19159a), w02.f19160b, w02.f19161c);
    }

    public WN(KN kn2, AbstractC9010ou abstractC9010ou) {
        this.f71078b = kn2;
        this.f71077a = Collections.singletonList(abstractC9010ou);
    }

    private final void Z(Class cls, String str, Object... objArr) throws IOException {
        this.f71078b.a(this.f71077a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void C(EnumC9681v80 enumC9681v80, String str) throws IOException {
        Z(InterfaceC9574u80.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void J(Context context) throws IOException {
        Z(InterfaceC9688vC.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void L(EnumC9681v80 enumC9681v80, String str) throws IOException {
        Z(InterfaceC9574u80.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) throws IOException {
        this.f71079c = Lc.v.c().c();
        Z(InterfaceC10118zD.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void a(EnumC9681v80 enumC9681v80, String str, Throwable th2) throws IOException {
        Z(InterfaceC9574u80.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void i(EnumC9681v80 enumC9681v80, String str) throws IOException {
        Z(InterfaceC9574u80.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void j(Context context) throws IOException {
        Z(InterfaceC9688vC.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(InterfaceC6838Io interfaceC6838Io, String str, String str2) throws IOException {
        Z(ZB.class, "onRewarded", interfaceC6838Io, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9688vC
    public final void q(Context context) throws IOException {
        Z(InterfaceC9688vC.class, "onPause", context);
    }

    @Override // Fc.c
    public final void s(String str, String str2) throws IOException {
        Z(Fc.c.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() throws IOException {
        Pc.p0.k("Ad Request Latency : " + (Lc.v.c().c() - this.f71079c));
        Z(PC.class, "onAdLoaded", new Object[0]);
    }
}
