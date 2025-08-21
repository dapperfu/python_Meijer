package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final /* synthetic */ class C9979wo0 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f80380a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f80381b;

    static {
        int[] iArr = new int[Xr0.values().length];
        f80381b = iArr;
        try {
            iArr[Xr0.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f80381b[Xr0.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Es0.values().length];
        f80380a = iArr2;
        try {
            iArr2[Es0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f80380a[Es0.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f80380a[Es0.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f80380a[Es0.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
