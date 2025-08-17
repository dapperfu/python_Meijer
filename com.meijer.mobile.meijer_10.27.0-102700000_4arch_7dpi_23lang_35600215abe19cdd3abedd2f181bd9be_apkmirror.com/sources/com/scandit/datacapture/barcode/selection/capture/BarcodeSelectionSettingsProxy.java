package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0014\u001a\u00020\u0015H'J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\bH'J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0004H'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettingsProxy;", "", "enabledSymbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getEnabledSymbologies", "()Ljava/util/Set;", "<set-?>", "", "singleBarcodeAutoDetection", "getSingleBarcodeAutoDetection", "()Z", "setSingleBarcodeAutoDetection", "(Z)V", "swipeGesturesEnabled", "getSwipeGesturesEnabled", "setSwipeGesturesEnabled", "tapGestureForSelectionEnabled", "getTapGestureForSelectionEnabled", "setTapGestureForSelectionEnabled", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;", "enableSymbologies", "", "symbologies", "enableSymbology", "symbology", "enabled", "getSymbologySettings", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeSelectionSettings.class)
/* loaded from: classes11.dex */
public interface BarcodeSelectionSettingsProxy {
    @NativeImpl
    NativeBarcodeSelectionSettings _impl();

    @ProxyFunction
    void enableSymbologies(Set<? extends Symbology> symbologies);

    @ProxyFunction(nativeName = "setSymbologyEnabled")
    void enableSymbology(Symbology symbology, boolean enabled);

    @ProxyFunction(property = "enabledSymbologies")
    Set<Symbology> getEnabledSymbologies();

    @ProxyFunction(nativeName = "getSingleBarcodeAutoDetectionEnabled", property = "singleBarcodeAutoDetection")
    boolean getSingleBarcodeAutoDetection();

    @ProxyFunction(nativeName = "getSwipeGesturesEnabled", property = "swipeGesturesEnabled")
    boolean getSwipeGesturesEnabled();

    @ProxyFunction
    SymbologySettings getSymbologySettings(Symbology symbology);

    @ProxyFunction(nativeName = "getTapGestureForSelectionEnabled", property = "tapGestureForSelectionEnabled")
    boolean getTapGestureForSelectionEnabled();

    @ProxyFunction(nativeName = "setSingleBarcodeAutoDetectionEnabled", property = "singleBarcodeAutoDetection")
    void setSingleBarcodeAutoDetection(boolean z10);

    @ProxyFunction(nativeName = "setSwipeGesturesEnabled", property = "swipeGesturesEnabled")
    void setSwipeGesturesEnabled(boolean z10);

    @ProxyFunction(nativeName = "setTapGestureForSelectionEnabled", property = "tapGestureForSelectionEnabled")
    void setTapGestureForSelectionEnabled(boolean z10);
}
