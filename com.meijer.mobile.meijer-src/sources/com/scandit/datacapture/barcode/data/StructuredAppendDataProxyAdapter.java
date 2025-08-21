package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData;
import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0013R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/data/StructuredAppendDataProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/StructuredAppendDataProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;", "_NativeAbstractStructuredAppendData", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "isComplete", "()Z", "", "getBarcodeSetId", "()Ljava/lang/String;", "barcodeSetId", "", "getScannedSegmentCount", "()I", "scannedSegmentCount", "getTotalSegmentCount", "totalSegmentCount", "", "Lcom/scandit/datacapture/core/common/buffer/EncodingRange;", "getEncodingRanges", "()Ljava/util/List;", "encodingRanges", "getCompleteData", "completeData", "", "getRawCompleteData", "()[B", "rawCompleteData", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class StructuredAppendDataProxyAdapter implements StructuredAppendDataProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAbstractStructuredAppendData f121862a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public StructuredAppendDataProxyAdapter(NativeAbstractStructuredAppendData _NativeAbstractStructuredAppendData, ProxyCache proxyCache) {
        Intrinsics.j(_NativeAbstractStructuredAppendData, "_NativeAbstractStructuredAppendData");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121862a = _NativeAbstractStructuredAppendData;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    /* renamed from: _impl, reason: from getter */
    public NativeAbstractStructuredAppendData getF121862a() {
        return this.f121862a;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public String getBarcodeSetId() {
        String barcodeSetId = this.f121862a.getBarcodeSetId();
        Intrinsics.g(barcodeSetId);
        return barcodeSetId;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public String getCompleteData() {
        return this.f121862a.getCompleteDataUtf8String();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public List<EncodingRange> getEncodingRanges() {
        ArrayList<EncodingRange> completeDataEncodings = this.f121862a.getCompleteDataEncodings();
        Intrinsics.g(completeDataEncodings);
        return completeDataEncodings;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public byte[] getRawCompleteData() {
        byte[] completeDataRaw = this.f121862a.getCompleteDataRaw();
        Intrinsics.g(completeDataRaw);
        return completeDataRaw;
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public int getScannedSegmentCount() {
        return this.f121862a.getScannedSegmentCount();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public int getTotalSegmentCount() {
        return this.f121862a.getTotalSegmentCount();
    }

    @Override // com.scandit.datacapture.barcode.data.StructuredAppendDataProxy
    public boolean isComplete() {
        return this.f121862a.isComplete();
    }

    public /* synthetic */ StructuredAppendDataProxyAdapter(NativeAbstractStructuredAppendData nativeAbstractStructuredAppendData, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAbstractStructuredAppendData, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
