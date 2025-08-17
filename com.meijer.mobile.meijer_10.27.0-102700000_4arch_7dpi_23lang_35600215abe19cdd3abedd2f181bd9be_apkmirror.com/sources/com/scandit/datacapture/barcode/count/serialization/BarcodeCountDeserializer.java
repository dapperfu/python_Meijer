package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.source.CameraSettings;
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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002?@B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b#\u0010$J \u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u0013J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b)\u0010\u001fJ!\u0010+\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b*\u0010\u0018J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0;8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerProxy;", "<init>", "()V", "_deserializer", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "json", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "mode", "jsonData", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "_overlayFromJson", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;)V", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "overlay", "_updateOverlayFromJson", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "settings", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "modeFromJson", "settingsFromJson", "overlayFromJsonInternal$scandit_barcode_capture", "overlayFromJsonInternal", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "()Lcom/scandit/datacapture/core/source/CameraSettings;", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;", "c", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;", "getListener$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;", "setListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;)V", "listener", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "com/scandit/datacapture/barcode/count/serialization/b", "com/scandit/datacapture/barcode/count/serialization/c", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class BarcodeCountDeserializer implements DataCaptureModeDeserializer, BarcodeCountDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountDeserializerHelper f120725a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodeCountDeserializerProxyAdapter f120726b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BarcodeCountDeserializerListener listener;

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    public BarcodeCountDeserializer _deserializer() {
        return this.f120726b._deserializer();
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeCountDeserializer getF120733a() {
        return this.f120726b.getF120733a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getF120735c() {
        return this.f120726b.getF120735c();
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "barcodeCountFromJson")
    public BarcodeCount _modeFromJson(DataCaptureContext dataCaptureContext, String json) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(json, "json");
        return this.f120726b._modeFromJson(dataCaptureContext, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "barcodeCountBasicOverlayFromJson")
    public BarcodeCountBasicOverlay _overlayFromJson(BarcodeCount mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        return this.f120726b._overlayFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxySetter
    public void _setDeserializer(BarcodeCountDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f120726b._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    public BarcodeCountSettings _settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        return this.f120726b._settingsFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeCountBasicOverlayFromJson")
    public BarcodeCountBasicOverlay _updateOverlayFromJson(BarcodeCountBasicOverlay overlay, String jsonData) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(jsonData, "jsonData");
        return this.f120726b._updateOverlayFromJson(overlay, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(property = "warnings")
    public List<String> getWarnings() {
        return this.f120726b.getWarnings();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    public BarcodeCountDeserializerHelper get_helper() {
        return this.f120726b.get_helper();
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeCountFromJson")
    public BarcodeCount updateModeFromJson(BarcodeCount mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return this.f120726b.updateModeFromJson(mode, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction
    public BarcodeCountSettings updateSettingsFromJson(BarcodeCountSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        return this.f120726b.updateSettingsFromJson(settings, json);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeCountDeserializer() {
        c cVar = new c();
        BarcodeCountDeserializerHelperReversedAdapter barcodeCountDeserializerHelperReversedAdapter = new BarcodeCountDeserializerHelperReversedAdapter(cVar, null, 2, null);
        NativeBarcodeCountDeserializer nativeBarcodeCountDeserializerCreate = NativeBarcodeCountDeserializer.create(barcodeCountDeserializerHelperReversedAdapter);
        Intrinsics.i(nativeBarcodeCountDeserializerCreate, "create(...)");
        this.f120725a = cVar;
        this.f120726b = new BarcodeCountDeserializerProxyAdapter(nativeBarcodeCountDeserializerCreate, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(BarcodeCountDeserializerHelper.class), null, cVar, new a(barcodeCountDeserializerHelperReversedAdapter));
        _setDeserializer(this);
        nativeBarcodeCountDeserializerCreate.setListener(new BarcodeCountDeserializerListenerReversedAdapter(new b(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public CameraSettings createRecommendedCameraSettings() {
        return BarcodeCount.INSTANCE.createRecommendedCameraSettings();
    }

    /* renamed from: getListener$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountDeserializerListener getListener() {
        return this.listener;
    }

    public final BarcodeCount modeFromJson(DataCaptureContext dataCaptureContext, String json) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(json, "json");
        BarcodeCount barcodeCount_modeFromJson = _modeFromJson(dataCaptureContext, json);
        this.f120725a.clear();
        return barcodeCount_modeFromJson;
    }

    public final BarcodeCountBasicOverlay overlayFromJsonInternal$scandit_barcode_capture(BarcodeCount mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay_overlayFromJson = _overlayFromJson(mode, jsonData);
        this.f120725a.clear();
        return barcodeCountBasicOverlay_overlayFromJson;
    }

    public final void setListener$scandit_barcode_capture(BarcodeCountDeserializerListener barcodeCountDeserializerListener) {
        this.listener = barcodeCountDeserializerListener;
    }

    public final BarcodeCountSettings settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        BarcodeCountSettings barcodeCountSettings_settingsFromJson = _settingsFromJson(json);
        this.f120725a.clear();
        return barcodeCountSettings_settingsFromJson;
    }
}
