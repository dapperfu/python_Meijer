package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0010\n\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R0\u0010*\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020%0$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R(\u00100\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/SymbologySettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/capture/SymbologySettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;", "_NativeSymbologySettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;", "", "extension", "", "enabled", "", "setExtensionEnabled", "(Ljava/lang/String;Z)V", "isExtensionEnabled", "(Ljava/lang/String;)Z", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "p0", "isEnabled", "()Z", "setEnabled", "(Z)V", "isColorInvertedEnabled", "setColorInvertedEnabled", "", "", "getActiveSymbolCounts", "()Ljava/util/Set;", "setActiveSymbolCounts", "(Ljava/util/Set;)V", "activeSymbolCounts", "getEnabledExtensions", "enabledExtensions", "getOcrFallbackRegex", "setOcrFallbackRegex", "(Ljava/lang/String;)V", "ocrFallbackRegex", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SymbologySettingsProxyAdapter implements SymbologySettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSymbologySettings f121518a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public SymbologySettingsProxyAdapter(NativeSymbologySettings _NativeSymbologySettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeSymbologySettings, "_NativeSymbologySettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121518a = _NativeSymbologySettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    /* renamed from: _impl, reason: from getter */
    public NativeSymbologySettings getF121518a() {
        return this.f121518a;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public Set<Short> getActiveSymbolCounts() {
        HashSet<Short> activeSymbolCounts = this.f121518a.getActiveSymbolCounts();
        Intrinsics.g(activeSymbolCounts);
        return activeSymbolCounts;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public Set<String> getEnabledExtensions() {
        HashSet<String> enabledExtensions = this.f121518a.getEnabledExtensions();
        Intrinsics.g(enabledExtensions);
        return enabledExtensions;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public String getOcrFallbackRegex() {
        return this.f121518a.getOcrFallbackRegex();
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public Symbology getSymbology() {
        Symbology symbology = this.f121518a.getSymbology();
        Intrinsics.g(symbology);
        return symbology;
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public boolean isColorInvertedEnabled() {
        return this.f121518a.isColorInvertedEnabled();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public boolean isEnabled() {
        return this.f121518a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public boolean isExtensionEnabled(String extension) {
        Intrinsics.j(extension, "extension");
        return this.f121518a.isExtensionEnabled(extension);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public void setActiveSymbolCounts(Set<Short> p02) {
        Intrinsics.j(p02, "p0");
        this.f121518a.setActiveSymbolCounts(BarcodeNativeTypeFactory.INSTANCE.convert(p02));
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public void setColorInvertedEnabled(boolean z10) {
        this.f121518a.setColorInvertedEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public void setEnabled(boolean z10) {
        this.f121518a.setEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public void setExtensionEnabled(String extension, boolean enabled) {
        Intrinsics.j(extension, "extension");
        this.f121518a.setExtensionEnabled(extension, enabled);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public void setOcrFallbackRegex(String str) {
        this.f121518a.setOcrFallbackRegex(str);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    public String toJson() {
        String json = this.f121518a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ SymbologySettingsProxyAdapter(NativeSymbologySettings nativeSymbologySettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSymbologySettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
