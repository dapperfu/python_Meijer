package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J!\u0010\u0017\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangular;", "_NativeBarcodePickViewHighlightStyleRectangular", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangular;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangular;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "state", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrushForState", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "", "setBrushForState", "(Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "getSelectedBrushForState", "setSelectedBrushForState", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "p0", "getMinimumHighlightWidth", "()I", "setMinimumHighlightWidth", "(I)V", "minimumHighlightWidth", "getMinimumHighlightHeight", "setMinimumHighlightHeight", "minimumHighlightHeight", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodePickViewHighlightStyleRectangularProxyAdapter implements BarcodePickViewHighlightStyleRectangularProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickViewHighlightStyleRectangular f124641a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeBarcodePickViewHighlightStyle f124643c;

    public BarcodePickViewHighlightStyleRectangularProxyAdapter(NativeBarcodePickViewHighlightStyleRectangular _NativeBarcodePickViewHighlightStyleRectangular, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodePickViewHighlightStyleRectangular, "_NativeBarcodePickViewHighlightStyleRectangular");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124641a = _NativeBarcodePickViewHighlightStyleRectangular;
        this.proxyCache = proxyCache;
        NativeBarcodePickViewHighlightStyle nativeBarcodePickViewHighlightStyleAsHighlightStyle = _NativeBarcodePickViewHighlightStyleRectangular.asHighlightStyle();
        Intrinsics.i(nativeBarcodePickViewHighlightStyleAsHighlightStyle, "asHighlightStyle(...)");
        this.f124643c = nativeBarcodePickViewHighlightStyleAsHighlightStyle;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    /* renamed from: _highlightStyleImpl, reason: from getter */
    public NativeBarcodePickViewHighlightStyle getF124643c() {
        return this.f124643c;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickViewHighlightStyleRectangular getF124641a() {
        return this.f124641a;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    public Brush getBrushForState(BarcodePickState state) {
        Intrinsics.j(state, "state");
        NativeBrush nativeBrushBrushForState = this.f124641a.brushForState(BarcodeNativeTypeFactory.INSTANCE.convert(state));
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(nativeBrushBrushForState);
        return coreNativeTypeFactory.convert(nativeBrushBrushForState);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    public int getMinimumHighlightHeight() {
        return this.f124641a.getMinimumHighlightHeight();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    public int getMinimumHighlightWidth() {
        return this.f124641a.getMinimumHighlightWidth();
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    public Brush getSelectedBrushForState(BarcodePickState state) {
        Intrinsics.j(state, "state");
        NativeBrush nativeBrushSelectedBrushForState = this.f124641a.selectedBrushForState(BarcodeNativeTypeFactory.INSTANCE.convert(state));
        if (nativeBrushSelectedBrushForState != null) {
            return CoreNativeTypeFactory.INSTANCE.convert(nativeBrushSelectedBrushForState);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    public void setBrushForState(Brush brush, BarcodePickState state) {
        Intrinsics.j(brush, "brush");
        Intrinsics.j(state, "state");
        this.f124641a.setBrushForState(CoreNativeTypeFactory.INSTANCE.convert(brush), BarcodeNativeTypeFactory.INSTANCE.convert(state));
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    public void setMinimumHighlightHeight(int i10) {
        this.f124641a.setMinimumHighlightHeight(i10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    public void setMinimumHighlightWidth(int i10) {
        this.f124641a.setMinimumHighlightWidth(i10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
    public void setSelectedBrushForState(Brush brush, BarcodePickState state) {
        Intrinsics.j(state, "state");
        this.f124641a.setSelectedBrushForState(brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null, BarcodeNativeTypeFactory.INSTANCE.convert(state));
    }

    public /* synthetic */ BarcodePickViewHighlightStyleRectangularProxyAdapter(NativeBarcodePickViewHighlightStyleRectangular nativeBarcodePickViewHighlightStyleRectangular, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickViewHighlightStyleRectangular, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
