package com.google.android.gms.internal.ads;

import Mc.C4106c1;
import Mc.C4135m0;
import Mc.InterfaceC4099a0;
import Mc.InterfaceC4123i0;
import Mc.InterfaceC4144p0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class JW extends Mc.U implements InterfaceC8942oD {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67922a;

    /* renamed from: b, reason: collision with root package name */
    private final C8178h40 f67923b;

    /* renamed from: c, reason: collision with root package name */
    private final String f67924c;

    /* renamed from: d, reason: collision with root package name */
    private final C7899eX f67925d;

    /* renamed from: e, reason: collision with root package name */
    private Mc.d2 f67926e;

    /* renamed from: f, reason: collision with root package name */
    private final C9356s60 f67927f;

    /* renamed from: g, reason: collision with root package name */
    private final Qc.a f67928g;

    /* renamed from: h, reason: collision with root package name */
    private final C9812wN f67929h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC8804my f67930i;

    private final synchronized void D9(Mc.d2 d2Var) {
        this.f67927f.O(d2Var);
        this.f67927f.U(this.f67926e.f19226n);
    }

    private final synchronized boolean E9(Mc.Y1 y12) throws RemoteException {
        try {
            if (F9()) {
                com.google.android.gms.common.internal.r.e("loadAd must be called on the main UI thread.");
            }
            Lc.v.t();
            if (!Pc.D0.i(this.f67922a) || y12.f19185s != null) {
                R60.a(this.f67922a, y12.f19172f);
                return this.f67923b.a(y12, this.f67924c, null, new IW(this));
            }
            Qc.p.d("Failed to load the ad because app ID is missing.");
            C7899eX c7899eX = this.f67925d;
            if (c7899eX != null) {
                c7899eX.g0(V60.d(4, null, null));
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Mc.V
    public final void E8(boolean z10) {
    }

    @Override // Mc.V
    public final synchronized boolean G() {
        AbstractC8804my abstractC8804my = this.f67930i;
        if (abstractC8804my != null) {
            if (abstractC8804my.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // Mc.V
    public final synchronized void G6(InterfaceC6758Gf interfaceC6758Gf) {
        com.google.android.gms.common.internal.r.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f67923b.o(interfaceC6758Gf);
    }

    @Override // Mc.V
    public final synchronized boolean H4(Mc.Y1 y12) throws RemoteException {
        D9(this.f67926e);
        return E9(y12);
    }

    @Override // Mc.V
    public final void I2(InterfaceC6633Cn interfaceC6633Cn) {
    }

    @Override // Mc.V
    public final void K4(InterfaceC9722vc interfaceC9722vc) {
    }

    @Override // Mc.V
    public final synchronized void L6(Mc.R1 r12) {
        try {
            if (F9()) {
                com.google.android.gms.common.internal.r.e("setVideoOptions must be called on the main UI thread.");
            }
            this.f67927f.i(r12);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Mc.V
    public final synchronized void O7(Mc.d2 d2Var) {
        com.google.android.gms.common.internal.r.e("setAdSize must be called on the main UI thread.");
        this.f67927f.O(d2Var);
        this.f67926e = d2Var;
        AbstractC8804my abstractC8804my = this.f67930i;
        if (abstractC8804my != null) {
            abstractC8804my.p(this.f67923b.b(), d2Var);
        }
    }

    @Override // Mc.V
    public final boolean R() {
        return false;
    }

    @Override // Mc.V
    public final synchronized void R1(C4135m0 c4135m0) {
        com.google.android.gms.common.internal.r.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f67927f.v(c4135m0);
    }

    @Override // Mc.V
    public final void R4(InterfaceC4144p0 interfaceC4144p0) {
    }

    @Override // Mc.V
    public final void R6(Mc.j2 j2Var) {
    }

    @Override // Mc.V
    public final void V1(InterfaceC6735Fn interfaceC6735Fn, String str) {
    }

    @Override // Mc.V
    public final void X1(InterfaceC7075Po interfaceC7075Po) {
    }

    @Override // Mc.V
    public final void Y8(Mc.Y1 y12, Mc.K k10) {
    }

    @Override // Mc.V
    public final void a4(C4106c1 c4106c1) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // Mc.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8554kg.f75691g     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76247Za     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r1 = Mc.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            Qc.a r0 = r3.f67928g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f29931c     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f76303db     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.r.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.my r0 = r3.f67930i     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zC r0 = r0.d()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.S0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JW.j():void");
    }

    @Override // Mc.V
    public final void o() {
    }

    @Override // Mc.V
    public final synchronized boolean q0() {
        return this.f67923b.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // Mc.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void r() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8554kg.f75692h     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76219Xa     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r1 = Mc.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            Qc.a r0 = r3.f67928g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f29931c     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f76303db     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.r.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.my r0 = r3.f67930i     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zC r0 = r0.d()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.T0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JW.r():void");
    }

    @Override // Mc.V
    public final void u5(String str) {
    }

    @Override // Mc.V
    public final void u6(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // Mc.V
    public final synchronized void v() {
        com.google.android.gms.common.internal.r.e("recordManualImpression must be called on the main UI thread.");
        AbstractC8804my abstractC8804my = this.f67930i;
        if (abstractC8804my != null) {
            abstractC8804my.o();
        }
    }

    @Override // Mc.V
    public final void w6(String str) {
    }

    @Override // Mc.V
    public final synchronized void w9(boolean z10) {
        try {
            if (F9()) {
                com.google.android.gms.common.internal.r.e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f67927f.b(z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8942oD
    public final synchronized void zza() {
        try {
            if (!this.f67923b.r()) {
                this.f67923b.k();
                return;
            }
            Mc.d2 d2VarD = this.f67927f.D();
            AbstractC8804my abstractC8804my = this.f67930i;
            if (abstractC8804my != null && abstractC8804my.n() != null && this.f67927f.t()) {
                d2VarD = A60.a(this.f67922a, Collections.singletonList(this.f67930i.n()));
            }
            D9(d2VarD);
            this.f67927f.T(true);
            try {
                E9(this.f67927f.B());
            } catch (RemoteException unused) {
                Qc.p.g("Failed to refresh the banner ad.");
            }
            this.f67927f.T(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8942oD
    public final synchronized void zzb() throws ExecutionException, InterruptedException {
        if (this.f67923b.r()) {
            this.f67923b.p();
        } else {
            this.f67923b.l();
        }
    }

    @Override // Mc.V
    public final synchronized Mc.d2 zzg() {
        com.google.android.gms.common.internal.r.e("getAdSize must be called on the main UI thread.");
        AbstractC8804my abstractC8804my = this.f67930i;
        if (abstractC8804my != null) {
            return A60.a(this.f67922a, Collections.singletonList(abstractC8804my.m()));
        }
        return this.f67927f.D();
    }

    @Override // Mc.V
    public final synchronized Mc.U0 zzk() {
        AbstractC8804my abstractC8804my;
        if (((Boolean) Mc.A.c().a(C8659lf.f75921C6)).booleanValue() && (abstractC8804my = this.f67930i) != null) {
            return abstractC8804my.c();
        }
        return null;
    }

    @Override // Mc.V
    public final synchronized Mc.Y0 zzl() {
        com.google.android.gms.common.internal.r.e("getVideoController must be called from the main thread.");
        AbstractC8804my abstractC8804my = this.f67930i;
        if (abstractC8804my == null) {
            return null;
        }
        return abstractC8804my.l();
    }

    @Override // Mc.V
    public final synchronized String zzr() {
        return this.f67924c;
    }

    @Override // Mc.V
    public final synchronized String zzs() {
        AbstractC8804my abstractC8804my = this.f67930i;
        if (abstractC8804my == null || abstractC8804my.c() == null) {
            return null;
        }
        return abstractC8804my.c().zzg();
    }

    @Override // Mc.V
    public final synchronized String zzt() {
        AbstractC8804my abstractC8804my = this.f67930i;
        if (abstractC8804my == null || abstractC8804my.c() == null) {
            return null;
        }
        return abstractC8804my.c().zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // Mc.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8554kg.f75689e     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76233Ya     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r1 = Mc.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            Qc.a r0 = r3.f67928g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f29931c     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f76303db     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4a
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.r.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.my r0 = r3.f67930i     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            r0.a()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JW.zzx():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean F9() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8554kg.f75690f
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76275bb
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            Qc.a r3 = r6.f67928g
            int r3 = r3.f29931c
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.C8659lf.f76289cb
            com.google.android.gms.internal.ads.jf r5 = Mc.A.c()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JW.F9():boolean");
    }

    @Override // Mc.V
    public final void c7(InterfaceC4099a0 interfaceC4099a0) {
        com.google.android.gms.common.internal.r.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // Mc.V
    public final Bundle zzd() {
        com.google.android.gms.common.internal.r.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // Mc.V
    public final Mc.H zzi() {
        return this.f67925d.a();
    }

    @Override // Mc.V
    public final InterfaceC4123i0 zzj() {
        return this.f67925d.q();
    }

    public JW(Context context, Mc.d2 d2Var, String str, C8178h40 c8178h40, C7899eX c7899eX, Qc.a aVar, C9812wN c9812wN) {
        this.f67922a = context;
        this.f67923b = c8178h40;
        this.f67926e = d2Var;
        this.f67924c = str;
        this.f67925d = c7899eX;
        this.f67927f = c8178h40.e();
        this.f67928g = aVar;
        this.f67929h = c9812wN;
        c8178h40.n(this);
    }

    @Override // Mc.V
    public final void B4(Mc.N0 n02) {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!n02.zzf()) {
                this.f67929h.e();
            }
        } catch (RemoteException e10) {
            Qc.p.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f67925d.L(n02);
    }

    @Override // Mc.V
    public final void G7(InterfaceC4123i0 interfaceC4123i0) {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("setAppEventListener must be called on the main UI thread.");
        }
        this.f67925d.b0(interfaceC4123i0);
    }

    @Override // Mc.V
    public final void N1(Mc.E e10) {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("setAdListener must be called on the main UI thread.");
        }
        this.f67923b.m(e10);
    }

    @Override // Mc.V
    public final void s8(Mc.H h10) {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("setAdListener must be called on the main UI thread.");
        }
        this.f67925d.C(h10);
    }

    @Override // Mc.V
    public final com.google.android.gms.dynamic.b zzn() {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("getAdFrame must be called on the main UI thread.");
        }
        return com.google.android.gms.dynamic.d.F2(this.f67923b.b());
    }
}
