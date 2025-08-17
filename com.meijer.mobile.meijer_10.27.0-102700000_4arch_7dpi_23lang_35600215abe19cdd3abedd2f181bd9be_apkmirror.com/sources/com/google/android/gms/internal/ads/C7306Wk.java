package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Wk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7306Wk {

    /* renamed from: a, reason: collision with root package name */
    public Object f71148a;

    /* renamed from: b, reason: collision with root package name */
    public Object f71149b;

    /* renamed from: c, reason: collision with root package name */
    public int f71150c;

    /* renamed from: d, reason: collision with root package name */
    public long f71151d;

    /* renamed from: e, reason: collision with root package name */
    public long f71152e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f71153f;

    /* renamed from: g, reason: collision with root package name */
    public C8867nc f71154g = C8867nc.f77098e;

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
        if (obj != null && C7306Wk.class.equals(obj.getClass())) {
            C7306Wk c7306Wk = (C7306Wk) obj;
            if (Objects.equals(this.f71148a, c7306Wk.f71148a) && Objects.equals(this.f71149b, c7306Wk.f71149b) && this.f71150c == c7306Wk.f71150c && this.f71151d == c7306Wk.f71151d && this.f71153f == c7306Wk.f71153f && Objects.equals(this.f71154g, c7306Wk.f71154g)) {
                return true;
            }
        }
        return false;
    }

    public final C7306Wk i(Object obj, Object obj2, int i10, long j10, long j11, C8867nc c8867nc, boolean z10) {
        this.f71148a = obj;
        this.f71149b = obj2;
        this.f71150c = i10;
        this.f71151d = j10;
        this.f71152e = 0L;
        this.f71154g = c8867nc;
        this.f71153f = z10;
        return this;
    }

    public final int a(int i10) {
        return this.f71154g.a(i10).f72322b;
    }

    public final int b() {
        int i10 = this.f71154g.f77100a;
        return 0;
    }

    public final int d(long j10) {
        this.f71154g.b(-1);
        return -1;
    }

    public final int e(int i10) {
        return this.f71154g.a(i10).a(-1);
    }

    public final long f(int i10, int i11) {
        C7421a c7421aA = this.f71154g.a(i10);
        if (c7421aA.f72322b != -1) {
            return c7421aA.f72326f[i11];
        }
        return -9223372036854775807L;
    }

    public final long g(int i10) {
        long j10 = this.f71154g.a(i10).f72321a;
        return 0L;
    }

    public final long h() {
        long j10 = this.f71154g.f77101b;
        return 0L;
    }

    public final int hashCode() {
        Object obj = this.f71148a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f71149b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f71150c;
        long j10 = this.f71151d;
        return (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.f71153f ? 1 : 0)) * 31) + this.f71154g.hashCode();
    }

    public final boolean k(int i10) {
        boolean z10 = this.f71154g.a(i10).f72328h;
        return false;
    }

    public final boolean j(int i10) {
        b();
        if (i10 == -1) {
            this.f71154g.b(-1);
            return false;
        }
        return false;
    }
}
