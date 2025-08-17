package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSessionProxy;", "", "acceptedBarcodes", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getAcceptedBarcodes", "()Ljava/util/List;", "additionalBarcodes", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getAdditionalBarcodes", "correctBarcodes", "getCorrectBarcodes", "missingBarcodes", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "getMissingBarcodes", "rejectedBarcodes", "getRejectedBarcodes", "wrongBarcodes", "getWrongBarcodes", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCountCaptureListSession.class)
/* loaded from: classes11.dex */
public interface BarcodeCountCaptureListSessionProxy {
    @NativeImpl
    /* renamed from: _impl */
    NativeBarcodeCountCaptureListSession getF120653a();

    @ProxyFunction(nativeName = "getAcceptedBarcodesList", property = "acceptedBarcodes")
    List<TrackedBarcode> getAcceptedBarcodes();

    @ProxyFunction(nativeName = "getAdditionalBarcodes", property = "additionalBarcodes")
    List<Barcode> getAdditionalBarcodes();

    @ProxyFunction(nativeName = "getCorrectBarcodes", property = "correctBarcodes")
    List<TrackedBarcode> getCorrectBarcodes();

    @ProxyFunction(nativeName = "getMissingBarcodes", property = "missingBarcodes")
    List<TargetBarcode> getMissingBarcodes();

    @ProxyFunction(nativeName = "getRejectedBarcodesList", property = "rejectedBarcodes")
    List<TrackedBarcode> getRejectedBarcodes();

    @ProxyFunction(nativeName = "getWrongBarcodes", property = "wrongBarcodes")
    List<TrackedBarcode> getWrongBarcodes();

    @ProxyFunction
    String toJson();
}
