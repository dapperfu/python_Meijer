package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public enum Lr0 implements Ku0 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    private final int f68447a;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f68447a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    Lr0(int i10) {
        this.f68447a = i10;
    }
}
