package com.google.android.gms.internal.ads;

import Mc.C4106c1;
import Mc.C4135m0;
import Mc.InterfaceC4099a0;
import Mc.InterfaceC4123i0;
import Mc.InterfaceC4144p0;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.a40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7431a40 extends Mc.U implements Oc.p, InterfaceC8546kc {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9010ou f72338a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f72339b;

    /* renamed from: d, reason: collision with root package name */
    private final String f72341d;

    /* renamed from: e, reason: collision with root package name */
    private final U30 f72342e;

    /* renamed from: f, reason: collision with root package name */
    private final S30 f72343f;

    /* renamed from: g, reason: collision with root package name */
    private final Qc.a f72344g;

    /* renamed from: h, reason: collision with root package name */
    private final C9812wN f72345h;

    /* renamed from: j, reason: collision with root package name */
    private C7152Rx f72347j;

    /* renamed from: k, reason: collision with root package name */
    protected C8164gy f72348k;

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f72340c = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private long f72346i = -1;

    private final synchronized void z0(int i10) {
        try {
            if (this.f72340c.compareAndSet(false, true)) {
                this.f72343f.q();
                C7152Rx c7152Rx = this.f72347j;
                if (c7152Rx != null) {
                    Lc.v.e().e(c7152Rx);
                }
                if (this.f72348k != null) {
                    long jC = -1;
                    if (this.f72346i != -1) {
                        jC = Lc.v.c().c() - this.f72346i;
                    }
                    this.f72348k.l(jC, i10);
                }
                zzx();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Oc.p
    public final synchronized void A1() {
        C8164gy c8164gy = this.f72348k;
        if (c8164gy != null) {
            c8164gy.l(Lc.v.c().c() - this.f72346i, 1);
        }
    }

    @Override // Mc.V
    public final void B4(Mc.N0 n02) {
    }

    @Override // Mc.V
    public final void E8(boolean z10) {
    }

    @Override // Oc.p
    public final synchronized void F2() {
        if (this.f72348k != null) {
            this.f72346i = Lc.v.c().c();
            int i10 = this.f72348k.i();
            if (i10 > 0) {
                C7152Rx c7152Rx = new C7152Rx(this.f72338a.e(), Lc.v.c());
                this.f72347j = c7152Rx;
                c7152Rx.d(i10, new Runnable() { // from class: com.google.android.gms.internal.ads.X30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f71236a.zzp();
                    }
                });
            }
        }
    }

    @Override // Mc.V
    public final synchronized boolean G() {
        return false;
    }

    @Override // Mc.V
    public final synchronized void G6(InterfaceC6758Gf interfaceC6758Gf) {
    }

    @Override // Mc.V
    public final void G7(InterfaceC4123i0 interfaceC4123i0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // Mc.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean H4(Mc.Y1 r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.T()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8554kg.f75688d     // Catch: java.lang.Throwable -> L2d
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
            goto L91
        L2f:
            Qc.a r2 = r5.f72344g     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.f72339b     // Catch: java.lang.Throwable -> L2d
            boolean r0 = Pc.D0.i(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6e
            Mc.X r0 = r6.f19185s     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5c
            goto L6e
        L5c:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            Qc.p.d(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.S30 r6 = r5.f72343f     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            Mc.W0 r0 = com.google.android.gms.internal.ads.V60.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.g0(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L6e:
            boolean r0 = r5.q0()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L76
            monitor-exit(r5)
            return r1
        L76:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.f72340c = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Y30 r0 = new com.google.android.gms.internal.ads.Y30     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.U30 r1 = r5.f72342e     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.f72341d     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.Z30 r3 = new com.google.android.gms.internal.ads.Z30     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L91:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC7431a40.H4(Mc.Y1):boolean");
    }

    @Override // Mc.V
    public final void I2(InterfaceC6633Cn interfaceC6633Cn) {
    }

    @Override // Mc.V
    public final synchronized void L6(Mc.R1 r12) {
    }

    @Override // Mc.V
    public final void N1(Mc.E e10) {
    }

    @Override // Mc.V
    public final synchronized void O7(Mc.d2 d2Var) {
        com.google.android.gms.common.internal.r.e("setAdSize must be called on the main UI thread.");
    }

    @Override // Mc.V
    public final boolean R() {
        return false;
    }

    @Override // Mc.V
    public final synchronized void R1(C4135m0 c4135m0) {
    }

    @Override // Mc.V
    public final void R4(InterfaceC4144p0 interfaceC4144p0) {
    }

    @Override // Mc.V
    public final void V1(InterfaceC6735Fn interfaceC6735Fn, String str) {
    }

    @Override // Oc.p
    public final void W5() {
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

    @Override // Oc.p
    public final void b2() {
    }

    @Override // Mc.V
    public final void c7(InterfaceC4099a0 interfaceC4099a0) {
    }

    @Override // Oc.p
    public final void d7() {
    }

    @Override // Mc.V
    public final synchronized void j() {
        com.google.android.gms.common.internal.r.e("pause must be called on the main UI thread.");
    }

    @Override // Mc.V
    public final synchronized void o() {
    }

    @Override // Mc.V
    public final synchronized boolean q0() {
        return this.f72342e.zza();
    }

    @Override // Mc.V
    public final synchronized void r() {
        com.google.android.gms.common.internal.r.e("resume must be called on the main UI thread.");
    }

    @Override // Mc.V
    public final void s8(Mc.H h10) {
    }

    @Override // Mc.V
    public final void u5(String str) {
    }

    @Override // Mc.V
    public final void u6(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // Mc.V
    public final synchronized void v() {
    }

    @Override // Mc.V
    public final void w6(String str) {
    }

    @Override // Mc.V
    public final synchronized void w9(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8546kc
    public final void zza() {
        z0(3);
    }

    @Override // Mc.V
    public final synchronized Mc.d2 zzg() {
        return null;
    }

    @Override // Mc.V
    public final Mc.H zzi() {
        return null;
    }

    @Override // Mc.V
    public final InterfaceC4123i0 zzj() {
        return null;
    }

    @Override // Mc.V
    public final synchronized Mc.U0 zzk() {
        return null;
    }

    @Override // Mc.V
    public final synchronized Mc.Y0 zzl() {
        return null;
    }

    @Override // Mc.V
    public final com.google.android.gms.dynamic.b zzn() {
        return null;
    }

    final /* synthetic */ void zzo() {
        z0(5);
    }

    @Override // Mc.V
    public final synchronized String zzr() {
        return this.f72341d;
    }

    @Override // Mc.V
    public final synchronized String zzs() {
        return null;
    }

    @Override // Mc.V
    public final synchronized String zzt() {
        return null;
    }

    @Override // Mc.V
    public final synchronized void zzx() {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        C8164gy c8164gy = this.f72348k;
        if (c8164gy != null) {
            c8164gy.a();
        }
    }

    @Override // Mc.V
    public final void K4(InterfaceC9722vc interfaceC9722vc) {
        this.f72343f.J(interfaceC9722vc);
    }

    @Override // Oc.p
    public final void N3(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            z0(2);
            return;
        }
        if (i11 == 1) {
            z0(4);
        } else if (i11 != 2) {
            z0(6);
        } else {
            z0(3);
        }
    }

    @Override // Mc.V
    public final void R6(Mc.j2 j2Var) {
        this.f72342e.k(j2Var);
    }

    @Override // Mc.V
    public final Bundle zzd() {
        return new Bundle();
    }

    public final void zzp() {
        this.f72338a.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.W30
            @Override // java.lang.Runnable
            public final void run() {
                this.f70999a.zzo();
            }
        });
    }

    public BinderC7431a40(AbstractC9010ou abstractC9010ou, Context context, String str, U30 u30, S30 s30, Qc.a aVar, C9812wN c9812wN) {
        this.f72338a = abstractC9010ou;
        this.f72339b = context;
        this.f72341d = str;
        this.f72342e = u30;
        this.f72343f = s30;
        this.f72344g = aVar;
        this.f72345h = c9812wN;
        s30.v(this);
    }
}
