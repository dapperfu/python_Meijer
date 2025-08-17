package com.scandit.datacapture.barcode.find.serialization;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.find.feedback.BarcodeFindFeedback;
import com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer;
import com.scandit.datacapture.barcode.internal.module.find.serialization.d;
import com.scandit.datacapture.barcode.internal.module.find.serialization.n;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fJ\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u0012J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u0015J\u001d\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u0018R$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerProxy;", "<init>", "()V", "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/NativeBarcodeFindDeserializer;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/find/serialization/NativeBarcodeFindDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "", "json", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "_modeFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "mode", "_updateModeFromJson", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "settings", "_updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "modeFromJson", "settingsFromJson", "Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "feedbackFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "updateModeFromJson", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;", "c", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;)V", "listener", "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "_helper", "com/scandit/datacapture/barcode/find/serialization/b", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeFindDeserializer implements DataCaptureModeDeserializer, BarcodeFindDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeFindDeserializerHelper f120965a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodeFindDeserializerProxyAdapter f120966b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BarcodeFindDeserializerListener listener;

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeFindDeserializer getF120968a() {
        return this.f120966b.getF120968a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getF120970c() {
        return this.f120966b.getF120970c();
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @ProxyFunction(nativeName = "barcodeFindFromJson")
    public BarcodeFind _modeFromJson(String json) {
        Intrinsics.j(json, "json");
        return this.f120966b._modeFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    public BarcodeFindSettings _settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        return this.f120966b._settingsFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeFindFromJson")
    public BarcodeFind _updateModeFromJson(BarcodeFind mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return this.f120966b._updateModeFromJson(mode, json);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    @ProxyFunction(nativeName = "updateSettingsFromJson")
    public BarcodeFindSettings _updateSettingsFromJson(BarcodeFindSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        return this.f120966b._updateSettingsFromJson(settings, json);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    public BarcodeFindDeserializerHelper get_helper() {
        return this.f120966b.get_helper();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeFindDeserializer() {
        com.scandit.datacapture.barcode.internal.module.find.serialization.a aVar = new com.scandit.datacapture.barcode.internal.module.find.serialization.a();
        d dVar = new d(aVar);
        NativeBarcodeFindDeserializer nativeBarcodeFindDeserializerCreate = NativeBarcodeFindDeserializer.create(dVar);
        Intrinsics.i(nativeBarcodeFindDeserializerCreate, "create(...)");
        this.f120965a = aVar;
        this.f120966b = new BarcodeFindDeserializerProxyAdapter(nativeBarcodeFindDeserializerCreate, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(BarcodeFindDeserializerHelper.class), null, aVar, new a(dVar));
        getF120968a().setListener(new n(new b(this), this));
    }

    public final BarcodeFindFeedback feedbackFromJson(String json) {
        Intrinsics.j(json, "json");
        JsonValue json2 = new JsonValue(json);
        Intrinsics.j(json2, "json");
        BarcodeFindFeedback barcodeFindFeedbackDefaultFeedback = BarcodeFindFeedback.INSTANCE.defaultFeedback();
        Feedback feedbackFromJson = json2.contains("found") ? FeedbackDeserializer.fromJson(json2.requireByKey("found")) : barcodeFindFeedbackDefaultFeedback.getFound();
        Feedback feedbackFromJson2 = json2.contains("itemListUpdated") ? FeedbackDeserializer.fromJson(json2.requireByKey("itemListUpdated")) : barcodeFindFeedbackDefaultFeedback.getItemListUpdated();
        BarcodeFindFeedback barcodeFindFeedback = new BarcodeFindFeedback();
        barcodeFindFeedback.setFound(feedbackFromJson);
        barcodeFindFeedback.setItemListUpdated(feedbackFromJson2);
        return barcodeFindFeedback;
    }

    public final BarcodeFindDeserializerListener getListener() {
        return this.listener;
    }

    public final BarcodeFind modeFromJson(String json) {
        Intrinsics.j(json, "json");
        BarcodeFind barcodeFind_modeFromJson = _modeFromJson(json);
        this.f120965a.clear();
        return barcodeFind_modeFromJson;
    }

    public final void setListener(BarcodeFindDeserializerListener barcodeFindDeserializerListener) {
        this.listener = barcodeFindDeserializerListener;
    }

    public final BarcodeFindSettings settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        BarcodeFindSettings barcodeFindSettings_settingsFromJson = _settingsFromJson(json);
        this.f120965a.clear();
        return barcodeFindSettings_settingsFromJson;
    }

    public final BarcodeFind updateModeFromJson(BarcodeFind mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return _updateModeFromJson(mode, json);
    }

    public final BarcodeFindSettings updateSettingsFromJson(BarcodeFindSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        return _updateSettingsFromJson(settings, json);
    }
}
