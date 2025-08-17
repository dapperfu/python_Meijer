package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f122942a;

    public h(SparkScanInternal owner) {
        Intrinsics.j(owner, "owner");
        this.f122942a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.j
    public final void onBarcodeScanned(SparkScanInternal sparkScan, SparkScanSession session, FrameData data) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(sparkScan, "sparkScan");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.f122942a.get();
        if (sparkScanInternal == null || (copyOnWriteArraySet = sparkScanInternal.f122929c) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((j) it.next()).onBarcodeScanned(sparkScan, session, data);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.j
    public final void onObservationStarted(SparkScanInternal sparkScan) {
        Intrinsics.j(sparkScan, "sparkScan");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.j
    public final void onObservationStopped(SparkScanInternal sparkScan) {
        Intrinsics.j(sparkScan, "sparkScan");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.j
    public final void onSessionUpdated(SparkScanInternal sparkScan, SparkScanSession session, FrameData data) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(sparkScan, "sparkScan");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.f122942a.get();
        if (sparkScanInternal == null || (copyOnWriteArraySet = sparkScanInternal.f122929c) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((j) it.next()).onSessionUpdated(sparkScan, session, data);
        }
    }
}
