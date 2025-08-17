package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public enum Es0 implements Ku0 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    private final int f66548a;

    public static Es0 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f66548a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    Es0(int i10) {
        this.f66548a = i10;
    }
}
