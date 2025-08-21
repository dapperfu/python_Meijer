package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastType;
import com.scandit.datacapture.barcode.spark.ui.SparkScanMiniPreviewSize;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123957a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f123958b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f123959c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f123960d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int[] f123961e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int[] f123962f;

    static {
        int[] iArr = new int[SparkScanScanningBehavior.values().length];
        try {
            iArr[SparkScanScanningBehavior.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SparkScanScanningBehavior.CONTINUOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f123957a = iArr;
        int[] iArr2 = new int[SparkScanViewState.values().length];
        try {
            iArr2[SparkScanViewState.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SparkScanViewState.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SparkScanViewState.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SparkScanViewState.IDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SparkScanViewState.INITIAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f123958b = iArr2;
        int[] iArr3 = new int[CameraPosition.values().length];
        try {
            iArr3[CameraPosition.WORLD_FACING.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        f123959c = iArr3;
        int[] iArr4 = new int[TorchState.values().length];
        try {
            iArr4[TorchState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        f123960d = iArr4;
        int[] iArr5 = new int[SparkScanMiniPreviewSize.values().length];
        try {
            iArr5[SparkScanMiniPreviewSize.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr5[SparkScanMiniPreviewSize.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        f123961e = iArr5;
        int[] iArr6 = new int[NativeSparkScanToastType.values().length];
        try {
            iArr6[NativeSparkScanToastType.TARGET_MODE_ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr6[NativeSparkScanToastType.TARGET_MODE_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr6[NativeSparkScanToastType.CONTINUOUS_MODE_ENABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr6[NativeSparkScanToastType.CONTINUOUS_MODE_DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr6[NativeSparkScanToastType.SCAN_PAUSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[NativeSparkScanToastType.ZOOMED_IN.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr6[NativeSparkScanToastType.ZOOMED_OUT.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[NativeSparkScanToastType.TORCH_ON.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[NativeSparkScanToastType.TORCH_OFF.ordinal()] = 9;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[NativeSparkScanToastType.USER_FACING_CAMERA_ENABLED.ordinal()] = 10;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[NativeSparkScanToastType.WORLD_FACING_CAMERA_ENABLED.ordinal()] = 11;
        } catch (NoSuchFieldError unused22) {
        }
        f123962f = iArr6;
    }
}
