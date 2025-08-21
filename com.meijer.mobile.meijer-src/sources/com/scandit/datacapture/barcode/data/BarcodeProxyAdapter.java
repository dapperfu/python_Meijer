package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/data/BarcodeProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/BarcodeProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "_NativeBarcode", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "getStructuredAppendData", "()Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "structuredAppendData", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeProxyAdapter implements BarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcode f121842a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeProxyAdapter(NativeBarcode _NativeBarcode, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcode, "_NativeBarcode");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121842a = _NativeBarcode;
        this.proxyCache = proxyCache;
    }

    public /* synthetic */ BarcodeProxyAdapter(NativeBarcode nativeBarcode, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcode, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcode getF121842a() {
        return this.f121842a;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    public StructuredAppendData getStructuredAppendData() {
        NativeAbstractStructuredAppendData structuredAppendData = this.f121842a.getStructuredAppendData();
        if (structuredAppendData != null) {
            return (StructuredAppendData) this.proxyCache.getOrPut(Reflection.b(NativeAbstractStructuredAppendData.class), null, structuredAppendData, new b(structuredAppendData));
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.data.BarcodeProxy
    public String toJson() {
        String json = this.f121842a.toJson();
        Intrinsics.g(json);
        return json;
    }
}
