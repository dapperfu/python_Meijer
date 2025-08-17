package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$R*\u0010,\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R$\u00105\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00128W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00108\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00128W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b6\u00102\"\u0004\b7\u00104R$\u0010;\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00128W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b9\u00102\"\u0004\b:\u00104R$\u0010A\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettingsProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;)V", "()V", "", "Lcom/scandit/datacapture/barcode/data/CapturePreset;", "capturePresets", "(Ljava/util/Set;)V", "_impl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "symbology", "", "enabled", "enableSymbology", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "", "jsonData", "updateFromJson", "(Ljava/lang/String;)V", "name", "", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "key", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;", "b", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;", "getSelectionType", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;", "setSelectionType", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;)V", "selectionType", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "<set-?>", "getSingleBarcodeAutoDetection", "()Z", "setSingleBarcodeAutoDetection", "(Z)V", "singleBarcodeAutoDetection", "getSwipeGesturesEnabled", "setSwipeGesturesEnabled", "swipeGesturesEnabled", "getTapGestureForSelectionEnabled", "setTapGestureForSelectionEnabled", "tapGestureForSelectionEnabled", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getCodeDuplicateFilter", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setCodeDuplicateFilter", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "codeDuplicateFilter", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeSelectionSettings implements BarcodeSelectionSettingsProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeSelectionSettingsProxyAdapter f123792a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private BarcodeSelectionType selectionType;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeSelectionSettings fromJson(String jsonData) {
            Intrinsics.j(jsonData, "jsonData");
            return new BarcodeSelectionDeserializer().settingsFromJson(jsonData);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeSelectionSettings(NativeBarcodeSelectionSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f123792a = new BarcodeSelectionSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.selectionType = new BarcodeSelectionTapSelection();
        setSelectionType(new BarcodeSelectionTapSelection());
    }

    @JvmStatic
    public static final BarcodeSelectionSettings fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeSelectionSettings getF123794a() {
        return this.f123792a.getF123794a();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f123792a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f123792a.enableSymbology(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    public Set<Symbology> getEnabledSymbologies() {
        return this.f123792a.getEnabledSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "getSingleBarcodeAutoDetectionEnabled", property = "singleBarcodeAutoDetection")
    public boolean getSingleBarcodeAutoDetection() {
        return this.f123792a.getSingleBarcodeAutoDetection();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "getSwipeGesturesEnabled", property = "swipeGesturesEnabled")
    public boolean getSwipeGesturesEnabled() {
        return this.f123792a.getSwipeGesturesEnabled();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        return this.f123792a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "getTapGestureForSelectionEnabled", property = "tapGestureForSelectionEnabled")
    public boolean getTapGestureForSelectionEnabled() {
        return this.f123792a.getTapGestureForSelectionEnabled();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "setSingleBarcodeAutoDetectionEnabled", property = "singleBarcodeAutoDetection")
    public void setSingleBarcodeAutoDetection(boolean z10) {
        this.f123792a.setSingleBarcodeAutoDetection(z10);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "setSwipeGesturesEnabled", property = "swipeGesturesEnabled")
    public void setSwipeGesturesEnabled(boolean z10) {
        this.f123792a.setSwipeGesturesEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSettingsProxy
    @ProxyFunction(nativeName = "setTapGestureForSelectionEnabled", property = "tapGestureForSelectionEnabled")
    public void setTapGestureForSelectionEnabled(boolean z10) {
        this.f123792a.setTapGestureForSelectionEnabled(z10);
    }

    public final TimeInterval getCodeDuplicateFilter() {
        return TimeInterval.INSTANCE.millis(getF123794a().getCodeDuplicateFilterMilliseconds());
    }

    public final Object getProperty(String key) {
        Intrinsics.j(key, "key");
        Integer intProperty = getF123794a().getIntProperty(key);
        if (intProperty != null) {
            return intProperty;
        }
        Boolean boolProperty = getF123794a().getBoolProperty(key);
        Integer numValueOf = boolProperty != null ? Integer.valueOf(Boolean.compare(boolProperty.booleanValue(), false)) : null;
        if (numValueOf == null) {
            return -1;
        }
        return numValueOf;
    }

    public final BarcodeSelectionType getSelectionType() {
        return this.selectionType;
    }

    public final void setCodeDuplicateFilter(TimeInterval value) {
        Intrinsics.j(value, "value");
        getF123794a().setCodeDuplicateFilterMilliseconds((int) value.asMillis());
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        if (value instanceof Float) {
            getF123794a().setFloatProperty(name, ((Number) value).floatValue());
            return;
        }
        if (value instanceof String) {
            getF123794a().setStringProperty(name, (String) value);
            return;
        }
        if (value instanceof Boolean) {
            getF123794a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF123794a().setIntProperty(name, numIntFromAny.intValue());
        }
    }

    public final void setSelectionType(BarcodeSelectionType value) {
        Intrinsics.j(value, "value");
        this.selectionType = value;
        getF123794a().setSelectionType(value.getF123755c());
    }

    public final void updateFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        new BarcodeSelectionDeserializer().updateSettingsFromJson(this, jsonData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionSettings() {
        NativeBarcodeSelectionSettings nativeBarcodeSelectionSettingsCreate = NativeBarcodeSelectionSettings.create();
        Intrinsics.i(nativeBarcodeSelectionSettingsCreate, "create(...)");
        this(nativeBarcodeSelectionSettingsCreate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionSettings(Set<? extends CapturePreset> capturePresets) {
        Intrinsics.j(capturePresets, "capturePresets");
        NativeBarcodeSelectionSettings nativeBarcodeSelectionSettingsCreateWithPresets = NativeBarcodeSelectionSettings.createWithPresets(CollectionsKt.h1(capturePresets));
        Intrinsics.i(nativeBarcodeSelectionSettingsCreateWithPresets, "createWithPresets(...)");
        this(nativeBarcodeSelectionSettingsCreateWithPresets);
    }
}
