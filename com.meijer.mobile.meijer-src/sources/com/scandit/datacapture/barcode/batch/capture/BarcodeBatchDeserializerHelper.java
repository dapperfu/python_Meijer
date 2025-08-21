package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlayStyle;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeObjectTrackerScenario;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheResult;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Deprecated;
import kotlin.Metadata;

@ProxyReversedAdapter(NativeBarcodeTrackingDeserializerHelper.class)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H'J\b\u0010\u0018\u001a\u00020\u0019H'J\b\u0010\u001a\u001a\u00020\u0007H'J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH'J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H'J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H'J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 H'J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H'¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelper;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "applySettings", "", "mode", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "settings", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "changeAdvancedOverlayAddedToView", "overlay", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "view", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "added", "", "changeBasicOverlayAddedToView", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "createAdvancedOverlay", "createBasicOverlay", "style", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayStyle;", "createMode", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createSettings", "createSettingsForScenario", "scenario", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeObjectTrackerScenario;", "updateAdvancedOverlayFromJson", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "updateBasicOverlayFromJson", "updateModeFromJson", "updateSettingsFromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeBatchDeserializerHelper extends DataCaptureDeserializerHelper {
    @ProxyFunction
    void applySettings(BarcodeBatch mode, BarcodeBatchSettings settings);

    @ProxyFunction
    void changeAdvancedOverlayAddedToView(BarcodeBatchAdvancedOverlay overlay, DataCaptureView view, boolean added);

    @ProxyFunction
    void changeBasicOverlayAddedToView(BarcodeBatchBasicOverlay overlay, DataCaptureView view, boolean added);

    @ProxyCacheResult
    @ProxyFunction
    BarcodeBatchAdvancedOverlay createAdvancedOverlay(BarcodeBatch mode);

    @ProxyCacheResult
    @ProxyFunction
    BarcodeBatchBasicOverlay createBasicOverlay(BarcodeBatch mode, BarcodeBatchBasicOverlayStyle style);

    @ProxyCacheResult
    @ProxyFunction
    BarcodeBatch createMode(DataCaptureContext dataCaptureContext);

    @ProxyFunction
    CameraSettings createRecommendedCameraSettings();

    @ProxyCacheResult
    @ProxyFunction
    BarcodeBatchSettings createSettings();

    @Deprecated
    @ProxyCacheResult
    @ProxyFunction
    BarcodeBatchSettings createSettingsForScenario(NativeObjectTrackerScenario scenario);

    @ProxyFunction
    void updateAdvancedOverlayFromJson(BarcodeBatchAdvancedOverlay overlay, JsonValue json);

    @ProxyFunction
    void updateBasicOverlayFromJson(BarcodeBatchBasicOverlay overlay, JsonValue json);

    @ProxyFunction
    void updateModeFromJson(BarcodeBatch mode, JsonValue json);

    @ProxyFunction
    void updateSettingsFromJson(BarcodeBatchSettings settings, JsonValue json);
}
