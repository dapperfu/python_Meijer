package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlay;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeObjectTrackerScenario;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J'\u0010+\u001a\u00020\u00102\u0006\u0010$\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00102\u0006\u0010$\u001a\u00020-2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020\u00102\u0006\u0010$\u001a\u00020-2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializerHelper;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelper;", "_BarcodeBatchDeserializerHelper", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;", "createMode", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;)Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;", "mode", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;", "settings", "", "applySettings", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;)V", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "createSettings", "()Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeObjectTrackerScenario;", "scenario", "createSettingsForScenario", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeObjectTrackerScenario;)Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "createBasicOverlay", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayStyle;)Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "overlay", "updateBasicOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "view", "", "added", "changeBasicOverlayAddedToView", "(Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;Z)V", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "createAdvancedOverlay", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;)Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "updateAdvancedOverlayFromJson", "(Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "changeAdvancedOverlayAddedToView", "(Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;Z)V", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "createRecommendedCameraSettings", "()Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeBatchDeserializerHelperReversedAdapter extends NativeBarcodeTrackingDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeBatchDeserializerHelper f120413a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeBatchDeserializerHelperReversedAdapter(BarcodeBatchDeserializerHelper _BarcodeBatchDeserializerHelper, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeBatchDeserializerHelper, "_BarcodeBatchDeserializerHelper");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120413a = _BarcodeBatchDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void applySettings(NativeBarcodeTracking mode, NativeBarcodeTrackingSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        this.f120413a.applySettings((BarcodeBatch) this.proxyCache.require(Reflection.b(NativeBarcodeTracking.class), null, mode), (BarcodeBatchSettings) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void changeAdvancedOverlayAddedToView(NativeBarcodeTrackingAdvancedOverlay overlay, NativeDataCaptureView view, boolean added) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(view, "view");
        this.f120413a.changeAdvancedOverlayAddedToView((BarcodeBatchAdvancedOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingAdvancedOverlay.class), null, overlay), (DataCaptureView) this.proxyCache.require(Reflection.b(NativeDataCaptureView.class), null, view), added);
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void changeBasicOverlayAddedToView(NativeBarcodeTrackingBasicOverlay overlay, NativeDataCaptureView view, boolean added) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(view, "view");
        this.f120413a.changeBasicOverlayAddedToView((BarcodeBatchBasicOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay), (DataCaptureView) this.proxyCache.require(Reflection.b(NativeDataCaptureView.class), null, view), added);
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public NativeBarcodeTrackingAdvancedOverlay createAdvancedOverlay(NativeBarcodeTracking mode) {
        Intrinsics.j(mode, "mode");
        BarcodeBatchAdvancedOverlay barcodeBatchAdvancedOverlayCreateAdvancedOverlay = this.f120413a.createAdvancedOverlay((BarcodeBatch) this.proxyCache.require(Reflection.b(NativeBarcodeTracking.class), null, mode));
        this.proxyCache.put(Reflection.b(BarcodeBatchAdvancedOverlay.class), null, barcodeBatchAdvancedOverlayCreateAdvancedOverlay, barcodeBatchAdvancedOverlayCreateAdvancedOverlay._impl());
        NativeBarcodeTrackingAdvancedOverlay nativeBarcodeTrackingAdvancedOverlay_impl = barcodeBatchAdvancedOverlayCreateAdvancedOverlay._impl();
        this.proxyCache.put(Reflection.b(NativeBarcodeTrackingAdvancedOverlay.class), null, nativeBarcodeTrackingAdvancedOverlay_impl, barcodeBatchAdvancedOverlayCreateAdvancedOverlay);
        return nativeBarcodeTrackingAdvancedOverlay_impl;
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public NativeBarcodeTrackingBasicOverlay createBasicOverlay(NativeBarcodeTracking mode, NativeBarcodeTrackingBasicOverlayStyle style) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(style, "style");
        BarcodeBatchBasicOverlay barcodeBatchBasicOverlayCreateBasicOverlay = this.f120413a.createBasicOverlay((BarcodeBatch) this.proxyCache.require(Reflection.b(NativeBarcodeTracking.class), null, mode), BarcodeNativeTypeFactory.INSTANCE.convert(style));
        this.proxyCache.put(Reflection.b(BarcodeBatchBasicOverlay.class), null, barcodeBatchBasicOverlayCreateBasicOverlay, barcodeBatchBasicOverlayCreateBasicOverlay.getF120498a());
        NativeBarcodeTrackingBasicOverlay f120498a = barcodeBatchBasicOverlayCreateBasicOverlay.getF120498a();
        this.proxyCache.put(Reflection.b(NativeBarcodeTrackingBasicOverlay.class), null, f120498a, barcodeBatchBasicOverlayCreateBasicOverlay);
        return f120498a;
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public NativeBarcodeTracking createMode(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        BarcodeBatch barcodeBatchCreateMode = this.f120413a.createMode((DataCaptureContext) this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new C13035g(context)));
        this.proxyCache.put(Reflection.b(BarcodeBatch.class), null, barcodeBatchCreateMode, barcodeBatchCreateMode._impl());
        NativeBarcodeTracking nativeBarcodeTracking_impl = barcodeBatchCreateMode._impl();
        this.proxyCache.put(Reflection.b(NativeBarcodeTracking.class), null, nativeBarcodeTracking_impl, barcodeBatchCreateMode);
        return nativeBarcodeTracking_impl;
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public NativeCameraSettings createRecommendedCameraSettings() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f120413a.createRecommendedCameraSettings());
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public NativeBarcodeTrackingSettings createSettings() {
        BarcodeBatchSettings barcodeBatchSettingsCreateSettings = this.f120413a.createSettings();
        this.proxyCache.put(Reflection.b(BarcodeBatchSettings.class), null, barcodeBatchSettingsCreateSettings, barcodeBatchSettingsCreateSettings._impl());
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettings_impl = barcodeBatchSettingsCreateSettings._impl();
        this.proxyCache.put(Reflection.b(NativeBarcodeTrackingSettings.class), null, nativeBarcodeTrackingSettings_impl, barcodeBatchSettingsCreateSettings);
        return nativeBarcodeTrackingSettings_impl;
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public NativeBarcodeTrackingSettings createSettingsForScenario(NativeObjectTrackerScenario scenario) {
        Intrinsics.j(scenario, "scenario");
        BarcodeBatchSettings barcodeBatchSettingsCreateSettingsForScenario = this.f120413a.createSettingsForScenario(scenario);
        this.proxyCache.put(Reflection.b(BarcodeBatchSettings.class), null, barcodeBatchSettingsCreateSettingsForScenario, barcodeBatchSettingsCreateSettingsForScenario._impl());
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettings_impl = barcodeBatchSettingsCreateSettingsForScenario._impl();
        this.proxyCache.put(Reflection.b(NativeBarcodeTrackingSettings.class), null, nativeBarcodeTrackingSettings_impl, barcodeBatchSettingsCreateSettingsForScenario);
        return nativeBarcodeTrackingSettings_impl;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void updateAdvancedOverlayFromJson(NativeBarcodeTrackingAdvancedOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        this.f120413a.updateAdvancedOverlayFromJson((BarcodeBatchAdvancedOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingAdvancedOverlay.class), null, overlay), (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new C13036h(json)));
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void updateBasicOverlayFromJson(NativeBarcodeTrackingBasicOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        this.f120413a.updateBasicOverlayFromJson((BarcodeBatchBasicOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay), (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new i(json)));
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void updateModeFromJson(NativeBarcodeTracking mode, NativeJsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        this.f120413a.updateModeFromJson((BarcodeBatch) this.proxyCache.require(Reflection.b(NativeBarcodeTracking.class), null, mode), (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new j(json)));
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void updateSettingsFromJson(NativeBarcodeTrackingSettings settings, NativeJsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        this.f120413a.updateSettingsFromJson((BarcodeBatchSettings) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingSettings.class), null, settings), (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new k(json)));
    }

    public /* synthetic */ BarcodeBatchDeserializerHelperReversedAdapter(BarcodeBatchDeserializerHelper barcodeBatchDeserializerHelper, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeBatchDeserializerHelper, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
