package com.scandit.datacapture.barcode.ar.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSettings;", "_NativeBarcodeArSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSettings;", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "", "enabled", "", "enableSymbology", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "", "symbologies", "enableSymbologies", "(Ljava/util/Set;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "p0", "getExpectsOnlyUniqueBarcodes", "()Z", "setExpectsOnlyUniqueBarcodes", "(Z)V", "expectsOnlyUniqueBarcodes", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArSettingsProxyAdapter implements BarcodeArSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeArSettings f121052a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeArSettingsProxyAdapter(NativeBarcodeArSettings _NativeBarcodeArSettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeArSettings, "_NativeBarcodeArSettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121052a = _NativeBarcodeArSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeArSettings getF121052a() {
        return this.f121052a;
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f121052a.enableSymbologies(BarcodeNativeTypeFactory.INSTANCE.convertSymbologySetToHashSet(symbologies));
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    public void enableSymbology(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f121052a.setSymbologyEnabled(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    public Set<Symbology> getEnabledSymbologies() {
        HashSet<Symbology> enabledSymbologies = this.f121052a.getEnabledSymbologies();
        Intrinsics.g(enabledSymbologies);
        return enabledSymbologies;
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    public boolean getExpectsOnlyUniqueBarcodes() {
        return this.f121052a.expectsOnlyUniqueBarcodes();
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        NativeSymbologySettings symbologySettings = this.f121052a.getSymbologySettings(symbology);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeSymbologySettings.class);
        Intrinsics.g(symbologySettings);
        return (SymbologySettings) proxyCache.getOrPut(kClassB, null, symbologySettings, new d(symbologySettings));
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    public void setExpectsOnlyUniqueBarcodes(boolean z10) {
        this.f121052a.setExpectsOnlyUniqueBarcodes(z10);
    }

    public /* synthetic */ BarcodeArSettingsProxyAdapter(NativeBarcodeArSettings nativeBarcodeArSettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeArSettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
