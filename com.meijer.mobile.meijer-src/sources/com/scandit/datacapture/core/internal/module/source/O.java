package com.scandit.datacapture.core.internal.module.source;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class O {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125763a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f125764b;

    static {
        int[] iArr = new int[NativeCameraApi.values().length];
        try {
            iArr[NativeCameraApi.CAMERA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeCameraApi.CAMERA2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f125763a = iArr;
        int[] iArr2 = new int[NativePreferredFrameRateRange.values().length];
        try {
            iArr2[NativePreferredFrameRateRange.HIGHEST_WIDEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NativePreferredFrameRateRange.HIGHEST_NARROWEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f125764b = iArr2;
    }
}
