package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheResult;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;

@ProxyReversedAdapter(NativeBarcodeCountDeserializerHelper.class)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0007H'J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H'¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "applySettings", "", "mode", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "settings", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "changeBasicOverlayAddedToView", "overlay", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "view", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "added", "", "createBasicOverlay", "style", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "createMode", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "createSettings", "updateBasicOverlayFromJson", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "updateModeFromJson", "updateSettingsFromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeCountDeserializerHelper extends DataCaptureDeserializerHelper {
    @ProxyFunction
    void applySettings(BarcodeCount mode, BarcodeCountSettings settings);

    @ProxyFunction
    void changeBasicOverlayAddedToView(BarcodeCountBasicOverlay overlay, DataCaptureView view, boolean added);

    @ProxyFunction
    BarcodeCountBasicOverlay createBasicOverlay(BarcodeCount mode, BarcodeCountViewStyle style);

    @ProxyCacheResult
    @ProxyFunction
    BarcodeCount createMode(DataCaptureContext dataCaptureContext);

    @ProxyCacheResult
    @ProxyFunction
    BarcodeCountSettings createSettings();

    @ProxyFunction
    void updateBasicOverlayFromJson(BarcodeCountBasicOverlay overlay, JsonValue json);

    @ProxyFunction
    void updateModeFromJson(BarcodeCount mode, JsonValue json);

    @ProxyFunction
    void updateSettingsFromJson(BarcodeCountSettings settings, JsonValue json);
}
