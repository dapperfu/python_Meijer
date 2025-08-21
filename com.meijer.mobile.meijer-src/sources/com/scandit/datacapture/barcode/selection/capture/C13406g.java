package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeSelectionFeedbackDeserializer;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayStyle;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.selection.capture.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13406g implements BarcodeSelectionDeserializerHelper, DataCaptureDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f124764a = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    public BarcodeSelectionType f124765b;

    /* renamed from: c, reason: collision with root package name */
    public BarcodeSelectionStrategy f124766c;

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
        this.f124765b = null;
        this.f124766c = null;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void applySettings(BarcodeSelection mode, BarcodeSelectionSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        BarcodeSelection.applySettings$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void changeBasicOverlayAddedToView(BarcodeSelectionBasicOverlay overlay, DataCaptureView view, boolean z10) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(view, "view");
        if (z10) {
            view.addOverlay(overlay);
        } else {
            view.removeOverlay(overlay);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionAimerSelection createAimerSelection() {
        BarcodeSelectionAimerSelection barcodeSelectionAimerSelection = new BarcodeSelectionAimerSelection();
        this.f124765b = barcodeSelectionAimerSelection;
        return barcodeSelectionAimerSelection;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionAutoSelectionStrategy createAutoSelectionStrategy() {
        BarcodeSelectionAutoSelectionStrategy barcodeSelectionAutoSelectionStrategy = new BarcodeSelectionAutoSelectionStrategy();
        this.f124766c = barcodeSelectionAutoSelectionStrategy;
        return barcodeSelectionAutoSelectionStrategy;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionBasicOverlay createBasicOverlay(BarcodeSelection mode, BarcodeSelectionBasicOverlayStyle style) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(style, "style");
        Object obj = this.f124764a.get();
        Intrinsics.g(obj);
        Viewfinder viewfinder_getAndResetLastViewfinder = ((BarcodeSelectionDeserializer) obj).getViewfinderDeserializer()._getAndResetLastViewfinder();
        BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlayNewInstance = BarcodeSelectionBasicOverlay.INSTANCE.newInstance(mode, null, style);
        if ((viewfinder_getAndResetLastViewfinder instanceof AimerViewfinder) && (barcodeSelectionBasicOverlayNewInstance.getViewfinder() instanceof AimerViewfinder)) {
            AimerViewfinder aimerViewfinder = (AimerViewfinder) viewfinder_getAndResetLastViewfinder;
            ((AimerViewfinder) barcodeSelectionBasicOverlayNewInstance.getViewfinder()).setDotColor(aimerViewfinder.getDotColor());
            ((AimerViewfinder) barcodeSelectionBasicOverlayNewInstance.getViewfinder()).setFrameColor(aimerViewfinder.getFrameColor());
        }
        return barcodeSelectionBasicOverlayNewInstance;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionManualSelectionStrategy createManualSelectionStrategy() {
        BarcodeSelectionManualSelectionStrategy barcodeSelectionManualSelectionStrategy = new BarcodeSelectionManualSelectionStrategy();
        this.f124766c = barcodeSelectionManualSelectionStrategy;
        return barcodeSelectionManualSelectionStrategy;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelection createMode(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        return BarcodeSelection.INSTANCE.forDataCaptureContext(dataCaptureContext, new BarcodeSelectionSettings());
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final CameraSettings createRecommendedCameraSettings() {
        return BarcodeSelection.INSTANCE.createRecommendedCameraSettings();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionSettings createSettings() {
        return new BarcodeSelectionSettings();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final BarcodeSelectionTapSelection createTapSelection() {
        BarcodeSelectionTapSelection barcodeSelectionTapSelection = new BarcodeSelectionTapSelection();
        this.f124765b = barcodeSelectionTapSelection;
        return barcodeSelectionTapSelection;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void updateBasicOverlayFromJson(BarcodeSelectionBasicOverlay overlay, JsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        Object obj = this.f124764a.get();
        Intrinsics.g(obj);
        Viewfinder viewfinder_getAndResetLastViewfinder = ((BarcodeSelectionDeserializer) obj).getViewfinderDeserializer()._getAndResetLastViewfinder();
        Viewfinder viewfinder = overlay.getViewfinder();
        if ((viewfinder_getAndResetLastViewfinder instanceof AimerViewfinder) && (viewfinder instanceof AimerViewfinder)) {
            AimerViewfinder aimerViewfinder = (AimerViewfinder) viewfinder;
            AimerViewfinder aimerViewfinder2 = (AimerViewfinder) viewfinder_getAndResetLastViewfinder;
            aimerViewfinder.setDotColor(aimerViewfinder2.getDotColor());
            aimerViewfinder.setFrameColor(aimerViewfinder2.getFrameColor());
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void updateModeFromJson(BarcodeSelection mode, JsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        JsonValue byKeyAsObject = json.getByKeyAsObject("feedback", null);
        if (byKeyAsObject != null) {
            mode.setFeedback(BarcodeSelectionFeedbackDeserializer.fromJson(byKeyAsObject));
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerHelper
    public final void updateSettingsFromJson(BarcodeSelectionSettings settings, JsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeSelectionType barcodeSelectionType = this.f124765b;
        if (barcodeSelectionType != null) {
            BarcodeSelectionStrategy barcodeSelectionStrategy = this.f124766c;
            if (barcodeSelectionStrategy != null) {
                BarcodeSelectionAimerSelection barcodeSelectionAimerSelection = barcodeSelectionType instanceof BarcodeSelectionAimerSelection ? (BarcodeSelectionAimerSelection) barcodeSelectionType : null;
                if (barcodeSelectionAimerSelection != null) {
                    barcodeSelectionAimerSelection.setSelectionStrategy(barcodeSelectionStrategy);
                }
            }
            settings.setSelectionType(barcodeSelectionType);
        }
    }
}
