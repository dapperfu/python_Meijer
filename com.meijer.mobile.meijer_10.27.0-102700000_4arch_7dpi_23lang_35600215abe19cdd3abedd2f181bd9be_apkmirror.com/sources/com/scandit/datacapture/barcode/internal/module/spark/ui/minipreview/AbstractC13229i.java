package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import com.scandit.datacapture.barcode.spark.ui.SparkScanMiniPreviewSize;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC13229i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123201a;

    static {
        int[] iArr = new int[SparkScanMiniPreviewSize.values().length];
        try {
            iArr[SparkScanMiniPreviewSize.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SparkScanMiniPreviewSize.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f123201a = iArr;
    }
}
