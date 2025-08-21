package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import com.scandit.datacapture.barcode.spark.ui.SparkScanMiniPreviewSize;
import com.scandit.datacapture.core.source.TorchState;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC13364k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f124155a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f124156b;

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
        f124155a = iArr;
        int[] iArr2 = new int[TorchState.values().length];
        try {
            iArr2[TorchState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f124156b = iArr2;
    }
}
