package com.scandit.datacapture.core.internal.module.source;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class E {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125730a;

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
        f125730a = iArr;
    }
}
