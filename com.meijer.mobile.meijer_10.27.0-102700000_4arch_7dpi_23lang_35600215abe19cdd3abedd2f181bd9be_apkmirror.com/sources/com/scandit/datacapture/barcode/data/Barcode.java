package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.module.data.NativeBarcodeRecord;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010)\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001eR\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\nR\u0013\u00101\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\nR\u0013\u00103\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\nR\u0011\u00105\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0011\u00106\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001eR\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010%R\u0011\u0010>\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b=\u0010\n¨\u0006?"}, d2 = {"Lcom/scandit/datacapture/barcode/data/Barcode;", "Lcom/scandit/datacapture/barcode/data/BarcodeProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "getStructuredAppendData", "()Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "structuredAppendData", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "", "Lcom/scandit/datacapture/core/common/buffer/EncodingRange;", "getEncodingRanges", "()Ljava/util/List;", "encodingRanges", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "location", "", "isGs1DataCarrier", "()Z", "Lcom/scandit/datacapture/barcode/data/CompositeFlag;", "getCompositeFlag", "()Lcom/scandit/datacapture/barcode/data/CompositeFlag;", "compositeFlag", "", "getFrameId", "()I", "frameId", "getSymbolCount", "symbolCount", "isColorInverted", "", "getRawData", "()[B", "rawData", "getData", "data", "getAddOnData", "addOnData", "getCompositeData", "compositeData", "getCompositeRawData", "compositeRawData", "isStructuredAppend", "", "get_pixelsPerElement", "()F", "_pixelsPerElement", "getGlobalId$scandit_barcode_capture", "globalId", "get_uniqueHash", "_uniqueHash", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class Barcode implements BarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeProxyAdapter f120888a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f120889b;

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcode getF120890a() {
        return this.f120888a.getF120890a();
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    @ProxyFunction(nativeName = "getStructuredAppendData", property = "structuredAppendData")
    public StructuredAppendData getStructuredAppendData() {
        return this.f120888a.getStructuredAppendData();
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    @ProxyFunction(nativeName = "toJson")
    public String toJson() {
        return this.f120888a.toJson();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Barcode(NativeBarcode impl) {
        Intrinsics.j(impl, "impl");
        this.f120888a = new BarcodeProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.f120889b = LazyKt.b(new a(this));
    }

    private final NativeBarcodeRecord a() {
        Object value = this.f120889b.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (NativeBarcodeRecord) value;
    }

    public final String getAddOnData() {
        return a().getAddOnData();
    }

    public final String getCompositeData() {
        return a().getCompositeData();
    }

    public final CompositeFlag getCompositeFlag() {
        CompositeFlag compositeFlag = a().getCompositeFlag();
        Intrinsics.i(compositeFlag, "getCompositeFlag(...)");
        return compositeFlag;
    }

    public final byte[] getCompositeRawData() {
        byte[] compositeRawData = a().getCompositeRawData();
        Intrinsics.i(compositeRawData, "getCompositeRawData(...)");
        return compositeRawData;
    }

    public final String getData() {
        return a().getUtf8String();
    }

    public final List<EncodingRange> getEncodingRanges() {
        ArrayList<EncodingRange> dataEncoding = a().getDataEncoding();
        Intrinsics.i(dataEncoding, "getDataEncoding(...)");
        return dataEncoding;
    }

    public final int getFrameId() {
        return a().getFrameId();
    }

    public final int getGlobalId$scandit_barcode_capture() {
        Integer globalId = a().getGlobalId();
        if (globalId == null) {
            return -1;
        }
        return globalId.intValue();
    }

    public final Quadrilateral getLocation() {
        Quadrilateral location = a().getLocation();
        Intrinsics.i(location, "getLocation(...)");
        return location;
    }

    public final byte[] getRawData() {
        byte[] data = a().getData();
        Intrinsics.i(data, "getData(...)");
        return data;
    }

    public final int getSymbolCount() {
        return a().getSymbolCount();
    }

    public final Symbology getSymbology() {
        Symbology symbology = a().getSymbology();
        Intrinsics.i(symbology, "getSymbology(...)");
        return symbology;
    }

    public final float get_pixelsPerElement() {
        return a().getPixelsPerComponent();
    }

    public final String get_uniqueHash() {
        String uniqueHash = a().getUniqueHash();
        Intrinsics.i(uniqueHash, "getUniqueHash(...)");
        return uniqueHash;
    }

    public final boolean isColorInverted() {
        return a().getColorInverted();
    }

    public final boolean isGs1DataCarrier() {
        return a().getGs1DataCarrier();
    }

    public final boolean isStructuredAppend() {
        return a().getStructuredAppend();
    }
}
