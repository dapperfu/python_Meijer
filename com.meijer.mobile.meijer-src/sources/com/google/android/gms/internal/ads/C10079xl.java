package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10079xl {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f80684o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final H7 f80685p;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public Object f80687b;

    /* renamed from: d, reason: collision with root package name */
    public long f80689d;

    /* renamed from: e, reason: collision with root package name */
    public long f80690e;

    /* renamed from: f, reason: collision with root package name */
    public long f80691f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f80692g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f80693h;

    /* renamed from: i, reason: collision with root package name */
    public J4 f80694i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f80695j;

    /* renamed from: k, reason: collision with root package name */
    public long f80696k;

    /* renamed from: l, reason: collision with root package name */
    public long f80697l;

    /* renamed from: m, reason: collision with root package name */
    public int f80698m;

    /* renamed from: n, reason: collision with root package name */
    public int f80699n;

    /* renamed from: a, reason: collision with root package name */
    public Object f80686a = f80684o;

    /* renamed from: c, reason: collision with root package name */
    public H7 f80688c = f80685p;

    public final C10079xl a(Object obj, H7 h72, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, J4 j42, long j13, long j14, int i10, int i11, long j15) {
        this.f80686a = obj;
        if (h72 == null) {
            h72 = f80685p;
        }
        this.f80688c = h72;
        this.f80687b = null;
        this.f80689d = -9223372036854775807L;
        this.f80690e = -9223372036854775807L;
        this.f80691f = -9223372036854775807L;
        this.f80692g = z10;
        this.f80693h = z11;
        this.f80694i = j42;
        this.f80696k = 0L;
        this.f80697l = j14;
        this.f80698m = 0;
        this.f80699n = 0;
        this.f80695j = false;
        return this;
    }

    public final boolean b() {
        return this.f80694i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10079xl.class.equals(obj.getClass())) {
            C10079xl c10079xl = (C10079xl) obj;
            if (Objects.equals(this.f80686a, c10079xl.f80686a) && Objects.equals(this.f80688c, c10079xl.f80688c) && Objects.equals(this.f80694i, c10079xl.f80694i) && this.f80689d == c10079xl.f80689d && this.f80690e == c10079xl.f80690e && this.f80691f == c10079xl.f80691f && this.f80692g == c10079xl.f80692g && this.f80693h == c10079xl.f80693h && this.f80695j == c10079xl.f80695j && this.f80697l == c10079xl.f80697l && this.f80698m == c10079xl.f80698m && this.f80699n == c10079xl.f80699n) {
                return true;
            }
        }
        return false;
    }

    static {
        E1 e12 = new E1();
        e12.a("androidx.media3.common.Timeline");
        e12.b(Uri.EMPTY);
        f80685p = e12.c();
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final int hashCode() {
        int iHashCode = ((this.f80686a.hashCode() + 217) * 31) + this.f80688c.hashCode();
        J4 j42 = this.f80694i;
        int iHashCode2 = ((iHashCode * 961) + (j42 == null ? 0 : j42.hashCode())) * 31;
        long j10 = this.f80689d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f80690e;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f80691f;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f80692g ? 1 : 0)) * 31) + (this.f80693h ? 1 : 0)) * 31) + (this.f80695j ? 1 : 0);
        long j13 = this.f80697l;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f80698m) * 31) + this.f80699n) * 31;
    }
}
