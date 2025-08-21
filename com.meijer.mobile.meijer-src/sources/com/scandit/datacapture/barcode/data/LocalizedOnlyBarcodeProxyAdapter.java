package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcodeProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcodeProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeLocalizedOnlyBarcode;", "_NativeLocalizedOnlyBarcode", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeLocalizedOnlyBarcode;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeLocalizedOnlyBarcode;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "location", "", "getFrameId", "()I", "frameId", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class LocalizedOnlyBarcodeProxyAdapter implements LocalizedOnlyBarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeLocalizedOnlyBarcode f121859a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public LocalizedOnlyBarcodeProxyAdapter(NativeLocalizedOnlyBarcode _NativeLocalizedOnlyBarcode, ProxyCache proxyCache) {
        Intrinsics.j(_NativeLocalizedOnlyBarcode, "_NativeLocalizedOnlyBarcode");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121859a = _NativeLocalizedOnlyBarcode;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.LocalizedOnlyBarcodeProxy
    /* renamed from: _impl, reason: from getter */
    public NativeLocalizedOnlyBarcode getF121859a() {
        return this.f121859a;
    }

    @Override // com.scandit.datacapture.barcode.data.LocalizedOnlyBarcodeProxy
    public int getFrameId() {
        return this.f121859a.getFrameId();
    }

    @Override // com.scandit.datacapture.barcode.data.LocalizedOnlyBarcodeProxy
    public Quadrilateral getLocation() {
        Quadrilateral location = this.f121859a.getLocation();
        Intrinsics.g(location);
        return location;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.LocalizedOnlyBarcodeProxy
    public String toJson() {
        String json = this.f121859a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ LocalizedOnlyBarcodeProxyAdapter(NativeLocalizedOnlyBarcode nativeLocalizedOnlyBarcode, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeLocalizedOnlyBarcode, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
