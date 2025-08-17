package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC10485o4 implements InterfaceC10432i5 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    private final int f82314a;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f82314a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10432i5
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f82314a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    EnumC10485o4(int i10) {
        this.f82314a = i10;
    }
}
