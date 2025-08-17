package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializer;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlay;
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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH'J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH'J\b\u0010\u0012\u001a\u00020\u0013H'J\b\u0010\u0014\u001a\u00020\u0015H'J\b\u0010\u0016\u001a\u00020\u0017H'J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\bH'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\bH'J\u0018\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH'J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\bH'J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH'J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\bH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerProxy;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "_helper", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelper;", "warnings", "", "", "getWarnings", "()Ljava/util/List;", "_advancedOverlayFromJson", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "mode", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "jsonData", "_basicOverlayFromJson", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "_deserializer", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;", "_impl", "Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeFromJson", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "_setDeserializer", "", "deserializer", "_settingsFromJson", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "updateAdvancedOverlayFromJson", "overlay", "updateBasicOverlayFromJson", "updateModeFromJson", "updateSettingsFromJson", "settings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeTrackingDeserializer.class)
/* loaded from: classes11.dex */
public interface BarcodeBatchDeserializerProxy extends DataCaptureModeDeserializer {
    @ProxyFunction(nativeName = "barcodeTrackingAdvancedOverlayFromJson")
    BarcodeBatchAdvancedOverlay _advancedOverlayFromJson(BarcodeBatch mode, String jsonData);

    @ProxyFunction(nativeName = "barcodeTrackingBasicOverlayFromJson")
    BarcodeBatchBasicOverlay _basicOverlayFromJson(BarcodeBatch mode, String jsonData);

    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    BarcodeBatchDeserializer _deserializer();

    @NativeImpl
    /* renamed from: _impl */
    NativeBarcodeTrackingDeserializer getF120418a();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    NativeDataCaptureModeDeserializer getF123616c();

    @ProxyFunction(nativeName = "barcodeTrackingFromJson")
    BarcodeBatch _modeFromJson(DataCaptureContext dataCaptureContext, String jsonData);

    @ProxySetter
    void _setDeserializer(BarcodeBatchDeserializer deserializer);

    @ProxyFunction(nativeName = "settingsFromJson")
    BarcodeBatchSettings _settingsFromJson(String jsonData);

    @ProxyFunction(property = "warnings")
    List<String> getWarnings();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    BarcodeBatchDeserializerHelper get_helper();

    @ProxyFunction(nativeName = "updateBarcodeTrackingAdvancedOverlayFromJson")
    BarcodeBatchAdvancedOverlay updateAdvancedOverlayFromJson(BarcodeBatchAdvancedOverlay overlay, String jsonData);

    @ProxyFunction(nativeName = "updateBarcodeTrackingBasicOverlayFromJson")
    BarcodeBatchBasicOverlay updateBasicOverlayFromJson(BarcodeBatchBasicOverlay overlay, String jsonData);

    @ProxyFunction(nativeName = "updateBarcodeTrackingFromJson")
    BarcodeBatch updateModeFromJson(BarcodeBatch mode, String jsonData);

    @ProxyFunction
    BarcodeBatchSettings updateSettingsFromJson(BarcodeBatchSettings settings, String jsonData);
}
