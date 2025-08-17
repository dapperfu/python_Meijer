package com.scandit.datacapture.barcode.internal.module.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.serialization.k;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes11.dex */
public final class e extends NativeBarcodePickDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickDeserializerHelper f122466a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f122467b;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final void applySettings(NativeBarcodePick mode, NativeBarcodePickSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        this.f122466a.a(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (BarcodePickSettings) this.f122467b.require(Reflection.b(NativeBarcodePickSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final NativeBarcodePickBasicOverlay createBasicOverlay(NativeBarcodePick mode, NativeBarcodePickViewSettings viewSettings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(viewSettings, "viewSettings");
        BarcodePickBasicOverlay barcodePickBasicOverlayA = this.f122466a.a(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (BarcodePickViewSettings) this.f122467b.require(Reflection.b(NativeBarcodePickViewSettings.class), null, viewSettings));
        NativeBarcodePickBasicOverlay nativeBarcodePickBasicOverlayA = barcodePickBasicOverlayA.a();
        this.f122467b.put(Reflection.b(NativeBarcodePickBasicOverlay.class), null, nativeBarcodePickBasicOverlayA, barcodePickBasicOverlayA);
        return nativeBarcodePickBasicOverlayA;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final NativeBarcodePick createMode(NativeDataCaptureContext context, NativeProductProvider provider) {
        Intrinsics.j(context, "context");
        Intrinsics.j(provider, "provider");
        BarcodePick barcodePickA = this.f122466a.a((DataCaptureContext) this.f122467b.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new a(context)), (BarcodePickProductProvider) this.f122467b.require(Reflection.b(NativeProductProvider.class), null, provider));
        this.f122467b.put(Reflection.b(BarcodePick.class), null, barcodePickA, barcodePickA._impl$scandit_barcode_capture());
        return BarcodeNativeTypeFactory.INSTANCE.convert(barcodePickA);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final NativeBarcodePickSettings createSettings() {
        BarcodePickSettings barcodePickSettingsCreateSettings = this.f122466a.createSettings();
        this.f122467b.put(Reflection.b(BarcodePickSettings.class), null, barcodePickSettingsCreateSettings, barcodePickSettingsCreateSettings._impl());
        NativeBarcodePickSettings nativeBarcodePickSettings_impl = barcodePickSettingsCreateSettings._impl();
        this.f122467b.put(Reflection.b(NativeBarcodePickSettings.class), null, nativeBarcodePickSettings_impl, barcodePickSettingsCreateSettings);
        return nativeBarcodePickSettings_impl;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final NativeBarcodePickViewSettings createViewSettings() {
        BarcodePickViewSettings barcodePickViewSettingsA = this.f122466a.a();
        this.f122467b.put(Reflection.b(BarcodePickViewSettings.class), null, barcodePickViewSettingsA, barcodePickViewSettingsA.getF123721a());
        NativeBarcodePickViewSettings f123721a = barcodePickViewSettingsA.getF123721a();
        this.f122467b.put(Reflection.b(NativeBarcodePickViewSettings.class), null, f123721a, barcodePickViewSettingsA);
        return f123721a;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final void updateModeFromJson(NativeBarcodePick mode, NativeJsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        this.f122466a.a(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (JsonValue) this.f122467b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new b(json)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final void updateSettingsFromJson(NativeBarcodePickSettings settings, NativeJsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        this.f122466a.a((BarcodePickSettings) this.f122467b.require(Reflection.b(NativeBarcodePickSettings.class), null, settings), (JsonValue) this.f122467b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new c(json)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final void updateViewSettingsFromJson(NativeBarcodePickViewSettings viewSettings, NativeJsonValue json) {
        Intrinsics.j(viewSettings, "viewSettings");
        Intrinsics.j(json, "json");
        this.f122466a.a((BarcodePickViewSettings) this.f122467b.require(Reflection.b(NativeBarcodePickViewSettings.class), null, viewSettings), (JsonValue) this.f122467b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new d(json)));
    }

    public e(k _BarcodePickDeserializerHelper) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_BarcodePickDeserializerHelper, "_BarcodePickDeserializerHelper");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122466a = _BarcodePickDeserializerHelper;
        this.f122467b = proxyCache;
    }
}
