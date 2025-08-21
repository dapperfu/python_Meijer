package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerProxy;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "_helper", "Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/BarcodeArDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/BarcodeArDeserializerHelper;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeFromJson", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "json", "", "_settingsFromJson", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "_updateModeFromJson", "mode", "_updateSettingsFromJson", "settings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeArDeserializer.class)
/* loaded from: classes12.dex */
public interface BarcodeArDeserializerProxy extends DataCaptureModeDeserializer {
    @NativeImpl
    /* renamed from: _impl */
    NativeBarcodeArDeserializer getF121066a();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    NativeDataCaptureModeDeserializer getF124568c();

    @ProxyFunction(nativeName = "barcodeArFromJson")
    BarcodeAr _modeFromJson(DataCaptureContext context, String json);

    @ProxyFunction(nativeName = "settingsFromJson")
    BarcodeArSettings _settingsFromJson(String json);

    @ProxyFunction(nativeName = "updateBarcodeArFromJson")
    BarcodeAr _updateModeFromJson(BarcodeAr mode, String json);

    @ProxyFunction(nativeName = "updateSettingsFromJson")
    BarcodeArSettings _updateSettingsFromJson(BarcodeArSettings settings, String json);

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    BarcodeArDeserializerHelper get_helper();
}
