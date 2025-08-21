package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes6.dex */
public final class EC0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f67208a;

    /* renamed from: b, reason: collision with root package name */
    private final FC0 f67209b;

    public final void a(final Exception exc) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80551a.j(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.yC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81016a.k(exc);
                }
            });
        }
    }

    public final void c(final GC0 gc0) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79869a.l(gc0);
                }
            });
        }
    }

    public final void d(final GC0 gc0) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80293a.m(gc0);
                }
            });
        }
    }

    public final void e(final String str, final long j10, final long j11) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.CC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66577a.n(str, j10, j11);
                }
            });
        }
    }

    public final void f(final String str) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.DC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67028a.o(str);
                }
            });
        }
    }

    public final void h(final My0 my0) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78802a.q(my0);
                }
            });
        }
    }

    public final void i(final C c10, final Ny0 ny0) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.AC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65933a.r(c10, ny0);
                }
            });
        }
    }

    final /* synthetic */ void j(Exception exc) {
        int i10 = OV.f69931a;
        this.f67209b.a(exc);
    }

    final /* synthetic */ void k(Exception exc) {
        int i10 = OV.f69931a;
        this.f67209b.e(exc);
    }

    final /* synthetic */ void l(GC0 gc0) {
        int i10 = OV.f69931a;
        this.f67209b.c(gc0);
    }

    final /* synthetic */ void m(GC0 gc0) {
        int i10 = OV.f69931a;
        this.f67209b.b(gc0);
    }

    final /* synthetic */ void n(String str, long j10, long j11) {
        int i10 = OV.f69931a;
        this.f67209b.h(str, j10, j11);
    }

    final /* synthetic */ void o(String str) {
        int i10 = OV.f69931a;
        this.f67209b.p(str);
    }

    final /* synthetic */ void q(My0 my0) {
        int i10 = OV.f69931a;
        this.f67209b.f(my0);
    }

    final /* synthetic */ void r(C c10, Ny0 ny0) {
        int i10 = OV.f69931a;
        this.f67209b.i(c10, ny0);
    }

    final /* synthetic */ void s(long j10) {
        int i10 = OV.f69931a;
        this.f67209b.zzg(j10);
    }

    final /* synthetic */ void t(boolean z10) {
        int i10 = OV.f69931a;
        this.f67209b.q(z10);
    }

    final /* synthetic */ void u(int i10, long j10, long j11) {
        int i11 = OV.f69931a;
        this.f67209b.d(i10, j10, j11);
    }

    public final void v(final long j10) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.tC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79352a.s(j10);
                }
            });
        }
    }

    public final void w(final boolean z10) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.BC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66325a.t(z10);
                }
            });
        }
    }

    public final void x(final int i10, final long j10, final long j11) {
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.uC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79602a.u(i10, j10, j11);
                }
            });
        }
    }

    public EC0(Handler handler, FC0 fc0) {
        this.f67208a = fc0 == null ? null : handler;
        this.f67209b = fc0;
    }

    public final void g(final My0 my0) {
        my0.a();
        Handler handler = this.f67208a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sC0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79025a.p(my0);
                }
            });
        }
    }

    final /* synthetic */ void p(My0 my0) {
        my0.a();
        int i10 = OV.f69931a;
        this.f67209b.g(my0);
    }
}
