package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProduct;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u000bH'J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0017H'J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u0017H'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0017H'J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010%\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010'\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006("}, d2 = {"Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerProxy;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "_helper", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "_deserializer", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeFromJson", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "productProvider", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "json", "", "_overlayFromJson", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "mode", "Lcom/scandit/datacapture/core/json/JsonValue;", "_productsFromJson", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "_setDeserializer", "", "deserializerProxy", "_settingsFromJson", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "_updateOverlayFromJson", "overlay", "_updateViewSettingsFromJson", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "settings", "_viewSettingsFromJson", "updateModeFromJson", "updateSettingsFromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickDeserializer.class)
/* loaded from: classes12.dex */
public interface BarcodePickDeserializerProxy extends DataCaptureModeDeserializer {
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    BarcodePickDeserializer _deserializer();

    @NativeImpl
    /* renamed from: _impl */
    NativeBarcodePickDeserializer getF124566a();

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    NativeDataCaptureModeDeserializer getF124568c();

    @ProxyFunction(nativeName = "barcodePickFromJson")
    BarcodePick _modeFromJson(DataCaptureContext context, BarcodePickProductProvider productProvider, String json);

    @ProxyFunction(nativeName = "overlayFromJson")
    BarcodePickBasicOverlay _overlayFromJson(BarcodePick mode, JsonValue json);

    @ProxyFunction(nativeName = "barcodePickProductsFromJson")
    List<BarcodePickProduct> _productsFromJson(JsonValue json);

    @ProxySetter
    void _setDeserializer(BarcodePickDeserializer deserializerProxy);

    @ProxyFunction(nativeName = "settingsFromJson")
    BarcodePickSettings _settingsFromJson(String json);

    @ProxyFunction(nativeName = "updateOverlayFromJson")
    BarcodePickBasicOverlay _updateOverlayFromJson(BarcodePickBasicOverlay overlay, JsonValue json);

    @ProxyFunction(nativeName = "updateViewSettingsFromJson")
    BarcodePickViewSettings _updateViewSettingsFromJson(BarcodePickViewSettings settings, String json);

    @ProxyFunction(nativeName = "viewSettingsFromJson")
    BarcodePickViewSettings _viewSettingsFromJson(String json);

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    BarcodePickDeserializerHelper get_helper();

    @ProxyFunction(nativeName = "updateBarcodePickFromJson")
    BarcodePick updateModeFromJson(BarcodePick mode, String json);

    @ProxyFunction
    BarcodePickSettings updateSettingsFromJson(BarcodePickSettings settings, String json);
}
