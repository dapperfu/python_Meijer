package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.em0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7927em0 extends AbstractC7499al0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7821dm0 f73935a;

    private C7927em0(C7821dm0 c7821dm0) {
        this.f73935a = c7821dm0;
    }

    public static C7927em0 c(C7821dm0 c7821dm0) {
        return new C7927em0(c7821dm0);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f73935a != C7821dm0.f73477d;
    }

    public final C7821dm0 b() {
        return this.f73935a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7927em0) && ((C7927em0) obj).f73935a == this.f73935a;
    }

    public final int hashCode() {
        return Objects.hash(C7927em0.class, this.f73935a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f73935a.toString() + ")";
    }
}
