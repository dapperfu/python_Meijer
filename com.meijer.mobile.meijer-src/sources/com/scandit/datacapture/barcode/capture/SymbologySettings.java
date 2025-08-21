package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Checksum;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010(\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0016H\u0097\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0018H\u0097\u0001J\t\u0010.\u001a\u00020\u0016H\u0097\u0001R0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\nR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR(\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00168W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "Lcom/scandit/datacapture/barcode/capture/SymbologySettingsProxy;", "impl", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;)V", "<set-?>", "", "", "activeSymbolCounts", "getActiveSymbolCounts", "()Ljava/util/Set;", "setActiveSymbolCounts", "(Ljava/util/Set;)V", "value", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/Checksum;", "checksums", "getChecksums", "()Ljava/util/EnumSet;", "setChecksums", "(Ljava/util/EnumSet;)V", "enabledExtensions", "", "getEnabledExtensions", "", "isColorInvertedEnabled", "()Z", "setColorInvertedEnabled", "(Z)V", "isEnabled", "setEnabled", "ocrFallbackRegex", "getOcrFallbackRegex", "()Ljava/lang/String;", "setOcrFallbackRegex", "(Ljava/lang/String;)V", "symbology", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "_impl", "isExtensionEnabled", "extension", "setExtensionEnabled", "", "enabled", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Mockable
/* loaded from: classes12.dex */
public final class SymbologySettings implements SymbologySettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SymbologySettingsProxyAdapter f121517a;

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeSymbologySettings getF121518a() {
        return this.f121517a.getF121518a();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "activeSymbolCounts")
    public Set<Short> getActiveSymbolCounts() {
        return this.f121517a.getActiveSymbolCounts();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "enabledExtensions")
    public Set<String> getEnabledExtensions() {
        return this.f121517a.getEnabledExtensions();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "ocrFallbackRegex")
    public String getOcrFallbackRegex() {
        return this.f121517a.getOcrFallbackRegex();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "symbology")
    public Symbology getSymbology() {
        return this.f121517a.getSymbology();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "isColorInvertedEnabled")
    public boolean isColorInvertedEnabled() {
        return this.f121517a.isColorInvertedEnabled();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.f121517a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction
    public boolean isExtensionEnabled(String extension) {
        Intrinsics.j(extension, "extension");
        return this.f121517a.isExtensionEnabled(extension);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "activeSymbolCounts")
    public void setActiveSymbolCounts(Set<Short> set) {
        Intrinsics.j(set, "<set-?>");
        this.f121517a.setActiveSymbolCounts(set);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "isColorInvertedEnabled")
    public void setColorInvertedEnabled(boolean z10) {
        this.f121517a.setColorInvertedEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z10) {
        this.f121517a.setEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction
    public void setExtensionEnabled(String extension, boolean enabled) {
        Intrinsics.j(extension, "extension");
        this.f121517a.setExtensionEnabled(extension, enabled);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(property = "ocrFallbackRegex")
    public void setOcrFallbackRegex(String str) {
        this.f121517a.setOcrFallbackRegex(str);
    }

    @Override // com.scandit.datacapture.barcode.capture.SymbologySettingsProxy
    @ProxyFunction(nativeName = "toJson")
    public String toJson() {
        return this.f121517a.toJson();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SymbologySettings(NativeSymbologySettings impl) {
        Intrinsics.j(impl, "impl");
        this.f121517a = new SymbologySettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    public final void setChecksums(EnumSet<Checksum> value) {
        Intrinsics.j(value, "value");
        getF121518a().setChecksumBits(value);
    }

    public final EnumSet<Checksum> getChecksums() {
        EnumSet<Checksum> checksumBits = getF121518a().getChecksumBits();
        Intrinsics.i(checksumBits, "getChecksumBits(...)");
        return checksumBits;
    }
}
