package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7617ai {

    /* renamed from: a, reason: collision with root package name */
    public final Object f73306a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73307b;

    /* renamed from: c, reason: collision with root package name */
    public final H7 f73308c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f73309d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73310e;

    /* renamed from: f, reason: collision with root package name */
    public final long f73311f;

    /* renamed from: g, reason: collision with root package name */
    public final long f73312g;

    /* renamed from: h, reason: collision with root package name */
    public final int f73313h;

    /* renamed from: i, reason: collision with root package name */
    public final int f73314i;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public C7617ai(Object obj, int i10, H7 h72, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f73306a = obj;
        this.f73307b = i10;
        this.f73308c = h72;
        this.f73309d = obj2;
        this.f73310e = i11;
        this.f73311f = j10;
        this.f73312g = j11;
        this.f73313h = i12;
        this.f73314i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7617ai.class == obj.getClass()) {
            C7617ai c7617ai = (C7617ai) obj;
            if (this.f73307b == c7617ai.f73307b && this.f73310e == c7617ai.f73310e && this.f73311f == c7617ai.f73311f && this.f73312g == c7617ai.f73312g && this.f73313h == c7617ai.f73313h && this.f73314i == c7617ai.f73314i && C6680Af0.a(this.f73308c, c7617ai.f73308c) && C6680Af0.a(this.f73306a, c7617ai.f73306a) && C6680Af0.a(this.f73309d, c7617ai.f73309d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f73306a, Integer.valueOf(this.f73307b), this.f73308c, this.f73309d, Integer.valueOf(this.f73310e), Long.valueOf(this.f73311f), Long.valueOf(this.f73312g), Integer.valueOf(this.f73313h), Integer.valueOf(this.f73314i)});
    }
}
