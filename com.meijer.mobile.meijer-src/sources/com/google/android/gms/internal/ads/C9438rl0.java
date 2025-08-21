package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9438rl0 extends AbstractC7624al0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f78898a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78899b;

    /* renamed from: c, reason: collision with root package name */
    private final int f78900c;

    /* renamed from: d, reason: collision with root package name */
    private final int f78901d;

    /* renamed from: e, reason: collision with root package name */
    private final C9225pl0 f78902e;

    /* renamed from: f, reason: collision with root package name */
    private final C9118ol0 f78903f;

    /* synthetic */ C9438rl0(int i10, int i11, int i12, int i13, C9225pl0 c9225pl0, C9118ol0 c9118ol0, C9332ql0 c9332ql0) {
        this.f78898a = i10;
        this.f78899b = i11;
        this.f78900c = i12;
        this.f78901d = i13;
        this.f78902e = c9225pl0;
        this.f78903f = c9118ol0;
    }

    public static C9011nl0 f() {
        return new C9011nl0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f78902e != C9225pl0.f78478d;
    }

    public final int b() {
        return this.f78898a;
    }

    public final int c() {
        return this.f78899b;
    }

    public final int d() {
        return this.f78900c;
    }

    public final int e() {
        return this.f78901d;
    }

    public final C9118ol0 g() {
        return this.f78903f;
    }

    public final C9225pl0 h() {
        return this.f78902e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9438rl0)) {
            return false;
        }
        C9438rl0 c9438rl0 = (C9438rl0) obj;
        return c9438rl0.f78898a == this.f78898a && c9438rl0.f78899b == this.f78899b && c9438rl0.f78900c == this.f78900c && c9438rl0.f78901d == this.f78901d && c9438rl0.f78902e == this.f78902e && c9438rl0.f78903f == this.f78903f;
    }

    public final int hashCode() {
        return Objects.hash(C9438rl0.class, Integer.valueOf(this.f78898a), Integer.valueOf(this.f78899b), Integer.valueOf(this.f78900c), Integer.valueOf(this.f78901d), this.f78902e, this.f78903f);
    }

    public final String toString() {
        C9118ol0 c9118ol0 = this.f78903f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.f78902e) + ", hashType: " + String.valueOf(c9118ol0) + ", " + this.f78900c + "-byte IV, and " + this.f78901d + "-byte tags, and " + this.f78898a + "-byte AES key, and " + this.f78899b + "-byte HMAC key)";
    }
}
