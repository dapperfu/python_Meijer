package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridElement;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u0097\u0001R\u0014\u0010\u0005\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElement;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElementProxy;", "impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridElement;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridElement;)V", "mainBarcode", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getMainBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "subBarcode", "getSubBarcode", "_impl", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Mockable
/* loaded from: classes12.dex */
public final class BarcodeSpatialGridElement implements BarcodeSpatialGridElementProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeSpatialGridElementProxyAdapter f121640a;

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridElementProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeSpatialGridElement getF121641a() {
        return this.f121640a.getF121641a();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridElementProxy
    @ProxyFunction(nativeName = "mainBarcode", property = "mainBarcode")
    public Barcode getMainBarcode() {
        return this.f121640a.getMainBarcode();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridElementProxy
    @ProxyFunction(nativeName = "subBarcode", property = "subBarcode")
    public Barcode getSubBarcode() {
        return this.f121640a.getSubBarcode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeSpatialGridElement(NativeBarcodeSpatialGridElement impl) {
        Intrinsics.j(impl, "impl");
        this.f121640a = new BarcodeSpatialGridElementProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }
}
