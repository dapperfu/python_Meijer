package com.scandit.datacapture.barcode.ar.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\u0018\u0000 &2\u00020\u0001:\u0001&B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettingsProxy;", "<init>", "()V", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSettings;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSettings;", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "(Ljava/util/Set;)V", "symbology", "", "enabled", "enableSymbology", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "", "name", "", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "<set-?>", "getExpectsOnlyUniqueBarcodes", "()Z", "setExpectsOnlyUniqueBarcodes", "(Z)V", "expectsOnlyUniqueBarcodes", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArSettings implements BarcodeArSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeArSettingsProxyAdapter f120099a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeArSettings fromJson(String jsonData) {
            Intrinsics.j(jsonData, "jsonData");
            NativeBarcodeArSettings nativeBarcodeArSettingsFromJson = NativeBarcodeArSettings.fromJson(new JsonValue(jsonData)._impl());
            Intrinsics.i(nativeBarcodeArSettingsFromJson, "fromJson(...)");
            return new BarcodeArSettings(nativeBarcodeArSettingsFromJson, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ BarcodeArSettings(NativeBarcodeArSettings nativeBarcodeArSettings, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeArSettings);
    }

    @JvmStatic
    public static final BarcodeArSettings fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeArSettings getF120100a() {
        return this.f120099a.getF120100a();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    @ProxyFunction
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f120099a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f120099a.enableSymbology(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    public Set<Symbology> getEnabledSymbologies() {
        return this.f120099a.getEnabledSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    @ProxyFunction(nativeName = "expectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    public boolean getExpectsOnlyUniqueBarcodes() {
        return this.f120099a.getExpectsOnlyUniqueBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    @ProxyFunction
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        return this.f120099a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSettingsProxy
    @ProxyFunction(nativeName = "setExpectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    public void setExpectsOnlyUniqueBarcodes(boolean z10) {
        this.f120099a.setExpectsOnlyUniqueBarcodes(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BarcodeArSettings(NativeBarcodeArSettings nativeBarcodeArSettings) {
        this.f120099a = new BarcodeArSettingsProxyAdapter(nativeBarcodeArSettings, null, 2, 0 == true ? 1 : 0);
    }

    public final Object getProperty(String name) {
        Intrinsics.j(name, "name");
        Integer intProperty = getF120100a().getIntProperty(name);
        if (intProperty != null) {
            return intProperty;
        }
        Boolean boolProperty = getF120100a().getBoolProperty(name);
        Integer numValueOf = boolProperty != null ? Integer.valueOf(Boolean.compare(boolProperty.booleanValue(), false)) : null;
        if (numValueOf == null) {
            return -1;
        }
        return numValueOf;
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        if (value instanceof Boolean) {
            getF120100a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF120100a().setIntProperty(name, numIntFromAny.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeArSettings() {
        NativeBarcodeArSettings nativeBarcodeArSettingsCreate = NativeBarcodeArSettings.create();
        Intrinsics.i(nativeBarcodeArSettingsCreate, "create(...)");
        this(nativeBarcodeArSettingsCreate);
    }
}
