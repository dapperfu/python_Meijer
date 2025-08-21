package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.yo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10193yo0 extends Qk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9981wp0 f81131a;

    public C10193yo0(C9981wp0 c9981wp0) {
        this.f81131a = c9981wp0;
    }

    public final C9981wp0 b() {
        return this.f81131a;
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f81131a.c().g0() != Es0.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10193yo0)) {
            return false;
        }
        C9981wp0 c9981wp0 = ((C10193yo0) obj).f81131a;
        return this.f81131a.c().g0().equals(c9981wp0.c().g0()) && this.f81131a.c().i0().equals(c9981wp0.c().i0()) && this.f81131a.c().h0().equals(c9981wp0.c().h0());
    }

    public final int hashCode() {
        C9981wp0 c9981wp0 = this.f81131a;
        return Objects.hash(c9981wp0.c(), c9981wp0.zzd());
    }

    public final String toString() {
        String strI0 = this.f81131a.c().i0();
        int iOrdinal = this.f81131a.c().g0().ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strI0, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
