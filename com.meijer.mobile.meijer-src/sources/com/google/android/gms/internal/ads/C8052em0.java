package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.em0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8052em0 extends AbstractC7624al0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7946dm0 f74775a;

    private C8052em0(C7946dm0 c7946dm0) {
        this.f74775a = c7946dm0;
    }

    public static C8052em0 c(C7946dm0 c7946dm0) {
        return new C8052em0(c7946dm0);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f74775a != C7946dm0.f74317d;
    }

    public final C7946dm0 b() {
        return this.f74775a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8052em0) && ((C8052em0) obj).f74775a == this.f74775a;
    }

    public final int hashCode() {
        return Objects.hash(C8052em0.class, this.f74775a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f74775a.toString() + ")";
    }
}
