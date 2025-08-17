package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001MB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\nJ \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0013H\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0097\u0001¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00102\u0006\u0010%\u001a\u00020!2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020&2\u0006\u0010*\u001a\u00020!¢\u0006\u0004\b+\u0010,R$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R0\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u0012R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R$\u0010@\u001a\u00020;2\u0006\u0010.\u001a\u00020;8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010F\u001a\u0004\u0018\u00010A2\b\u0010'\u001a\u0004\u0018\u00010A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010L\u001a\u00020G2\u0006\u0010'\u001a\u00020G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;)V", "()V", "", "Lcom/scandit/datacapture/barcode/data/CapturePreset;", "capturePresets", "(Ljava/util/Set;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "compositeTypes", "", "enableSymbologies", "(Ljava/util/EnumSet;)V", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "symbology", "", "enabled", "enableSymbology", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "dictionary", "setArucoDictionary", "(Lcom/scandit/datacapture/barcode/data/ArucoDictionary;)V", "", "jsonData", "updateFromJson", "(Ljava/lang/String;)V", "name", "", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "key", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "<set-?>", "getBatterySaving", "()Lcom/scandit/datacapture/core/source/BatterySavingMode;", "setBatterySaving", "(Lcom/scandit/datacapture/core/source/BatterySavingMode;)V", "batterySaving", "getEnabledCompositeTypes", "()Ljava/util/EnumSet;", "setEnabledCompositeTypes", "enabledCompositeTypes", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "Lcom/scandit/datacapture/core/source/ScanIntention;", "getScanIntention", "()Lcom/scandit/datacapture/core/source/ScanIntention;", "setScanIntention", "(Lcom/scandit/datacapture/core/source/ScanIntention;)V", "scanIntention", "Lcom/scandit/datacapture/core/area/LocationSelection;", "getLocationSelection", "()Lcom/scandit/datacapture/core/area/LocationSelection;", "setLocationSelection", "(Lcom/scandit/datacapture/core/area/LocationSelection;)V", "locationSelection", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getCodeDuplicateFilter", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setCodeDuplicateFilter", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "codeDuplicateFilter", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class BarcodeCaptureSettings implements BarcodeCaptureSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCaptureSettingsProxyAdapter f120545a;

    /* renamed from: b, reason: collision with root package name */
    private LocationSelection f120546b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeCaptureSettings fromJson(String jsonData) {
            Intrinsics.j(jsonData, "jsonData");
            return new BarcodeCaptureDeserializer().settingsFromJson(jsonData);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeCaptureSettings(NativeBarcodeCaptureSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f120545a = new BarcodeCaptureSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @JvmStatic
    public static final BarcodeCaptureSettings fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeCaptureSettings getF120547a() {
        return this.f120545a.getF120547a();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "enableSymbologiesForCompositeTypes")
    public void enableSymbologies(EnumSet<CompositeType> compositeTypes) {
        Intrinsics.j(compositeTypes, "compositeTypes");
        this.f120545a.enableSymbologies(compositeTypes);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f120545a.enableSymbology(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "getBatterySavingMode", property = "batterySaving")
    public BatterySavingMode getBatterySaving() {
        return this.f120545a.getBatterySaving();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "getEnabledCompositeTypesBits", property = "enabledCompositeTypes")
    public EnumSet<CompositeType> getEnabledCompositeTypes() {
        return this.f120545a.getEnabledCompositeTypes();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    public Set<Symbology> getEnabledSymbologies() {
        return this.f120545a.getEnabledSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "getScanIntention", property = "scanIntention")
    public ScanIntention getScanIntention() {
        return this.f120545a.getScanIntention();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        return this.f120545a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction
    public void setArucoDictionary(ArucoDictionary dictionary) {
        Intrinsics.j(dictionary, "dictionary");
        this.f120545a.setArucoDictionary(dictionary);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "setBatterySavingMode", property = "batterySaving")
    public void setBatterySaving(BatterySavingMode batterySavingMode) {
        Intrinsics.j(batterySavingMode, "<set-?>");
        this.f120545a.setBatterySaving(batterySavingMode);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "setEnabledCompositeTypesBits", property = "enabledCompositeTypes")
    public void setEnabledCompositeTypes(EnumSet<CompositeType> enumSet) {
        Intrinsics.j(enumSet, "<set-?>");
        this.f120545a.setEnabledCompositeTypes(enumSet);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction(nativeName = "setScanIntention", property = "scanIntention")
    public void setScanIntention(ScanIntention scanIntention) {
        Intrinsics.j(scanIntention, "<set-?>");
        this.f120545a.setScanIntention(scanIntention);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSettingsProxy
    @ProxyFunction
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f120545a.enableSymbologies(symbologies);
    }

    public final TimeInterval getCodeDuplicateFilter() {
        return TimeInterval.INSTANCE.millis(getF120547a().getCodeDuplicateFilterMilliseconds());
    }

    /* renamed from: getLocationSelection, reason: from getter */
    public final LocationSelection getF120546b() {
        return this.f120546b;
    }

    public final Object getProperty(String key) {
        Intrinsics.j(key, "key");
        Integer intProperty = getF120547a().getIntProperty(key);
        if (intProperty != null) {
            return intProperty;
        }
        Boolean boolProperty = getF120547a().getBoolProperty(key);
        Integer numValueOf = boolProperty != null ? Integer.valueOf(Boolean.compare(boolProperty.booleanValue(), false)) : null;
        if (numValueOf == null) {
            return -1;
        }
        return numValueOf;
    }

    public final void setCodeDuplicateFilter(TimeInterval value) {
        Intrinsics.j(value, "value");
        getF120547a().setCodeDuplicateFilterMilliseconds((int) value.asMillis());
    }

    public final void setLocationSelection(LocationSelection locationSelection) {
        this.f120546b = locationSelection;
        getF120547a().setLocationSelection(locationSelection != null ? locationSelection.getF124021c() : null);
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        if (value instanceof Float) {
            getF120547a().setFloatProperty(name, ((Number) value).floatValue());
            return;
        }
        if (value instanceof String) {
            getF120547a().setStringProperty(name, (String) value);
            return;
        }
        if (value instanceof Boolean) {
            getF120547a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF120547a().setIntProperty(name, numIntFromAny.intValue());
        }
    }

    public final void updateFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        new BarcodeCaptureDeserializer().updateSettingsFromJson(this, jsonData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCaptureSettings() {
        NativeBarcodeCaptureSettings nativeBarcodeCaptureSettingsCreate = NativeBarcodeCaptureSettings.create();
        Intrinsics.i(nativeBarcodeCaptureSettingsCreate, "create(...)");
        this(nativeBarcodeCaptureSettingsCreate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCaptureSettings(Set<? extends CapturePreset> capturePresets) {
        Intrinsics.j(capturePresets, "capturePresets");
        NativeBarcodeCaptureSettings nativeBarcodeCaptureSettingsCreateWithPresets = NativeBarcodeCaptureSettings.createWithPresets(CollectionsKt.h1(capturePresets));
        Intrinsics.i(nativeBarcodeCaptureSettingsCreateWithPresets, "createWithPresets(...)");
        this(nativeBarcodeCaptureSettingsCreateWithPresets);
    }
}
