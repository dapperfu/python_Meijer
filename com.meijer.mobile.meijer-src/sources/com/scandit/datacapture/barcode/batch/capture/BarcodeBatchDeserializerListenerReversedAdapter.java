package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializer;
import com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u001fJ'\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializerListener;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerListener;", "_BarcodeBatchDeserializerListener", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;", "_BarcodeBatchDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerListener;Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "(Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;", "settings", "onSettingsDeserializationStarted", "(Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSettings;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onSettingsDeserializationFinished", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "overlay", "onBasicOverlayDeserializationStarted", "(Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onBasicOverlayDeserializationFinished", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "onAdvancedOverlayDeserializationStarted", "(Lcom/scandit/datacapture/barcode/batch/internal/module/serialization/NativeBarcodeTrackingDeserializer;Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onAdvancedOverlayDeserializationFinished", "onModeDeserializationFinished", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeBatchDeserializerListenerReversedAdapter extends NativeBarcodeTrackingDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeBatchDeserializerListener f121367a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f121369c;

    public /* synthetic */ BarcodeBatchDeserializerListenerReversedAdapter(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener, BarcodeBatchDeserializer barcodeBatchDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeBatchDeserializerListener, barcodeBatchDeserializer, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onAdvancedOverlayDeserializationFinished(NativeBarcodeTrackingDeserializer deserializer, NativeBarcodeTrackingAdvancedOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f121369c.get();
        if (barcodeBatchDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new l(barcodeBatchDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeBatchAdvancedOverlay barcodeBatchAdvancedOverlay = (BarcodeBatchAdvancedOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingAdvancedOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new m(json));
            this.f121367a.onAdvancedOverlayDeserializationFinished((BarcodeBatchDeserializer) orPut, barcodeBatchAdvancedOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onAdvancedOverlayDeserializationStarted(NativeBarcodeTrackingDeserializer deserializer, NativeBarcodeTrackingAdvancedOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f121369c.get();
        if (barcodeBatchDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new n(barcodeBatchDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeBatchAdvancedOverlay barcodeBatchAdvancedOverlay = (BarcodeBatchAdvancedOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingAdvancedOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new o(json));
            this.f121367a.onAdvancedOverlayDeserializationStarted((BarcodeBatchDeserializer) orPut, barcodeBatchAdvancedOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onBasicOverlayDeserializationFinished(NativeBarcodeTrackingDeserializer deserializer, NativeBarcodeTrackingBasicOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f121369c.get();
        if (barcodeBatchDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new p(barcodeBatchDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeBatchBasicOverlay barcodeBatchBasicOverlay = (BarcodeBatchBasicOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new q(json));
            this.f121367a.onBasicOverlayDeserializationFinished((BarcodeBatchDeserializer) orPut, barcodeBatchBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onBasicOverlayDeserializationStarted(NativeBarcodeTrackingDeserializer deserializer, NativeBarcodeTrackingBasicOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f121369c.get();
        if (barcodeBatchDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new r(barcodeBatchDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeBatchBasicOverlay barcodeBatchBasicOverlay = (BarcodeBatchBasicOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new s(json));
            this.f121367a.onBasicOverlayDeserializationStarted((BarcodeBatchDeserializer) orPut, barcodeBatchBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onModeDeserializationFinished(NativeBarcodeTrackingDeserializer deserializer, NativeBarcodeTracking mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f121369c.get();
        if (barcodeBatchDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new t(barcodeBatchDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeBatch barcodeBatch = (BarcodeBatch) this.proxyCache.require(Reflection.b(NativeBarcodeTracking.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new u(json));
            this.f121367a.onModeDeserializationFinished((BarcodeBatchDeserializer) orPut, barcodeBatch, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onModeDeserializationStarted(NativeBarcodeTrackingDeserializer deserializer, NativeBarcodeTracking mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f121369c.get();
        if (barcodeBatchDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new v(barcodeBatchDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeBatch barcodeBatch = (BarcodeBatch) this.proxyCache.require(Reflection.b(NativeBarcodeTracking.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new w(json));
            this.f121367a.onModeDeserializationStarted((BarcodeBatchDeserializer) orPut, barcodeBatch, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onSettingsDeserializationFinished(NativeBarcodeTrackingDeserializer deserializer, NativeBarcodeTrackingSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f121369c.get();
        if (barcodeBatchDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new x(barcodeBatchDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeBatchSettings barcodeBatchSettings = (BarcodeBatchSettings) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new y(json));
            this.f121367a.onSettingsDeserializationFinished((BarcodeBatchDeserializer) orPut, barcodeBatchSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onSettingsDeserializationStarted(NativeBarcodeTrackingDeserializer deserializer, NativeBarcodeTrackingSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f121369c.get();
        if (barcodeBatchDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new z(barcodeBatchDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeBatchSettings barcodeBatchSettings = (BarcodeBatchSettings) this.proxyCache.require(Reflection.b(NativeBarcodeTrackingSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new A(json));
            this.f121367a.onSettingsDeserializationStarted((BarcodeBatchDeserializer) orPut, barcodeBatchSettings, jsonValue);
        }
    }

    public BarcodeBatchDeserializerListenerReversedAdapter(BarcodeBatchDeserializerListener _BarcodeBatchDeserializerListener, BarcodeBatchDeserializer _BarcodeBatchDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeBatchDeserializerListener, "_BarcodeBatchDeserializerListener");
        Intrinsics.j(_BarcodeBatchDeserializer, "_BarcodeBatchDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121367a = _BarcodeBatchDeserializerListener;
        this.proxyCache = proxyCache;
        this.f121369c = new WeakReference(_BarcodeBatchDeserializer);
    }
}
