package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay;
import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlayStyle;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13210c implements DataCaptureOverlay {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13211d f123114a;

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getF126134c() {
        return this.f123114a.f123117b;
    }

    public C13210c(SparkScanInternal sparkScanInternal, NativeSparkScanOverlayStyle nativeSparkScanOverlayStyle) {
        NativeSparkScanOverlay impl = NativeSparkScanOverlay.create(sparkScanInternal.a(), nativeSparkScanOverlayStyle);
        Intrinsics.i(impl, "create(...)");
        Intrinsics.j(impl, "impl");
        this.f123114a = new C13211d(impl);
        new HashMap();
    }
}
