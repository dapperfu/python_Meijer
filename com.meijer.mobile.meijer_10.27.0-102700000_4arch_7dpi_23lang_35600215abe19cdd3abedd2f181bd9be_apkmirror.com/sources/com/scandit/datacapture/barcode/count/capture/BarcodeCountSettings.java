package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.core.data.ClusteringMode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010*\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\t8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R$\u00100\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u0014\u00104\u001a\u0002018WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R$\u00107\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00138W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b5\u0010'\"\u0004\b6\u0010)¨\u00069"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettingsProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;)V", "()V", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "(Ljava/util/Set;)V", "symbology", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "", "enabled", "setSymbologyEnabled", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "", "name", "", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/scandit/datacapture/core/data/ClusteringMode;", "<set-?>", "getClusteringMode", "()Lcom/scandit/datacapture/core/data/ClusteringMode;", "setClusteringMode", "(Lcom/scandit/datacapture/core/data/ClusteringMode;)V", "clusteringMode", "getDisableModeWhenCaptureListCompleted", "()Z", "setDisableModeWhenCaptureListCompleted", "(Z)V", "disableModeWhenCaptureListCompleted", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "getExpectsOnlyUniqueBarcodes", "setExpectsOnlyUniqueBarcodes", "expectsOnlyUniqueBarcodes", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "filterSettings", "getMappingEnabled", "setMappingEnabled", "mappingEnabled", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeCountSettings implements BarcodeCountSettingsProxy {
    public static final String PROPERTY_TRIGGER_AUTO_FOCUS_DELAY = "trigger_auto_focus_delay";
    public static final String PROPERTY_TRIGGER_AUTO_FOCUS_ON_SHUTTER = "trigger_auto_focus_on_shutter";
    public static final String PROPERTY_USE_IMU_DATA = "use_imu_data";
    public static final long TRIGGER_AUTO_FOCUS_DELAY_DEFAULT = 100;
    public static final boolean TRIGGER_AUTO_FOCUS_ON_SHUTTER_DEFAULT = true;

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCountSettingsProxyAdapter f120620a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f120621b;

    /* renamed from: c, reason: collision with root package name */
    private long f120622c;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeCountSettings(NativeBarcodeCountSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f120620a = new BarcodeCountSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.f120621b = true;
        this.f120622c = 100L;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeCountSettings getF120623a() {
        return this.f120620a.getF120623a();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f120620a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "getClusteringMode", property = "clusteringMode")
    public ClusteringMode getClusteringMode() {
        return this.f120620a.getClusteringMode();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "shouldDisableModeWhenCaptureListCompleted", property = "disableModeWhenCaptureListCompleted")
    public boolean getDisableModeWhenCaptureListCompleted() {
        return this.f120620a.getDisableModeWhenCaptureListCompleted();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "getEnabledSymbologies", property = "enabledSymbologies")
    public Set<Symbology> getEnabledSymbologies() {
        return this.f120620a.getEnabledSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "expectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    public boolean getExpectsOnlyUniqueBarcodes() {
        return this.f120620a.getExpectsOnlyUniqueBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "getFilterSettings", property = "filterSettings")
    public BarcodeFilterSettings getFilterSettings() {
        return this.f120620a.getFilterSettings();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "getMappingEnabled", property = "mappingEnabled")
    public boolean getMappingEnabled() {
        return this.f120620a.getMappingEnabled();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        return this.f120620a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "setClusteringMode", property = "clusteringMode")
    public void setClusteringMode(ClusteringMode clusteringMode) {
        Intrinsics.j(clusteringMode, "<set-?>");
        this.f120620a.setClusteringMode(clusteringMode);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "setShouldDisableModeWhenCaptureListCompleted", property = "disableModeWhenCaptureListCompleted")
    public void setDisableModeWhenCaptureListCompleted(boolean z10) {
        this.f120620a.setDisableModeWhenCaptureListCompleted(z10);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "setExpectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    public void setExpectsOnlyUniqueBarcodes(boolean z10) {
        this.f120620a.setExpectsOnlyUniqueBarcodes(z10);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction(nativeName = "setMappingEnabled", property = "mappingEnabled")
    public void setMappingEnabled(boolean z10) {
        this.f120620a.setMappingEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountSettingsProxy
    @ProxyFunction
    public void setSymbologyEnabled(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f120620a.setSymbologyEnabled(symbology, enabled);
    }

    public final Object getProperty(String name) {
        int iIntValue;
        Intrinsics.j(name, "name");
        int iHashCode = name.hashCode();
        if (iHashCode != -1145110768) {
            if (iHashCode != -371273613) {
                if (iHashCode == 1444281501 && name.equals(PROPERTY_TRIGGER_AUTO_FOCUS_ON_SHUTTER)) {
                    return Boolean.valueOf(this.f120621b);
                }
            } else if (name.equals(PROPERTY_TRIGGER_AUTO_FOCUS_DELAY)) {
                return Long.valueOf(this.f120622c);
            }
        } else if (name.equals(PROPERTY_USE_IMU_DATA)) {
            return Boolean.valueOf(getF120623a().getShouldUseIMUData());
        }
        Integer intProperty = getF120623a().getIntProperty(name);
        if (intProperty != null) {
            iIntValue = intProperty.intValue();
        } else {
            Boolean boolProperty = getF120623a().getBoolProperty(name);
            Integer numValueOf = boolProperty != null ? Integer.valueOf(Boolean.compare(boolProperty.booleanValue(), false)) : null;
            iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        }
        return Integer.valueOf(iIntValue);
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        int iHashCode = name.hashCode();
        if (iHashCode != -1145110768) {
            if (iHashCode != -371273613) {
                if (iHashCode == 1444281501 && name.equals(PROPERTY_TRIGGER_AUTO_FOCUS_ON_SHUTTER)) {
                    Boolean boolBooleanFromAny = TypeConverter.INSTANCE.booleanFromAny(value);
                    if (boolBooleanFromAny != null) {
                        this.f120621b = boolBooleanFromAny.booleanValue();
                        return;
                    }
                    return;
                }
            } else if (name.equals(PROPERTY_TRIGGER_AUTO_FOCUS_DELAY)) {
                Long lLongFromAny = TypeConverter.INSTANCE.longFromAny(value);
                if (lLongFromAny != null) {
                    this.f120622c = lLongFromAny.longValue();
                    return;
                }
                return;
            }
        } else if (name.equals(PROPERTY_USE_IMU_DATA)) {
            Boolean boolBooleanFromAny2 = TypeConverter.INSTANCE.booleanFromAny(value);
            if (boolBooleanFromAny2 != null) {
                getF120623a().setShouldUseIMUData(boolBooleanFromAny2.booleanValue());
                return;
            }
            return;
        }
        if (value instanceof Boolean) {
            getF120623a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF120623a().setIntProperty(name, numIntFromAny.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCountSettings() {
        NativeBarcodeCountSettings nativeBarcodeCountSettingsCreate = NativeBarcodeCountSettings.create();
        Intrinsics.i(nativeBarcodeCountSettingsCreate, "create(...)");
        this(nativeBarcodeCountSettingsCreate);
    }
}
