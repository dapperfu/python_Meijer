package com.google.android.gms.internal.ads;

import Oc.C4384c1;
import Oc.C4413m0;
import Oc.InterfaceC4377a0;
import Oc.InterfaceC4401i0;
import Oc.InterfaceC4422p0;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.a40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7556a40 extends Oc.U implements Qc.p, InterfaceC8671kc {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9135ou f73178a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f73179b;

    /* renamed from: d, reason: collision with root package name */
    private final String f73181d;

    /* renamed from: e, reason: collision with root package name */
    private final U30 f73182e;

    /* renamed from: f, reason: collision with root package name */
    private final S30 f73183f;

    /* renamed from: g, reason: collision with root package name */
    private final Sc.a f73184g;

    /* renamed from: h, reason: collision with root package name */
    private final C9937wN f73185h;

    /* renamed from: j, reason: collision with root package name */
    private C7277Rx f73187j;

    /* renamed from: k, reason: collision with root package name */
    protected C8289gy f73188k;

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f73180c = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private long f73186i = -1;

    private final synchronized void C0(int i10) {
        try {
            if (this.f73180c.compareAndSet(false, true)) {
                this.f73183f.q();
                C7277Rx c7277Rx = this.f73187j;
                if (c7277Rx != null) {
                    Nc.v.e().e(c7277Rx);
                }
                if (this.f73188k != null) {
                    long jC = -1;
                    if (this.f73186i != -1) {
                        jC = Nc.v.c().c() - this.f73186i;
                    }
                    this.f73188k.l(jC, i10);
                }
                zzx();
            }
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
    }

    @Override // Oc.V
    public final void D3(Oc.N0 n02) {
    }

    @Override // Oc.V
    public final synchronized boolean G() {
        return false;
    }

    @Override // Qc.p
    public final synchronized void I2() {
        if (this.f73188k != null) {
            this.f73186i = Nc.v.c().c();
            int i10 = this.f73188k.i();
            if (i10 > 0) {
                C7277Rx c7277Rx = new C7277Rx(this.f73178a.e(), Nc.v.c());
                this.f73187j = c7277Rx;
                c7277Rx.d(i10, new Runnable() { // from class: com.google.android.gms.internal.ads.X30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f72076a.zzp();
                    }
                });
            }
        }
    }

    @Override // Oc.V
    public final void J2(Oc.E e10) {
    }

    @Override // Oc.V
    public final void J6(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // Qc.p
    public final synchronized void K1() {
        C8289gy c8289gy = this.f73188k;
        if (c8289gy != null) {
            c8289gy.l(Nc.v.c().c() - this.f73186i, 1);
        }
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
    public final void S6(InterfaceC4377a0 interfaceC4377a0) {
    }

    @Override // Oc.V
    public final synchronized void T6(InterfaceC6883Gf interfaceC6883Gf) {
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
    public final synchronized boolean W7(Oc.Y1 r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.T()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8679kg.f76528d     // Catch: java.lang.Throwable -> L2d
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
            goto L91
        L2f:
            Sc.a r2 = r5.f73184g     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.f73179b     // Catch: java.lang.Throwable -> L2d
            boolean r0 = Rc.D0.i(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6e
            Oc.X r0 = r6.f23372s     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5c
            goto L6e
        L5c:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            Sc.p.d(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.S30 r6 = r5.f73183f     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            Oc.W0 r0 = com.google.android.gms.internal.ads.V60.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.C(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L6e:
            boolean r0 = r5.r0()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L76
            monitor-exit(r5)
            return r1
        L76:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.f73180c = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Y30 r0 = new com.google.android.gms.internal.ads.Y30     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.U30 r1 = r5.f73182e     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.f73181d     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Z30 r3 = new com.google.android.gms.internal.ads.Z30     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L91:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC7556a40.W7(Oc.Y1):boolean");
    }

    @Override // Oc.V
    public final void X1(InterfaceC6860Fn interfaceC6860Fn, String str) {
    }

    @Override // Oc.V
    public final void Y1(InterfaceC7200Po interfaceC7200Po) {
    }

    @Override // Oc.V
    public final synchronized void a9(C4413m0 c4413m0) {
    }

    @Override // Qc.p
    public final void c2() {
    }

    @Override // Oc.V
    public final void d4(InterfaceC4422p0 interfaceC4422p0) {
    }

    @Override // Oc.V
    public final synchronized void j() {
        com.google.android.gms.common.internal.r.e("pause must be called on the main UI thread.");
    }

    @Override // Qc.p
    public final void m6() {
    }

    @Override // Oc.V
    public final void n9(Oc.H h10) {
    }

    @Override // Oc.V
    public final synchronized void o() {
    }

    @Override // Qc.p
    public final void o7() {
    }

    @Override // Oc.V
    public final void o9(InterfaceC4401i0 interfaceC4401i0) {
    }

    @Override // Oc.V
    public final synchronized void r() {
        com.google.android.gms.common.internal.r.e("resume must be called on the main UI thread.");
    }

    @Override // Oc.V
    public final synchronized boolean r0() {
        return this.f73182e.zza();
    }

    @Override // Oc.V
    public final synchronized void u1(Oc.d2 d2Var) {
        com.google.android.gms.common.internal.r.e("setAdSize must be called on the main UI thread.");
    }

    @Override // Oc.V
    public final synchronized void v() {
    }

    @Override // Oc.V
    public final synchronized void v9(boolean z10) {
    }

    @Override // Oc.V
    public final void y8(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8671kc
    public final void zza() {
        C0(3);
    }

    @Override // Oc.V
    public final synchronized Oc.d2 zzg() {
        return null;
    }

    @Override // Oc.V
    public final Oc.H zzi() {
        return null;
    }

    @Override // Oc.V
    public final InterfaceC4401i0 zzj() {
        return null;
    }

    @Override // Oc.V
    public final synchronized Oc.U0 zzk() {
        return null;
    }

    @Override // Oc.V
    public final synchronized Oc.Y0 zzl() {
        return null;
    }

    @Override // Oc.V
    public final com.google.android.gms.dynamic.b zzn() {
        return null;
    }

    final /* synthetic */ void zzo() {
        C0(5);
    }

    @Override // Oc.V
    public final synchronized String zzr() {
        return this.f73181d;
    }

    @Override // Oc.V
    public final synchronized String zzs() {
        return null;
    }

    @Override // Oc.V
    public final synchronized String zzt() {
        return null;
    }

    @Override // Oc.V
    public final synchronized void zzx() {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        C8289gy c8289gy = this.f73188k;
        if (c8289gy != null) {
            c8289gy.a();
        }
    }

    @Override // Oc.V
    public final void G5(Oc.j2 j2Var) {
        this.f73182e.k(j2Var);
    }

    @Override // Oc.V
    public final void V4(InterfaceC9847vc interfaceC9847vc) {
        this.f73183f.L(interfaceC9847vc);
    }

    @Override // Qc.p
    public final void Z3(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            C0(2);
            return;
        }
        if (i11 == 1) {
            C0(4);
        } else if (i11 != 2) {
            C0(6);
        } else {
            C0(3);
        }
    }

    @Override // Oc.V
    public final Bundle zzd() {
        return new Bundle();
    }

    public final void zzp() {
        this.f73178a.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.W30
            @Override // java.lang.Runnable
            public final void run() {
                this.f71839a.zzo();
            }
        });
    }

    public BinderC7556a40(AbstractC9135ou abstractC9135ou, Context context, String str, U30 u30, S30 s30, Sc.a aVar, C9937wN c9937wN) {
        this.f73178a = abstractC9135ou;
        this.f73179b = context;
        this.f73181d = str;
        this.f73182e = u30;
        this.f73183f = s30;
        this.f73184g = aVar;
        this.f73185h = c9937wN;
        s30.v(this);
    }
}
