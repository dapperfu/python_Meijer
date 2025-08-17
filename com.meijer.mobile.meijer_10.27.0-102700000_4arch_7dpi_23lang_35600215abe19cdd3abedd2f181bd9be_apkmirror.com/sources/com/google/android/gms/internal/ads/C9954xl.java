package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9954xl {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f79844o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final H7 f79845p;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public Object f79847b;

    /* renamed from: d, reason: collision with root package name */
    public long f79849d;

    /* renamed from: e, reason: collision with root package name */
    public long f79850e;

    /* renamed from: f, reason: collision with root package name */
    public long f79851f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f79852g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f79853h;

    /* renamed from: i, reason: collision with root package name */
    public J4 f79854i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f79855j;

    /* renamed from: k, reason: collision with root package name */
    public long f79856k;

    /* renamed from: l, reason: collision with root package name */
    public long f79857l;

    /* renamed from: m, reason: collision with root package name */
    public int f79858m;

    /* renamed from: n, reason: collision with root package name */
    public int f79859n;

    /* renamed from: a, reason: collision with root package name */
    public Object f79846a = f79844o;

    /* renamed from: c, reason: collision with root package name */
    public H7 f79848c = f79845p;

    public final C9954xl a(Object obj, H7 h72, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, J4 j42, long j13, long j14, int i10, int i11, long j15) {
        this.f79846a = obj;
        if (h72 == null) {
            h72 = f79845p;
        }
        this.f79848c = h72;
        this.f79847b = null;
        this.f79849d = -9223372036854775807L;
        this.f79850e = -9223372036854775807L;
        this.f79851f = -9223372036854775807L;
        this.f79852g = z10;
        this.f79853h = z11;
        this.f79854i = j42;
        this.f79856k = 0L;
        this.f79857l = j14;
        this.f79858m = 0;
        this.f79859n = 0;
        this.f79855j = false;
        return this;
    }

    public final boolean b() {
        return this.f79854i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9954xl.class.equals(obj.getClass())) {
            C9954xl c9954xl = (C9954xl) obj;
            if (Objects.equals(this.f79846a, c9954xl.f79846a) && Objects.equals(this.f79848c, c9954xl.f79848c) && Objects.equals(this.f79854i, c9954xl.f79854i) && this.f79849d == c9954xl.f79849d && this.f79850e == c9954xl.f79850e && this.f79851f == c9954xl.f79851f && this.f79852g == c9954xl.f79852g && this.f79853h == c9954xl.f79853h && this.f79855j == c9954xl.f79855j && this.f79857l == c9954xl.f79857l && this.f79858m == c9954xl.f79858m && this.f79859n == c9954xl.f79859n) {
                return true;
            }
        }
        return false;
    }

    static {
        E1 e12 = new E1();
        e12.a("androidx.media3.common.Timeline");
        e12.b(Uri.EMPTY);
        f79845p = e12.c();
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
        int iHashCode = ((this.f79846a.hashCode() + 217) * 31) + this.f79848c.hashCode();
        J4 j42 = this.f79854i;
        int iHashCode2 = ((iHashCode * 961) + (j42 == null ? 0 : j42.hashCode())) * 31;
        long j10 = this.f79849d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f79850e;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f79851f;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f79852g ? 1 : 0)) * 31) + (this.f79853h ? 1 : 0)) * 31) + (this.f79855j ? 1 : 0);
        long j13 = this.f79857l;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f79858m) * 31) + this.f79859n) * 31;
    }
}
