package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData;
import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u001d\u001a\u00020\u0003H\u0097\u0001R\u0014\u0010\u0005\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "Lcom/scandit/datacapture/barcode/data/StructuredAppendDataProxy;", "impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;)V", "barcodeSetId", "", "getBarcodeSetId", "()Ljava/lang/String;", "completeData", "getCompleteData", "encodingRanges", "", "Lcom/scandit/datacapture/core/common/buffer/EncodingRange;", "getEncodingRanges", "()Ljava/util/List;", "isComplete", "", "()Z", "rawCompleteData", "", "getRawCompleteData", "()[B", "scannedSegmentCount", "", "getScannedSegmentCount", "()I", "totalSegmentCount", "getTotalSegmentCount", "_impl", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Mockable
/* loaded from: classes11.dex */
public final class StructuredAppendData implements StructuredAppendDataProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ StructuredAppendDataProxyAdapter f120909a;

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeAbstractStructuredAppendData getF120910a() {
        return this.f120909a.getF120910a();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @ProxyFunction(property = "barcodeSetId")
    public String getBarcodeSetId() {
        return this.f120909a.getBarcodeSetId();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @ProxyFunction(nativeName = "getCompleteDataUtf8String", property = "completeData")
    public String getCompleteData() {
        return this.f120909a.getCompleteData();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @ProxyFunction(nativeName = "getCompleteDataEncodings", property = "encodingRanges")
    public List<EncodingRange> getEncodingRanges() {
        return this.f120909a.getEncodingRanges();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @ProxyFunction(nativeName = "getCompleteDataRaw", property = "rawCompleteData")
    public byte[] getRawCompleteData() {
        return this.f120909a.getRawCompleteData();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @ProxyFunction(property = "scannedSegmentCount")
    public int getScannedSegmentCount() {
        return this.f120909a.getScannedSegmentCount();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @ProxyFunction(property = "totalSegmentCount")
    public int getTotalSegmentCount() {
        return this.f120909a.getTotalSegmentCount();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    @ProxyFunction(property = "isComplete")
    public boolean isComplete() {
        return this.f120909a.isComplete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StructuredAppendData(NativeAbstractStructuredAppendData impl) {
        Intrinsics.j(impl, "impl");
        this.f120909a = new StructuredAppendDataProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }
}
