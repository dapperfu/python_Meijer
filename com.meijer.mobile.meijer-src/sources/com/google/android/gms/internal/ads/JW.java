package com.google.android.gms.internal.ads;

import Oc.C4384c1;
import Oc.C4413m0;
import Oc.InterfaceC4377a0;
import Oc.InterfaceC4401i0;
import Oc.InterfaceC4422p0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class JW extends Oc.U implements InterfaceC9067oD {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68762a;

    /* renamed from: b, reason: collision with root package name */
    private final C8303h40 f68763b;

    /* renamed from: c, reason: collision with root package name */
    private final String f68764c;

    /* renamed from: d, reason: collision with root package name */
    private final C8024eX f68765d;

    /* renamed from: e, reason: collision with root package name */
    private Oc.d2 f68766e;

    /* renamed from: f, reason: collision with root package name */
    private final C9481s60 f68767f;

    /* renamed from: g, reason: collision with root package name */
    private final Sc.a f68768g;

    /* renamed from: h, reason: collision with root package name */
    private final C9937wN f68769h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC8929my f68770i;

    private final synchronized void D9(Oc.d2 d2Var) {
        this.f68767f.O(d2Var);
        this.f68767f.U(this.f68766e.f23413n);
    }

    private final synchronized boolean E9(Oc.Y1 y12) throws RemoteException {
        try {
            if (F9()) {
                com.google.android.gms.common.internal.r.e("loadAd must be called on the main UI thread.");
            }
            Nc.v.t();
            if (!Rc.D0.i(this.f68762a) || y12.f23372s != null) {
                R60.a(this.f68762a, y12.f23359f);
                return this.f68763b.a(y12, this.f68764c, null, new IW(this));
            }
            Sc.p.d("Failed to load the ad because app ID is missing.");
            C8024eX c8024eX = this.f68765d;
            if (c8024eX != null) {
                c8024eX.C(V60.d(4, null, null));
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Oc.V
    public final void A5(String str) {
    }

    @Override // Oc.V
    public final void A6(Oc.Y1 y12, Oc.K k10) {
    }

    @Override // Oc.V
    public final synchronized void B5(Oc.R1 r12) {
        try {
            if (F9()) {
                com.google.android.gms.common.internal.r.e("setVideoOptions must be called on the main UI thread.");
            }
            this.f68767f.i(r12);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Oc.V
    public final synchronized boolean G() {
        AbstractC8929my abstractC8929my = this.f68770i;
        if (abstractC8929my != null) {
            if (abstractC8929my.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // Oc.V
    public final void G5(Oc.j2 j2Var) {
    }

    @Override // Oc.V
    public final void J6(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // Oc.V
    public final void K6(String str) {
    }

    @Override // Oc.V
    public final void O2(InterfaceC6758Cn interfaceC6758Cn) {
    }

    @Override // Oc.V
    public final boolean R() {
        return false;
    }

    @Override // Oc.V
    public final synchronized void T6(InterfaceC6883Gf interfaceC6883Gf) {
        com.google.android.gms.common.internal.r.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f68763b.o(interfaceC6883Gf);
    }

    @Override // Oc.V
    public final void V4(InterfaceC9847vc interfaceC9847vc) {
    }

    @Override // Oc.V
    public final void W4(C4384c1 c4384c1) {
    }

    @Override // Oc.V
    public final synchronized boolean W7(Oc.Y1 y12) throws RemoteException {
        D9(this.f68766e);
        return E9(y12);
    }

    @Override // Oc.V
    public final void X1(InterfaceC6860Fn interfaceC6860Fn, String str) {
    }

    @Override // Oc.V
    public final void Y1(InterfaceC7200Po interfaceC7200Po) {
    }

    @Override // Oc.V
    public final synchronized void a9(C4413m0 c4413m0) {
        com.google.android.gms.common.internal.r.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f68767f.v(c4413m0);
    }

    @Override // Oc.V
    public final void d4(InterfaceC4422p0 interfaceC4422p0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // Oc.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8679kg.f76531g     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77087Za     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            Sc.a r0 = r3.f68768g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f34481c     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f77143db     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L38
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
            com.google.android.gms.internal.ads.my r0 = r3.f68770i     // Catch: java.lang.Throwable -> L38
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

    @Override // Oc.V
    public final void o() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // Oc.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void r() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8679kg.f76532h     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77059Xa     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            Sc.a r0 = r3.f68768g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f34481c     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f77143db     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L38
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
            com.google.android.gms.internal.ads.my r0 = r3.f68770i     // Catch: java.lang.Throwable -> L38
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

    @Override // Oc.V
    public final synchronized boolean r0() {
        return this.f68763b.zza();
    }

    @Override // Oc.V
    public final synchronized void u1(Oc.d2 d2Var) {
        com.google.android.gms.common.internal.r.e("setAdSize must be called on the main UI thread.");
        this.f68767f.O(d2Var);
        this.f68766e = d2Var;
        AbstractC8929my abstractC8929my = this.f68770i;
        if (abstractC8929my != null) {
            abstractC8929my.p(this.f68763b.b(), d2Var);
        }
    }

    @Override // Oc.V
    public final synchronized void v() {
        com.google.android.gms.common.internal.r.e("recordManualImpression must be called on the main UI thread.");
        AbstractC8929my abstractC8929my = this.f68770i;
        if (abstractC8929my != null) {
            abstractC8929my.o();
        }
    }

    @Override // Oc.V
    public final synchronized void v9(boolean z10) {
        try {
            if (F9()) {
                com.google.android.gms.common.internal.r.e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f68767f.b(z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Oc.V
    public final void y8(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9067oD
    public final synchronized void zza() {
        try {
            if (!this.f68763b.r()) {
                this.f68763b.k();
                return;
            }
            Oc.d2 d2VarD = this.f68767f.D();
            AbstractC8929my abstractC8929my = this.f68770i;
            if (abstractC8929my != null && abstractC8929my.n() != null && this.f68767f.t()) {
                d2VarD = A60.a(this.f68762a, Collections.singletonList(this.f68770i.n()));
            }
            D9(d2VarD);
            this.f68767f.T(true);
            try {
                E9(this.f68767f.B());
            } catch (RemoteException unused) {
                Sc.p.g("Failed to refresh the banner ad.");
            }
            this.f68767f.T(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9067oD
    public final synchronized void zzb() throws ExecutionException, InterruptedException {
        if (this.f68763b.r()) {
            this.f68763b.p();
        } else {
            this.f68763b.l();
        }
    }

    @Override // Oc.V
    public final synchronized Oc.d2 zzg() {
        com.google.android.gms.common.internal.r.e("getAdSize must be called on the main UI thread.");
        AbstractC8929my abstractC8929my = this.f68770i;
        if (abstractC8929my != null) {
            return A60.a(this.f68762a, Collections.singletonList(abstractC8929my.m()));
        }
        return this.f68767f.D();
    }

    @Override // Oc.V
    public final synchronized Oc.U0 zzk() {
        AbstractC8929my abstractC8929my;
        if (((Boolean) Oc.A.c().a(C8784lf.f76761C6)).booleanValue() && (abstractC8929my = this.f68770i) != null) {
            return abstractC8929my.c();
        }
        return null;
    }

    @Override // Oc.V
    public final synchronized Oc.Y0 zzl() {
        com.google.android.gms.common.internal.r.e("getVideoController must be called from the main thread.");
        AbstractC8929my abstractC8929my = this.f68770i;
        if (abstractC8929my == null) {
            return null;
        }
        return abstractC8929my.l();
    }

    @Override // Oc.V
    public final synchronized String zzr() {
        return this.f68764c;
    }

    @Override // Oc.V
    public final synchronized String zzs() {
        AbstractC8929my abstractC8929my = this.f68770i;
        if (abstractC8929my == null || abstractC8929my.c() == null) {
            return null;
        }
        return abstractC8929my.c().zzg();
    }

    @Override // Oc.V
    public final synchronized String zzt() {
        AbstractC8929my abstractC8929my = this.f68770i;
        if (abstractC8929my == null || abstractC8929my.c() == null) {
            return null;
        }
        return abstractC8929my.c().zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // Oc.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8679kg.f76529e     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77073Ya     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            Sc.a r0 = r3.f68768g     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f34481c     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f77143db     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L38
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
            com.google.android.gms.internal.ads.my r0 = r3.f68770i     // Catch: java.lang.Throwable -> L38
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
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8679kg.f76530f
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77115bb
            com.google.android.gms.internal.ads.jf r3 = Oc.A.c()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            Sc.a r3 = r6.f68768g
            int r3 = r3.f34481c
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.C8784lf.f77129cb
            com.google.android.gms.internal.ads.jf r5 = Oc.A.c()
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

    @Override // Oc.V
    public final void S6(InterfaceC4377a0 interfaceC4377a0) {
        com.google.android.gms.common.internal.r.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // Oc.V
    public final Bundle zzd() {
        com.google.android.gms.common.internal.r.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // Oc.V
    public final Oc.H zzi() {
        return this.f68765d.a();
    }

    @Override // Oc.V
    public final InterfaceC4401i0 zzj() {
        return this.f68765d.q();
    }

    public JW(Context context, Oc.d2 d2Var, String str, C8303h40 c8303h40, C8024eX c8024eX, Sc.a aVar, C9937wN c9937wN) {
        this.f68762a = context;
        this.f68763b = c8303h40;
        this.f68766e = d2Var;
        this.f68764c = str;
        this.f68765d = c8024eX;
        this.f68767f = c8303h40.e();
        this.f68768g = aVar;
        this.f68769h = c9937wN;
        c8303h40.n(this);
    }

    @Override // Oc.V
    public final void D3(Oc.N0 n02) {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!n02.zzf()) {
                this.f68769h.e();
            }
        } catch (RemoteException e10) {
            Sc.p.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f68765d.N(n02);
    }

    @Override // Oc.V
    public final void J2(Oc.E e10) {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("setAdListener must be called on the main UI thread.");
        }
        this.f68763b.m(e10);
    }

    @Override // Oc.V
    public final void n9(Oc.H h10) {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("setAdListener must be called on the main UI thread.");
        }
        this.f68765d.J(h10);
    }

    @Override // Oc.V
    public final void o9(InterfaceC4401i0 interfaceC4401i0) {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("setAppEventListener must be called on the main UI thread.");
        }
        this.f68765d.g0(interfaceC4401i0);
    }

    @Override // Oc.V
    public final com.google.android.gms.dynamic.b zzn() {
        if (F9()) {
            com.google.android.gms.common.internal.r.e("getAdFrame must be called on the main UI thread.");
        }
        return com.google.android.gms.dynamic.d.I2(this.f68763b.b());
    }
}
