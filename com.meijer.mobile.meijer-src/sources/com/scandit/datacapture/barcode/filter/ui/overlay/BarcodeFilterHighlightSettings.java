package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003H\u0097\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0097\u0001J\u0011\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0097\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsProxy;", "impl", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;)V", "brush", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "highlightType", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "getHighlightType", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "_impl", "_setBrush", "", "_setHighlightType", "type", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Mockable
/* loaded from: classes12.dex */
public final class BarcodeFilterHighlightSettings implements BarcodeFilterOverlaySettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeFilterOverlaySettingsProxyAdapter f121875a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings$Companion;", "", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "_create", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeFilterHighlightSettings _create() {
            NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettingsCreate = NativeBarcodeFilterOverlaySettings.create();
            Intrinsics.i(nativeBarcodeFilterOverlaySettingsCreate, "create(...)");
            return new BarcodeFilterHighlightSettings(nativeBarcodeFilterOverlaySettingsCreate);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final BarcodeFilterHighlightSettings _create() {
        return INSTANCE._create();
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeFilterOverlaySettings getF121881a() {
        return this.f121875a.getF121881a();
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    @ProxyFunction(nativeName = "setBrush")
    public void _setBrush(Brush brush) {
        this.f121875a._setBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    @ProxyFunction(nativeName = "setBarcodeFilterHighlightType")
    public void _setHighlightType(BarcodeFilterHighlightType type) {
        Intrinsics.j(type, "type");
        this.f121875a._setHighlightType(type);
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    @ProxyFunction(nativeName = "getBrush", property = "brush")
    public Brush getBrush() {
        return this.f121875a.getBrush();
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    @ProxyFunction(nativeName = "getOverlayType", property = "highlightType")
    public BarcodeFilterHighlightType getHighlightType() {
        return this.f121875a.getHighlightType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeFilterHighlightSettings(NativeBarcodeFilterOverlaySettings impl) {
        Intrinsics.j(impl, "impl");
        this.f121875a = new BarcodeFilterOverlaySettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }
}
