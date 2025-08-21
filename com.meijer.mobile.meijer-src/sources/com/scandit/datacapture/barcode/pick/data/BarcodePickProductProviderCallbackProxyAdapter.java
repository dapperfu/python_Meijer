package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallback;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallback;", "_NativeProductProviderCallback", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallback;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallback;", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItem;", "data", "", "onData", "(Ljava/util/List;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodePickProductProviderCallbackProxyAdapter implements BarcodePickProductProviderCallbackProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeProductProviderCallback f124558a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickProductProviderCallbackProxyAdapter(NativeProductProviderCallback _NativeProductProviderCallback, ProxyCache proxyCache) {
        Intrinsics.j(_NativeProductProviderCallback, "_NativeProductProviderCallback");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124558a = _NativeProductProviderCallback;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackProxy
    /* renamed from: _impl, reason: from getter */
    public NativeProductProviderCallback getF124558a() {
        return this.f124558a;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackProxy
    public void onData(List<BarcodePickProductProviderCallbackItem> data) {
        Intrinsics.j(data, "data");
        this.f124558a.onData(BarcodeNativeTypeFactory.INSTANCE.convertProductProviderCallbackItemToNativeImpl(data));
    }

    public /* synthetic */ BarcodePickProductProviderCallbackProxyAdapter(NativeProductProviderCallback nativeProductProviderCallback, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeProductProviderCallback, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
