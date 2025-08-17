package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickStatusIconSettings;", "_NativeBarcodePickStatusIconSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickStatusIconSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickStatusIconSettings;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "p0", "getRatioToHighlightSize", "()F", "setRatioToHighlightSize", "(F)V", "ratioToHighlightSize", "", "getMinSize", "()I", "setMinSize", "(I)V", "minSize", "getMaxSize", "setMaxSize", "maxSize", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickStatusIconSettingsProxyAdapter implements BarcodePickStatusIconSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickStatusIconSettings f123644a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickStatusIconSettingsProxyAdapter(NativeBarcodePickStatusIconSettings _NativeBarcodePickStatusIconSettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodePickStatusIconSettings, "_NativeBarcodePickStatusIconSettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123644a = _NativeBarcodePickStatusIconSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickStatusIconSettings getF123644a() {
        return this.f123644a;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public int getMaxSize() {
        return this.f123644a.getMaxSize();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public int getMinSize() {
        return this.f123644a.getMinSize();
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public float getRatioToHighlightSize() {
        return this.f123644a.getSizeToHighlightSizeRatio();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public void setMaxSize(int i10) {
        this.f123644a.setMaxSize(i10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public void setMinSize(int i10) {
        this.f123644a.setMinSize(i10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettingsProxy
    public void setRatioToHighlightSize(float f10) {
        this.f123644a.setSizeToHighlightSizeRatio(f10);
    }

    public /* synthetic */ BarcodePickStatusIconSettingsProxyAdapter(NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickStatusIconSettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
