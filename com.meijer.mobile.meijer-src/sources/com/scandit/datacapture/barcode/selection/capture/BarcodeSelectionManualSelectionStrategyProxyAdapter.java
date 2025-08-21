package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeManualSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionStrategy;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionManualSelectionStrategyProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionManualSelectionStrategyProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeManualSelectionStrategy;", "_NativeManualSelectionStrategy", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeManualSelectionStrategy;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeManualSelectionStrategy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionStrategy;", "_selectionStrategyImpl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionStrategy;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeSelectionManualSelectionStrategyProxyAdapter implements BarcodeSelectionManualSelectionStrategyProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManualSelectionStrategy f124734a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeSelectionStrategy f124736c;

    public BarcodeSelectionManualSelectionStrategyProxyAdapter(NativeManualSelectionStrategy _NativeManualSelectionStrategy, ProxyCache proxyCache) {
        Intrinsics.j(_NativeManualSelectionStrategy, "_NativeManualSelectionStrategy");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124734a = _NativeManualSelectionStrategy;
        this.proxyCache = proxyCache;
        NativeSelectionStrategy nativeSelectionStrategyAsSelectionStrategy = _NativeManualSelectionStrategy.asSelectionStrategy();
        Intrinsics.i(nativeSelectionStrategyAsSelectionStrategy, "asSelectionStrategy(...)");
        this.f124736c = nativeSelectionStrategyAsSelectionStrategy;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionManualSelectionStrategyProxy
    /* renamed from: _impl, reason: from getter */
    public NativeManualSelectionStrategy getF124734a() {
        return this.f124734a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionManualSelectionStrategyProxy
    /* renamed from: _selectionStrategyImpl, reason: from getter */
    public NativeSelectionStrategy getF124736c() {
        return this.f124736c;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionManualSelectionStrategyProxy
    public String toJson() {
        String json = this.f124734a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ BarcodeSelectionManualSelectionStrategyProxyAdapter(NativeManualSelectionStrategy nativeManualSelectionStrategy, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeManualSelectionStrategy, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
