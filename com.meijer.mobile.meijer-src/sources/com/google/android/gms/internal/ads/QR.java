package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class QR {

    /* renamed from: a, reason: collision with root package name */
    private long f70406a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f70407b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f70408c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f70409d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f70410e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f70411f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f70412g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f70413h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Object f70414i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final Object f70415j = new Object();

    public final synchronized long b() {
        long j10;
        synchronized (this.f70415j) {
            j10 = this.f70410e;
        }
        return j10;
    }

    public final synchronized long c() {
        long j10;
        synchronized (this.f70414i) {
            j10 = this.f70409d;
        }
        return j10;
    }

    public final synchronized long d() {
        long j10;
        synchronized (this.f70411f) {
            j10 = this.f70406a;
        }
        return j10;
    }

    public final synchronized void f(long j10) {
        synchronized (this.f70415j) {
            this.f70410e = j10;
        }
    }

    public final synchronized void g(long j10) {
        synchronized (this.f70414i) {
            this.f70409d = j10;
        }
    }

    public final synchronized void h(long j10) {
        synchronized (this.f70411f) {
            this.f70406a = j10;
        }
    }

    public final int a() {
        int i10;
        synchronized (this.f70412g) {
            i10 = this.f70407b;
        }
        return i10;
    }

    public final long e() {
        long j10;
        synchronized (this.f70413h) {
            j10 = this.f70408c;
        }
        return j10;
    }

    public final void i(int i10) {
        synchronized (this.f70412g) {
            this.f70407b = i10;
        }
    }

    public final void j(long j10) {
        synchronized (this.f70413h) {
            this.f70408c = j10;
        }
    }
}
