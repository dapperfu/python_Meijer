package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.barcode.ar.feedback.BarcodeArFeedback;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer;
import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeArFeedbackDeserializer;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0013J\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b \u0010\u0016J\u001d\u0010!\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\u0019R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializer;", "Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerProxy;", "<init>", "()V", "Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializer;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "", "json", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "mode", "_updateModeFromJson", "(Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "settings", "_updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "dataCaptureContext", "modeFromJson", "settingsFromJson", "Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;", "feedbackFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;", "updateModeFromJson", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerListener;", "c", "Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerListener;)V", "listener", "Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/BarcodeArDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/BarcodeArDeserializerHelper;", "_helper", "com/scandit/datacapture/barcode/ar/serialization/b", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArDeserializer implements BarcodeArDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeArDeserializerHelper f120108a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodeArDeserializerProxyAdapter f120109b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BarcodeArDeserializerListener listener;

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeArDeserializer getF120114a() {
        return this.f120109b.getF120114a();
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getF120116c() {
        return this.f120109b.getF120116c();
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    @ProxyFunction(nativeName = "barcodeArFromJson")
    public BarcodeAr _modeFromJson(DataCaptureContext context, String json) {
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        return this.f120109b._modeFromJson(context, json);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    public BarcodeArSettings _settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        return this.f120109b._settingsFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeArFromJson")
    public BarcodeAr _updateModeFromJson(BarcodeAr mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return this.f120109b._updateModeFromJson(mode, json);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    @ProxyFunction(nativeName = "updateSettingsFromJson")
    public BarcodeArSettings _updateSettingsFromJson(BarcodeArSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        return this.f120109b._updateSettingsFromJson(settings, json);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    public BarcodeArDeserializerHelper get_helper() {
        return this.f120109b.get_helper();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeArDeserializer() {
        com.scandit.datacapture.barcode.internal.module.ar.serialization.a aVar = new com.scandit.datacapture.barcode.internal.module.ar.serialization.a();
        com.scandit.datacapture.barcode.internal.module.ar.serialization.e eVar = new com.scandit.datacapture.barcode.internal.module.ar.serialization.e(aVar);
        NativeBarcodeArDeserializer nativeBarcodeArDeserializerCreate = NativeBarcodeArDeserializer.create(eVar);
        Intrinsics.i(nativeBarcodeArDeserializerCreate, "create(...)");
        this.f120108a = aVar;
        this.f120109b = new BarcodeArDeserializerProxyAdapter(nativeBarcodeArDeserializerCreate, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(BarcodeArDeserializerHelper.class), null, aVar, new a(eVar));
        getF120114a().setListener(new BarcodeArDeserializerListenerReversedAdapter(new b(this), this, null, 4, null));
    }

    public final BarcodeArFeedback feedbackFromJson(String json) {
        Intrinsics.j(json, "json");
        return BarcodeArFeedbackDeserializer.fromJson(new JsonValue(json));
    }

    public final BarcodeArDeserializerListener getListener() {
        return this.listener;
    }

    public final BarcodeAr modeFromJson(DataCaptureContext dataCaptureContext, String json) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(json, "json");
        BarcodeAr barcodeAr_modeFromJson = _modeFromJson(dataCaptureContext, json);
        this.f120108a.clear();
        return barcodeAr_modeFromJson;
    }

    public final void setListener(BarcodeArDeserializerListener barcodeArDeserializerListener) {
        this.listener = barcodeArDeserializerListener;
    }

    public final BarcodeArSettings settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        BarcodeArSettings barcodeArSettings_settingsFromJson = _settingsFromJson(json);
        this.f120108a.clear();
        return barcodeArSettings_settingsFromJson;
    }

    public final BarcodeAr updateModeFromJson(BarcodeAr mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return _updateModeFromJson(mode, json);
    }

    public final BarcodeArSettings updateSettingsFromJson(BarcodeArSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        return _updateSettingsFromJson(settings, json);
    }
}
