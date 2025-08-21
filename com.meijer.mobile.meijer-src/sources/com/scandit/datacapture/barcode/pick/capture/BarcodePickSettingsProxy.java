package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u001a\u001a\u00020\u001bH'J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH'J\u0016\u0010 \u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0003H'J\u0010\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020\u000bH'J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR$\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\b¨\u0006*"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettingsProxy;", "", "<set-?>", "", "cachingEnabled", "getCachingEnabled", "()Z", "setCachingEnabled", "(Z)V", "enabledSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getEnabledSymbologies", "()Ljava/util/Set;", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "filterSettings", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;)V", "hapticsEnabled", "getHapticsEnabled", "setHapticsEnabled", "soundEnabled", "getSoundEnabled", "setSoundEnabled", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;", "_updateFromJson", "", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "enableSymbologies", "symbologies", "enableSymbology", "symbology", "enabled", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "setArucoDictionary", "dictionary", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickSettings.class)
/* loaded from: classes12.dex */
public interface BarcodePickSettingsProxy {
    @NativeImpl
    NativeBarcodePickSettings _impl();

    @ProxyFunction(nativeName = "updateFromJson")
    void _updateFromJson(JsonValue json);

    @ProxyFunction
    void enableSymbologies(Set<? extends Symbology> symbologies);

    @ProxyFunction(nativeName = "setSymbologyEnabled")
    void enableSymbology(Symbology symbology, boolean enabled);

    @ProxyFunction(nativeName = "getShouldEnableCaching", property = "cachingEnabled")
    boolean getCachingEnabled();

    @ProxyFunction(property = "enabledSymbologies")
    Set<Symbology> getEnabledSymbologies();

    @ProxyFunction(property = "filterSettings")
    BarcodeFilterSettings getFilterSettings();

    @ProxyFunction(nativeName = "getHapticEnabled", property = "hapticsEnabled")
    boolean getHapticsEnabled();

    @ProxyFunction(property = "soundEnabled")
    boolean getSoundEnabled();

    @ProxyFunction
    SymbologySettings getSymbologySettings(Symbology symbology);

    @ProxyFunction
    void setArucoDictionary(ArucoDictionary dictionary);

    @ProxyFunction(nativeName = "setShouldEnableCaching", property = "cachingEnabled")
    void setCachingEnabled(boolean z10);

    @ProxyFunction(property = "filterSettings")
    void setFilterSettings(BarcodeFilterSettings barcodeFilterSettings);

    @ProxyFunction(nativeName = "setHapticEnabled", property = "hapticsEnabled")
    void setHapticsEnabled(boolean z10);

    @ProxyFunction(property = "soundEnabled")
    void setSoundEnabled(boolean z10);
}
