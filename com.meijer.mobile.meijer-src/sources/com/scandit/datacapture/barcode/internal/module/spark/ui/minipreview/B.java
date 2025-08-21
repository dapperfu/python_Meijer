package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import com.scandit.datacapture.core.ui.orientation.DeviceOrientation;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class B {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f124092a;

    static {
        int[] iArr = new int[DeviceOrientation.values().length];
        try {
            iArr[DeviceOrientation.PORTRAIT_UPSIDE_DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeviceOrientation.PORTRAIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f124092a = iArr;
    }
}
