package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u001e\u001a\u00020\u0004H\u0097\u0001J\u0011\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0097\u0001J\u0017\u0010#\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0097\u0001J\u0019\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0007H\u0097\u0001J\u0010\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+J\u0011\u0010,\u001a\u00020-2\u0006\u0010&\u001a\u00020\u000fH\u0097\u0001J\u0011\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0097\u0001J\u0018\u00101\u001a\u00020 2\u0006\u0010*\u001a\u00020+2\b\u00102\u001a\u0004\u0018\u00010)R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00128W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\f¨\u00063"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettingsProxy;", "()V", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;)V", "<set-?>", "", "cachingEnabled", "getCachingEnabled", "()Z", "setCachingEnabled", "(Z)V", "enabledSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getEnabledSymbologies", "()Ljava/util/Set;", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "filterSettings", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;)V", "hapticsEnabled", "getHapticsEnabled", "setHapticsEnabled", "soundEnabled", "getSoundEnabled", "setSoundEnabled", "_impl", "_updateFromJson", "", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "enableSymbologies", "symbologies", "enableSymbology", "symbology", "enabled", "getProperty", "", "name", "", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "setArucoDictionary", "dictionary", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "setProperty", "value", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarcodePickSettings implements BarcodePickSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodePickSettingsProxyAdapter f124534a;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodePickSettings(NativeBarcodePickSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f124534a = new BarcodePickSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodePickSettings getF124535a() {
        return this.f124534a.getF124535a();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(nativeName = "updateFromJson")
    public void _updateFromJson(JsonValue json) {
        Intrinsics.j(json, "json");
        this.f124534a._updateFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f124534a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f124534a.enableSymbology(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(nativeName = "getShouldEnableCaching", property = "cachingEnabled")
    public boolean getCachingEnabled() {
        return this.f124534a.getCachingEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    public Set<Symbology> getEnabledSymbologies() {
        return this.f124534a.getEnabledSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(property = "filterSettings")
    public BarcodeFilterSettings getFilterSettings() {
        return this.f124534a.getFilterSettings();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(nativeName = "getHapticEnabled", property = "hapticsEnabled")
    public boolean getHapticsEnabled() {
        return this.f124534a.getHapticsEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(property = "soundEnabled")
    public boolean getSoundEnabled() {
        return this.f124534a.getSoundEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        return this.f124534a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction
    public void setArucoDictionary(ArucoDictionary dictionary) {
        Intrinsics.j(dictionary, "dictionary");
        this.f124534a.setArucoDictionary(dictionary);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(nativeName = "setShouldEnableCaching", property = "cachingEnabled")
    public void setCachingEnabled(boolean z10) {
        this.f124534a.setCachingEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(property = "filterSettings")
    public void setFilterSettings(BarcodeFilterSettings barcodeFilterSettings) {
        Intrinsics.j(barcodeFilterSettings, "<set-?>");
        this.f124534a.setFilterSettings(barcodeFilterSettings);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(nativeName = "setHapticEnabled", property = "hapticsEnabled")
    public void setHapticsEnabled(boolean z10) {
        this.f124534a.setHapticsEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    @ProxyFunction(property = "soundEnabled")
    public void setSoundEnabled(boolean z10) {
        this.f124534a.setSoundEnabled(z10);
    }

    public final Object getProperty(String name) {
        Intrinsics.j(name, "name");
        Integer intProperty = getF124535a().getIntProperty(name);
        if (intProperty != null) {
            return intProperty;
        }
        Boolean boolProperty = getF124535a().getBoolProperty(name);
        Integer numValueOf = boolProperty != null ? Integer.valueOf(Boolean.compare(boolProperty.booleanValue(), false)) : null;
        if (numValueOf == null) {
            return -1;
        }
        return numValueOf;
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        if (value instanceof Boolean) {
            getF124535a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF124535a().setIntProperty(name, numIntFromAny.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePickSettings() {
        NativeBarcodePickSettings nativeBarcodePickSettingsCreate = NativeBarcodePickSettings.create();
        Intrinsics.i(nativeBarcodePickSettingsCreate, "create(...)");
        this(nativeBarcodePickSettingsCreate);
    }
}
