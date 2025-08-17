package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.hA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8190hA0 {

    /* renamed from: a, reason: collision with root package name */
    public final C7453aF0 f74617a;

    /* renamed from: b, reason: collision with root package name */
    public final long f74618b;

    /* renamed from: c, reason: collision with root package name */
    public final long f74619c;

    /* renamed from: d, reason: collision with root package name */
    public final long f74620d;

    /* renamed from: e, reason: collision with root package name */
    public final long f74621e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f74622f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f74623g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f74624h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f74625i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8190hA0.class == obj.getClass()) {
            C8190hA0 c8190hA0 = (C8190hA0) obj;
            if (this.f74618b == c8190hA0.f74618b && this.f74619c == c8190hA0.f74619c && this.f74620d == c8190hA0.f74620d && this.f74621e == c8190hA0.f74621e && this.f74623g == c8190hA0.f74623g && this.f74624h == c8190hA0.f74624h && this.f74625i == c8190hA0.f74625i && Objects.equals(this.f74617a, c8190hA0.f74617a)) {
                return true;
            }
        }
        return false;
    }

    public final C8190hA0 a(long j10) {
        return j10 == this.f74619c ? this : new C8190hA0(this.f74617a, this.f74618b, j10, this.f74620d, this.f74621e, false, this.f74623g, this.f74624h, this.f74625i);
    }

    public final C8190hA0 b(long j10) {
        return j10 == this.f74618b ? this : new C8190hA0(this.f74617a, j10, this.f74619c, this.f74620d, this.f74621e, false, this.f74623g, this.f74624h, this.f74625i);
    }

    public final int hashCode() {
        int iHashCode = this.f74617a.hashCode() + 527;
        long j10 = this.f74621e;
        long j11 = this.f74620d;
        return (((((((((((((iHashCode * 31) + ((int) this.f74618b)) * 31) + ((int) this.f74619c)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 961) + (this.f74623g ? 1 : 0)) * 31) + (this.f74624h ? 1 : 0)) * 31) + (this.f74625i ? 1 : 0);
    }

    C8190hA0(C7453aF0 c7453aF0, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15 = true;
        if (!z13 || z11) {
            z14 = true;
        } else {
            z14 = false;
        }
        C8086gC.d(z14);
        if (z12 && !z11) {
            z15 = false;
        }
        C8086gC.d(z15);
        this.f74617a = c7453aF0;
        this.f74618b = j10;
        this.f74619c = j11;
        this.f74620d = j12;
        this.f74621e = j13;
        this.f74622f = false;
        this.f74623g = z11;
        this.f74624h = z12;
        this.f74625i = z13;
    }
}
