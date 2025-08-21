package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSession;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0016\u001a\u00020\u0017H'J\b\u0010\u0018\u001a\u00020\u0019H'J\b\u0010\u001a\u001a\u00020\u001bH'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSessionProxy;", "", "addedTrackedBarcodes", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getAddedTrackedBarcodes", "()Ljava/util/List;", "frameSequenceId", "", "getFrameSequenceId", "()J", "removedTrackedBarcodes", "", "getRemovedTrackedBarcodes", "trackedBarcodes", "", "getTrackedBarcodes", "()Ljava/util/Map;", "unscannedTrackedBarcodes", "getUnscannedTrackedBarcodes", "updatedTrackedBarcodes", "getUpdatedTrackedBarcodes", "_impl", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSession;", "reset", "", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeTrackingSession.class)
/* loaded from: classes12.dex */
public interface BarcodeBatchSessionProxy {
    @NativeImpl
    NativeBarcodeTrackingSession _impl();

    @ProxyFunction(property = "addedTrackedBarcodes")
    List<TrackedBarcode> getAddedTrackedBarcodes();

    @ProxyFunction(nativeName = "getFrameSeqIdAndroid", property = "frameSequenceId")
    long getFrameSequenceId();

    @ProxyFunction(property = "removedTrackedBarcodes")
    List<Integer> getRemovedTrackedBarcodes();

    @ProxyFunction(property = "trackedBarcodes")
    Map<Integer, TrackedBarcode> getTrackedBarcodes();

    @ProxyFunction(property = "unscannedTrackedBarcodes")
    List<TrackedBarcode> getUnscannedTrackedBarcodes();

    @ProxyFunction(property = "updatedTrackedBarcodes")
    List<TrackedBarcode> getUpdatedTrackedBarcodes();

    @ProxyFunction
    void reset();

    @ProxyFunction
    String toJson();
}
