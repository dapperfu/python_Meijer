package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoDictionary;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R$\u0010-\u001a\u00020'2\u0006\u0010(\u001a\u00020'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00102\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00105\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R$\u00108\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010/\"\u0004\b7\u00101¨\u00069"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;", "_NativeBarcodePickSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "", "enabled", "", "enableSymbology", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "", "symbologies", "enableSymbologies", "(Ljava/util/Set;)V", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "dictionary", "setArucoDictionary", "(Lcom/scandit/datacapture/barcode/data/ArucoDictionary;)V", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "_updateFromJson", "(Lcom/scandit/datacapture/core/json/JsonValue;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "p0", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;)V", "filterSettings", "getSoundEnabled", "()Z", "setSoundEnabled", "(Z)V", "soundEnabled", "getHapticsEnabled", "setHapticsEnabled", "hapticsEnabled", "getCachingEnabled", "setCachingEnabled", "cachingEnabled", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodePickSettingsProxyAdapter implements BarcodePickSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickSettings f124535a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickSettingsProxyAdapter(NativeBarcodePickSettings _NativeBarcodePickSettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodePickSettings, "_NativeBarcodePickSettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124535a = _NativeBarcodePickSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickSettings getF124535a() {
        return this.f124535a;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void _updateFromJson(JsonValue json) {
        Intrinsics.j(json, "json");
        NativeJsonValue f126782a = json.getF126782a();
        this.proxyCache.put(Reflection.b(NativeJsonValue.class), null, f126782a, json);
        this.f124535a.updateFromJson(f126782a);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f124535a.enableSymbologies(BarcodeNativeTypeFactory.INSTANCE.convertSymbologySetToHashSet(symbologies));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void enableSymbology(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f124535a.setSymbologyEnabled(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public boolean getCachingEnabled() {
        return this.f124535a.getShouldEnableCaching();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public Set<Symbology> getEnabledSymbologies() {
        HashSet<Symbology> enabledSymbologies = this.f124535a.getEnabledSymbologies();
        Intrinsics.g(enabledSymbologies);
        return enabledSymbologies;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public BarcodeFilterSettings getFilterSettings() {
        NativeBarcodeFilterSettings filterSettings = this.f124535a.getFilterSettings();
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeFilterSettings.class);
        Intrinsics.g(filterSettings);
        return (BarcodeFilterSettings) proxyCache.getOrPut(kClassB, null, filterSettings, new g(filterSettings));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public boolean getHapticsEnabled() {
        return this.f124535a.getHapticEnabled();
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public boolean getSoundEnabled() {
        return this.f124535a.getSoundEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        NativeSymbologySettings symbologySettings = this.f124535a.getSymbologySettings(symbology);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeSymbologySettings.class);
        Intrinsics.g(symbologySettings);
        return (SymbologySettings) proxyCache.getOrPut(kClassB, null, symbologySettings, new h(symbologySettings));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setArucoDictionary(ArucoDictionary dictionary) {
        Intrinsics.j(dictionary, "dictionary");
        NativeArucoDictionary f121835a = dictionary.getF121835a();
        this.proxyCache.put(Reflection.b(NativeArucoDictionary.class), null, f121835a, dictionary);
        this.f124535a.setArucoDictionary(f121835a);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setCachingEnabled(boolean z10) {
        this.f124535a.setShouldEnableCaching(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setFilterSettings(BarcodeFilterSettings p02) {
        Intrinsics.j(p02, "p0");
        NativeBarcodeFilterSettings f121872a = p02.getF121872a();
        this.proxyCache.put(Reflection.b(NativeBarcodeFilterSettings.class), null, f121872a, p02);
        this.f124535a.setFilterSettings(f121872a);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setHapticsEnabled(boolean z10) {
        this.f124535a.setHapticEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSettingsProxy
    public void setSoundEnabled(boolean z10) {
        this.f124535a.setSoundEnabled(z10);
    }

    public /* synthetic */ BarcodePickSettingsProxyAdapter(NativeBarcodePickSettings nativeBarcodePickSettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickSettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
