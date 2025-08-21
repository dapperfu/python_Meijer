package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC7453Xd implements Ku0 {
    UNSPECIFIED(0),
    IN_MEMORY(1);


    /* renamed from: d, reason: collision with root package name */
    private static final Lu0<EnumC7453Xd> f72205d = new Lu0<EnumC7453Xd>() { // from class: com.google.android.gms.internal.ads.Xd.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f72207a;

    public static EnumC7453Xd a(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED;
        }
        if (i10 != 1) {
            return null;
        }
        return IN_MEMORY;
    }

    public static Mu0 b() {
        return C7486Yd.f72425a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f72207a;
    }

    EnumC7453Xd(int i10) {
        this.f72207a = i10;
    }
}
