package com.scandit.datacapture.barcode.internal.module.find.serialization;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes11.dex */
public final class d extends NativeBarcodeFindDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeFindDeserializerHelper f122137a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f122138b;

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final void applySettings(NativeBarcodeFind mode, NativeBarcodeFindSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        this.f122137a.a((BarcodeFind) this.f122138b.require(Reflection.b(NativeBarcodeFind.class), null, mode), (BarcodeFindSettings) this.f122138b.require(Reflection.b(NativeBarcodeFindSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final NativeBarcodeFind createMode() {
        BarcodeFind barcodeFindB = this.f122137a.b();
        NativeBarcodeFind nativeBarcodeFind_impl = barcodeFindB._impl();
        this.f122138b.put(Reflection.b(NativeBarcodeFind.class), null, nativeBarcodeFind_impl, barcodeFindB);
        return nativeBarcodeFind_impl;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final NativeBarcodeFindSettings createSettings() {
        BarcodeFindSettings barcodeFindSettingsCreateSettings = this.f122137a.createSettings();
        NativeBarcodeFindSettings nativeBarcodeFindSettings_impl = barcodeFindSettingsCreateSettings._impl();
        this.f122138b.put(Reflection.b(NativeBarcodeFindSettings.class), null, nativeBarcodeFindSettings_impl, barcodeFindSettingsCreateSettings);
        return nativeBarcodeFindSettings_impl;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final void updateModeFromJson(NativeBarcodeFind mode, NativeJsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        this.f122137a.a((BarcodeFind) this.f122138b.require(Reflection.b(NativeBarcodeFind.class), null, mode), (JsonValue) this.f122138b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new b(json)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final void updateSettingsFromJson(NativeBarcodeFindSettings settings, NativeJsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        this.f122137a.a((BarcodeFindSettings) this.f122138b.require(Reflection.b(NativeBarcodeFindSettings.class), null, settings), (JsonValue) this.f122138b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new c(json)));
    }

    public d(a _BarcodeFindDeserializerHelper) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_BarcodeFindDeserializerHelper, "_BarcodeFindDeserializerHelper");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122137a = _BarcodeFindDeserializerHelper;
        this.f122138b = proxyCache;
    }
}
