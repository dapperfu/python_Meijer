package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.ArucoDictionary;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH'J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\bH'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0004H'J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettingsProxy;", "", "enabledSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getEnabledSymbologies", "()Ljava/util/Set;", "<set-?>", "", "expectsOnlyUniqueBarcodes", "getExpectsOnlyUniqueBarcodes", "()Z", "setExpectsOnlyUniqueBarcodes", "(Z)V", "_impl", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;", "enableSymbologies", "", "symbologies", "enableSymbology", "symbology", "enabled", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "setArucoDictionary", "dictionary", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeTrackingSettings.class)
/* loaded from: classes12.dex */
public interface BarcodeBatchSettingsProxy {
    @NativeImpl
    NativeBarcodeTrackingSettings _impl();

    @ProxyFunction
    void enableSymbologies(Set<? extends Symbology> symbologies);

    @ProxyFunction(nativeName = "setSymbologyEnabled")
    void enableSymbology(Symbology symbology, boolean enabled);

    @ProxyFunction(property = "enabledSymbologies")
    Set<Symbology> getEnabledSymbologies();

    @ProxyFunction(nativeName = "expectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    boolean getExpectsOnlyUniqueBarcodes();

    @ProxyFunction
    SymbologySettings getSymbologySettings(Symbology symbology);

    @ProxyFunction
    void setArucoDictionary(ArucoDictionary dictionary);

    @ProxyFunction(nativeName = "setExpectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    void setExpectsOnlyUniqueBarcodes(boolean z10);
}
