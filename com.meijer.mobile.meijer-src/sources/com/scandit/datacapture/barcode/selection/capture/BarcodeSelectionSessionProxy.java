package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\fH'J\b\u0010\u0017\u001a\u00020\u0018H'J\b\u0010\u0019\u001a\u00020\u0018H'J\b\u0010\u001a\u001a\u00020\u001bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSessionProxy;", "", "frameSequenceId", "", "getFrameSequenceId", "()J", "lastProcessedFrameId", "", "getLastProcessedFrameId", "()I", "newlySelectedBarcodes", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlySelectedBarcodes", "()Ljava/util/List;", "newlyUnselectedBarcodes", "getNewlyUnselectedBarcodes", "selectedBarcodes", "getSelectedBarcodes", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSession;", "getCount", "barcode", "reset", "", "selectUnselectedBarcodes", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeSelectionSession.class)
/* loaded from: classes12.dex */
public interface BarcodeSelectionSessionProxy {
    @NativeImpl
    NativeBarcodeSelectionSession _impl();

    @ProxyFunction(nativeName = "getCount")
    int getCount(Barcode barcode);

    @ProxyFunction(nativeName = "getFrameSeqIdAndroid", property = "frameSequenceId")
    long getFrameSequenceId();

    @ProxyFunction(property = "lastProcessedFrameId")
    int getLastProcessedFrameId();

    @ProxyFunction(property = "newlySelectedBarcodes")
    List<Barcode> getNewlySelectedBarcodes();

    @ProxyFunction(property = "newlyUnselectedBarcodes")
    List<Barcode> getNewlyUnselectedBarcodes();

    @ProxyFunction(property = "selectedBarcodes")
    List<Barcode> getSelectedBarcodes();

    @ProxyFunction(nativeName = "reset")
    void reset();

    @ProxyFunction(nativeName = "selectAllUnselectedBarcodes")
    void selectUnselectedBarcodes();

    @ProxyFunction
    String toJson();
}
