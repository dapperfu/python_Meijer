package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.ui.SparkScanPreviewBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanToastSettings;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.time.TimeInterval;

/* loaded from: classes12.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CameraPosition f124070a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TorchState f124071b;

    static {
        new SparkScanScanningMode.Default(SparkScanScanningBehavior.SINGLE, SparkScanPreviewBehavior.DEFAULT);
        TimeInterval.Companion companion = TimeInterval.INSTANCE;
        companion.seconds(10.0f);
        f124070a = CameraPosition.WORLD_FACING;
        companion.seconds(5.0f);
        f124071b = TorchState.OFF;
        SparkScanViewHandMode sparkScanViewHandMode = SparkScanViewHandMode.RIGHT;
        new SparkScanToastSettings(false, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
