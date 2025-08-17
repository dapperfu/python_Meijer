package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC7328Xd implements Ku0 {
    UNSPECIFIED(0),
    IN_MEMORY(1);


    /* renamed from: d, reason: collision with root package name */
    private static final Lu0<EnumC7328Xd> f71365d = new Lu0<EnumC7328Xd>() { // from class: com.google.android.gms.internal.ads.Xd.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f71367a;

    public static EnumC7328Xd a(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED;
        }
        if (i10 != 1) {
            return null;
        }
        return IN_MEMORY;
    }

    public static Mu0 b() {
        return C7361Yd.f71585a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f71367a;
    }

    EnumC7328Xd(int i10) {
        this.f71367a = i10;
    }
}
