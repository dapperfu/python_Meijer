package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoDictionary;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0016\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R0\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u001bR$\u00101\u001a\u00020,2\u0006\u0010'\u001a\u00020,8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00107\u001a\u0002022\u0006\u0010'\u001a\u0002028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "_NativeBarcodeCaptureSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "", "enabled", "", "enableSymbology", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "", "symbologies", "enableSymbologies", "(Ljava/util/Set;)V", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "compositeTypes", "(Ljava/util/EnumSet;)V", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "dictionary", "setArucoDictionary", "(Lcom/scandit/datacapture/barcode/data/ArucoDictionary;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "p0", "getEnabledCompositeTypes", "()Ljava/util/EnumSet;", "setEnabledCompositeTypes", "enabledCompositeTypes", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "getBatterySaving", "()Lcom/scandit/datacapture/core/source/BatterySavingMode;", "setBatterySaving", "(Lcom/scandit/datacapture/core/source/BatterySavingMode;)V", "batterySaving", "Lcom/scandit/datacapture/core/source/ScanIntention;", "getScanIntention", "()Lcom/scandit/datacapture/core/source/ScanIntention;", "setScanIntention", "(Lcom/scandit/datacapture/core/source/ScanIntention;)V", "scanIntention", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCaptureSettingsProxyAdapter implements BarcodeCaptureSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCaptureSettings f120547a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCaptureSettingsProxyAdapter(NativeBarcodeCaptureSettings _NativeBarcodeCaptureSettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeCaptureSettings, "_NativeBarcodeCaptureSettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120547a = _NativeBarcodeCaptureSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f120547a.enableSymbologies(BarcodeNativeTypeFactory.INSTANCE.convertSymbologySetToHashSet(symbologies));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCaptureSettings getF120547a() {
        return this.f120547a;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void enableSymbology(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f120547a.setSymbologyEnabled(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public BatterySavingMode getBatterySaving() {
        BatterySavingMode batterySavingMode = this.f120547a.getBatterySavingMode();
        Intrinsics.g(batterySavingMode);
        return batterySavingMode;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public EnumSet<CompositeType> getEnabledCompositeTypes() {
        EnumSet<CompositeType> enabledCompositeTypesBits = this.f120547a.getEnabledCompositeTypesBits();
        Intrinsics.g(enabledCompositeTypesBits);
        return enabledCompositeTypesBits;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public Set<Symbology> getEnabledSymbologies() {
        HashSet<Symbology> enabledSymbologies = this.f120547a.getEnabledSymbologies();
        Intrinsics.g(enabledSymbologies);
        return enabledSymbologies;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public ScanIntention getScanIntention() {
        ScanIntention scanIntention = this.f120547a.getScanIntention();
        Intrinsics.g(scanIntention);
        return scanIntention;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        NativeSymbologySettings symbologySettings = this.f120547a.getSymbologySettings(symbology);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeSymbologySettings.class);
        Intrinsics.g(symbologySettings);
        return (SymbologySettings) proxyCache.getOrPut(kClassB, null, symbologySettings, new U(symbologySettings));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void setArucoDictionary(ArucoDictionary dictionary) {
        Intrinsics.j(dictionary, "dictionary");
        NativeArucoDictionary f120883a = dictionary.getF120883a();
        this.proxyCache.put(Reflection.b(NativeArucoDictionary.class), null, f120883a, dictionary);
        this.f120547a.setArucoDictionary(f120883a);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void setBatterySaving(BatterySavingMode p02) {
        Intrinsics.j(p02, "p0");
        this.f120547a.setBatterySavingMode(p02);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void setEnabledCompositeTypes(EnumSet<CompositeType> p02) {
        Intrinsics.j(p02, "p0");
        this.f120547a.setEnabledCompositeTypesBits(p02);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void setScanIntention(ScanIntention p02) {
        Intrinsics.j(p02, "p0");
        this.f120547a.setScanIntention(p02);
    }

    public /* synthetic */ BarcodeCaptureSettingsProxyAdapter(NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCaptureSettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    public void enableSymbologies(EnumSet<CompositeType> compositeTypes) {
        Intrinsics.j(compositeTypes, "compositeTypes");
        this.f120547a.enableSymbologiesForCompositeTypes(compositeTypes);
    }
}
