package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializerHelper;", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "_BarcodeCountDeserializerHelper", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "createSettings", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "createMode", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;)Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "settings", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "mode", "applySettings", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;)V", "updateModeFromJson", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "createBasicOverlay", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;)Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "overlay", "updateBasicOverlayFromJson", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "view", "", "added", "changeBasicOverlayAddedToView", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;Z)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCountDeserializerHelperReversedAdapter extends NativeBarcodeCountDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountDeserializerHelper f121680a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCountDeserializerHelperReversedAdapter(BarcodeCountDeserializerHelper _BarcodeCountDeserializerHelper, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeCountDeserializerHelper, "_BarcodeCountDeserializerHelper");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121680a = _BarcodeCountDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void applySettings(NativeBarcodeCount mode, NativeBarcodeCountSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        this.f121680a.applySettings((BarcodeCount) this.proxyCache.require(Reflection.b(NativeBarcodeCount.class), null, mode), (BarcodeCountSettings) this.proxyCache.require(Reflection.b(NativeBarcodeCountSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void changeBasicOverlayAddedToView(NativeBarcodeCountBasicOverlay overlay, NativeDataCaptureView view, boolean added) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(view, "view");
        this.f121680a.changeBasicOverlayAddedToView((BarcodeCountBasicOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay), (DataCaptureView) this.proxyCache.require(Reflection.b(NativeDataCaptureView.class), null, view), added);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public NativeBarcodeCountBasicOverlay createBasicOverlay(NativeBarcodeCount mode, NativeBarcodeCountBasicOverlayStyle style) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(style, "style");
        BarcodeCountBasicOverlay barcodeCountBasicOverlayCreateBasicOverlay = this.f121680a.createBasicOverlay((BarcodeCount) this.proxyCache.require(Reflection.b(NativeBarcodeCount.class), null, mode), BarcodeNativeTypeFactory.INSTANCE.convert(style));
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay_impl = barcodeCountBasicOverlayCreateBasicOverlay._impl();
        this.proxyCache.put(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, nativeBarcodeCountBasicOverlay_impl, barcodeCountBasicOverlayCreateBasicOverlay);
        return nativeBarcodeCountBasicOverlay_impl;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public NativeBarcodeCount createMode(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        BarcodeCount barcodeCountCreateMode = this.f121680a.createMode((DataCaptureContext) this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new d(context)));
        this.proxyCache.put(Reflection.b(BarcodeCount.class), null, barcodeCountCreateMode, barcodeCountCreateMode._impl());
        NativeBarcodeCount nativeBarcodeCount_impl = barcodeCountCreateMode._impl();
        this.proxyCache.put(Reflection.b(NativeBarcodeCount.class), null, nativeBarcodeCount_impl, barcodeCountCreateMode);
        return nativeBarcodeCount_impl;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public NativeBarcodeCountSettings createSettings() {
        BarcodeCountSettings barcodeCountSettingsCreateSettings = this.f121680a.createSettings();
        this.proxyCache.put(Reflection.b(BarcodeCountSettings.class), null, barcodeCountSettingsCreateSettings, barcodeCountSettingsCreateSettings._impl());
        NativeBarcodeCountSettings nativeBarcodeCountSettings_impl = barcodeCountSettingsCreateSettings._impl();
        this.proxyCache.put(Reflection.b(NativeBarcodeCountSettings.class), null, nativeBarcodeCountSettings_impl, barcodeCountSettingsCreateSettings);
        return nativeBarcodeCountSettings_impl;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void updateBasicOverlayFromJson(NativeBarcodeCountBasicOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        this.f121680a.updateBasicOverlayFromJson((BarcodeCountBasicOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay), (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new e(json)));
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void updateModeFromJson(NativeBarcodeCount mode, NativeJsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        this.f121680a.updateModeFromJson((BarcodeCount) this.proxyCache.require(Reflection.b(NativeBarcodeCount.class), null, mode), (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new f(json)));
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void updateSettingsFromJson(NativeBarcodeCountSettings settings, NativeJsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        this.f121680a.updateSettingsFromJson((BarcodeCountSettings) this.proxyCache.require(Reflection.b(NativeBarcodeCountSettings.class), null, settings), (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new g(json)));
    }

    public /* synthetic */ BarcodeCountDeserializerHelperReversedAdapter(BarcodeCountDeserializerHelper barcodeCountDeserializerHelper, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountDeserializerHelper, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
