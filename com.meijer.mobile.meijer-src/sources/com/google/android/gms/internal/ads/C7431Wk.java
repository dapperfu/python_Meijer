package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Wk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7431Wk {

    /* renamed from: a, reason: collision with root package name */
    public Object f71988a;

    /* renamed from: b, reason: collision with root package name */
    public Object f71989b;

    /* renamed from: c, reason: collision with root package name */
    public int f71990c;

    /* renamed from: d, reason: collision with root package name */
    public long f71991d;

    /* renamed from: e, reason: collision with root package name */
    public long f71992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f71993f;

    /* renamed from: g, reason: collision with root package name */
    public C8992nc f71994g = C8992nc.f77938e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final int c(long j10) {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7431Wk.class.equals(obj.getClass())) {
            C7431Wk c7431Wk = (C7431Wk) obj;
            if (Objects.equals(this.f71988a, c7431Wk.f71988a) && Objects.equals(this.f71989b, c7431Wk.f71989b) && this.f71990c == c7431Wk.f71990c && this.f71991d == c7431Wk.f71991d && this.f71993f == c7431Wk.f71993f && Objects.equals(this.f71994g, c7431Wk.f71994g)) {
                return true;
            }
        }
        return false;
    }

    public final C7431Wk i(Object obj, Object obj2, int i10, long j10, long j11, C8992nc c8992nc, boolean z10) {
        this.f71988a = obj;
        this.f71989b = obj2;
        this.f71990c = i10;
        this.f71991d = j10;
        this.f71992e = 0L;
        this.f71994g = c8992nc;
        this.f71993f = z10;
        return this;
    }

    public final int a(int i10) {
        return this.f71994g.a(i10).f73162b;
    }

    public final int b() {
        int i10 = this.f71994g.f77940a;
        return 0;
    }

    public final int d(long j10) {
        this.f71994g.b(-1);
        return -1;
    }

    public final int e(int i10) {
        return this.f71994g.a(i10).a(-1);
    }

    public final long f(int i10, int i11) {
        C7546a c7546aA = this.f71994g.a(i10);
        if (c7546aA.f73162b != -1) {
            return c7546aA.f73166f[i11];
        }
        return -9223372036854775807L;
    }

    public final long g(int i10) {
        long j10 = this.f71994g.a(i10).f73161a;
        return 0L;
    }

    public final long h() {
        long j10 = this.f71994g.f77941b;
        return 0L;
    }

    public final int hashCode() {
        Object obj = this.f71988a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f71989b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f71990c;
        long j10 = this.f71991d;
        return (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.f71993f ? 1 : 0)) * 31) + this.f71994g.hashCode();
    }

    public final boolean k(int i10) {
        boolean z10 = this.f71994g.a(i10).f73168h;
        return false;
    }

    public final boolean j(int i10) {
        b();
        if (i10 == -1) {
            this.f71994g.b(-1);
            return false;
        }
        return false;
    }
}
