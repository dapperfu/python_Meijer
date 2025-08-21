package com.google.android.gms.internal.ads;

import Oc.C4384c1;
import Oc.C4413m0;
import Oc.InterfaceC4377a0;
import Oc.InterfaceC4401i0;
import Oc.InterfaceC4422p0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8878mX extends Oc.U {

    /* renamed from: a, reason: collision with root package name */
    private final Oc.d2 f77648a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f77649b;

    /* renamed from: c, reason: collision with root package name */
    private final Z40 f77650c;

    /* renamed from: d, reason: collision with root package name */
    private final String f77651d;

    /* renamed from: e, reason: collision with root package name */
    private final Sc.a f77652e;

    /* renamed from: f, reason: collision with root package name */
    private final C8024eX f77653f;

    /* renamed from: g, reason: collision with root package name */
    private final B50 f77654g;

    /* renamed from: h, reason: collision with root package name */
    private final M9 f77655h;

    /* renamed from: i, reason: collision with root package name */
    private final C9937wN f77656i;

    /* renamed from: j, reason: collision with root package name */
    private FG f77657j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f77658k = ((Boolean) Oc.A.c().a(C8784lf.f76923O0)).booleanValue();

    private final synchronized boolean D9() {
        FG fg2 = this.f77657j;
        if (fg2 != null) {
            if (!fg2.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // Oc.V
    public final void A5(String str) {
    }

    @Override // Oc.V
    public final void B5(Oc.R1 r12) {
    }

    @Override // Oc.V
    public final synchronized boolean G() {
        return false;
    }

    @Override // Oc.V
    public final void G5(Oc.j2 j2Var) {
    }

    @Override // Oc.V
    public final void J2(Oc.E e10) {
    }

    @Override // Oc.V
    public final synchronized void J6(com.google.android.gms.dynamic.b bVar) {
        if (this.f77657j == null) {
            Sc.p.g("Interstitial can not be shown before loaded.");
            this.f77653f.j(V60.d(9, null, null));
            return;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76995T2)).booleanValue()) {
            this.f77655h.c().c(new Throwable().getStackTrace());
        }
        this.f77657j.j(this.f77658k, (Activity) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // Oc.V
    public final void K6(String str) {
    }

    @Override // Oc.V
    public final void O2(InterfaceC6758Cn interfaceC6758Cn) {
    }

    @Override // Oc.V
    public final synchronized boolean R() {
        com.google.android.gms.common.internal.r.e("isLoaded must be called on the main UI thread.");
        return D9();
    }

    @Override // Oc.V
    public final synchronized void T6(InterfaceC6883Gf interfaceC6883Gf) {
        com.google.android.gms.common.internal.r.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f77650c.h(interfaceC6883Gf);
    }

    @Override // Oc.V
    public final void V4(InterfaceC9847vc interfaceC9847vc) {
    }

    @Override // Oc.V
    public final void W4(C4384c1 c4384c1) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // Oc.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean W7(Oc.Y1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.T()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8679kg.f76533i     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77115bb     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r6 = move-exception
            goto L95
        L2f:
            Sc.a r2 = r5.f77652e     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.f34481c     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.bf r3 = com.google.android.gms.internal.ads.C8784lf.f77129cb     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.jf r4 = Oc.A.c()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.r.e(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            Nc.v.t()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.f77649b     // Catch: java.lang.Throwable -> L2d
            boolean r0 = Rc.D0.i(r0)     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            if (r0 == 0) goto L6e
            Oc.X r0 = r6.f23372s     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L6e
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            Sc.p.d(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.eX r6 = r5.f77653f     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L93
            r0 = 4
            Oc.W0 r0 = com.google.android.gms.internal.ads.V60.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.C(r0)     // Catch: java.lang.Throwable -> L2d
            goto L93
        L6e:
            boolean r0 = r5.D9()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L93
            android.content.Context r0 = r5.f77649b     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r6.f23359f     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.R60.a(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.f77657j = r2     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Z40 r0 = r5.f77650c     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.f77651d     // Catch: java.lang.Throwable -> L2d
            Oc.d2 r2 = r5.f77648a     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.S40 r3 = new com.google.android.gms.internal.ads.S40     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.lX r2 = new com.google.android.gms.internal.ads.lX     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.a(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L93:
            monitor-exit(r5)
            return r1
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC8878mX.W7(Oc.Y1):boolean");
    }

    @Override // Oc.V
    public final void X1(InterfaceC6860Fn interfaceC6860Fn, String str) {
    }

    @Override // Oc.V
    public final void a9(C4413m0 c4413m0) {
    }

    @Override // Oc.V
    public final synchronized void j() {
        com.google.android.gms.common.internal.r.e("pause must be called on the main UI thread.");
        FG fg2 = this.f77657j;
        if (fg2 != null) {
            fg2.d().S0(null);
        }
    }

    @Override // Oc.V
    public final synchronized void o() {
        com.google.android.gms.common.internal.r.e("showInterstitial must be called on the main UI thread.");
        if (this.f77657j == null) {
            Sc.p.g("Interstitial can not be shown before loaded.");
            this.f77653f.j(V60.d(9, null, null));
        } else {
            if (((Boolean) Oc.A.c().a(C8784lf.f76995T2)).booleanValue()) {
                this.f77655h.c().c(new Throwable().getStackTrace());
            }
            this.f77657j.j(this.f77658k, null);
        }
    }

    @Override // Oc.V
    public final synchronized void r() {
        com.google.android.gms.common.internal.r.e("resume must be called on the main UI thread.");
        FG fg2 = this.f77657j;
        if (fg2 != null) {
            fg2.d().T0(null);
        }
    }

    @Override // Oc.V
    public final synchronized boolean r0() {
        return this.f77650c.zza();
    }

    @Override // Oc.V
    public final void u1(Oc.d2 d2Var) {
    }

    @Override // Oc.V
    public final void v() {
    }

    @Override // Oc.V
    public final void v9(boolean z10) {
    }

    @Override // Oc.V
    public final synchronized void y8(boolean z10) {
        com.google.android.gms.common.internal.r.e("setImmersiveMode must be called on the main UI thread.");
        this.f77658k = z10;
    }

    @Override // Oc.V
    public final Oc.d2 zzg() {
        return null;
    }

    @Override // Oc.V
    public final synchronized Oc.U0 zzk() {
        FG fg2;
        if (((Boolean) Oc.A.c().a(C8784lf.f76761C6)).booleanValue() && (fg2 = this.f77657j) != null) {
            return fg2.c();
        }
        return null;
    }

    @Override // Oc.V
    public final Oc.Y0 zzl() {
        return null;
    }

    @Override // Oc.V
    public final com.google.android.gms.dynamic.b zzn() {
        return null;
    }

    @Override // Oc.V
    public final synchronized String zzr() {
        return this.f77651d;
    }

    @Override // Oc.V
    public final synchronized String zzs() {
        FG fg2 = this.f77657j;
        if (fg2 == null || fg2.c() == null) {
            return null;
        }
        return fg2.c().zzg();
    }

    @Override // Oc.V
    public final synchronized String zzt() {
        FG fg2 = this.f77657j;
        if (fg2 == null || fg2.c() == null) {
            return null;
        }
        return fg2.c().zzg();
    }

    @Override // Oc.V
    public final synchronized void zzx() {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        FG fg2 = this.f77657j;
        if (fg2 != null) {
            fg2.d().R0(null);
        }
    }

    @Override // Oc.V
    public final void A6(Oc.Y1 y12, Oc.K k10) {
        this.f77653f.L(k10);
        W7(y12);
    }

    @Override // Oc.V
    public final void D3(Oc.N0 n02) {
        com.google.android.gms.common.internal.r.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!n02.zzf()) {
                this.f77656i.e();
            }
        } catch (RemoteException e10) {
            Sc.p.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f77653f.N(n02);
    }

    @Override // Oc.V
    public final void S6(InterfaceC4377a0 interfaceC4377a0) {
        com.google.android.gms.common.internal.r.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // Oc.V
    public final void Y1(InterfaceC7200Po interfaceC7200Po) {
        this.f77654g.N(interfaceC7200Po);
    }

    @Override // Oc.V
    public final void d4(InterfaceC4422p0 interfaceC4422p0) {
        this.f77653f.k0(interfaceC4422p0);
    }

    @Override // Oc.V
    public final void n9(Oc.H h10) {
        com.google.android.gms.common.internal.r.e("setAdListener must be called on the main UI thread.");
        this.f77653f.J(h10);
    }

    @Override // Oc.V
    public final void o9(InterfaceC4401i0 interfaceC4401i0) {
        com.google.android.gms.common.internal.r.e("setAppEventListener must be called on the main UI thread.");
        this.f77653f.g0(interfaceC4401i0);
    }

    @Override // Oc.V
    public final Bundle zzd() {
        com.google.android.gms.common.internal.r.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // Oc.V
    public final Oc.H zzi() {
        return this.f77653f.a();
    }

    @Override // Oc.V
    public final InterfaceC4401i0 zzj() {
        return this.f77653f.q();
    }

    public BinderC8878mX(Context context, Oc.d2 d2Var, String str, Z40 z40, C8024eX c8024eX, B50 b50, Sc.a aVar, M9 m92, C9937wN c9937wN) {
        this.f77648a = d2Var;
        this.f77651d = str;
        this.f77649b = context;
        this.f77650c = z40;
        this.f77653f = c8024eX;
        this.f77654g = b50;
        this.f77652e = aVar;
        this.f77655h = m92;
        this.f77656i = c9937wN;
    }
}
