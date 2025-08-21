package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u001b\u001a\u00020\u001cH'J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tH'J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H'J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H'J\u0010\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u0012H'J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00158g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettingsProxy;", "", "<set-?>", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "batterySaving", "getBatterySaving", "()Lcom/scandit/datacapture/core/source/BatterySavingMode;", "setBatterySaving", "(Lcom/scandit/datacapture/core/source/BatterySavingMode;)V", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "enabledCompositeTypes", "getEnabledCompositeTypes", "()Ljava/util/EnumSet;", "setEnabledCompositeTypes", "(Ljava/util/EnumSet;)V", "enabledSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getEnabledSymbologies", "()Ljava/util/Set;", "Lcom/scandit/datacapture/core/source/ScanIntention;", "scanIntention", "getScanIntention", "()Lcom/scandit/datacapture/core/source/ScanIntention;", "setScanIntention", "(Lcom/scandit/datacapture/core/source/ScanIntention;)V", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "enableSymbologies", "", "compositeTypes", "symbologies", "enableSymbology", "symbology", "enabled", "", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "setArucoDictionary", "dictionary", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCaptureSettings.class)
/* loaded from: classes12.dex */
public interface BarcodeCaptureSettingsProxy {
    @NativeImpl
    NativeBarcodeCaptureSettings _impl();

    @ProxyFunction(nativeName = "enableSymbologiesForCompositeTypes")
    void enableSymbologies(EnumSet<CompositeType> compositeTypes);

    @ProxyFunction
    void enableSymbologies(Set<? extends Symbology> symbologies);

    @ProxyFunction(nativeName = "setSymbologyEnabled")
    void enableSymbology(Symbology symbology, boolean enabled);

    @ProxyFunction(nativeName = "getBatterySavingMode", property = "batterySaving")
    BatterySavingMode getBatterySaving();

    @ProxyFunction(nativeName = "getEnabledCompositeTypesBits", property = "enabledCompositeTypes")
    EnumSet<CompositeType> getEnabledCompositeTypes();

    @ProxyFunction(property = "enabledSymbologies")
    Set<Symbology> getEnabledSymbologies();

    @ProxyFunction(nativeName = "getScanIntention", property = "scanIntention")
    ScanIntention getScanIntention();

    @ProxyFunction
    SymbologySettings getSymbologySettings(Symbology symbology);

    @ProxyFunction
    void setArucoDictionary(ArucoDictionary dictionary);

    @ProxyFunction(nativeName = "setBatterySavingMode", property = "batterySaving")
    void setBatterySaving(BatterySavingMode batterySavingMode);

    @ProxyFunction(nativeName = "setEnabledCompositeTypesBits", property = "enabledCompositeTypes")
    void setEnabledCompositeTypes(EnumSet<CompositeType> enumSet);

    @ProxyFunction(nativeName = "setScanIntention", property = "scanIntention")
    void setScanIntention(ScanIntention scanIntention);
}
