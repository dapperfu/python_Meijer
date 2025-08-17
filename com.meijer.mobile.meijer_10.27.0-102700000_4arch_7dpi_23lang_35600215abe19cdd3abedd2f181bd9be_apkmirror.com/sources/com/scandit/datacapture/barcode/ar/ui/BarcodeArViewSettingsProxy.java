package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewSettingsProxy;", "", "<set-?>", "Lcom/scandit/datacapture/core/source/CameraPosition;", "defaultCameraPosition", "getDefaultCameraPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "setDefaultCameraPosition", "(Lcom/scandit/datacapture/core/source/CameraPosition;)V", "", "hapticEnabled", "getHapticEnabled", "()Z", "setHapticEnabled", "(Z)V", "soundEnabled", "getSoundEnabled", "setSoundEnabled", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/ar/ui/NativeBarcodeArViewSettings;", "_updateFromJson", "", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeArViewSettings.class)
/* loaded from: classes11.dex */
public interface BarcodeArViewSettingsProxy {
    @NativeImpl
    /* renamed from: _impl */
    NativeBarcodeArViewSettings getF120193a();

    @ProxyFunction(nativeName = "updateFromJson")
    void _updateFromJson(JsonValue json);

    @ProxyFunction(nativeName = "getCameraPosition", property = "defaultCameraPosition")
    CameraPosition getDefaultCameraPosition();

    @ProxyFunction(property = "hapticEnabled")
    boolean getHapticEnabled();

    @ProxyFunction(property = "soundEnabled")
    boolean getSoundEnabled();

    @ProxyFunction(nativeName = "setCameraPosition", property = "defaultCameraPosition")
    void setDefaultCameraPosition(CameraPosition cameraPosition);

    @ProxyFunction(property = "hapticEnabled")
    void setHapticEnabled(boolean z10);

    @ProxyFunction(property = "soundEnabled")
    void setSoundEnabled(boolean z10);
}
