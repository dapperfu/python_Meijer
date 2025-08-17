package com.scandit.datacapture.barcode.internal.module.ar.serialization;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeAr;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
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
public final class e extends NativeBarcodeArDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeArDeserializerHelper f121073a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f121074b;

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerHelper
    public final void applySettings(NativeBarcodeAr mode, NativeBarcodeArSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        this.f121073a.a(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (BarcodeArSettings) this.f121074b.require(Reflection.b(NativeBarcodeArSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerHelper
    public final NativeBarcodeAr createMode(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        BarcodeAr barcodeArCreateMode = this.f121073a.createMode((DataCaptureContext) this.f121074b.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new b(context)));
        this.f121074b.put(Reflection.b(BarcodeAr.class), null, barcodeArCreateMode, barcodeArCreateMode._impl$scandit_barcode_capture());
        return BarcodeNativeTypeFactory.INSTANCE.convert(barcodeArCreateMode);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerHelper
    public final NativeBarcodeArSettings createSettings() {
        BarcodeArSettings barcodeArSettingsCreateSettings = this.f121073a.createSettings();
        this.f121074b.put(Reflection.b(BarcodeArSettings.class), null, barcodeArSettingsCreateSettings, barcodeArSettingsCreateSettings.getF120100a());
        NativeBarcodeArSettings f120100a = barcodeArSettingsCreateSettings.getF120100a();
        this.f121074b.put(Reflection.b(NativeBarcodeArSettings.class), null, f120100a, barcodeArSettingsCreateSettings);
        return f120100a;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerHelper
    public final void updateModeFromJson(NativeBarcodeAr mode, NativeJsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        this.f121073a.a(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (JsonValue) this.f121074b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new c(json)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerHelper
    public final void updateSettingsFromJson(NativeBarcodeArSettings settings, NativeJsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        this.f121073a.a((BarcodeArSettings) this.f121074b.require(Reflection.b(NativeBarcodeArSettings.class), null, settings), (JsonValue) this.f121074b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new d(json)));
    }

    public e(a _BarcodeArDeserializerHelper) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_BarcodeArDeserializerHelper, "_BarcodeArDeserializerHelper");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121073a = _BarcodeArDeserializerHelper;
        this.f121074b = proxyCache;
    }
}
