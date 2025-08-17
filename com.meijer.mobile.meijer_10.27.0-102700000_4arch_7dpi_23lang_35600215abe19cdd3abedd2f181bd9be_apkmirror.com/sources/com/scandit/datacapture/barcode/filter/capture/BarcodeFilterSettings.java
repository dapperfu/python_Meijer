package com.scandit.datacapture.barcode.filter.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\n\n\u0002\b\r\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010#\u001a\u00020\u0003H\u0097\u0001R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RH\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00152\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00158W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00172\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u00178W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettingsProxy;", "impl", "Lcom/scandit/datacapture/barcode/filter/capture/NativeBarcodeFilterSettings;", "(Lcom/scandit/datacapture/barcode/filter/capture/NativeBarcodeFilterSettings;)V", "<set-?>", "", "excludeEan13", "getExcludeEan13", "()Z", "setExcludeEan13", "(Z)V", "excludeUpca", "getExcludeUpca", "setExcludeUpca", "", "excludedCodesRegex", "getExcludedCodesRegex", "()Ljava/lang/String;", "setExcludedCodesRegex", "(Ljava/lang/String;)V", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "", "", "excludedSymbolCounts", "getExcludedSymbolCounts", "()Ljava/util/Map;", "setExcludedSymbolCounts", "(Ljava/util/Map;)V", "excludedSymbologies", "getExcludedSymbologies", "()Ljava/util/Set;", "setExcludedSymbologies", "(Ljava/util/Set;)V", "_impl", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Mockable
/* loaded from: classes11.dex */
public final class BarcodeFilterSettings implements BarcodeFilterSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeFilterSettingsProxyAdapter f120919a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings$Companion;", "", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "create", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeFilterSettings create() {
            NativeBarcodeFilterSettings nativeBarcodeFilterSettingsCreate = NativeBarcodeFilterSettings.create();
            Intrinsics.i(nativeBarcodeFilterSettingsCreate, "create(...)");
            return new BarcodeFilterSettings(nativeBarcodeFilterSettingsCreate);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final BarcodeFilterSettings create() {
        return INSTANCE.create();
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeFilterSettings getF120920a() {
        return this.f120919a.getF120920a();
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "isExcludeEan13", property = "excludeEan13")
    public boolean getExcludeEan13() {
        return this.f120919a.getExcludeEan13();
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "isExcludeUpca", property = "excludeUpca")
    public boolean getExcludeUpca() {
        return this.f120919a.getExcludeUpca();
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "getExcludedCodesRegex", property = "excludedCodesRegex")
    public String getExcludedCodesRegex() {
        return this.f120919a.getExcludedCodesRegex();
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "getExcludedSymbolCounts", property = "excludedSymbolCounts")
    public Map<Symbology, Set<Short>> getExcludedSymbolCounts() {
        return this.f120919a.getExcludedSymbolCounts();
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "getExcludedSymbologies", property = "excludedSymbologies")
    public Set<Symbology> getExcludedSymbologies() {
        return this.f120919a.getExcludedSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "setExcludeEan13", property = "excludeEan13")
    public void setExcludeEan13(boolean z10) {
        this.f120919a.setExcludeEan13(z10);
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "setExcludeUpca", property = "excludeUpca")
    public void setExcludeUpca(boolean z10) {
        this.f120919a.setExcludeUpca(z10);
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "setExcludedCodesRegex", property = "excludedCodesRegex")
    public void setExcludedCodesRegex(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f120919a.setExcludedCodesRegex(str);
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "setExcludedSymbolCounts", property = "excludedSymbolCounts")
    public void setExcludedSymbolCounts(Map<Symbology, ? extends Set<Short>> map) {
        Intrinsics.j(map, "<set-?>");
        this.f120919a.setExcludedSymbolCounts(map);
    }

    @Override // com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettingsProxy
    @ProxyFunction(nativeName = "setExcludedSymbologies", property = "excludedSymbologies")
    public void setExcludedSymbologies(Set<? extends Symbology> set) {
        Intrinsics.j(set, "<set-?>");
        this.f120919a.setExcludedSymbologies(set);
    }

    public BarcodeFilterSettings(NativeBarcodeFilterSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f120919a = new BarcodeFilterSettingsProxyAdapter(impl, null, 2, null);
    }
}
