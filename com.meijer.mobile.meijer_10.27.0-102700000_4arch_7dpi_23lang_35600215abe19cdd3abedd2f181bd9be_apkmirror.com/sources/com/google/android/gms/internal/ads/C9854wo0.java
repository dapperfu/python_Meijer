package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final /* synthetic */ class C9854wo0 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f79540a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f79541b;

    static {
        int[] iArr = new int[Xr0.values().length];
        f79541b = iArr;
        try {
            iArr[Xr0.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f79541b[Xr0.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Es0.values().length];
        f79540a = iArr2;
        try {
            iArr2[Es0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f79540a[Es0.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f79540a[Es0.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f79540a[Es0.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
