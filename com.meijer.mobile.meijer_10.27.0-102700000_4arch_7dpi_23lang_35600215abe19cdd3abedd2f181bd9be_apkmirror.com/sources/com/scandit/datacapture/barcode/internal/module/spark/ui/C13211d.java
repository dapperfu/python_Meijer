package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13211d implements DataCaptureOverlay {

    /* renamed from: a, reason: collision with root package name */
    public final NativeSparkScanOverlay f123116a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeDataCaptureOverlay f123117b;

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    public final NativeDataCaptureOverlay _dataCaptureOverlayImpl() {
        return this.f123117b;
    }

    public C13211d(NativeSparkScanOverlay _NativeSparkScanOverlay) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeSparkScanOverlay, "_NativeSparkScanOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123116a = _NativeSparkScanOverlay;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeSparkScanOverlay.asDataCaptureOverlay();
        Intrinsics.i(nativeDataCaptureOverlayAsDataCaptureOverlay, "asDataCaptureOverlay(...)");
        this.f123117b = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }
}
