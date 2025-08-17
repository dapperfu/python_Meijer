package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes11.dex */
public final class s extends NativeSparkScanListener {

    /* renamed from: a, reason: collision with root package name */
    public final j f122952a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f122953b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f122954c;

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener
    public final void onObservationStarted(NativeSparkScan sparkScan) {
        Intrinsics.j(sparkScan, "sparkScan");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.f122954c.get();
        if (sparkScanInternal != null) {
            Object orPut = this.f122953b.getOrPut(Reflection.b(NativeSparkScan.class), null, sparkScan, new k(sparkScanInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f122952a.onObservationStarted((SparkScanInternal) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener
    public final void onObservationStopped(NativeSparkScan sparkScan) {
        Intrinsics.j(sparkScan, "sparkScan");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.f122954c.get();
        if (sparkScanInternal != null) {
            Object orPut = this.f122953b.getOrPut(Reflection.b(NativeSparkScan.class), null, sparkScan, new l(sparkScanInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f122952a.onObservationStopped((SparkScanInternal) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener
    public final void onScan(NativeSparkScan sparkScan, NativeSparkScanSession session, NativeFrameData data) {
        Intrinsics.j(sparkScan, "sparkScan");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.f122954c.get();
        if (sparkScanInternal != null) {
            Object orPut = this.f122953b.getOrPut(Reflection.b(NativeSparkScan.class), null, sparkScan, new m(sparkScanInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            SparkScanSession sparkScanSession = (SparkScanSession) this.f122953b.getOrPut(Reflection.b(NativeSparkScanSession.class), null, session, new n(sparkScanInternal));
            FrameData frameData = (FrameData) this.f122953b.getOrPut(Reflection.b(NativeFrameData.class), null, data, new o(data));
            this.f122952a.onBarcodeScanned((SparkScanInternal) orPut, sparkScanSession, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanListener
    public final void onSessionUpdated(NativeSparkScan sparkScan, NativeSparkScanSession session, NativeFrameData data) {
        Intrinsics.j(sparkScan, "sparkScan");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.f122954c.get();
        if (sparkScanInternal != null) {
            Object orPut = this.f122953b.getOrPut(Reflection.b(NativeSparkScan.class), null, sparkScan, new p(sparkScanInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            SparkScanSession sparkScanSession = (SparkScanSession) this.f122953b.getOrPut(Reflection.b(NativeSparkScanSession.class), null, session, new q(sparkScanInternal));
            FrameData frameData = (FrameData) this.f122953b.getOrPut(Reflection.b(NativeFrameData.class), null, data, new r(data));
            this.f122952a.onSessionUpdated((SparkScanInternal) orPut, sparkScanSession, frameData);
        }
    }

    public s(h _SparkScanInternalListener, SparkScanInternal _SparkScanInternal) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_SparkScanInternalListener, "_SparkScanInternalListener");
        Intrinsics.j(_SparkScanInternal, "_SparkScanInternal");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122952a = _SparkScanInternalListener;
        this.f122953b = proxyCache;
        this.f122954c = new WeakReference(_SparkScanInternal);
    }
}
