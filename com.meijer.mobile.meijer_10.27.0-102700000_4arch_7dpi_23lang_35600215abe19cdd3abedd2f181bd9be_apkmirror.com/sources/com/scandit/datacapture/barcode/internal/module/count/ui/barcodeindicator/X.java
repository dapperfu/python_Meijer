package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class X {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121424a;

    static {
        int[] iArr = new int[NativeBarcodeCountBasicOverlayColorScheme.values().length];
        try {
            iArr[NativeBarcodeCountBasicOverlayColorScheme.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f121424a = iArr;
    }
}
