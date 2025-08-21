package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.LocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSessionProxy;", "", "_newlyRecognizedBarcodes", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "get_newlyRecognizedBarcodes", "()Ljava/util/List;", "frameSequenceId", "", "getFrameSequenceId", "()J", "newlyLocalizedBarcodes", "Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcode;", "getNewlyLocalizedBarcodes", "newlyRecognizedBarcode", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "reset", "", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCaptureSession.class)
/* loaded from: classes12.dex */
public interface BarcodeCaptureSessionProxy {
    @ProxyFunction(nativeName = "getFrameSeqIdAndroid", property = "frameSequenceId")
    long getFrameSequenceId();

    @ProxyFunction(property = "newlyLocalizedBarcodes")
    List<LocalizedOnlyBarcode> getNewlyLocalizedBarcodes();

    @ProxyFunction(property = "newlyRecognizedBarcode")
    Barcode getNewlyRecognizedBarcode();

    @ProxyFunction(nativeName = "getNewlyRecognizedBarcodes", property = "_newlyRecognizedBarcodes")
    List<Barcode> get_newlyRecognizedBarcodes();

    @ProxyFunction(nativeName = "clear")
    void reset();

    @ProxyFunction(nativeName = "toJson")
    String toJson();
}
