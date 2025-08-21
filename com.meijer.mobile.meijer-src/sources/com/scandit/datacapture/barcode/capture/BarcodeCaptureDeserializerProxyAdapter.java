package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0016028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerProxy;", "Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;", "_NativeBarcodeCaptureDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;)V", "_deserializer", "()Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "jsonData", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "mode", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "settings", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "_overlayFromJson", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "overlay", "updateOverlayFromJson", "(Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCaptureDeserializerProxyAdapter implements BarcodeCaptureDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCaptureDeserializer f121483a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureModeDeserializer f121485c;

    /* renamed from: d, reason: collision with root package name */
    private BarcodeCaptureDeserializer f121486d;

    public BarcodeCaptureDeserializerProxyAdapter(NativeBarcodeCaptureDeserializer _NativeBarcodeCaptureDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeCaptureDeserializer, "_NativeBarcodeCaptureDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121483a = _NativeBarcodeCaptureDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeCaptureDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.i(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "asDataCaptureModeDeserializer(...)");
        this.f121485c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public BarcodeCaptureDeserializer _deserializer() {
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = this.f121486d;
        if (barcodeCaptureDeserializer != null) {
            return barcodeCaptureDeserializer;
        }
        Intrinsics.x("_setDeserializer_backing_field");
        return null;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCaptureDeserializer getF121483a() {
        return this.f121483a;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getF124568c() {
        return this.f121485c;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public BarcodeCapture _modeFromJson(DataCaptureContext dataCaptureContext, String jsonData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(jsonData, "jsonData");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF125005a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        NativeBarcodeCapture nativeBarcodeCaptureBarcodeCaptureFromJson = this.f121483a.barcodeCaptureFromJson(nativeDataCaptureContext_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCapture.class);
        Intrinsics.g(nativeBarcodeCaptureBarcodeCaptureFromJson);
        return (BarcodeCapture) proxyCache.getOrPut(kClassB, null, nativeBarcodeCaptureBarcodeCaptureFromJson, new F(nativeBarcodeCaptureBarcodeCaptureFromJson));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public BarcodeCaptureOverlay _overlayFromJson(BarcodeCapture mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeCapture nativeBarcodeCapture_impl = mode.getF121491a();
        this.proxyCache.put(Reflection.b(NativeBarcodeCapture.class), null, nativeBarcodeCapture_impl, mode);
        NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlayBarcodeCaptureOverlayFromJson = this.f121483a.barcodeCaptureOverlayFromJson(nativeBarcodeCapture_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCaptureOverlay.class);
        Intrinsics.g(nativeBarcodeCaptureOverlayBarcodeCaptureOverlayFromJson);
        return (BarcodeCaptureOverlay) proxyCache.require(kClassB, null, nativeBarcodeCaptureOverlayBarcodeCaptureOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public void _setDeserializer(BarcodeCaptureDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f121486d = deserializer;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public BarcodeCaptureSettings _settingsFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings = this.f121483a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCaptureSettings.class);
        Intrinsics.g(nativeBarcodeCaptureSettings);
        return (BarcodeCaptureSettings) proxyCache.getOrPut(kClassB, null, nativeBarcodeCaptureSettings, new G(nativeBarcodeCaptureSettings));
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public List<String> getWarnings() {
        ArrayList<String> warnings = this.f121483a.getWarnings();
        Intrinsics.g(warnings);
        return warnings;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    public BarcodeCaptureDeserializerHelper get_helper() {
        return (BarcodeCaptureDeserializerHelper) this.proxyCache.requireByValue(Reflection.b(BarcodeCaptureDeserializerHelper.class), this.f121483a.getHelper());
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public BarcodeCapture updateModeFromJson(BarcodeCapture mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeCapture nativeBarcodeCapture_impl = mode.getF121491a();
        this.proxyCache.put(Reflection.b(NativeBarcodeCapture.class), null, nativeBarcodeCapture_impl, mode);
        NativeBarcodeCapture nativeBarcodeCaptureUpdateBarcodeCaptureFromJson = this.f121483a.updateBarcodeCaptureFromJson(nativeBarcodeCapture_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCapture.class);
        Intrinsics.g(nativeBarcodeCaptureUpdateBarcodeCaptureFromJson);
        return (BarcodeCapture) proxyCache.getOrPut(kClassB, null, nativeBarcodeCaptureUpdateBarcodeCaptureFromJson, new H(nativeBarcodeCaptureUpdateBarcodeCaptureFromJson));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public BarcodeCaptureOverlay updateOverlayFromJson(BarcodeCaptureOverlay overlay, String jsonData) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay_impl = overlay.getF124958a();
        this.proxyCache.put(Reflection.b(NativeBarcodeCaptureOverlay.class), null, nativeBarcodeCaptureOverlay_impl, overlay);
        NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlayUpdateBarcodeCaptureOverlayFromJson = this.f121483a.updateBarcodeCaptureOverlayFromJson(nativeBarcodeCaptureOverlay_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCaptureOverlay.class);
        Intrinsics.g(nativeBarcodeCaptureOverlayUpdateBarcodeCaptureOverlayFromJson);
        return (BarcodeCaptureOverlay) proxyCache.require(kClassB, null, nativeBarcodeCaptureOverlayUpdateBarcodeCaptureOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    public BarcodeCaptureSettings updateSettingsFromJson(BarcodeCaptureSettings settings, String jsonData) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings_impl = settings.getF121499a();
        this.proxyCache.put(Reflection.b(NativeBarcodeCaptureSettings.class), null, nativeBarcodeCaptureSettings_impl, settings);
        NativeBarcodeCaptureSettings nativeBarcodeCaptureSettingsUpdateSettingsFromJson = this.f121483a.updateSettingsFromJson(nativeBarcodeCaptureSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeCaptureSettings.class);
        Intrinsics.g(nativeBarcodeCaptureSettingsUpdateSettingsFromJson);
        return (BarcodeCaptureSettings) proxyCache.getOrPut(kClassB, null, nativeBarcodeCaptureSettingsUpdateSettingsFromJson, new I(nativeBarcodeCaptureSettingsUpdateSettingsFromJson));
    }

    public /* synthetic */ BarcodeCaptureDeserializerProxyAdapter(NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCaptureDeserializer, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
