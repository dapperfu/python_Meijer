package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8593jq0 extends AbstractC8914mq0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f76362a;

    /* renamed from: b, reason: collision with root package name */
    private final int f76363b;

    /* renamed from: c, reason: collision with root package name */
    private final C8381hq0 f76364c;

    /* renamed from: d, reason: collision with root package name */
    private final C8274gq0 f76365d;

    /* synthetic */ C8593jq0(int i10, int i11, C8381hq0 c8381hq0, C8274gq0 c8274gq0, C8487iq0 c8487iq0) {
        this.f76362a = i10;
        this.f76363b = i11;
        this.f76364c = c8381hq0;
        this.f76365d = c8274gq0;
    }

    public static C8167fq0 e() {
        return new C8167fq0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f76364c != C8381hq0.f75632e;
    }

    public final int b() {
        return this.f76363b;
    }

    public final int c() {
        return this.f76362a;
    }

    public final C8274gq0 f() {
        return this.f76365d;
    }

    public final C8381hq0 g() {
        return this.f76364c;
    }

    public final int d() {
        C8381hq0 c8381hq0 = this.f76364c;
        if (c8381hq0 == C8381hq0.f75632e) {
            return this.f76363b;
        }
        if (c8381hq0 == C8381hq0.f75629b || c8381hq0 == C8381hq0.f75630c || c8381hq0 == C8381hq0.f75631d) {
            return this.f76363b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8593jq0)) {
            return false;
        }
        C8593jq0 c8593jq0 = (C8593jq0) obj;
        return c8593jq0.f76362a == this.f76362a && c8593jq0.d() == d() && c8593jq0.f76364c == this.f76364c && c8593jq0.f76365d == this.f76365d;
    }

    public final int hashCode() {
        return Objects.hash(C8593jq0.class, Integer.valueOf(this.f76362a), Integer.valueOf(this.f76363b), this.f76364c, this.f76365d);
    }

    public final String toString() {
        C8274gq0 c8274gq0 = this.f76365d;
        return "HMAC Parameters (variant: " + String.valueOf(this.f76364c) + ", hashType: " + String.valueOf(c8274gq0) + ", " + this.f76363b + "-byte tags, and " + this.f76362a + "-byte key)";
    }
}
