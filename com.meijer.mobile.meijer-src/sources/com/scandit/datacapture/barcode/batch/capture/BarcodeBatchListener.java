package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingListener;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodeBatch.class, value = NativeBarcodeTrackingListener.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchListener;", "", "onObservationStarted", "", "barcodeBatch", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "onObservationStopped", "onSessionUpdated", "mode", "session", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSession;", "data", "Lcom/scandit/datacapture/core/data/FrameData;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeBatchListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onObservationStarted(BarcodeBatchListener barcodeBatchListener, BarcodeBatch barcodeBatch) {
            Intrinsics.j(barcodeBatch, "barcodeBatch");
        }

        @ProxyFunction
        public static void onObservationStopped(BarcodeBatchListener barcodeBatchListener, BarcodeBatch barcodeBatch) {
            Intrinsics.j(barcodeBatch, "barcodeBatch");
        }

        @ProxyFunction
        public static void onSessionUpdated(BarcodeBatchListener barcodeBatchListener, BarcodeBatch mode, BarcodeBatchSession session, FrameData data) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(session, "session");
            Intrinsics.j(data, "data");
        }
    }

    @ProxyFunction
    void onObservationStarted(BarcodeBatch barcodeBatch);

    @ProxyFunction
    void onObservationStopped(BarcodeBatch barcodeBatch);

    @ProxyFunction
    void onSessionUpdated(BarcodeBatch mode, BarcodeBatchSession session, FrameData data);
}
