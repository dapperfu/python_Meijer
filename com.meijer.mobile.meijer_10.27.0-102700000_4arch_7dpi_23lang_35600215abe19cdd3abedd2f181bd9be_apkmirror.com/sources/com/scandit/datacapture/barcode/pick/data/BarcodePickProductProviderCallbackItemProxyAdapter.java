package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallbackItem;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItemProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItemProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallbackItem;", "_NativeProductProviderCallbackItem", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallbackItem;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallbackItem;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "getItemData", "()Ljava/lang/String;", "itemData", "getProductIdentifier", "productIdentifier", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickProductProviderCallbackItemProxyAdapter implements BarcodePickProductProviderCallbackItemProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeProductProviderCallbackItem f123604a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickProductProviderCallbackItemProxyAdapter(NativeProductProviderCallbackItem _NativeProductProviderCallbackItem, ProxyCache proxyCache) {
        Intrinsics.j(_NativeProductProviderCallbackItem, "_NativeProductProviderCallbackItem");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123604a = _NativeProductProviderCallbackItem;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItemProxy
    /* renamed from: _impl, reason: from getter */
    public NativeProductProviderCallbackItem getF123604a() {
        return this.f123604a;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItemProxy
    public String getItemData() {
        String toBeTransformedData = this.f123604a.getToBeTransformedData();
        Intrinsics.g(toBeTransformedData);
        return toBeTransformedData;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItemProxy
    public String getProductIdentifier() {
        return this.f123604a.getTransformationResult();
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodePickProductProviderCallbackItemProxyAdapter(NativeProductProviderCallbackItem nativeProductProviderCallbackItem, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeProductProviderCallbackItem, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
