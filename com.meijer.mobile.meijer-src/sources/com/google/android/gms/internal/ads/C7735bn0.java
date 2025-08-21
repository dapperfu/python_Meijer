package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7735bn0 extends AbstractC7624al0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7628an0 f73708a;

    private C7735bn0(C7628an0 c7628an0) {
        this.f73708a = c7628an0;
    }

    public static C7735bn0 c(C7628an0 c7628an0) {
        return new C7735bn0(c7628an0);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f73708a != C7628an0.f73334d;
    }

    public final C7628an0 b() {
        return this.f73708a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7735bn0) && ((C7735bn0) obj).f73708a == this.f73708a;
    }

    public final int hashCode() {
        return Objects.hash(C7735bn0.class, this.f73708a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f73708a.toString() + ")";
    }
}
