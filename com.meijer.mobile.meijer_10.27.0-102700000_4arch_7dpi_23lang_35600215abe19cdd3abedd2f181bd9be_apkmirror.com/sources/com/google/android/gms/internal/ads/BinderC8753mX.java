package com.google.android.gms.internal.ads;

import Mc.C4106c1;
import Mc.C4135m0;
import Mc.InterfaceC4099a0;
import Mc.InterfaceC4123i0;
import Mc.InterfaceC4144p0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8753mX extends Mc.U {

    /* renamed from: a, reason: collision with root package name */
    private final Mc.d2 f76808a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f76809b;

    /* renamed from: c, reason: collision with root package name */
    private final Z40 f76810c;

    /* renamed from: d, reason: collision with root package name */
    private final String f76811d;

    /* renamed from: e, reason: collision with root package name */
    private final Qc.a f76812e;

    /* renamed from: f, reason: collision with root package name */
    private final C7899eX f76813f;

    /* renamed from: g, reason: collision with root package name */
    private final B50 f76814g;

    /* renamed from: h, reason: collision with root package name */
    private final M9 f76815h;

    /* renamed from: i, reason: collision with root package name */
    private final C9812wN f76816i;

    /* renamed from: j, reason: collision with root package name */
    private FG f76817j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f76818k = ((Boolean) Mc.A.c().a(C8659lf.f76083O0)).booleanValue();

    private final synchronized boolean D9() {
        FG fg2 = this.f76817j;
        if (fg2 != null) {
            if (!fg2.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // Mc.V
    public final synchronized void E8(boolean z10) {
        com.google.android.gms.common.internal.r.e("setImmersiveMode must be called on the main UI thread.");
        this.f76818k = z10;
    }

    @Override // Mc.V
    public final synchronized boolean G() {
        return false;
    }

    @Override // Mc.V
    public final synchronized void G6(InterfaceC6758Gf interfaceC6758Gf) {
        com.google.android.gms.common.internal.r.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f76810c.h(interfaceC6758Gf);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // Mc.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean H4(Mc.Y1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.T()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8554kg.f75693i     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76275bb     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L2d
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
            Qc.a r2 = r5.f76812e     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.f29931c     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.bf r3 = com.google.android.gms.internal.ads.C8659lf.f76289cb     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.jf r4 = Mc.A.c()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.r.e(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            Lc.v.t()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.f76809b     // Catch: java.lang.Throwable -> L2d
            boolean r0 = Pc.D0.i(r0)     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            if (r0 == 0) goto L6e
            Mc.X r0 = r6.f19185s     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L6e
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            Qc.p.d(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.eX r6 = r5.f76813f     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L93
            r0 = 4
            Mc.W0 r0 = com.google.android.gms.internal.ads.V60.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.g0(r0)     // Catch: java.lang.Throwable -> L2d
            goto L93
        L6e:
            boolean r0 = r5.D9()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L93
            android.content.Context r0 = r5.f76809b     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r6.f19172f     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.R60.a(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.f76817j = r2     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Z40 r0 = r5.f76810c     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.f76811d     // Catch: java.lang.Throwable -> L2d
            Mc.d2 r2 = r5.f76808a     // Catch: java.lang.Throwable -> L2d
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC8753mX.H4(Mc.Y1):boolean");
    }

    @Override // Mc.V
    public final void I2(InterfaceC6633Cn interfaceC6633Cn) {
    }

    @Override // Mc.V
    public final void K4(InterfaceC9722vc interfaceC9722vc) {
    }

    @Override // Mc.V
    public final void L6(Mc.R1 r12) {
    }

    @Override // Mc.V
    public final void N1(Mc.E e10) {
    }

    @Override // Mc.V
    public final void O7(Mc.d2 d2Var) {
    }

    @Override // Mc.V
    public final synchronized boolean R() {
        com.google.android.gms.common.internal.r.e("isLoaded must be called on the main UI thread.");
        return D9();
    }

    @Override // Mc.V
    public final void R1(C4135m0 c4135m0) {
    }

    @Override // Mc.V
    public final void R6(Mc.j2 j2Var) {
    }

    @Override // Mc.V
    public final void V1(InterfaceC6735Fn interfaceC6735Fn, String str) {
    }

    @Override // Mc.V
    public final void a4(C4106c1 c4106c1) {
    }

    @Override // Mc.V
    public final synchronized void j() {
        com.google.android.gms.common.internal.r.e("pause must be called on the main UI thread.");
        FG fg2 = this.f76817j;
        if (fg2 != null) {
            fg2.d().S0(null);
        }
    }

    @Override // Mc.V
    public final synchronized void o() {
        com.google.android.gms.common.internal.r.e("showInterstitial must be called on the main UI thread.");
        if (this.f76817j == null) {
            Qc.p.g("Interstitial can not be shown before loaded.");
            this.f76813f.j(V60.d(9, null, null));
        } else {
            if (((Boolean) Mc.A.c().a(C8659lf.f76155T2)).booleanValue()) {
                this.f76815h.c().c(new Throwable().getStackTrace());
            }
            this.f76817j.j(this.f76818k, null);
        }
    }

    @Override // Mc.V
    public final synchronized boolean q0() {
        return this.f76810c.zza();
    }

    @Override // Mc.V
    public final synchronized void r() {
        com.google.android.gms.common.internal.r.e("resume must be called on the main UI thread.");
        FG fg2 = this.f76817j;
        if (fg2 != null) {
            fg2.d().T0(null);
        }
    }

    @Override // Mc.V
    public final void u5(String str) {
    }

    @Override // Mc.V
    public final synchronized void u6(com.google.android.gms.dynamic.b bVar) {
        if (this.f76817j == null) {
            Qc.p.g("Interstitial can not be shown before loaded.");
            this.f76813f.j(V60.d(9, null, null));
            return;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76155T2)).booleanValue()) {
            this.f76815h.c().c(new Throwable().getStackTrace());
        }
        this.f76817j.j(this.f76818k, (Activity) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // Mc.V
    public final void v() {
    }

    @Override // Mc.V
    public final void w6(String str) {
    }

    @Override // Mc.V
    public final void w9(boolean z10) {
    }

    @Override // Mc.V
    public final Mc.d2 zzg() {
        return null;
    }

    @Override // Mc.V
    public final synchronized Mc.U0 zzk() {
        FG fg2;
        if (((Boolean) Mc.A.c().a(C8659lf.f75921C6)).booleanValue() && (fg2 = this.f76817j) != null) {
            return fg2.c();
        }
        return null;
    }

    @Override // Mc.V
    public final Mc.Y0 zzl() {
        return null;
    }

    @Override // Mc.V
    public final com.google.android.gms.dynamic.b zzn() {
        return null;
    }

    @Override // Mc.V
    public final synchronized String zzr() {
        return this.f76811d;
    }

    @Override // Mc.V
    public final synchronized String zzs() {
        FG fg2 = this.f76817j;
        if (fg2 == null || fg2.c() == null) {
            return null;
        }
        return fg2.c().zzg();
    }

    @Override // Mc.V
    public final synchronized String zzt() {
        FG fg2 = this.f76817j;
        if (fg2 == null || fg2.c() == null) {
            return null;
        }
        return fg2.c().zzg();
    }

    @Override // Mc.V
    public final synchronized void zzx() {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        FG fg2 = this.f76817j;
        if (fg2 != null) {
            fg2.d().R0(null);
        }
    }

    @Override // Mc.V
    public final void B4(Mc.N0 n02) {
        com.google.android.gms.common.internal.r.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!n02.zzf()) {
                this.f76816i.e();
            }
        } catch (RemoteException e10) {
            Qc.p.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f76813f.L(n02);
    }

    @Override // Mc.V
    public final void G7(InterfaceC4123i0 interfaceC4123i0) {
        com.google.android.gms.common.internal.r.e("setAppEventListener must be called on the main UI thread.");
        this.f76813f.b0(interfaceC4123i0);
    }

    @Override // Mc.V
    public final void R4(InterfaceC4144p0 interfaceC4144p0) {
        this.f76813f.k0(interfaceC4144p0);
    }

    @Override // Mc.V
    public final void X1(InterfaceC7075Po interfaceC7075Po) {
        this.f76814g.L(interfaceC7075Po);
    }

    @Override // Mc.V
    public final void Y8(Mc.Y1 y12, Mc.K k10) {
        this.f76813f.J(k10);
        H4(y12);
    }

    @Override // Mc.V
    public final void c7(InterfaceC4099a0 interfaceC4099a0) {
        com.google.android.gms.common.internal.r.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // Mc.V
    public final void s8(Mc.H h10) {
        com.google.android.gms.common.internal.r.e("setAdListener must be called on the main UI thread.");
        this.f76813f.C(h10);
    }

    @Override // Mc.V
    public final Bundle zzd() {
        com.google.android.gms.common.internal.r.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // Mc.V
    public final Mc.H zzi() {
        return this.f76813f.a();
    }

    @Override // Mc.V
    public final InterfaceC4123i0 zzj() {
        return this.f76813f.q();
    }

    public BinderC8753mX(Context context, Mc.d2 d2Var, String str, Z40 z40, C7899eX c7899eX, B50 b50, Qc.a aVar, M9 m92, C9812wN c9812wN) {
        this.f76808a = d2Var;
        this.f76811d = str;
        this.f76809b = context;
        this.f76810c = z40;
        this.f76813f = c7899eX;
        this.f76814g = b50;
        this.f76812e = aVar;
        this.f76815h = m92;
        this.f76816i = c9812wN;
    }
}
