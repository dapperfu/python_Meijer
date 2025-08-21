package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionType;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapSelectionProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapSelectionProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeTapSelection;", "_NativeTapSelection", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeTapSelection;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeTapSelection;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionType;", "_selectionTypeImpl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionType;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;", "p0", "getFreezeBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;", "setFreezeBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;)V", "freezeBehavior", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;", "getTapBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;", "setTapBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;)V", "tapBehavior", "", "getShouldFreezeOnDoubleTap", "()Z", "setShouldFreezeOnDoubleTap", "(Z)V", "shouldFreezeOnDoubleTap", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeSelectionTapSelectionProxyAdapter implements BarcodeSelectionTapSelectionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeTapSelection f124750a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeSelectionType f124752c;

    public BarcodeSelectionTapSelectionProxyAdapter(NativeTapSelection _NativeTapSelection, ProxyCache proxyCache) {
        Intrinsics.j(_NativeTapSelection, "_NativeTapSelection");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124750a = _NativeTapSelection;
        this.proxyCache = proxyCache;
        NativeSelectionType nativeSelectionTypeAsSelectionType = _NativeTapSelection.asSelectionType();
        Intrinsics.i(nativeSelectionTypeAsSelectionType, "asSelectionType(...)");
        this.f124752c = nativeSelectionTypeAsSelectionType;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    /* renamed from: _impl, reason: from getter */
    public NativeTapSelection getF124750a() {
        return this.f124750a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    /* renamed from: _selectionTypeImpl, reason: from getter */
    public NativeSelectionType getF124752c() {
        return this.f124752c;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public BarcodeSelectionFreezeBehavior getFreezeBehavior() {
        BarcodeSelectionFreezeBehavior freezeBehavior = this.f124750a.getFreezeBehavior();
        Intrinsics.g(freezeBehavior);
        return freezeBehavior;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public boolean getShouldFreezeOnDoubleTap() {
        return this.f124750a.getShouldFreezeOnDoubleTap();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public BarcodeSelectionTapBehavior getTapBehavior() {
        BarcodeSelectionTapBehavior tapBehavior = this.f124750a.getTapBehavior();
        Intrinsics.g(tapBehavior);
        return tapBehavior;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public void setFreezeBehavior(BarcodeSelectionFreezeBehavior p02) {
        Intrinsics.j(p02, "p0");
        this.f124750a.setFreezeBehavior(p02);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public void setShouldFreezeOnDoubleTap(boolean z10) {
        this.f124750a.setShouldFreezeOnDoubleTap(z10);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public void setTapBehavior(BarcodeSelectionTapBehavior p02) {
        Intrinsics.j(p02, "p0");
        this.f124750a.setTapBehavior(p02);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapSelectionProxy
    public String toJson() {
        String json = this.f124750a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ BarcodeSelectionTapSelectionProxyAdapter(NativeTapSelection nativeTapSelection, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeTapSelection, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
