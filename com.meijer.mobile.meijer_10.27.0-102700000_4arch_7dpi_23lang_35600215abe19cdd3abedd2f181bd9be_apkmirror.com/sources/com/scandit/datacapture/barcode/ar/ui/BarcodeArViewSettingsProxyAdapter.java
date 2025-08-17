package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/ar/ui/NativeBarcodeArViewSettings;", "_NativeBarcodeArViewSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ar/ui/NativeBarcodeArViewSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/ar/ui/NativeBarcodeArViewSettings;", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "", "_updateFromJson", "(Lcom/scandit/datacapture/core/json/JsonValue;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "p0", "getHapticEnabled", "()Z", "setHapticEnabled", "(Z)V", "hapticEnabled", "getSoundEnabled", "setSoundEnabled", "soundEnabled", "Lcom/scandit/datacapture/core/source/CameraPosition;", "getDefaultCameraPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "setDefaultCameraPosition", "(Lcom/scandit/datacapture/core/source/CameraPosition;)V", "defaultCameraPosition", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArViewSettingsProxyAdapter implements BarcodeArViewSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeArViewSettings f120193a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeArViewSettingsProxyAdapter(NativeBarcodeArViewSettings _NativeBarcodeArViewSettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeArViewSettings, "_NativeBarcodeArViewSettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120193a = _NativeBarcodeArViewSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeArViewSettings getF120193a() {
        return this.f120193a;
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    public void _updateFromJson(JsonValue json) {
        Intrinsics.j(json, "json");
        NativeJsonValue nativeJsonValue_impl = json.getF125830a();
        this.proxyCache.put(Reflection.b(NativeJsonValue.class), null, nativeJsonValue_impl, json);
        this.f120193a.updateFromJson(nativeJsonValue_impl);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    public CameraPosition getDefaultCameraPosition() {
        CameraPosition cameraPosition = this.f120193a.getCameraPosition();
        Intrinsics.g(cameraPosition);
        return cameraPosition;
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    public boolean getHapticEnabled() {
        return this.f120193a.getHapticEnabled();
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    public boolean getSoundEnabled() {
        return this.f120193a.getSoundEnabled();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    public void setDefaultCameraPosition(CameraPosition p02) {
        Intrinsics.j(p02, "p0");
        this.f120193a.setCameraPosition(p02);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    public void setHapticEnabled(boolean z10) {
        this.f120193a.setHapticEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettingsProxy
    public void setSoundEnabled(boolean z10) {
        this.f120193a.setSoundEnabled(z10);
    }

    public /* synthetic */ BarcodeArViewSettingsProxyAdapter(NativeBarcodeArViewSettings nativeBarcodeArViewSettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeArViewSettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
