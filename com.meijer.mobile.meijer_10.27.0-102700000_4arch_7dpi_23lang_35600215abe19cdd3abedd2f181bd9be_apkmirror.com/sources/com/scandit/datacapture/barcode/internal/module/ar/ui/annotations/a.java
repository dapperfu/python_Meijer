package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationAnchor;
import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationAnchor;
import com.scandit.datacapture.barcode.ar.ui.annotations.statusicon.BarcodeArStatusIconAnnotationAnchor;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121080a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f121081b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f121082c;

    static {
        int[] iArr = new int[BarcodeArInfoAnnotationAnchor.values().length];
        try {
            iArr[BarcodeArInfoAnnotationAnchor.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BarcodeArInfoAnnotationAnchor.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BarcodeArInfoAnnotationAnchor.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BarcodeArInfoAnnotationAnchor.RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f121080a = iArr;
        int[] iArr2 = new int[BarcodeArStatusIconAnnotationAnchor.values().length];
        try {
            iArr2[BarcodeArStatusIconAnnotationAnchor.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[BarcodeArStatusIconAnnotationAnchor.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[BarcodeArStatusIconAnnotationAnchor.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[BarcodeArStatusIconAnnotationAnchor.RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f121081b = iArr2;
        int[] iArr3 = new int[BarcodeArPopoverAnnotationAnchor.values().length];
        try {
            iArr3[BarcodeArPopoverAnnotationAnchor.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[BarcodeArPopoverAnnotationAnchor.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[BarcodeArPopoverAnnotationAnchor.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[BarcodeArPopoverAnnotationAnchor.RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        f121082c = iArr3;
    }
}
