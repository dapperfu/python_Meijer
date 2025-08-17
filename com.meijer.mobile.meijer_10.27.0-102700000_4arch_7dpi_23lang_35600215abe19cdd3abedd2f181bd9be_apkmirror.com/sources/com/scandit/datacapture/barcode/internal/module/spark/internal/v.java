package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.internal.module.spark.data.C13197j;
import com.scandit.datacapture.barcode.internal.module.spark.data.InterfaceC13198k;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeHandlerListener;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class v extends NativeSparkScanScanningModeHandlerListener {

    /* renamed from: a, reason: collision with root package name */
    public final u f122957a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f122958b;

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeHandlerListener
    public final void onScanningModeChanged(NativeSparkScanScanningMode previousScanningMode, NativeSparkScanScanningMode newScanningMode) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(previousScanningMode, "previousScanningMode");
        Intrinsics.j(newScanningMode, "newScanningMode");
        if (((SparkScanStateManager) this.f122958b.get()) != null) {
            BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
            SparkScanScanningMode previousMode = barcodeNativeTypeFactory.convert(previousScanningMode);
            SparkScanScanningMode newMode = barcodeNativeTypeFactory.convert(newScanningMode);
            C13197j c13197j = (C13197j) this.f122957a;
            c13197j.getClass();
            Intrinsics.j(previousMode, "previousMode");
            Intrinsics.j(newMode, "newMode");
            SparkScanStateManager sparkScanStateManager = (SparkScanStateManager) c13197j.f122906a.get();
            if (sparkScanStateManager == null || (copyOnWriteArraySet = sparkScanStateManager.f122887r) == null) {
                return;
            }
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((InterfaceC13198k) it.next()).a(previousMode, newMode);
            }
        }
    }

    public v(C13197j _SparkScanInternalScanningModeListener, SparkScanStateManager _SparkScanStateManager) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_SparkScanInternalScanningModeListener, "_SparkScanInternalScanningModeListener");
        Intrinsics.j(_SparkScanStateManager, "_SparkScanStateManager");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122957a = _SparkScanInternalScanningModeListener;
        this.f122958b = new WeakReference(_SparkScanStateManager);
    }
}
