package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.core.data.ClusteringMode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\b\u0010\u001e\u001a\u00020\u001fH'J\u0016\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H'J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0011H'J\u0018\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\tH'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00188gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006("}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettingsProxy;", "", "<set-?>", "Lcom/scandit/datacapture/core/data/ClusteringMode;", "clusteringMode", "getClusteringMode", "()Lcom/scandit/datacapture/core/data/ClusteringMode;", "setClusteringMode", "(Lcom/scandit/datacapture/core/data/ClusteringMode;)V", "", "disableModeWhenCaptureListCompleted", "getDisableModeWhenCaptureListCompleted", "()Z", "setDisableModeWhenCaptureListCompleted", "(Z)V", "enabledSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getEnabledSymbologies", "()Ljava/util/Set;", "expectsOnlyUniqueBarcodes", "getExpectsOnlyUniqueBarcodes", "setExpectsOnlyUniqueBarcodes", "filterSettings", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "mappingEnabled", "getMappingEnabled", "setMappingEnabled", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "enableSymbologies", "", "symbologies", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "symbology", "setSymbologyEnabled", "enabled", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCountSettings.class)
/* loaded from: classes11.dex */
public interface BarcodeCountSettingsProxy {
    @NativeImpl
    NativeBarcodeCountSettings _impl();

    @ProxyFunction
    void enableSymbologies(Set<? extends Symbology> symbologies);

    @ProxyFunction(nativeName = "getClusteringMode", property = "clusteringMode")
    ClusteringMode getClusteringMode();

    @ProxyFunction(nativeName = "shouldDisableModeWhenCaptureListCompleted", property = "disableModeWhenCaptureListCompleted")
    boolean getDisableModeWhenCaptureListCompleted();

    @ProxyFunction(nativeName = "getEnabledSymbologies", property = "enabledSymbologies")
    Set<Symbology> getEnabledSymbologies();

    @ProxyFunction(nativeName = "expectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    boolean getExpectsOnlyUniqueBarcodes();

    @ProxyFunction(nativeName = "getFilterSettings", property = "filterSettings")
    BarcodeFilterSettings getFilterSettings();

    @ProxyFunction(nativeName = "getMappingEnabled", property = "mappingEnabled")
    boolean getMappingEnabled();

    @ProxyFunction
    SymbologySettings getSymbologySettings(Symbology symbology);

    @ProxyFunction(nativeName = "setClusteringMode", property = "clusteringMode")
    void setClusteringMode(ClusteringMode clusteringMode);

    @ProxyFunction(nativeName = "setShouldDisableModeWhenCaptureListCompleted", property = "disableModeWhenCaptureListCompleted")
    void setDisableModeWhenCaptureListCompleted(boolean z10);

    @ProxyFunction(nativeName = "setExpectsOnlyUniqueBarcodes", property = "expectsOnlyUniqueBarcodes")
    void setExpectsOnlyUniqueBarcodes(boolean z10);

    @ProxyFunction(nativeName = "setMappingEnabled", property = "mappingEnabled")
    void setMappingEnabled(boolean z10);

    @ProxyFunction
    void setSymbologyEnabled(Symbology symbology, boolean enabled);
}
