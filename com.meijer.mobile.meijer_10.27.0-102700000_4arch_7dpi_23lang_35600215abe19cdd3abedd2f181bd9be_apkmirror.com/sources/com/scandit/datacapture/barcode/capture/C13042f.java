package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeCaptureFeedbackDeserializer;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayStyle;
import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.area.NoLocationSelection;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinder;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.capture.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13042f implements BarcodeCaptureDeserializerHelper, DataCaptureDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f120575a = new WeakReference(null);

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void applySettings(BarcodeCapture mode, BarcodeCaptureSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        BarcodeCapture.applySettings$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void changeOverlayAddedToView(BarcodeCaptureOverlay overlay, DataCaptureView view, boolean z10) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(view, "view");
        if (z10) {
            view.addOverlay(overlay);
        } else {
            view.removeOverlay(overlay);
        }
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final BarcodeCapture createMode(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        return BarcodeCapture.INSTANCE.forDataCaptureContext(dataCaptureContext, new BarcodeCaptureSettings());
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final BarcodeCaptureOverlay createOverlay(BarcodeCapture mode, BarcodeCaptureOverlayStyle style) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(style, "style");
        Object obj = this.f120575a.get();
        Intrinsics.g(obj);
        ((BarcodeCaptureDeserializer) obj).getViewfinderDeserializer()._getAndResetLastViewfinder();
        return BarcodeCaptureOverlay.INSTANCE.newInstance(mode, null, style);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final CameraSettings createRecommendedCameraSettings() {
        return BarcodeCapture.INSTANCE.createRecommendedCameraSettings();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final BarcodeCaptureSettings createSettings() {
        Object obj = this.f120575a.get();
        Intrinsics.g(obj);
        ((BarcodeCaptureDeserializer) obj).getLocationSelectionDeserializer()._getAndResetLastLocationSelection();
        return new BarcodeCaptureSettings();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void updateModeFromJson(BarcodeCapture mode, JsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        JsonValue byKeyAsObject = json.getByKeyAsObject("feedback", null);
        if (byKeyAsObject != null) {
            mode.setFeedback(BarcodeCaptureFeedbackDeserializer.fromJson(byKeyAsObject));
        }
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void updateOverlayFromJson(BarcodeCaptureOverlay overlay, JsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        Object obj = this.f120575a.get();
        Intrinsics.g(obj);
        Viewfinder viewfinder_getAndResetLastViewfinder = ((BarcodeCaptureDeserializer) obj).getViewfinderDeserializer()._getAndResetLastViewfinder();
        if (viewfinder_getAndResetLastViewfinder != null) {
            if (viewfinder_getAndResetLastViewfinder instanceof NoViewfinder) {
                viewfinder_getAndResetLastViewfinder = null;
            }
            overlay.setViewfinder(viewfinder_getAndResetLastViewfinder);
        }
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerHelper
    public final void updateSettingsFromJson(BarcodeCaptureSettings settings, JsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        Object obj = this.f120575a.get();
        Intrinsics.g(obj);
        LocationSelection locationSelection_getAndResetLastLocationSelection = ((BarcodeCaptureDeserializer) obj).getLocationSelectionDeserializer()._getAndResetLastLocationSelection();
        if (locationSelection_getAndResetLastLocationSelection != null) {
            if (locationSelection_getAndResetLastLocationSelection instanceof NoLocationSelection) {
                locationSelection_getAndResetLastLocationSelection = null;
            }
            settings.setLocationSelection(locationSelection_getAndResetLastLocationSelection);
        }
    }
}
