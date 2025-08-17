package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8468jq0 extends AbstractC8789mq0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f75522a;

    /* renamed from: b, reason: collision with root package name */
    private final int f75523b;

    /* renamed from: c, reason: collision with root package name */
    private final C8256hq0 f75524c;

    /* renamed from: d, reason: collision with root package name */
    private final C8149gq0 f75525d;

    /* synthetic */ C8468jq0(int i10, int i11, C8256hq0 c8256hq0, C8149gq0 c8149gq0, C8362iq0 c8362iq0) {
        this.f75522a = i10;
        this.f75523b = i11;
        this.f75524c = c8256hq0;
        this.f75525d = c8149gq0;
    }

    public static C8042fq0 e() {
        return new C8042fq0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f75524c != C8256hq0.f74792e;
    }

    public final int b() {
        return this.f75523b;
    }

    public final int c() {
        return this.f75522a;
    }

    public final C8149gq0 f() {
        return this.f75525d;
    }

    public final C8256hq0 g() {
        return this.f75524c;
    }

    public final int d() {
        C8256hq0 c8256hq0 = this.f75524c;
        if (c8256hq0 == C8256hq0.f74792e) {
            return this.f75523b;
        }
        if (c8256hq0 == C8256hq0.f74789b || c8256hq0 == C8256hq0.f74790c || c8256hq0 == C8256hq0.f74791d) {
            return this.f75523b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8468jq0)) {
            return false;
        }
        C8468jq0 c8468jq0 = (C8468jq0) obj;
        return c8468jq0.f75522a == this.f75522a && c8468jq0.d() == d() && c8468jq0.f75524c == this.f75524c && c8468jq0.f75525d == this.f75525d;
    }

    public final int hashCode() {
        return Objects.hash(C8468jq0.class, Integer.valueOf(this.f75522a), Integer.valueOf(this.f75523b), this.f75524c, this.f75525d);
    }

    public final String toString() {
        C8149gq0 c8149gq0 = this.f75525d;
        return "HMAC Parameters (variant: " + String.valueOf(this.f75524c) + ", hashType: " + String.valueOf(c8149gq0) + ", " + this.f75523b + "-byte tags, and " + this.f75522a + "-byte key)";
    }
}
