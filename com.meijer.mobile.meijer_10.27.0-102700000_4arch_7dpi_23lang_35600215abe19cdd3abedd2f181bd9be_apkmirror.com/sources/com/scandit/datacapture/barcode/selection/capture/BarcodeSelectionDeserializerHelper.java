package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayStyle;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheResult;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;

@ProxyReversedAdapter(NativeBarcodeSelectionDeserializerHelper.class)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H'J\b\u0010\u0016\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH'J\b\u0010\u001b\u001a\u00020\u001cH'J\b\u0010\u001d\u001a\u00020\u0007H'J\b\u0010\u001e\u001a\u00020\u001fH'J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H'J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H'J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H'¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "applySettings", "", "mode", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "settings", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "changeBasicOverlayAddedToView", "overlay", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "view", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "added", "", "createAimerSelection", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerSelection;", "createAutoSelectionStrategy", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAutoSelectionStrategy;", "createBasicOverlay", "style", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "createManualSelectionStrategy", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionManualSelectionStrategy;", "createMode", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createSettings", "createTapSelection", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapSelection;", "updateBasicOverlayFromJson", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "updateModeFromJson", "updateSettingsFromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeSelectionDeserializerHelper extends DataCaptureDeserializerHelper {
    @ProxyFunction
    void applySettings(BarcodeSelection mode, BarcodeSelectionSettings settings);

    @ProxyFunction
    void changeBasicOverlayAddedToView(BarcodeSelectionBasicOverlay overlay, DataCaptureView view, boolean added);

    @ProxyCacheResult
    @ProxyFunction
    BarcodeSelectionAimerSelection createAimerSelection();

    @ProxyCacheResult
    @ProxyFunction
    BarcodeSelectionAutoSelectionStrategy createAutoSelectionStrategy();

    @ProxyCacheResult
    @ProxyFunction
    BarcodeSelectionBasicOverlay createBasicOverlay(BarcodeSelection mode, BarcodeSelectionBasicOverlayStyle style);

    @ProxyCacheResult
    @ProxyFunction
    BarcodeSelectionManualSelectionStrategy createManualSelectionStrategy();

    @ProxyCacheResult
    @ProxyFunction
    BarcodeSelection createMode(DataCaptureContext dataCaptureContext);

    @ProxyFunction
    CameraSettings createRecommendedCameraSettings();

    @ProxyCacheResult
    @ProxyFunction
    BarcodeSelectionSettings createSettings();

    @ProxyCacheResult
    @ProxyFunction
    BarcodeSelectionTapSelection createTapSelection();

    @ProxyFunction
    void updateBasicOverlayFromJson(BarcodeSelectionBasicOverlay overlay, JsonValue json);

    @ProxyFunction
    void updateModeFromJson(BarcodeSelection mode, JsonValue json);

    @ProxyFunction
    void updateSettingsFromJson(BarcodeSelectionSettings settings, JsonValue json);
}
