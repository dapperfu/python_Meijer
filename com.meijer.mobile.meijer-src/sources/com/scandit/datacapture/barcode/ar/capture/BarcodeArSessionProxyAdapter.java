package com.scandit.datacapture.barcode.ar.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSessionProxy;", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSession;", "_NativeBarcodeArSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "", "reset", "()V", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getAddedTrackedBarcodes", "()Ljava/util/List;", "addedTrackedBarcodes", "", "", "getTrackedBarcodes", "()Ljava/util/Map;", "trackedBarcodes", "getRemovedTrackedBarcodes", "removedTrackedBarcodes", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArSessionProxyAdapter implements BarcodeArSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeArSession f121049a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeArSessionProxyAdapter(NativeBarcodeArSession _NativeBarcodeArSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeArSession, "_NativeBarcodeArSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121049a = _NativeBarcodeArSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public List<TrackedBarcode> getAddedTrackedBarcodes() {
        ArrayList<NativeTrackedBarcode> addedTrackedBarcodes = this.f121049a.getAddedTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(addedTrackedBarcodes);
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(addedTrackedBarcodes);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public List<Integer> getRemovedTrackedBarcodes() {
        ArrayList<Integer> removedTrackedBarcodes = this.f121049a.getRemovedTrackedBarcodes();
        Intrinsics.g(removedTrackedBarcodes);
        return removedTrackedBarcodes;
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public Map<Integer, TrackedBarcode> getTrackedBarcodes() {
        HashMap<Integer, NativeTrackedBarcode> trackedBarcodes = this.f121049a.getTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(trackedBarcodes);
        return barcodeNativeTypeFactory.convert(trackedBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public void reset() {
        this.f121049a.reset();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public String toJson() {
        String json = this.f121049a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ BarcodeArSessionProxyAdapter(NativeBarcodeArSession nativeBarcodeArSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeArSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
