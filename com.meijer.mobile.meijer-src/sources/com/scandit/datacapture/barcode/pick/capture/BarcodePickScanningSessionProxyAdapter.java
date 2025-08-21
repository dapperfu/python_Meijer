package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningSessionProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickScanningSession;", "_NativeBarcodePickScanningSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickScanningSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "getPickedItems", "()Ljava/util/Set;", "pickedItems", "getScannedItems", "scannedItems", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodePickScanningSessionProxyAdapter implements BarcodePickScanningSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickScanningSession f124527a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickScanningSessionProxyAdapter(NativeBarcodePickScanningSession _NativeBarcodePickScanningSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodePickScanningSession, "_NativeBarcodePickScanningSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124527a = _NativeBarcodePickScanningSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    public Set<String> getPickedItems() {
        HashSet<String> pickedObjects = this.f124527a.getPickedObjects();
        Intrinsics.g(pickedObjects);
        return pickedObjects;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    public Set<String> getScannedItems() {
        HashSet<String> scannedObjects = this.f124527a.getScannedObjects();
        Intrinsics.g(scannedObjects);
        return scannedObjects;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    public String toJson() {
        String json = this.f124527a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ BarcodePickScanningSessionProxyAdapter(NativeBarcodePickScanningSession nativeBarcodePickScanningSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickScanningSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
