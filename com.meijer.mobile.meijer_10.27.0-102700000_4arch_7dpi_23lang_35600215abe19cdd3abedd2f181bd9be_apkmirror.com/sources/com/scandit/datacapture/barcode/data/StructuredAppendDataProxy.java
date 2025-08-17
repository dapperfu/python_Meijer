package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData;
import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u001a\u001a\u00020\u001bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/data/StructuredAppendDataProxy;", "", "barcodeSetId", "", "getBarcodeSetId", "()Ljava/lang/String;", "completeData", "getCompleteData", "encodingRanges", "", "Lcom/scandit/datacapture/core/common/buffer/EncodingRange;", "getEncodingRanges", "()Ljava/util/List;", "isComplete", "", "()Z", "rawCompleteData", "", "getRawCompleteData", "()[B", "scannedSegmentCount", "", "getScannedSegmentCount", "()I", "totalSegmentCount", "getTotalSegmentCount", "_impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeAbstractStructuredAppendData.class)
/* loaded from: classes11.dex */
public interface StructuredAppendDataProxy {
    @NativeImpl
    NativeAbstractStructuredAppendData _impl();

    @ProxyFunction(property = "barcodeSetId")
    String getBarcodeSetId();

    @ProxyFunction(nativeName = "getCompleteDataUtf8String", property = "completeData")
    String getCompleteData();

    @ProxyFunction(nativeName = "getCompleteDataEncodings", property = "encodingRanges")
    List<EncodingRange> getEncodingRanges();

    @ProxyFunction(nativeName = "getCompleteDataRaw", property = "rawCompleteData")
    byte[] getRawCompleteData();

    @ProxyFunction(property = "scannedSegmentCount")
    int getScannedSegmentCount();

    @ProxyFunction(property = "totalSegmentCount")
    int getTotalSegmentCount();

    @ProxyFunction(property = "isComplete")
    boolean isComplete();
}
