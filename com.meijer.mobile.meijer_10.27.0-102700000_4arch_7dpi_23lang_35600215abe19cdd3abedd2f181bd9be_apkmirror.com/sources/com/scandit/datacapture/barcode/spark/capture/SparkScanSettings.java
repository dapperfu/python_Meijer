package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.core.internal.sdk.utils.TypeConverter;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R$\u00108\u001a\u0002022\u0006\u00103\u001a\u0002028W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010>\u001a\u0002092\u0006\u0010!\u001a\u0002098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettingsProxy;", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSettings;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSettings;)V", "()V", "", "Lcom/scandit/datacapture/barcode/data/CapturePreset;", "capturePresets", "(Ljava/util/Set;)V", "_impl", "()Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSettings;", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbologies", "", "enableSymbologies", "symbology", "", "enabled", "enableSymbology", "(Lcom/scandit/datacapture/barcode/data/Symbology;Z)V", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "getSymbologySettings", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "scanningMode", "_applySettingsForScanningMode$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;)V", "_applySettingsForScanningMode", "", "name", "", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "key", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "b", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "getBatterySaving", "()Lcom/scandit/datacapture/core/source/BatterySavingMode;", "setBatterySaving", "(Lcom/scandit/datacapture/core/source/BatterySavingMode;)V", "batterySaving", "getEnabledSymbologies", "()Ljava/util/Set;", "enabledSymbologies", "Lcom/scandit/datacapture/core/source/ScanIntention;", "<set-?>", "getScanIntention", "()Lcom/scandit/datacapture/core/source/ScanIntention;", "setScanIntention", "(Lcom/scandit/datacapture/core/source/ScanIntention;)V", "scanIntention", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getCodeDuplicateFilter", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setCodeDuplicateFilter", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "codeDuplicateFilter", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SparkScanSettings implements SparkScanSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SparkScanSettingsProxyAdapter f123868a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private BatterySavingMode batterySaving;

    /* JADX WARN: Multi-variable type inference failed */
    public SparkScanSettings(NativeSparkScanSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f123868a = new SparkScanSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.batterySaving = BatterySavingMode.AUTO;
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeSparkScanSettings getF123870a() {
        return this.f123868a.getF123870a();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction
    public void enableSymbologies(Set<? extends Symbology> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        this.f123868a.enableSymbologies(symbologies);
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction(nativeName = "setSymbologyEnabled")
    public void enableSymbology(Symbology symbology, boolean enabled) {
        Intrinsics.j(symbology, "symbology");
        this.f123868a.enableSymbology(symbology, enabled);
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction(property = "enabledSymbologies")
    public Set<Symbology> getEnabledSymbologies() {
        return this.f123868a.getEnabledSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction(nativeName = "getScanIntention", property = "scanIntention")
    public ScanIntention getScanIntention() {
        return this.f123868a.getScanIntention();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction
    public SymbologySettings getSymbologySettings(Symbology symbology) {
        Intrinsics.j(symbology, "symbology");
        return this.f123868a.getSymbologySettings(symbology);
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSettingsProxy
    @ProxyFunction(nativeName = "setScanIntention", property = "scanIntention")
    public void setScanIntention(ScanIntention scanIntention) {
        Intrinsics.j(scanIntention, "<set-?>");
        this.f123868a.setScanIntention(scanIntention);
    }

    public final /* synthetic */ void _applySettingsForScanningMode$scandit_barcode_capture(SparkScanScanningMode scanningMode) {
        Intrinsics.j(scanningMode, "scanningMode");
        getF123870a().updateForTargetModeEnabled(scanningMode instanceof SparkScanScanningMode.Target);
    }

    public final BatterySavingMode getBatterySaving() {
        return this.batterySaving;
    }

    public final TimeInterval getCodeDuplicateFilter() {
        return TimeInterval.INSTANCE.millis(getF123870a().getCodeDuplicateFilterMilliseconds());
    }

    public final Object getProperty(String key) {
        Intrinsics.j(key, "key");
        Integer intProperty = getF123870a().getIntProperty(key);
        if (intProperty != null) {
            return intProperty;
        }
        Boolean boolProperty = getF123870a().getBoolProperty(key);
        Integer numValueOf = boolProperty != null ? Integer.valueOf(Boolean.compare(boolProperty.booleanValue(), false)) : null;
        if (numValueOf == null) {
            return -1;
        }
        return numValueOf;
    }

    public final void setBatterySaving(BatterySavingMode batterySavingMode) {
        Intrinsics.j(batterySavingMode, "<set-?>");
        this.batterySaving = batterySavingMode;
    }

    public final void setCodeDuplicateFilter(TimeInterval value) {
        Intrinsics.j(value, "value");
        getF123870a().setCodeDuplicateFilterMilliseconds((int) value.asMillis());
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        if (value instanceof Float) {
            getF123870a().setFloatProperty(name, ((Number) value).floatValue());
            return;
        }
        if (value instanceof String) {
            getF123870a().setStringProperty(name, (String) value);
            return;
        }
        if (value instanceof Boolean) {
            getF123870a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        Integer numIntFromAny = TypeConverter.INSTANCE.intFromAny(value);
        if (numIntFromAny != null) {
            getF123870a().setIntProperty(name, numIntFromAny.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SparkScanSettings() {
        NativeSparkScanSettings nativeSparkScanSettingsCreate = NativeSparkScanSettings.create();
        Intrinsics.i(nativeSparkScanSettingsCreate, "create(...)");
        this(nativeSparkScanSettingsCreate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SparkScanSettings(Set<? extends CapturePreset> capturePresets) {
        Intrinsics.j(capturePresets, "capturePresets");
        NativeSparkScanSettings nativeSparkScanSettingsCreateWithPresets = NativeSparkScanSettings.createWithPresets(CollectionsKt.h1(capturePresets));
        Intrinsics.i(nativeSparkScanSettingsCreateWithPresets, "createWithPresets(...)");
        this(nativeSparkScanSettingsCreateWithPresets);
    }
}
