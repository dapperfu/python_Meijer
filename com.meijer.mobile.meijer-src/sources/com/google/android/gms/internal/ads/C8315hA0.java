package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.hA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8315hA0 {

    /* renamed from: a, reason: collision with root package name */
    public final C7578aF0 f75457a;

    /* renamed from: b, reason: collision with root package name */
    public final long f75458b;

    /* renamed from: c, reason: collision with root package name */
    public final long f75459c;

    /* renamed from: d, reason: collision with root package name */
    public final long f75460d;

    /* renamed from: e, reason: collision with root package name */
    public final long f75461e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f75462f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f75463g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f75464h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f75465i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8315hA0.class == obj.getClass()) {
            C8315hA0 c8315hA0 = (C8315hA0) obj;
            if (this.f75458b == c8315hA0.f75458b && this.f75459c == c8315hA0.f75459c && this.f75460d == c8315hA0.f75460d && this.f75461e == c8315hA0.f75461e && this.f75463g == c8315hA0.f75463g && this.f75464h == c8315hA0.f75464h && this.f75465i == c8315hA0.f75465i && Objects.equals(this.f75457a, c8315hA0.f75457a)) {
                return true;
            }
        }
        return false;
    }

    public final C8315hA0 a(long j10) {
        return j10 == this.f75459c ? this : new C8315hA0(this.f75457a, this.f75458b, j10, this.f75460d, this.f75461e, false, this.f75463g, this.f75464h, this.f75465i);
    }

    public final C8315hA0 b(long j10) {
        return j10 == this.f75458b ? this : new C8315hA0(this.f75457a, j10, this.f75459c, this.f75460d, this.f75461e, false, this.f75463g, this.f75464h, this.f75465i);
    }

    public final int hashCode() {
        int iHashCode = this.f75457a.hashCode() + 527;
        long j10 = this.f75461e;
        long j11 = this.f75460d;
        return (((((((((((((iHashCode * 31) + ((int) this.f75458b)) * 31) + ((int) this.f75459c)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 961) + (this.f75463g ? 1 : 0)) * 31) + (this.f75464h ? 1 : 0)) * 31) + (this.f75465i ? 1 : 0);
    }

    C8315hA0(C7578aF0 c7578aF0, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15 = true;
        if (!z13 || z11) {
            z14 = true;
        } else {
            z14 = false;
        }
        C8211gC.d(z14);
        if (z12 && !z11) {
            z15 = false;
        }
        C8211gC.d(z15);
        this.f75457a = c7578aF0;
        this.f75458b = j10;
        this.f75459c = j11;
        this.f75460d = j12;
        this.f75461e = j13;
        this.f75462f = false;
        this.f75463g = z11;
        this.f75464h = z12;
        this.f75465i = z13;
    }
}
