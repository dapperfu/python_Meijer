package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializerListener;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;", "_BarcodeCaptureDeserializerListener", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;", "_BarcodeCaptureDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "(Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "settings", "onSettingsDeserializationStarted", "(Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onSettingsDeserializationFinished", "Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;", "overlay", "onOverlayDeserializationStarted", "(Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onOverlayDeserializationFinished", "onModeDeserializationFinished", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCaptureDeserializerListenerReversedAdapter extends NativeBarcodeCaptureDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCaptureDeserializerListener f120528a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f120530c;

    public /* synthetic */ BarcodeCaptureDeserializerListenerReversedAdapter(BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, BarcodeCaptureDeserializer barcodeCaptureDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCaptureDeserializerListener, barcodeCaptureDeserializer, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onModeDeserializationFinished(NativeBarcodeCaptureDeserializer deserializer, NativeBarcodeCapture mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120530c.get();
        if (barcodeCaptureDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new C13052p(barcodeCaptureDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeCapture barcodeCapture = (BarcodeCapture) this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCapture.class), null, mode, new C13053q(mode));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new r(json));
            this.f120528a.onModeDeserializationFinished((BarcodeCaptureDeserializer) orPut, barcodeCapture, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onModeDeserializationStarted(NativeBarcodeCaptureDeserializer deserializer, NativeBarcodeCapture mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120530c.get();
        if (barcodeCaptureDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new C13054s(barcodeCaptureDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeCapture barcodeCapture = (BarcodeCapture) this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCapture.class), null, mode, new C13055t(mode));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new C13056u(json));
            this.f120528a.onModeDeserializationStarted((BarcodeCaptureDeserializer) orPut, barcodeCapture, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onOverlayDeserializationFinished(NativeBarcodeCaptureDeserializer deserializer, NativeBarcodeCaptureOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120530c.get();
        if (barcodeCaptureDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new v(barcodeCaptureDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeCaptureOverlay barcodeCaptureOverlay = (BarcodeCaptureOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeCaptureOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new w(json));
            this.f120528a.onOverlayDeserializationFinished((BarcodeCaptureDeserializer) orPut, barcodeCaptureOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onOverlayDeserializationStarted(NativeBarcodeCaptureDeserializer deserializer, NativeBarcodeCaptureOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120530c.get();
        if (barcodeCaptureDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new x(barcodeCaptureDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeCaptureOverlay barcodeCaptureOverlay = (BarcodeCaptureOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeCaptureOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new y(json));
            this.f120528a.onOverlayDeserializationStarted((BarcodeCaptureDeserializer) orPut, barcodeCaptureOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onSettingsDeserializationFinished(NativeBarcodeCaptureDeserializer deserializer, NativeBarcodeCaptureSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120530c.get();
        if (barcodeCaptureDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new z(barcodeCaptureDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeCaptureSettings barcodeCaptureSettings = (BarcodeCaptureSettings) this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCaptureSettings.class), null, settings, new A(settings));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new B(json));
            this.f120528a.onSettingsDeserializationFinished((BarcodeCaptureDeserializer) orPut, barcodeCaptureSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onSettingsDeserializationStarted(NativeBarcodeCaptureDeserializer deserializer, NativeBarcodeCaptureSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120530c.get();
        if (barcodeCaptureDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new C(barcodeCaptureDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeCaptureSettings barcodeCaptureSettings = (BarcodeCaptureSettings) this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCaptureSettings.class), null, settings, new D(settings));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new E(json));
            this.f120528a.onSettingsDeserializationStarted((BarcodeCaptureDeserializer) orPut, barcodeCaptureSettings, jsonValue);
        }
    }

    public BarcodeCaptureDeserializerListenerReversedAdapter(BarcodeCaptureDeserializerListener _BarcodeCaptureDeserializerListener, BarcodeCaptureDeserializer _BarcodeCaptureDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeCaptureDeserializerListener, "_BarcodeCaptureDeserializerListener");
        Intrinsics.j(_BarcodeCaptureDeserializer, "_BarcodeCaptureDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120528a = _BarcodeCaptureDeserializerListener;
        this.proxyCache = proxyCache;
        this.f120530c = new WeakReference(_BarcodeCaptureDeserializer);
    }
}
