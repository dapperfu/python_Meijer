package com.scandit.datacapture.barcode.pick.serialization;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProvider;
import com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProviderCallback;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProduct;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickView;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleAsyncProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 U2\u00020\u0001:\u0003UVWB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b#\u0010$J \u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b&\u0010'J \u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b,\u0010-J \u0010.\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b.\u0010/J \u00100\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b0\u00101J\u001d\u00105\u001a\u0002042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106J%\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b8\u0010\u0014J\u0015\u00109\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b9\u0010$J\u0015\u0010:\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b:\u0010-J-\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;2\u0006\u00107\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b>\u0010?J7\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;2\u0006\u00107\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\b>\u0010BJ7\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;2\u0006\u00107\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\b>\u0010EJ\u001d\u0010G\u001a\u00020=2\u0006\u0010F\u001a\u00020=2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bG\u0010HR$\u0010P\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerProxy;", "<init>", "()V", "_deserializer", "()Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "productProvider", "", "json", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "mode", "Lcom/scandit/datacapture/core/json/JsonValue;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "_overlayFromJson", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "_productsFromJson", "(Lcom/scandit/datacapture/core/json/JsonValue;)Ljava/util/List;", "deserializerProxy", "", "_setDeserializer", "(Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;)V", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "overlay", "_updateOverlayFromJson", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "settings", "_updateViewSettingsFromJson", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "_viewSettingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderCallback;", "callback", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProvider;", "asyncMapperProductProviderFromJson", "(Ljava/lang/String;Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderCallback;)Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProvider;", "dataCaptureContext", "modeFromJson", "settingsFromJson", "viewSettingsFromJson", "Landroid/view/ViewGroup;", "parentView", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "viewFromJson", "(Landroid/view/ViewGroup;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "asyncProvider", "(Landroid/view/ViewGroup;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Ljava/lang/String;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;", "asyncCustomViewProvider", "(Landroid/view/ViewGroup;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Ljava/lang/String;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "view", "updateViewFromJson", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;", "c", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;)V", "listener", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "_helper", "Companion", "com/scandit/datacapture/barcode/pick/serialization/b", "com/scandit/datacapture/barcode/pick/serialization/k", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BarcodePickDeserializer implements BarcodePickDeserializerProxy {
    public static final String FIELD_BARCODE_PICK_STATE = "barcodePickState";
    public static final String FIELD_ICON = "icon";
    public static final String FIELD_ICONS_FOR_STATE = "iconsForState";
    public static final String FIELD_SELECTED_ICONS_FOR_STATE = "selectedIconsForState";

    /* renamed from: a, reason: collision with root package name */
    private final k f124560a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodePickDeserializerProxyAdapter f124561b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BarcodePickDeserializerListener listener;

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    public BarcodePickDeserializer _deserializer() {
        return this.f124561b._deserializer();
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodePickDeserializer getF124566a() {
        return this.f124561b.getF124566a();
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @NativeImpl
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getF124568c() {
        return this.f124561b.getF124568c();
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "barcodePickFromJson")
    public BarcodePick _modeFromJson(DataCaptureContext context, BarcodePickProductProvider productProvider, String json) {
        Intrinsics.j(context, "context");
        Intrinsics.j(productProvider, "productProvider");
        Intrinsics.j(json, "json");
        return this.f124561b._modeFromJson(context, productProvider, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "overlayFromJson")
    public BarcodePickBasicOverlay _overlayFromJson(BarcodePick mode, JsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return this.f124561b._overlayFromJson(mode, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "barcodePickProductsFromJson")
    public List<BarcodePickProduct> _productsFromJson(JsonValue json) {
        Intrinsics.j(json, "json");
        return this.f124561b._productsFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxySetter
    public void _setDeserializer(BarcodePickDeserializer deserializerProxy) {
        Intrinsics.j(deserializerProxy, "deserializerProxy");
        this.f124561b._setDeserializer(deserializerProxy);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    public BarcodePickSettings _settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        return this.f124561b._settingsFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "updateOverlayFromJson")
    public BarcodePickBasicOverlay _updateOverlayFromJson(BarcodePickBasicOverlay overlay, JsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        return this.f124561b._updateOverlayFromJson(overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "updateViewSettingsFromJson")
    public BarcodePickViewSettings _updateViewSettingsFromJson(BarcodePickViewSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        return this.f124561b._updateViewSettingsFromJson(settings, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "viewSettingsFromJson")
    public BarcodePickViewSettings _viewSettingsFromJson(String json) {
        Intrinsics.j(json, "json");
        return this.f124561b._viewSettingsFromJson(json);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    public BarcodePickDeserializerHelper get_helper() {
        return this.f124561b.get_helper();
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodePickFromJson")
    public BarcodePick updateModeFromJson(BarcodePick mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return this.f124561b.updateModeFromJson(mode, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @ProxyFunction
    public BarcodePickSettings updateSettingsFromJson(BarcodePickSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        return this.f124561b.updateSettingsFromJson(settings, json);
    }

    public final BarcodePickView viewFromJson(ViewGroup parentView, DataCaptureContext dataCaptureContext, BarcodePick mode, String json) {
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return a(parentView, dataCaptureContext, mode, json, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodePickDeserializer() {
        k kVar = new k();
        com.scandit.datacapture.barcode.internal.module.pick.serialization.e eVar = new com.scandit.datacapture.barcode.internal.module.pick.serialization.e(kVar);
        NativeBarcodePickDeserializer nativeBarcodePickDeserializerCreate = NativeBarcodePickDeserializer.create(eVar);
        Intrinsics.i(nativeBarcodePickDeserializerCreate, "create(...)");
        this.f124560a = kVar;
        this.f124561b = new BarcodePickDeserializerProxyAdapter(nativeBarcodePickDeserializerCreate, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(BarcodePickDeserializerHelper.class), null, kVar, new a(eVar));
        _setDeserializer(this);
        nativeBarcodePickDeserializerCreate.setListener(new BarcodePickDeserializerListenerReversedAdapter(new b(this), this, null, 4, null));
    }

    private final BarcodePickView a(ViewGroup viewGroup, DataCaptureContext dataCaptureContext, BarcodePick barcodePick, String str, Object obj) {
        CameraSettings cameraSettings;
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("viewSettings");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        String string = jSONObjectOptJSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        BarcodePickViewSettings barcodePickViewSettingsViewSettingsFromJson = viewSettingsFromJson(string);
        BarcodePickViewHighlightStyle highlightStyle = barcodePickViewSettingsViewSettingsFromJson.getHighlightStyle();
        if ((highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) && (obj instanceof BarcodePickViewHighlightStyleAsyncProvider)) {
            ((BarcodePickViewHighlightStyle.DotWithIcons) highlightStyle).setAsyncStyleProvider((BarcodePickViewHighlightStyleAsyncProvider) obj);
        } else if ((highlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) && (obj instanceof BarcodePickViewHighlightStyleAsyncProvider)) {
            ((BarcodePickViewHighlightStyle.RectangularWithIcons) highlightStyle).setAsyncStyleProvider((BarcodePickViewHighlightStyleAsyncProvider) obj);
        } else if ((highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) && (obj instanceof BarcodePickViewHighlightStyleCustomViewProvider)) {
            ((BarcodePickViewHighlightStyle.CustomView) highlightStyle).setAsyncCustomViewProvider((BarcodePickViewHighlightStyleCustomViewProvider) obj);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("cameraSettings");
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        boolean zOptBoolean = jSONObjectOptJSONObject2.optBoolean("usesRecommendedSettings", true);
        if (zOptBoolean) {
            cameraSettings = BarcodePick.INSTANCE.createRecommendedCameraSettings();
        } else {
            if (zOptBoolean) {
                throw new NoWhenBranchMatchedException();
            }
            cameraSettings = new CameraSettings();
        }
        FrameSourceDeserializer frameSourceDeserializer = new FrameSourceDeserializer(CollectionsKt.m());
        String string2 = jSONObjectOptJSONObject2.toString();
        Intrinsics.i(string2, "toString(...)");
        return BarcodePickView.INSTANCE.newInstance(viewGroup, dataCaptureContext, barcodePick, barcodePickViewSettingsViewSettingsFromJson, frameSourceDeserializer.updateCameraSettingsFromJson(cameraSettings, string2));
    }

    public final BarcodePickAsyncMapperProductProvider asyncMapperProductProviderFromJson(String json, BarcodePickAsyncMapperProductProviderCallback callback) {
        Intrinsics.j(json, "json");
        Intrinsics.j(callback, "callback");
        return new BarcodePickAsyncMapperProductProvider(CollectionsKt.o1(_productsFromJson(new JsonValue(json))), callback);
    }

    public final BarcodePickDeserializerListener getListener() {
        return this.listener;
    }

    public final BarcodePick modeFromJson(DataCaptureContext dataCaptureContext, BarcodePickProductProvider productProvider, String json) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(productProvider, "productProvider");
        Intrinsics.j(json, "json");
        BarcodePick barcodePick_modeFromJson = _modeFromJson(dataCaptureContext, productProvider, json);
        this.f124560a.f124580a = null;
        return barcodePick_modeFromJson;
    }

    public final void setListener(BarcodePickDeserializerListener barcodePickDeserializerListener) {
        this.listener = barcodePickDeserializerListener;
    }

    public final BarcodePickSettings settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        BarcodePickSettings barcodePickSettings_settingsFromJson = _settingsFromJson(json);
        this.f124560a.f124580a = null;
        return barcodePickSettings_settingsFromJson;
    }

    public final BarcodePickView updateViewFromJson(BarcodePickView view, String json) {
        Intrinsics.j(view, "view");
        Intrinsics.j(json, "json");
        view._applySettings$scandit_barcode_capture(viewSettingsFromJson(json));
        return view;
    }

    public final BarcodePickView viewFromJson(ViewGroup parentView, DataCaptureContext dataCaptureContext, BarcodePick mode, String json, BarcodePickViewHighlightStyleAsyncProvider asyncProvider) {
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return a(parentView, dataCaptureContext, mode, json, asyncProvider);
    }

    public final BarcodePickViewSettings viewSettingsFromJson(String json) {
        Intrinsics.j(json, "json");
        BarcodePickViewSettings barcodePickViewSettings_viewSettingsFromJson = _viewSettingsFromJson(json);
        get_helper().clear();
        return barcodePickViewSettings_viewSettingsFromJson;
    }

    public final BarcodePickView viewFromJson(ViewGroup parentView, DataCaptureContext dataCaptureContext, BarcodePick mode, String json, BarcodePickViewHighlightStyleCustomViewProvider asyncCustomViewProvider) {
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        return a(parentView, dataCaptureContext, mode, json, asyncCustomViewProvider);
    }
}
