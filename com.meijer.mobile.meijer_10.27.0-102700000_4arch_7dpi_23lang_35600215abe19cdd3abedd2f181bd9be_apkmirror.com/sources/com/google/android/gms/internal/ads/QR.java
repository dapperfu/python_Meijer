package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class QR {

    /* renamed from: a, reason: collision with root package name */
    private long f69566a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f69567b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f69568c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f69569d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f69570e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f69571f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f69572g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f69573h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Object f69574i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final Object f69575j = new Object();

    public final synchronized long b() {
        long j10;
        synchronized (this.f69575j) {
            j10 = this.f69570e;
        }
        return j10;
    }

    public final synchronized long c() {
        long j10;
        synchronized (this.f69574i) {
            j10 = this.f69569d;
        }
        return j10;
    }

    public final synchronized long d() {
        long j10;
        synchronized (this.f69571f) {
            j10 = this.f69566a;
        }
        return j10;
    }

    public final synchronized void f(long j10) {
        synchronized (this.f69575j) {
            this.f69570e = j10;
        }
    }

    public final synchronized void g(long j10) {
        synchronized (this.f69574i) {
            this.f69569d = j10;
        }
    }

    public final synchronized void h(long j10) {
        synchronized (this.f69571f) {
            this.f69566a = j10;
        }
    }

    public final int a() {
        int i10;
        synchronized (this.f69572g) {
            i10 = this.f69567b;
        }
        return i10;
    }

    public final long e() {
        long j10;
        synchronized (this.f69573h) {
            j10 = this.f69568c;
        }
        return j10;
    }

    public final void i(int i10) {
        synchronized (this.f69572g) {
            this.f69567b = i10;
        }
    }

    public final void j(long j10) {
        synchronized (this.f69573h) {
            this.f69568c = j10;
        }
    }
}
