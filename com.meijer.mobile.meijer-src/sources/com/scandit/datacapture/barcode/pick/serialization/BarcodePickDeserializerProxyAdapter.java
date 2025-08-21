package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.data.NativeBarcodePickProduct;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProduct;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020&2\u0006\u0010#\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020,2\u0006\u0010/\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020+H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010\u0019\u001a\u00020+H\u0016¢\u0006\u0004\b4\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "_NativeBarcodePickDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "deserializerProxy", "", "_setDeserializer", "(Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;)V", "_deserializer", "()Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "productProvider", "", "json", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "mode", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "settings", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "_viewSettingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "_updateViewSettingsFromJson", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "Lcom/scandit/datacapture/core/json/JsonValue;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "_overlayFromJson", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "overlay", "_updateOverlayFromJson", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "_productsFromJson", "(Lcom/scandit/datacapture/core/json/JsonValue;)Ljava/util/List;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "_helper", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodePickDeserializerProxyAdapter implements BarcodePickDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickDeserializer f124566a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureModeDeserializer f124568c;

    /* renamed from: d, reason: collision with root package name */
    private BarcodePickDeserializer f124569d;

    public BarcodePickDeserializerProxyAdapter(NativeBarcodePickDeserializer _NativeBarcodePickDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodePickDeserializer, "_NativeBarcodePickDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124566a = _NativeBarcodePickDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodePickDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.i(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "asDataCaptureModeDeserializer(...)");
        this.f124568c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public BarcodePickDeserializer _deserializer() {
        BarcodePickDeserializer barcodePickDeserializer = this.f124569d;
        if (barcodePickDeserializer != null) {
            return barcodePickDeserializer;
        }
        Intrinsics.x("_setDeserializer_backing_field");
        return null;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickDeserializer getF124566a() {
        return this.f124566a;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getF124568c() {
        return this.f124568c;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public BarcodePick _modeFromJson(DataCaptureContext context, BarcodePickProductProvider productProvider, String json) {
        Intrinsics.j(context, "context");
        Intrinsics.j(productProvider, "productProvider");
        Intrinsics.j(json, "json");
        NativeDataCaptureContext nativeDataCaptureContext_impl = context.getF125005a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, context);
        NativeProductProvider nativeProductProvider_productProviderImpl = productProvider.getF124552c();
        this.proxyCache.put(Reflection.b(NativeProductProvider.class), null, nativeProductProvider_productProviderImpl, productProvider);
        NativeBarcodePick nativeBarcodePickBarcodePickFromJson = this.f124566a.barcodePickFromJson(nativeDataCaptureContext_impl, nativeProductProvider_productProviderImpl, CoreNativeTypeFactory.INSTANCE.convert(json));
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(nativeBarcodePickBarcodePickFromJson);
        return barcodeNativeTypeFactory.convert(nativeBarcodePickBarcodePickFromJson);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public BarcodePickBasicOverlay _overlayFromJson(BarcodePick mode, JsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        NativeBarcodePick nativeBarcodePickConvert = BarcodeNativeTypeFactory.INSTANCE.convert(mode);
        NativeJsonValue f126782a = json.getF126782a();
        this.proxyCache.put(Reflection.b(NativeJsonValue.class), null, f126782a, json);
        NativeDataCaptureOverlay nativeDataCaptureOverlayOverlayFromJson = this.f124566a.overlayFromJson(nativeBarcodePickConvert, f126782a);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeDataCaptureOverlay.class);
        Intrinsics.g(nativeDataCaptureOverlayOverlayFromJson);
        return (BarcodePickBasicOverlay) proxyCache.require(kClassB, null, nativeDataCaptureOverlayOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public List<BarcodePickProduct> _productsFromJson(JsonValue json) {
        Intrinsics.j(json, "json");
        NativeJsonValue f126782a = json.getF126782a();
        this.proxyCache.put(Reflection.b(NativeJsonValue.class), null, f126782a, json);
        ArrayList<NativeBarcodePickProduct> arrayListBarcodePickProductsFromJson = this.f124566a.barcodePickProductsFromJson(f126782a);
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(arrayListBarcodePickProductsFromJson);
        return barcodeNativeTypeFactory.convertBarcodePickProductFromNativeImpl(arrayListBarcodePickProductsFromJson);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public void _setDeserializer(BarcodePickDeserializer deserializerProxy) {
        Intrinsics.j(deserializerProxy, "deserializerProxy");
        this.f124569d = deserializerProxy;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public BarcodePickSettings _settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        NativeBarcodePickSettings nativeBarcodePickSettings = this.f124566a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodePickSettings.class);
        Intrinsics.g(nativeBarcodePickSettings);
        return (BarcodePickSettings) proxyCache.require(kClassB, null, nativeBarcodePickSettings);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public BarcodePickBasicOverlay _updateOverlayFromJson(BarcodePickBasicOverlay overlay, JsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        NativeDataCaptureOverlay f121443c = overlay.getF124960c();
        this.proxyCache.put(Reflection.b(NativeDataCaptureOverlay.class), null, f121443c, overlay);
        NativeJsonValue f126782a = json.getF126782a();
        this.proxyCache.put(Reflection.b(NativeJsonValue.class), null, f126782a, json);
        NativeDataCaptureOverlay nativeDataCaptureOverlayUpdateOverlayFromJson = this.f124566a.updateOverlayFromJson(f121443c, f126782a);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeDataCaptureOverlay.class);
        Intrinsics.g(nativeDataCaptureOverlayUpdateOverlayFromJson);
        return (BarcodePickBasicOverlay) proxyCache.require(kClassB, null, nativeDataCaptureOverlayUpdateOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public BarcodePickViewSettings _updateViewSettingsFromJson(BarcodePickViewSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        NativeBarcodePickViewSettings f124673a = settings.getF124673a();
        this.proxyCache.put(Reflection.b(NativeBarcodePickViewSettings.class), null, f124673a, settings);
        NativeBarcodePickViewSettings nativeBarcodePickViewSettingsUpdateViewSettingsFromJson = this.f124566a.updateViewSettingsFromJson(f124673a, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodePickViewSettings.class);
        Intrinsics.g(nativeBarcodePickViewSettingsUpdateViewSettingsFromJson);
        return (BarcodePickViewSettings) proxyCache.require(kClassB, null, nativeBarcodePickViewSettingsUpdateViewSettingsFromJson);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public BarcodePickViewSettings _viewSettingsFromJson(String json) {
        Intrinsics.j(json, "json");
        NativeBarcodePickViewSettings nativeBarcodePickViewSettingsViewSettingsFromJson = this.f124566a.viewSettingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodePickViewSettings.class);
        Intrinsics.g(nativeBarcodePickViewSettingsViewSettingsFromJson);
        return (BarcodePickViewSettings) proxyCache.require(kClassB, null, nativeBarcodePickViewSettingsViewSettingsFromJson);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    public BarcodePickDeserializerHelper get_helper() {
        return (BarcodePickDeserializerHelper) this.proxyCache.requireByValue(Reflection.b(BarcodePickDeserializerHelper.class), this.f124566a.getHelper());
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public BarcodePick updateModeFromJson(BarcodePick mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcodePick nativeBarcodePickUpdateBarcodePickFromJson = this.f124566a.updateBarcodePickFromJson(barcodeNativeTypeFactory.convert(mode), CoreNativeTypeFactory.INSTANCE.convert(json));
        Intrinsics.g(nativeBarcodePickUpdateBarcodePickFromJson);
        return barcodeNativeTypeFactory.convert(nativeBarcodePickUpdateBarcodePickFromJson);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public BarcodePickSettings updateSettingsFromJson(BarcodePickSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        NativeBarcodePickSettings nativeBarcodePickSettings_impl = settings.getF124535a();
        this.proxyCache.put(Reflection.b(NativeBarcodePickSettings.class), null, nativeBarcodePickSettings_impl, settings);
        NativeBarcodePickSettings nativeBarcodePickSettingsUpdateSettingsFromJson = this.f124566a.updateSettingsFromJson(nativeBarcodePickSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodePickSettings.class);
        Intrinsics.g(nativeBarcodePickSettingsUpdateSettingsFromJson);
        return (BarcodePickSettings) proxyCache.require(kClassB, null, nativeBarcodePickSettingsUpdateSettingsFromJson);
    }

    public /* synthetic */ BarcodePickDeserializerProxyAdapter(NativeBarcodePickDeserializer nativeBarcodePickDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickDeserializer, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
