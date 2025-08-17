package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializer;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlay;
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

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020*2\u0006\u0010'\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0016078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerProxy;", "Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;", "_NativeBarcodeTrackingDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;)V", "_deserializer", "()Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "jsonData", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "mode", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "settings", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "_basicOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "overlay", "updateBasicOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "_advancedOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "updateAdvancedOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeBatchDeserializerProxyAdapter implements BarcodeBatchDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeTrackingDeserializer f120418a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureModeDeserializer f120420c;

    /* renamed from: d, reason: collision with root package name */
    private BarcodeBatchDeserializer f120421d;

    public BarcodeBatchDeserializerProxyAdapter(NativeBarcodeTrackingDeserializer _NativeBarcodeTrackingDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeTrackingDeserializer, "_NativeBarcodeTrackingDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120418a = _NativeBarcodeTrackingDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeTrackingDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.i(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "asDataCaptureModeDeserializer(...)");
        this.f120420c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public BarcodeBatchAdvancedOverlay _advancedOverlayFromJson(BarcodeBatch mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeTracking nativeBarcodeTracking_impl = mode.getF120426a();
        this.proxyCache.put(Reflection.b(NativeBarcodeTracking.class), null, nativeBarcodeTracking_impl, mode);
        NativeBarcodeTrackingAdvancedOverlay nativeBarcodeTrackingAdvancedOverlayBarcodeTrackingAdvancedOverlayFromJson = this.f120418a.barcodeTrackingAdvancedOverlayFromJson(nativeBarcodeTracking_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeTrackingAdvancedOverlay.class);
        Intrinsics.g(nativeBarcodeTrackingAdvancedOverlayBarcodeTrackingAdvancedOverlayFromJson);
        return (BarcodeBatchAdvancedOverlay) proxyCache.require(kClassB, null, nativeBarcodeTrackingAdvancedOverlayBarcodeTrackingAdvancedOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public BarcodeBatchBasicOverlay _basicOverlayFromJson(BarcodeBatch mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeTracking nativeBarcodeTracking_impl = mode.getF120426a();
        this.proxyCache.put(Reflection.b(NativeBarcodeTracking.class), null, nativeBarcodeTracking_impl, mode);
        NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlayBarcodeTrackingBasicOverlayFromJson = this.f120418a.barcodeTrackingBasicOverlayFromJson(nativeBarcodeTracking_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeTrackingBasicOverlay.class);
        Intrinsics.g(nativeBarcodeTrackingBasicOverlayBarcodeTrackingBasicOverlayFromJson);
        return (BarcodeBatchBasicOverlay) proxyCache.require(kClassB, null, nativeBarcodeTrackingBasicOverlayBarcodeTrackingBasicOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public BarcodeBatchDeserializer _deserializer() {
        BarcodeBatchDeserializer barcodeBatchDeserializer = this.f120421d;
        if (barcodeBatchDeserializer != null) {
            return barcodeBatchDeserializer;
        }
        Intrinsics.y("_setDeserializer_backing_field");
        return null;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeTrackingDeserializer getF120418a() {
        return this.f120418a;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getF123616c() {
        return this.f120420c;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public BarcodeBatch _modeFromJson(DataCaptureContext dataCaptureContext, String jsonData) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(jsonData, "jsonData");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF124053a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        NativeBarcodeTracking nativeBarcodeTrackingBarcodeTrackingFromJson = this.f120418a.barcodeTrackingFromJson(nativeDataCaptureContext_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeTracking.class);
        Intrinsics.g(nativeBarcodeTrackingBarcodeTrackingFromJson);
        return (BarcodeBatch) proxyCache.require(kClassB, null, nativeBarcodeTrackingBarcodeTrackingFromJson);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public void _setDeserializer(BarcodeBatchDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f120421d = deserializer;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public BarcodeBatchSettings _settingsFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettings = this.f120418a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeTrackingSettings.class);
        Intrinsics.g(nativeBarcodeTrackingSettings);
        return (BarcodeBatchSettings) proxyCache.require(kClassB, null, nativeBarcodeTrackingSettings);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public List<String> getWarnings() {
        ArrayList<String> warnings = this.f120418a.getWarnings();
        Intrinsics.g(warnings);
        return warnings;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    public BarcodeBatchDeserializerHelper get_helper() {
        return (BarcodeBatchDeserializerHelper) this.proxyCache.requireByValue(Reflection.b(BarcodeBatchDeserializerHelper.class), this.f120418a.getHelper());
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public BarcodeBatchAdvancedOverlay updateAdvancedOverlayFromJson(BarcodeBatchAdvancedOverlay overlay, String jsonData) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeTrackingAdvancedOverlay nativeBarcodeTrackingAdvancedOverlay_impl = overlay.getF120489a();
        this.proxyCache.put(Reflection.b(NativeBarcodeTrackingAdvancedOverlay.class), null, nativeBarcodeTrackingAdvancedOverlay_impl, overlay);
        NativeBarcodeTrackingAdvancedOverlay nativeBarcodeTrackingAdvancedOverlayUpdateBarcodeTrackingAdvancedOverlayFromJson = this.f120418a.updateBarcodeTrackingAdvancedOverlayFromJson(nativeBarcodeTrackingAdvancedOverlay_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeTrackingAdvancedOverlay.class);
        Intrinsics.g(nativeBarcodeTrackingAdvancedOverlayUpdateBarcodeTrackingAdvancedOverlayFromJson);
        return (BarcodeBatchAdvancedOverlay) proxyCache.require(kClassB, null, nativeBarcodeTrackingAdvancedOverlayUpdateBarcodeTrackingAdvancedOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public BarcodeBatchBasicOverlay updateBasicOverlayFromJson(BarcodeBatchBasicOverlay overlay, String jsonData) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeTrackingBasicOverlay f120498a = overlay.getF120498a();
        this.proxyCache.put(Reflection.b(NativeBarcodeTrackingBasicOverlay.class), null, f120498a, overlay);
        NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlayUpdateBarcodeTrackingBasicOverlayFromJson = this.f120418a.updateBarcodeTrackingBasicOverlayFromJson(f120498a, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeTrackingBasicOverlay.class);
        Intrinsics.g(nativeBarcodeTrackingBasicOverlayUpdateBarcodeTrackingBasicOverlayFromJson);
        return (BarcodeBatchBasicOverlay) proxyCache.require(kClassB, null, nativeBarcodeTrackingBasicOverlayUpdateBarcodeTrackingBasicOverlayFromJson);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public BarcodeBatch updateModeFromJson(BarcodeBatch mode, String jsonData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeTracking nativeBarcodeTracking_impl = mode.getF120426a();
        this.proxyCache.put(Reflection.b(NativeBarcodeTracking.class), null, nativeBarcodeTracking_impl, mode);
        NativeBarcodeTracking nativeBarcodeTrackingUpdateBarcodeTrackingFromJson = this.f120418a.updateBarcodeTrackingFromJson(nativeBarcodeTracking_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeTracking.class);
        Intrinsics.g(nativeBarcodeTrackingUpdateBarcodeTrackingFromJson);
        return (BarcodeBatch) proxyCache.require(kClassB, null, nativeBarcodeTrackingUpdateBarcodeTrackingFromJson);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerProxy
    public BarcodeBatchSettings updateSettingsFromJson(BarcodeBatchSettings settings, String jsonData) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(jsonData, "jsonData");
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettings_impl = settings.getF120435a();
        this.proxyCache.put(Reflection.b(NativeBarcodeTrackingSettings.class), null, nativeBarcodeTrackingSettings_impl, settings);
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettingsUpdateSettingsFromJson = this.f120418a.updateSettingsFromJson(nativeBarcodeTrackingSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeTrackingSettings.class);
        Intrinsics.g(nativeBarcodeTrackingSettingsUpdateSettingsFromJson);
        return (BarcodeBatchSettings) proxyCache.require(kClassB, null, nativeBarcodeTrackingSettingsUpdateSettingsFromJson);
    }

    public /* synthetic */ BarcodeBatchDeserializerProxyAdapter(NativeBarcodeTrackingDeserializer nativeBarcodeTrackingDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeTrackingDeserializer, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
