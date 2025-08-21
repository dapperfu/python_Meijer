package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\t8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010.\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00108W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettingsProxy;", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;)V", "()V", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "(Ljava/util/Set;)V", "symbology", "", "enabled", "enableSymbology", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "dictionary", "setArucoDictionary", "(Lcom/scandit/datacapture/barcode/data/ArucoDictionary;)V", "", "jsonData", "updateFromJson", "(Ljava/lang/String;)V", "name", "", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "<set-?>", "getExpectsOnlyUniqueBarcodes", "()Z", "setExpectsOnlyUniqueBarcodes", "(Z)V", "expectsOnlyUniqueBarcodes", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes12.dex */
public final class BarcodeBatchSettings implements BarcodeBatchSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeBatchSettingsProxyAdapter f121385a;

    /* renamed from: b, reason: collision with root package name */
    private com.scandit.datacapture.barcode.internal.module.batch.capture.a f121386b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "FREEZE_INDICATION_LISTENER", "Ljava/lang/String;", "FREEZE_INDICATION_WAIT_TIME", "FREEZE_INDICATOR", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeBatchSettings fromJson(String jsonData) {
            Intrinsics.j(jsonData, "jsonData");
            return new BarcodeBatchDeserializer().settingsFromJson(jsonData);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeBatchSettings(NativeBarcodeTrackingSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f121385a = new BarcodeBatchSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @JvmStatic
    public static final BarcodeBatchSettings fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeTrackingSettings getF121387a() {
        return this.f121385a.getF121387a();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSettingsProxy
    @ProxyFunction
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f121385a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f121385a.enableSymbology(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    public Set<Symbology> getEnabledSymbologies() {
        return this.f121385a.getEnabledSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSettingsProxy
    @ProxyFunction(nativeName = "expectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    public boolean getExpectsOnlyUniqueBarcodes() {
        return this.f121385a.getExpectsOnlyUniqueBarcodes();
    }

    public final Object getProperty(String name) {
        Runnable runnable;
        Intrinsics.j(name, "name");
        int iHashCode = name.hashCode();
        if (iHashCode != -1372984747) {
            if (iHashCode != -272164569) {
                if (iHashCode == 670080312 && name.equals("freezeIndicator")) {
                    com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar = this.f121386b;
                    if (aVar == null) {
                        return -1;
                    }
                    return aVar;
                }
            } else if (name.equals("freezeIndicationListener")) {
                com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar2 = this.f121386b;
                if (aVar2 == null || (runnable = aVar2.f122215a) == null) {
                    return -1;
                }
                return runnable;
            }
        } else if (name.equals("freezeIndicationWaitTime")) {
            com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar3 = this.f121386b;
            return Integer.valueOf(aVar3 != null ? (int) aVar3.f122216b : -1);
        }
        Integer intProperty = getF121387a().getIntProperty(name);
        if (intProperty != null) {
            iIntValue = intProperty.intValue();
        } else {
            Boolean boolProperty = getF121387a().getBoolProperty(name);
            Integer numValueOf = boolProperty != null ? Integer.valueOf(Boolean.compare(boolProperty.booleanValue(), false)) : null;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        return Integer.valueOf(iIntValue);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSettingsProxy
    @ProxyFunction
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        return this.f121385a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSettingsProxy
    @ProxyFunction
    public void setArucoDictionary(ArucoDictionary dictionary) {
        Intrinsics.j(dictionary, "dictionary");
        this.f121385a.setArucoDictionary(dictionary);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSettingsProxy
    @ProxyFunction(nativeName = "setExpectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    public void setExpectsOnlyUniqueBarcodes(boolean z10) {
        this.f121385a.setExpectsOnlyUniqueBarcodes(z10);
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        if (Intrinsics.e(name, "freezeIndicationListener") && (value instanceof Runnable)) {
            com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar = this.f121386b;
            if (aVar == null) {
                aVar = new com.scandit.datacapture.barcode.internal.module.batch.capture.a();
            }
            aVar.f122215a = (Runnable) value;
            this.f121386b = aVar;
            return;
        }
        if (Intrinsics.e(name, "freezeIndicationWaitTime") && (value instanceof Integer)) {
            com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar2 = this.f121386b;
            if (aVar2 == null) {
                aVar2 = new com.scandit.datacapture.barcode.internal.module.batch.capture.a();
            }
            aVar2.f122216b = ((Number) value).intValue();
            this.f121386b = aVar2;
            return;
        }
        if (value instanceof Boolean) {
            getF121387a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF121387a().setIntProperty(name, numIntFromAny.intValue());
        }
    }

    public final void updateFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        new BarcodeBatchDeserializer().updateSettingsFromJson(this, jsonData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeBatchSettings() {
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettingsCreate = NativeBarcodeTrackingSettings.create();
        Intrinsics.i(nativeBarcodeTrackingSettingsCreate, "create(...)");
        this(nativeBarcodeTrackingSettingsCreate);
    }
}
