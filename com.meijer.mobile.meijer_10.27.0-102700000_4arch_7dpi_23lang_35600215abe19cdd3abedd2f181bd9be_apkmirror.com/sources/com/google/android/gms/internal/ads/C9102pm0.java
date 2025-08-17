package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9102pm0 extends AbstractC7499al0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f77640a;

    /* renamed from: b, reason: collision with root package name */
    private final C8995om0 f77641b;

    private C9102pm0(String str, C8995om0 c8995om0) {
        this.f77640a = str;
        this.f77641b = c8995om0;
    }

    public static C9102pm0 c(String str, C8995om0 c8995om0) {
        return new C9102pm0(str, c8995om0);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f77641b != C8995om0.f77426c;
    }

    public final C8995om0 b() {
        return this.f77641b;
    }

    public final String d() {
        return this.f77640a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9102pm0)) {
            return false;
        }
        C9102pm0 c9102pm0 = (C9102pm0) obj;
        return c9102pm0.f77640a.equals(this.f77640a) && c9102pm0.f77641b.equals(this.f77641b);
    }

    public final int hashCode() {
        return Objects.hash(C9102pm0.class, this.f77640a, this.f77641b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f77640a + ", variant: " + this.f77641b.toString() + ")";
    }
}
