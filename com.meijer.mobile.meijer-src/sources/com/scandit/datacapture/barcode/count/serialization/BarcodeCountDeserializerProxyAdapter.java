package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0016068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;", "_NativeBarcodeCountDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;)V", "_deserializer", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "json", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "mode", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "settings", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "jsonData", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "_overlayFromJson", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "overlay", "_updateOverlayFromJson", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "()Lcom/scandit/datacapture/core/source/CameraSettings;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCountDeserializerProxyAdapter implements BarcodeCountDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountDeserializer f121685a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureModeDeserializer f121687c;

    /* renamed from: d, reason: collision with root package name */
    private BarcodeCountDeserializer f121688d;

    public BarcodeCountDeserializerProxyAdapter(NativeBarcodeCountDeserializer _NativeBarcodeCountDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeCountDeserializer, "_NativeBarcodeCountDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121685a = _NativeBarcodeCountDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeCountDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.i(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "asDataCaptureModeDeserializer(...)");
        this.f121687c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public BarcodeCountDeserializer _deserializer() {
        BarcodeCountDeserializer barcodeCountDeserializer = this.f121688d;
        if (barcodeCountDeserializer != null) {
            return barcodeCountDeserializer;
        }
        Intrinsics.x("_setDeserializer_backing_field");
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountDeserializer getF121685a() {
        return this.f121685a;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getF124568c() {
        return this.f121687c;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public BarcodeCount _modeFromJson(DataCaptureContext dataCaptureContext, String json) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(json, "json");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF125005a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        NativeBarcodeCount nativeBarcodeCountBarcodeCountFromJson = this.f121685a.barcodeCountFromJson(nativeDataCaptureContext_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCount.class);
        Intrinsics.g(nativeBarcodeCountBarcodeCountFromJson);
        return (BarcodeCount) proxyCache.require(kClassB, null, nativeBarcodeCountBarcodeCountFromJson);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public BarcodeCountBasicOverlay _overlayFromJson(BarcodeCount mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeCount nativeBarcodeCount_impl = mode.getF121563a();
        this.proxyCache.put(Reflection.b(NativeBarcodeCount.class), null, nativeBarcodeCount_impl, mode);
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlayBarcodeCountBasicOverlayFromJson = this.f121685a.barcodeCountBasicOverlayFromJson(nativeBarcodeCount_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCountBasicOverlay.class);
        Intrinsics.g(nativeBarcodeCountBasicOverlayBarcodeCountBasicOverlayFromJson);
        return (BarcodeCountBasicOverlay) proxyCache.require(kClassB, null, nativeBarcodeCountBasicOverlayBarcodeCountBasicOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public void _setDeserializer(BarcodeCountDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f121688d = deserializer;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public BarcodeCountSettings _settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        NativeBarcodeCountSettings nativeBarcodeCountSettings = this.f121685a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCountSettings.class);
        Intrinsics.g(nativeBarcodeCountSettings);
        return (BarcodeCountSettings) proxyCache.require(kClassB, null, nativeBarcodeCountSettings);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public BarcodeCountBasicOverlay _updateOverlayFromJson(BarcodeCountBasicOverlay overlay, String jsonData) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay_impl = overlay.getF121725a();
        this.proxyCache.put(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, nativeBarcodeCountBasicOverlay_impl, overlay);
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlayUpdateBarcodeCountBasicOverlayFromJson = this.f121685a.updateBarcodeCountBasicOverlayFromJson(nativeBarcodeCountBasicOverlay_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCountBasicOverlay.class);
        Intrinsics.g(nativeBarcodeCountBasicOverlayUpdateBarcodeCountBasicOverlayFromJson);
        return (BarcodeCountBasicOverlay) proxyCache.require(kClassB, null, nativeBarcodeCountBasicOverlayUpdateBarcodeCountBasicOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public CameraSettings createRecommendedCameraSettings() {
        NativeCameraSettings nativeCameraSettingsCreateRecommendedCameraSettings = this.f121685a.createRecommendedCameraSettings();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(nativeCameraSettingsCreateRecommendedCameraSettings);
        return coreNativeTypeFactory.convert(nativeCameraSettingsCreateRecommendedCameraSettings);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public List<String> getWarnings() {
        ArrayList<String> warnings = this.f121685a.getWarnings();
        Intrinsics.g(warnings);
        return warnings;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    public BarcodeCountDeserializerHelper get_helper() {
        return (BarcodeCountDeserializerHelper) this.proxyCache.requireByValue(Reflection.b(BarcodeCountDeserializerHelper.class), this.f121685a.getHelper());
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public BarcodeCount updateModeFromJson(BarcodeCount mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        NativeBarcodeCount nativeBarcodeCount_impl = mode.getF121563a();
        this.proxyCache.put(Reflection.b(NativeBarcodeCount.class), null, nativeBarcodeCount_impl, mode);
        NativeBarcodeCount nativeBarcodeCountUpdateBarcodeCountFromJson = this.f121685a.updateBarcodeCountFromJson(nativeBarcodeCount_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCount.class);
        Intrinsics.g(nativeBarcodeCountUpdateBarcodeCountFromJson);
        return (BarcodeCount) proxyCache.require(kClassB, null, nativeBarcodeCountUpdateBarcodeCountFromJson);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    public BarcodeCountSettings updateSettingsFromJson(BarcodeCountSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        NativeBarcodeCountSettings nativeBarcodeCountSettings_impl = settings.getF121575a();
        this.proxyCache.put(Reflection.b(NativeBarcodeCountSettings.class), null, nativeBarcodeCountSettings_impl, settings);
        NativeBarcodeCountSettings nativeBarcodeCountSettingsUpdateSettingsFromJson = this.f121685a.updateSettingsFromJson(nativeBarcodeCountSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCountSettings.class);
        Intrinsics.g(nativeBarcodeCountSettingsUpdateSettingsFromJson);
        return (BarcodeCountSettings) proxyCache.require(kClassB, null, nativeBarcodeCountSettingsUpdateSettingsFromJson);
    }

    public /* synthetic */ BarcodeCountDeserializerProxyAdapter(NativeBarcodeCountDeserializer nativeBarcodeCountDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountDeserializer, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
