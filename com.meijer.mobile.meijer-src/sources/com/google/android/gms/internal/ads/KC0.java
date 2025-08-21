package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes6.dex */
final class KC0 {

    /* renamed from: a, reason: collision with root package name */
    private final JC0 f68897a;

    /* renamed from: b, reason: collision with root package name */
    private int f68898b;

    /* renamed from: c, reason: collision with root package name */
    private long f68899c;

    /* renamed from: d, reason: collision with root package name */
    private long f68900d;

    /* renamed from: e, reason: collision with root package name */
    private long f68901e;

    /* renamed from: f, reason: collision with root package name */
    private long f68902f;

    public final long a() {
        return this.f68897a.a();
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.f68898b == 2;
    }

    private final void h(int i10) {
        this.f68898b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f68901e = 0L;
            this.f68902f = -1L;
            this.f68899c = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.f68900d = 10000L;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.f68900d = j10;
    }

    public final long b() {
        return this.f68897a.b();
    }

    public final void c() {
        if (this.f68898b == 4) {
            h(0);
        }
    }

    public final boolean g(long j10) {
        if (j10 - this.f68901e < this.f68900d) {
            return false;
        }
        this.f68901e = j10;
        boolean zC = this.f68897a.c();
        int i10 = this.f68898b;
        if (i10 == 0) {
            if (!zC) {
                if (j10 - this.f68899c <= 500000) {
                    return false;
                }
                h(3);
                return false;
            }
            if (this.f68897a.b() < this.f68899c) {
                return false;
            }
            this.f68902f = this.f68897a.a();
            h(1);
            return true;
        }
        if (i10 == 1) {
            if (!zC) {
                h(0);
                return false;
            }
            if (this.f68897a.a() <= this.f68902f) {
                return true;
            }
            h(2);
            return true;
        }
        if (i10 == 2) {
            if (zC) {
                return true;
            }
            h(0);
            return false;
        }
        if (i10 != 3) {
            return zC;
        }
        if (!zC) {
            return false;
        }
        h(0);
        return true;
    }

    public KC0(AudioTrack audioTrack) {
        this.f68897a = new JC0(audioTrack);
        h(0);
    }
}
