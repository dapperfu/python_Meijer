package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121798a;

    static {
        int[] iArr = new int[BarcodeCountStatus.values().length];
        try {
            iArr[BarcodeCountStatus.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BarcodeCountStatus.NOT_AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BarcodeCountStatus.EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BarcodeCountStatus.FRAGILE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BarcodeCountStatus.QUALITY_CHECK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BarcodeCountStatus.LOW_STOCK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BarcodeCountStatus.WRONG.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BarcodeCountStatus.EXPIRING_SOON.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f121798a = iArr;
    }
}
