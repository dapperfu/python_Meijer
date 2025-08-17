package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7492ai {

    /* renamed from: a, reason: collision with root package name */
    public final Object f72466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72467b;

    /* renamed from: c, reason: collision with root package name */
    public final H7 f72468c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f72469d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72470e;

    /* renamed from: f, reason: collision with root package name */
    public final long f72471f;

    /* renamed from: g, reason: collision with root package name */
    public final long f72472g;

    /* renamed from: h, reason: collision with root package name */
    public final int f72473h;

    /* renamed from: i, reason: collision with root package name */
    public final int f72474i;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public C7492ai(Object obj, int i10, H7 h72, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f72466a = obj;
        this.f72467b = i10;
        this.f72468c = h72;
        this.f72469d = obj2;
        this.f72470e = i11;
        this.f72471f = j10;
        this.f72472g = j11;
        this.f72473h = i12;
        this.f72474i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7492ai.class == obj.getClass()) {
            C7492ai c7492ai = (C7492ai) obj;
            if (this.f72467b == c7492ai.f72467b && this.f72470e == c7492ai.f72470e && this.f72471f == c7492ai.f72471f && this.f72472g == c7492ai.f72472g && this.f72473h == c7492ai.f72473h && this.f72474i == c7492ai.f72474i && C6555Af0.a(this.f72468c, c7492ai.f72468c) && C6555Af0.a(this.f72466a, c7492ai.f72466a) && C6555Af0.a(this.f72469d, c7492ai.f72469d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f72466a, Integer.valueOf(this.f72467b), this.f72468c, this.f72469d, Integer.valueOf(this.f72470e), Long.valueOf(this.f72471f), Long.valueOf(this.f72472g), Integer.valueOf(this.f72473h), Integer.valueOf(this.f72474i)});
    }
}
