package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\bH'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fH'J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH'J\b\u0010!\u001a\u00020\"H'J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH'J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerProxy;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "_helper", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "warnings", "", "", "getWarnings", "()Ljava/util/List;", "_deserializer", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeFromJson", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "json", "_overlayFromJson", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "mode", "jsonData", "_setDeserializer", "", "deserializer", "_settingsFromJson", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "_updateOverlayFromJson", "overlay", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "updateModeFromJson", "updateSettingsFromJson", "settings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCountDeserializer.class)
/* loaded from: classes12.dex */
public interface BarcodeCountDeserializerProxy extends DataCaptureModeDeserializer {
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    BarcodeCountDeserializer _deserializer();

    @NativeImpl
    /* renamed from: _impl */
    NativeBarcodeCountDeserializer getF121685a();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    NativeDataCaptureModeDeserializer getF124568c();

    @ProxyFunction(nativeName = "barcodeCountFromJson")
    BarcodeCount _modeFromJson(DataCaptureContext dataCaptureContext, String json);

    @ProxyFunction(nativeName = "barcodeCountBasicOverlayFromJson")
    BarcodeCountBasicOverlay _overlayFromJson(BarcodeCount mode, String jsonData);

    @ProxySetter
    void _setDeserializer(BarcodeCountDeserializer deserializer);

    @ProxyFunction(nativeName = "settingsFromJson")
    BarcodeCountSettings _settingsFromJson(String json);

    @ProxyFunction(nativeName = "updateBarcodeCountBasicOverlayFromJson")
    BarcodeCountBasicOverlay _updateOverlayFromJson(BarcodeCountBasicOverlay overlay, String jsonData);

    @ProxyFunction
    CameraSettings createRecommendedCameraSettings();

    @ProxyFunction(property = "warnings")
    List<String> getWarnings();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    BarcodeCountDeserializerHelper get_helper();

    @ProxyFunction(nativeName = "updateBarcodeCountFromJson")
    BarcodeCount updateModeFromJson(BarcodeCount mode, String json);

    @ProxyFunction
    BarcodeCountSettings updateSettingsFromJson(BarcodeCountSettings settings, String json);
}
