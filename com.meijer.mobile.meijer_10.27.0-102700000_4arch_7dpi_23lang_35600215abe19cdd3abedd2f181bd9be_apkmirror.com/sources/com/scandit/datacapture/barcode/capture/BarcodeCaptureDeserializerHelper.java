package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayStyle;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheResult;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;

@ProxyReversedAdapter(NativeBarcodeCaptureDeserializerHelper.class)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H'J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'J\b\u0010\u0017\u001a\u00020\u0007H'J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH'¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "applySettings", "", "mode", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "settings", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "changeOverlayAddedToView", "overlay", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "view", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "added", "", "createMode", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "createOverlay", "style", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createSettings", "updateModeFromJson", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "updateOverlayFromJson", "updateSettingsFromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeCaptureDeserializerHelper extends DataCaptureDeserializerHelper {
    @ProxyFunction
    void applySettings(BarcodeCapture mode, BarcodeCaptureSettings settings);

    @ProxyFunction
    void changeOverlayAddedToView(BarcodeCaptureOverlay overlay, DataCaptureView view, boolean added);

    @ProxyCacheResult
    @ProxyFunction
    BarcodeCapture createMode(DataCaptureContext dataCaptureContext);

    @ProxyCacheResult
    @ProxyFunction
    BarcodeCaptureOverlay createOverlay(BarcodeCapture mode, BarcodeCaptureOverlayStyle style);

    @ProxyFunction
    CameraSettings createRecommendedCameraSettings();

    @ProxyCacheResult
    @ProxyFunction
    BarcodeCaptureSettings createSettings();

    @ProxyFunction
    void updateModeFromJson(BarcodeCapture mode, JsonValue json);

    @ProxyFunction
    void updateOverlayFromJson(BarcodeCaptureOverlay overlay, JsonValue json);

    @ProxyFunction
    void updateSettingsFromJson(BarcodeCaptureSettings settings, JsonValue json);
}
