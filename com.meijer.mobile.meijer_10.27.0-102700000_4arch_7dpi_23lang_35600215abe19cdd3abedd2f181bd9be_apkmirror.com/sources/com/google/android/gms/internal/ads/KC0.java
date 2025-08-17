package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes6.dex */
final class KC0 {

    /* renamed from: a, reason: collision with root package name */
    private final JC0 f68057a;

    /* renamed from: b, reason: collision with root package name */
    private int f68058b;

    /* renamed from: c, reason: collision with root package name */
    private long f68059c;

    /* renamed from: d, reason: collision with root package name */
    private long f68060d;

    /* renamed from: e, reason: collision with root package name */
    private long f68061e;

    /* renamed from: f, reason: collision with root package name */
    private long f68062f;

    public final long a() {
        return this.f68057a.a();
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.f68058b == 2;
    }

    private final void h(int i10) {
        this.f68058b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f68061e = 0L;
            this.f68062f = -1L;
            this.f68059c = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.f68060d = 10000L;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.f68060d = j10;
    }

    public final long b() {
        return this.f68057a.b();
    }

    public final void c() {
        if (this.f68058b == 4) {
            h(0);
        }
    }

    public final boolean g(long j10) {
        if (j10 - this.f68061e < this.f68060d) {
            return false;
        }
        this.f68061e = j10;
        boolean zC = this.f68057a.c();
        int i10 = this.f68058b;
        if (i10 == 0) {
            if (!zC) {
                if (j10 - this.f68059c <= 500000) {
                    return false;
                }
                h(3);
                return false;
            }
            if (this.f68057a.b() < this.f68059c) {
                return false;
            }
            this.f68062f = this.f68057a.a();
            h(1);
            return true;
        }
        if (i10 == 1) {
            if (!zC) {
                h(0);
                return false;
            }
            if (this.f68057a.a() <= this.f68062f) {
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
        this.f68057a = new JC0(audioTrack);
        h(0);
    }
}
