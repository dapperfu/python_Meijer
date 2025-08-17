package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f66312a;

    /* renamed from: b, reason: collision with root package name */
    private final F f66313b;

    public final void a(final String str, final long j10, final long j11) {
        Handler handler = this.f66312a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78460a.g(str, j10, j11);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.f66312a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66097a.h(str);
                }
            });
        }
    }

    public final void d(final int i10, final long j10) {
        Handler handler = this.f66312a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78963a.j(i10, j10);
                }
            });
        }
    }

    public final void e(final My0 my0) {
        Handler handler = this.f66312a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80320a.k(my0);
                }
            });
        }
    }

    public final void f(final C c10, final Ny0 ny0) {
        Handler handler = this.f66312a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65036a.l(c10, ny0);
                }
            });
        }
    }

    final /* synthetic */ void g(String str, long j10, long j11) {
        int i10 = OV.f69091a;
        this.f66313b.v0(str, j10, j11);
    }

    final /* synthetic */ void h(String str) {
        int i10 = OV.f69091a;
        this.f66313b.p0(str);
    }

    final /* synthetic */ void j(int i10, long j10) {
        int i11 = OV.f69091a;
        this.f66313b.q0(i10, j10);
    }

    final /* synthetic */ void k(My0 my0) {
        int i10 = OV.f69091a;
        this.f66313b.r0(my0);
    }

    final /* synthetic */ void l(C c10, Ny0 ny0) {
        int i10 = OV.f69091a;
        this.f66313b.y0(c10, ny0);
    }

    final /* synthetic */ void m(Object obj, long j10) {
        int i10 = OV.f69091a;
        this.f66313b.w0(obj, j10);
    }

    final /* synthetic */ void n(long j10, int i10) {
        int i11 = OV.f69091a;
        this.f66313b.s0(j10, i10);
    }

    final /* synthetic */ void o(Exception exc) {
        int i10 = OV.f69091a;
        this.f66313b.x0(exc);
    }

    final /* synthetic */ void p(C9113ps c9113ps) {
        int i10 = OV.f69091a;
        this.f66313b.t0(c9113ps);
    }

    public final void q(final Object obj) {
        Handler handler = this.f66312a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79393a.m(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j10, final int i10) {
        Handler handler = this.f66312a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79627a.n(j10, i10);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.f66312a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79899a.o(exc);
                }
            });
        }
    }

    public final void t(final C9113ps c9113ps) {
        Handler handler = this.f66312a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78707a.p(c9113ps);
                }
            });
        }
    }

    public E(Handler handler, F f10) {
        this.f66312a = f10 == null ? null : handler;
        this.f66313b = f10;
    }

    public final void c(final My0 my0) {
        my0.a();
        Handler handler = this.f66312a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65387a.i(my0);
                }
            });
        }
    }

    final /* synthetic */ void i(My0 my0) {
        my0.a();
        int i10 = OV.f69091a;
        this.f66313b.u0(my0);
    }
}
