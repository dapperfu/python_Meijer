package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridElement;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElementProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElementProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridElement;", "_NativeBarcodeSpatialGridElement", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridElement;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridElement;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getMainBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "mainBarcode", "getSubBarcode", "subBarcode", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeSpatialGridElementProxyAdapter implements BarcodeSpatialGridElementProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSpatialGridElement f120689a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeSpatialGridElementProxyAdapter(NativeBarcodeSpatialGridElement _NativeBarcodeSpatialGridElement, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeSpatialGridElement, "_NativeBarcodeSpatialGridElement");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120689a = _NativeBarcodeSpatialGridElement;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridElementProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeSpatialGridElement getF120689a() {
        return this.f120689a;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridElementProxy
    public Barcode getMainBarcode() {
        NativeBarcode nativeBarcodeMainBarcode = this.f120689a.mainBarcode();
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcode.class);
        Intrinsics.g(nativeBarcodeMainBarcode);
        return (Barcode) proxyCache.getOrPut(kClassB, null, nativeBarcodeMainBarcode, new c(nativeBarcodeMainBarcode));
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridElementProxy
    public Barcode getSubBarcode() {
        NativeBarcode nativeBarcodeSubBarcode = this.f120689a.subBarcode();
        if (nativeBarcodeSubBarcode != null) {
            return (Barcode) this.proxyCache.getOrPut(Reflection.b(NativeBarcode.class), null, nativeBarcodeSubBarcode, new d(nativeBarcodeSubBarcode));
        }
        return null;
    }

    public /* synthetic */ BarcodeSpatialGridElementProxyAdapter(NativeBarcodeSpatialGridElement nativeBarcodeSpatialGridElement, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeSpatialGridElement, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
