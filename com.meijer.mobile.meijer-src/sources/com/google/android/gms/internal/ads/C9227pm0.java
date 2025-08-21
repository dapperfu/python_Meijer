package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9227pm0 extends AbstractC7624al0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f78480a;

    /* renamed from: b, reason: collision with root package name */
    private final C9120om0 f78481b;

    private C9227pm0(String str, C9120om0 c9120om0) {
        this.f78480a = str;
        this.f78481b = c9120om0;
    }

    public static C9227pm0 c(String str, C9120om0 c9120om0) {
        return new C9227pm0(str, c9120om0);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f78481b != C9120om0.f78266c;
    }

    public final C9120om0 b() {
        return this.f78481b;
    }

    public final String d() {
        return this.f78480a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9227pm0)) {
            return false;
        }
        C9227pm0 c9227pm0 = (C9227pm0) obj;
        return c9227pm0.f78480a.equals(this.f78480a) && c9227pm0.f78481b.equals(this.f78481b);
    }

    public final int hashCode() {
        return Objects.hash(C9227pm0.class, this.f78480a, this.f78481b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f78480a + ", variant: " + this.f78481b.toString() + ")";
    }
}
