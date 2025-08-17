package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotationTrigger;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121083a;

    static {
        int[] iArr = new int[BarcodeArAnnotationTrigger.values().length];
        try {
            iArr[BarcodeArAnnotationTrigger.HIGHLIGHT_TAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BarcodeArAnnotationTrigger.HIGHLIGHT_TAP_AND_BARCODE_SCAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f121083a = iArr;
    }
}
