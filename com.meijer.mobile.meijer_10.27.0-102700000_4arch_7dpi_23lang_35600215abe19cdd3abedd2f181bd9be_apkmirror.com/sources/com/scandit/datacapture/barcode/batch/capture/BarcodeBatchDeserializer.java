package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializer;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002@AB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b \u0010!J \u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b'\u0010(J \u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\u001aJ\u0015\u0010-\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b-\u0010!J\u001d\u0010.\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u000eJ\u001d\u0010/\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b/\u0010\u000bR$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00070<8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerProxy;", "<init>", "()V", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "mode", "", "jsonData", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "_advancedOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "_basicOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "_deserializer", "()Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;", "Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;)V", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "overlay", "updateAdvancedOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "updateBasicOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "settings", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "modeFromJson", "settingsFromJson", "basicOverlayFromJson", "advancedOverlayFromJson", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerListener;", "c", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerListener;)V", "listener", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "com/scandit/datacapture/barcode/batch/capture/e", "com/scandit/datacapture/barcode/batch/capture/f", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class BarcodeBatchDeserializer implements DataCaptureModeDeserializer, BarcodeBatchDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeBatchDeserializerHelper f120410a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodeBatchDeserializerProxyAdapter f120411b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BarcodeBatchDeserializerListener listener;

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyFunction(nativeName = "barcodeTrackingAdvancedOverlayFromJson")
    public BarcodeBatchAdvancedOverlay _advancedOverlayFromJson(BarcodeBatch mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        return this.f120411b._advancedOverlayFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyFunction(nativeName = "barcodeTrackingBasicOverlayFromJson")
    public BarcodeBatchBasicOverlay _basicOverlayFromJson(BarcodeBatch mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        return this.f120411b._basicOverlayFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    public BarcodeBatchDeserializer _deserializer() {
        return this.f120411b._deserializer();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeTrackingDeserializer getF120418a() {
        return this.f120411b.getF120418a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getF120420c() {
        return this.f120411b.getF120420c();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyFunction(nativeName = "barcodeTrackingFromJson")
    public BarcodeBatch _modeFromJson(DataCaptureContext dataCaptureContext, String jsonData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(jsonData, "jsonData");
        return this.f120411b._modeFromJson(dataCaptureContext, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxySetter
    public void _setDeserializer(BarcodeBatchDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f120411b._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    public BarcodeBatchSettings _settingsFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        return this.f120411b._settingsFromJson(jsonData);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyFunction(property = "warnings")
    public List<String> getWarnings() {
        return this.f120411b.getWarnings();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    public BarcodeBatchDeserializerHelper get_helper() {
        return this.f120411b.get_helper();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeTrackingAdvancedOverlayFromJson")
    public BarcodeBatchAdvancedOverlay updateAdvancedOverlayFromJson(BarcodeBatchAdvancedOverlay overlay, String jsonData) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(jsonData, "jsonData");
        return this.f120411b.updateAdvancedOverlayFromJson(overlay, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeTrackingBasicOverlayFromJson")
    public BarcodeBatchBasicOverlay updateBasicOverlayFromJson(BarcodeBatchBasicOverlay overlay, String jsonData) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(jsonData, "jsonData");
        return this.f120411b.updateBasicOverlayFromJson(overlay, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeTrackingFromJson")
    public BarcodeBatch updateModeFromJson(BarcodeBatch mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        return this.f120411b.updateModeFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    @ProxyFunction
    public BarcodeBatchSettings updateSettingsFromJson(BarcodeBatchSettings settings, String jsonData) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(jsonData, "jsonData");
        return this.f120411b.updateSettingsFromJson(settings, jsonData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeBatchDeserializer() {
        C13034f c13034f = new C13034f();
        int i10 = 2;
        BarcodeBatchDeserializerHelperReversedAdapter barcodeBatchDeserializerHelperReversedAdapter = new BarcodeBatchDeserializerHelperReversedAdapter(c13034f, null, i10, 0 == true ? 1 : 0);
        NativeBarcodeTrackingDeserializer nativeBarcodeTrackingDeserializerCreate = NativeBarcodeTrackingDeserializer.create(barcodeBatchDeserializerHelperReversedAdapter);
        Intrinsics.i(nativeBarcodeTrackingDeserializerCreate, "create(...)");
        this.f120410a = c13034f;
        this.f120411b = new BarcodeBatchDeserializerProxyAdapter(nativeBarcodeTrackingDeserializerCreate, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(BarcodeBatchDeserializerHelper.class), null, c13034f, new C13032d(barcodeBatchDeserializerHelperReversedAdapter));
        _setDeserializer(this);
        nativeBarcodeTrackingDeserializerCreate.setListener(new BarcodeBatchDeserializerListenerReversedAdapter(new C13033e(this), this, null, 4, null));
    }

    public final BarcodeBatchAdvancedOverlay advancedOverlayFromJson(BarcodeBatch mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        BarcodeBatchAdvancedOverlay barcodeBatchAdvancedOverlay_advancedOverlayFromJson = _advancedOverlayFromJson(mode, jsonData);
        this.f120410a.clear();
        return barcodeBatchAdvancedOverlay_advancedOverlayFromJson;
    }

    public final BarcodeBatchBasicOverlay basicOverlayFromJson(BarcodeBatch mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        BarcodeBatchBasicOverlay barcodeBatchBasicOverlay_basicOverlayFromJson = _basicOverlayFromJson(mode, jsonData);
        this.f120410a.clear();
        return barcodeBatchBasicOverlay_basicOverlayFromJson;
    }

    public final BarcodeBatchDeserializerListener getListener() {
        return this.listener;
    }

    public final BarcodeBatch modeFromJson(DataCaptureContext dataCaptureContext, String jsonData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(jsonData, "jsonData");
        BarcodeBatch barcodeBatch_modeFromJson = _modeFromJson(dataCaptureContext, jsonData);
        this.f120410a.clear();
        return barcodeBatch_modeFromJson;
    }

    public final void setListener(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener) {
        this.listener = barcodeBatchDeserializerListener;
    }

    public final BarcodeBatchSettings settingsFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        BarcodeBatchSettings barcodeBatchSettings_settingsFromJson = _settingsFromJson(jsonData);
        this.f120410a.clear();
        return barcodeBatchSettings_settingsFromJson;
    }
}
