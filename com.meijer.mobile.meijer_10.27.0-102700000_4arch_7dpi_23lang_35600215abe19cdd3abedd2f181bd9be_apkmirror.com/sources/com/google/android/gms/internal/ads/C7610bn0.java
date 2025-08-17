package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7610bn0 extends AbstractC7499al0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7503an0 f72868a;

    private C7610bn0(C7503an0 c7503an0) {
        this.f72868a = c7503an0;
    }

    public static C7610bn0 c(C7503an0 c7503an0) {
        return new C7610bn0(c7503an0);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f72868a != C7503an0.f72494d;
    }

    public final C7503an0 b() {
        return this.f72868a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7610bn0) && ((C7610bn0) obj).f72868a == this.f72868a;
    }

    public final int hashCode() {
        return Objects.hash(C7610bn0.class, this.f72868a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f72868a.toString() + ")";
    }
}
