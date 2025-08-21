package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f67152a;

    /* renamed from: b, reason: collision with root package name */
    private final F f67153b;

    public final void a(final String str, final long j10, final long j11) {
        Handler handler = this.f67152a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79300a.g(str, j10, j11);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.f67152a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66937a.h(str);
                }
            });
        }
    }

    public final void d(final int i10, final long j10) {
        Handler handler = this.f67152a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79803a.j(i10, j10);
                }
            });
        }
    }

    public final void e(final My0 my0) {
        Handler handler = this.f67152a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81160a.k(my0);
                }
            });
        }
    }

    public final void f(final C c10, final Ny0 ny0) {
        Handler handler = this.f67152a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65876a.l(c10, ny0);
                }
            });
        }
    }

    final /* synthetic */ void g(String str, long j10, long j11) {
        int i10 = OV.f69931a;
        this.f67153b.w0(str, j10, j11);
    }

    final /* synthetic */ void h(String str) {
        int i10 = OV.f69931a;
        this.f67153b.q0(str);
    }

    final /* synthetic */ void j(int i10, long j10) {
        int i11 = OV.f69931a;
        this.f67153b.r0(i10, j10);
    }

    final /* synthetic */ void k(My0 my0) {
        int i10 = OV.f69931a;
        this.f67153b.s0(my0);
    }

    final /* synthetic */ void l(C c10, Ny0 ny0) {
        int i10 = OV.f69931a;
        this.f67153b.z0(c10, ny0);
    }

    final /* synthetic */ void m(Object obj, long j10) {
        int i10 = OV.f69931a;
        this.f67153b.x0(obj, j10);
    }

    final /* synthetic */ void n(long j10, int i10) {
        int i11 = OV.f69931a;
        this.f67153b.t0(j10, i10);
    }

    final /* synthetic */ void o(Exception exc) {
        int i10 = OV.f69931a;
        this.f67153b.y0(exc);
    }

    final /* synthetic */ void p(C9238ps c9238ps) {
        int i10 = OV.f69931a;
        this.f67153b.u0(c9238ps);
    }

    public final void q(final Object obj) {
        Handler handler = this.f67152a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80233a.m(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j10, final int i10) {
        Handler handler = this.f67152a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80467a.n(j10, i10);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.f67152a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80739a.o(exc);
                }
            });
        }
    }

    public final void t(final C9238ps c9238ps) {
        Handler handler = this.f67152a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79547a.p(c9238ps);
                }
            });
        }
    }

    public E(Handler handler, F f10) {
        this.f67152a = f10 == null ? null : handler;
        this.f67153b = f10;
    }

    public final void c(final My0 my0) {
        my0.a();
        Handler handler = this.f67152a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66227a.i(my0);
                }
            });
        }
    }

    final /* synthetic */ void i(My0 my0) {
        my0.a();
        int i10 = OV.f69931a;
        this.f67153b.v0(my0);
    }
}
