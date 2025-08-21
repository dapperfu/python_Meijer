package com.scandit.datacapture.barcode.filter.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\n\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010 \u001a\u00020!H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RH\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00122\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00128g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00130\u00148g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettingsProxy;", "", "<set-?>", "", "excludeEan13", "getExcludeEan13", "()Z", "setExcludeEan13", "(Z)V", "excludeUpca", "getExcludeUpca", "setExcludeUpca", "", "excludedCodesRegex", "getExcludedCodesRegex", "()Ljava/lang/String;", "setExcludedCodesRegex", "(Ljava/lang/String;)V", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "", "", "excludedSymbolCounts", "getExcludedSymbolCounts", "()Ljava/util/Map;", "setExcludedSymbolCounts", "(Ljava/util/Map;)V", "excludedSymbologies", "getExcludedSymbologies", "()Ljava/util/Set;", "setExcludedSymbologies", "(Ljava/util/Set;)V", "_impl", "Lcom/scandit/datacapture/barcode/filter/capture/NativeBarcodeFilterSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeFilterSettings.class)
/* loaded from: classes12.dex */
public interface BarcodeFilterSettingsProxy {
    @NativeImpl
    NativeBarcodeFilterSettings _impl();

    @ProxyFunction(nativeName = "isExcludeEan13", property = "excludeEan13")
    boolean getExcludeEan13();

    @ProxyFunction(nativeName = "isExcludeUpca", property = "excludeUpca")
    boolean getExcludeUpca();

    @ProxyFunction(nativeName = "getExcludedCodesRegex", property = "excludedCodesRegex")
    String getExcludedCodesRegex();

    @ProxyFunction(nativeName = "getExcludedSymbolCounts", property = "excludedSymbolCounts")
    Map<Symbology, Set<Short>> getExcludedSymbolCounts();

    @ProxyFunction(nativeName = "getExcludedSymbologies", property = "excludedSymbologies")
    Set<Symbology> getExcludedSymbologies();

    @ProxyFunction(nativeName = "setExcludeEan13", property = "excludeEan13")
    void setExcludeEan13(boolean z10);

    @ProxyFunction(nativeName = "setExcludeUpca", property = "excludeUpca")
    void setExcludeUpca(boolean z10);

    @ProxyFunction(nativeName = "setExcludedCodesRegex", property = "excludedCodesRegex")
    void setExcludedCodesRegex(String str);

    @ProxyFunction(nativeName = "setExcludedSymbolCounts", property = "excludedSymbolCounts")
    void setExcludedSymbolCounts(Map<Symbology, ? extends Set<Short>> map);

    @ProxyFunction(nativeName = "setExcludedSymbologies", property = "excludedSymbologies")
    void setExcludedSymbologies(Set<? extends Symbology> set);
}
