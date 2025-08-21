package com.scandit.datacapture.barcode.internal.module.batch.capture;

import com.scandit.datacapture.barcode.batch.capture.BarcodeBatch;
import com.scandit.datacapture.barcode.batch.capture.BarcodeBatchListener;
import com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSession;
import com.scandit.datacapture.core.data.FrameData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements BarcodeBatchListener {

    /* renamed from: a, reason: collision with root package name */
    public Runnable f122215a;

    /* renamed from: b, reason: collision with root package name */
    public long f122216b = 1500;

    /* renamed from: c, reason: collision with root package name */
    public long f122217c = -1;

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchListener
    public final void onSessionUpdated(BarcodeBatch mode, BarcodeBatchSession session, FrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.j(session, "session");
        if (!session.getAddedTrackedBarcodes().isEmpty() || !session.getRemovedTrackedBarcodes().isEmpty() || this.f122217c == -1) {
            this.f122217c = jCurrentTimeMillis;
            return;
        }
        if (session.getTrackedBarcodes().isEmpty() || jCurrentTimeMillis - this.f122217c < this.f122216b) {
            return;
        }
        Runnable runnable = this.f122215a;
        if (runnable != null) {
            runnable.run();
        }
        this.f122217c = -1L;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchListener
    public final void onObservationStarted(BarcodeBatch barcodeBatch) {
        BarcodeBatchListener.DefaultImpls.onObservationStarted(this, barcodeBatch);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchListener
    public final void onObservationStopped(BarcodeBatch barcodeBatch) {
        BarcodeBatchListener.DefaultImpls.onObservationStopped(this, barcodeBatch);
    }
}
