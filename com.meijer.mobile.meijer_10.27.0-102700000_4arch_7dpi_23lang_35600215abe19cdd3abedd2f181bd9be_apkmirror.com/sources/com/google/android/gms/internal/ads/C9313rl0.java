package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9313rl0 extends AbstractC7499al0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f78058a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78059b;

    /* renamed from: c, reason: collision with root package name */
    private final int f78060c;

    /* renamed from: d, reason: collision with root package name */
    private final int f78061d;

    /* renamed from: e, reason: collision with root package name */
    private final C9100pl0 f78062e;

    /* renamed from: f, reason: collision with root package name */
    private final C8993ol0 f78063f;

    /* synthetic */ C9313rl0(int i10, int i11, int i12, int i13, C9100pl0 c9100pl0, C8993ol0 c8993ol0, C9207ql0 c9207ql0) {
        this.f78058a = i10;
        this.f78059b = i11;
        this.f78060c = i12;
        this.f78061d = i13;
        this.f78062e = c9100pl0;
        this.f78063f = c8993ol0;
    }

    public static C8886nl0 f() {
        return new C8886nl0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f78062e != C9100pl0.f77638d;
    }

    public final int b() {
        return this.f78058a;
    }

    public final int c() {
        return this.f78059b;
    }

    public final int d() {
        return this.f78060c;
    }

    public final int e() {
        return this.f78061d;
    }

    public final C8993ol0 g() {
        return this.f78063f;
    }

    public final C9100pl0 h() {
        return this.f78062e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9313rl0)) {
            return false;
        }
        C9313rl0 c9313rl0 = (C9313rl0) obj;
        return c9313rl0.f78058a == this.f78058a && c9313rl0.f78059b == this.f78059b && c9313rl0.f78060c == this.f78060c && c9313rl0.f78061d == this.f78061d && c9313rl0.f78062e == this.f78062e && c9313rl0.f78063f == this.f78063f;
    }

    public final int hashCode() {
        return Objects.hash(C9313rl0.class, Integer.valueOf(this.f78058a), Integer.valueOf(this.f78059b), Integer.valueOf(this.f78060c), Integer.valueOf(this.f78061d), this.f78062e, this.f78063f);
    }

    public final String toString() {
        C8993ol0 c8993ol0 = this.f78063f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.f78062e) + ", hashType: " + String.valueOf(c8993ol0) + ", " + this.f78060c + "-byte IV, and " + this.f78061d + "-byte tags, and " + this.f78058a + "-byte AES key, and " + this.f78059b + "-byte HMAC key)";
    }
}
