package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH'J\b\u0010\u0010\u001a\u00020\u0011H'J\b\u0010\u0012\u001a\u00020\u0013H'J\b\u0010\u0014\u001a\u00020\u0015H'J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\bH'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H'J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\bH'J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH'J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH'J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerProxy;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "_helper", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "warnings", "", "", "getWarnings", "()Ljava/util/List;", "_basicOverlayFromJson", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "mode", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "jsonData", "_deserializer", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeFromJson", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "_setDeserializer", "", "deserializer", "_settingsFromJson", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "updateBasicOverlayFromJson", "overlay", "updateModeFromJson", "updateSettingsFromJson", "settings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeSelectionDeserializer.class)
/* loaded from: classes12.dex */
public interface BarcodeSelectionDeserializerProxy extends DataCaptureModeDeserializer {
    @ProxyFunction(nativeName = "barcodeSelectionBasicOverlayFromJson")
    BarcodeSelectionBasicOverlay _basicOverlayFromJson(BarcodeSelection mode, String jsonData);

    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    BarcodeSelectionDeserializer _deserializer();

    @NativeImpl
    /* renamed from: _impl */
    NativeBarcodeSelectionDeserializer getF124724a();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    NativeDataCaptureModeDeserializer getF124568c();

    @ProxyFunction(nativeName = "barcodeSelectionFromJson")
    BarcodeSelection _modeFromJson(DataCaptureContext dataCaptureContext, String jsonData);

    @ProxySetter
    void _setDeserializer(BarcodeSelectionDeserializer deserializer);

    @ProxyFunction(nativeName = "settingsFromJson")
    BarcodeSelectionSettings _settingsFromJson(String jsonData);

    @ProxyFunction(property = "warnings")
    List<String> getWarnings();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    BarcodeSelectionDeserializerHelper get_helper();

    @ProxyFunction(nativeName = "updateBarcodeSelectionBasicOverlayFromJson")
    BarcodeSelectionBasicOverlay updateBasicOverlayFromJson(BarcodeSelectionBasicOverlay overlay, String jsonData);

    @ProxyFunction(nativeName = "updateBarcodeSelectionFromJson")
    BarcodeSelection updateModeFromJson(BarcodeSelection mode, String jsonData);

    @ProxyFunction
    BarcodeSelectionSettings updateSettingsFromJson(BarcodeSelectionSettings settings, String jsonData);
}
