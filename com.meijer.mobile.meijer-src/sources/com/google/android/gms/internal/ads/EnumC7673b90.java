package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b90, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC7673b90 implements Ku0 {
    SCAR_REQUEST_TYPE_ADMOB(0),
    SCAR_REQUEST_TYPE_UNSPECIFIED(-1),
    SCAR_REQUEST_TYPE_INBOUND_MEDIATION(1),
    SCAR_REQUEST_TYPE_GBID(2),
    SCAR_REQUEST_TYPE_GOLDENEYE(3),
    SCAR_REQUEST_TYPE_YAVIN(4),
    SCAR_REQUEST_TYPE_UNITY(5),
    SCAR_REQUEST_TYPE_PAW(6),
    SCAR_REQUEST_TYPE_GUILDER(7),
    SCAR_REQUEST_TYPE_GAM_S2S(8),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    private final int f73576a;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f73576a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    EnumC7673b90(int i10) {
        this.f73576a = i10;
    }
}
