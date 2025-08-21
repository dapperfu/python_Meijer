package com.google.crypto.tink.internal;

import java.util.Objects;

/* renamed from: com.google.crypto.tink.internal.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11427k extends Ke.x {

    /* renamed from: a, reason: collision with root package name */
    private final H f89054a;

    /* renamed from: com.google.crypto.tink.internal.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89055a;

        static {
            int[] iArr = new int[We.I.values().length];
            f89055a = iArr;
            try {
                iArr[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89055a[We.I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89055a[We.I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89055a[We.I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static String c(We.I i10) {
        int i11 = a.f89055a[i10.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
    }

    @Override // Ke.x
    public boolean a() {
        return this.f89054a.d().c0() != We.I.RAW;
    }

    public H b() {
        return this.f89054a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11427k)) {
            return false;
        }
        H h10 = ((C11427k) obj).f89054a;
        return this.f89054a.d().c0().equals(h10.d().c0()) && this.f89054a.d().d0().equals(h10.d().d0()) && this.f89054a.d().e0().equals(h10.d().e0());
    }

    public int hashCode() {
        return Objects.hash(this.f89054a.d(), this.f89054a.a());
    }

    public String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f89054a.d().d0(), c(this.f89054a.d().c0()));
    }

    public C11427k(H h10) {
        this.f89054a = h10;
    }
}
