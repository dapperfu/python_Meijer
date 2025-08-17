package com.google.crypto.tink.internal;

import java.util.Objects;

/* renamed from: com.google.crypto.tink.internal.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11302k extends Ie.x {

    /* renamed from: a, reason: collision with root package name */
    private final H f88214a;

    /* renamed from: com.google.crypto.tink.internal.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88215a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f88215a = iArr;
            try {
                iArr[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88215a[Ue.I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88215a[Ue.I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88215a[Ue.I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static String c(Ue.I i10) {
        int i11 = a.f88215a[i10.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
    }

    @Override // Ie.x
    public boolean a() {
        return this.f88214a.d().c0() != Ue.I.RAW;
    }

    public H b() {
        return this.f88214a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11302k)) {
            return false;
        }
        H h10 = ((C11302k) obj).f88214a;
        return this.f88214a.d().c0().equals(h10.d().c0()) && this.f88214a.d().d0().equals(h10.d().d0()) && this.f88214a.d().e0().equals(h10.d().e0());
    }

    public int hashCode() {
        return Objects.hash(this.f88214a.d(), this.f88214a.a());
    }

    public String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f88214a.d().d0(), c(this.f88214a.d().c0()));
    }

    public C11302k(H h10) {
        this.f88214a = h10;
    }
}
