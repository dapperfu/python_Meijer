package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProviderCallback;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusResult;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProviderCallbackProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProviderCallbackProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;", "_NativeBarcodeCountStatusProviderCallback", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResult;", "statusResult", "", "onStatusReady", "(Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResult;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountStatusProviderCallbackProxyAdapter implements BarcodeCountStatusProviderCallbackProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountStatusProviderCallback f120875a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCountStatusProviderCallbackProxyAdapter(NativeBarcodeCountStatusProviderCallback _NativeBarcodeCountStatusProviderCallback, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeCountStatusProviderCallback, "_NativeBarcodeCountStatusProviderCallback");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120875a = _NativeBarcodeCountStatusProviderCallback;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusProviderCallbackProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountStatusProviderCallback getF120875a() {
        return this.f120875a;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusProviderCallbackProxy
    public void onStatusReady(BarcodeCountStatusResult statusResult) {
        Intrinsics.j(statusResult, "statusResult");
        NativeBarcodeCountStatusResult f120878a = statusResult.getF120878a();
        this.proxyCache.put(Reflection.b(NativeBarcodeCountStatusResult.class), null, f120878a, statusResult);
        this.f120875a.onStatusReady(f120878a);
    }

    public /* synthetic */ BarcodeCountStatusProviderCallbackProxyAdapter(NativeBarcodeCountStatusProviderCallback nativeBarcodeCountStatusProviderCallback, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountStatusProviderCallback, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
