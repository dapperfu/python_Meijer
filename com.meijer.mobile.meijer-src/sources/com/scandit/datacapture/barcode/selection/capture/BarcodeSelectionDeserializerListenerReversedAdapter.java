package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer;
import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializerListener;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "_BarcodeSelectionDeserializerListener", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;", "_BarcodeSelectionDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "(Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onModeDeserializationFinished", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;", "settings", "onSettingsDeserializationStarted", "(Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onSettingsDeserializationFinished", "Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;", "overlay", "onBasicOverlayDeserializationStarted", "(Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onBasicOverlayDeserializationFinished", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeSelectionDeserializerListenerReversedAdapter extends NativeBarcodeSelectionDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeSelectionDeserializerListener f124721a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f124723c;

    public /* synthetic */ BarcodeSelectionDeserializerListenerReversedAdapter(BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, BarcodeSelectionDeserializer barcodeSelectionDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeSelectionDeserializerListener, barcodeSelectionDeserializer, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onBasicOverlayDeserializationFinished(NativeBarcodeSelectionDeserializer deserializer, NativeBarcodeSelectionBasicOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124723c.get();
        if (barcodeSelectionDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new l(barcodeSelectionDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = (BarcodeSelectionBasicOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeSelectionBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new m(json));
            this.f124721a.onBasicOverlayDeserializationFinished((BarcodeSelectionDeserializer) orPut, barcodeSelectionBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onBasicOverlayDeserializationStarted(NativeBarcodeSelectionDeserializer deserializer, NativeBarcodeSelectionBasicOverlay overlay, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124723c.get();
        if (barcodeSelectionDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new n(barcodeSelectionDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = (BarcodeSelectionBasicOverlay) this.proxyCache.require(Reflection.b(NativeBarcodeSelectionBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new o(json));
            this.f124721a.onBasicOverlayDeserializationStarted((BarcodeSelectionDeserializer) orPut, barcodeSelectionBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onModeDeserializationFinished(NativeBarcodeSelectionDeserializer deserializer, NativeBarcodeSelection mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124723c.get();
        if (barcodeSelectionDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new p(barcodeSelectionDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeSelection barcodeSelection = (BarcodeSelection) this.proxyCache.require(Reflection.b(NativeBarcodeSelection.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new q(json));
            this.f124721a.onModeDeserializationFinished((BarcodeSelectionDeserializer) orPut, barcodeSelection, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onModeDeserializationStarted(NativeBarcodeSelectionDeserializer deserializer, NativeBarcodeSelection mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124723c.get();
        if (barcodeSelectionDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new r(barcodeSelectionDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeSelection barcodeSelection = (BarcodeSelection) this.proxyCache.require(Reflection.b(NativeBarcodeSelection.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new s(json));
            this.f124721a.onModeDeserializationStarted((BarcodeSelectionDeserializer) orPut, barcodeSelection, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onSettingsDeserializationFinished(NativeBarcodeSelectionDeserializer deserializer, NativeBarcodeSelectionSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124723c.get();
        if (barcodeSelectionDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new t(barcodeSelectionDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeSelectionSettings barcodeSelectionSettings = (BarcodeSelectionSettings) this.proxyCache.require(Reflection.b(NativeBarcodeSelectionSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new u(json));
            this.f124721a.onSettingsDeserializationFinished((BarcodeSelectionDeserializer) orPut, barcodeSelectionSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onSettingsDeserializationStarted(NativeBarcodeSelectionDeserializer deserializer, NativeBarcodeSelectionSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124723c.get();
        if (barcodeSelectionDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new v(barcodeSelectionDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeSelectionSettings barcodeSelectionSettings = (BarcodeSelectionSettings) this.proxyCache.require(Reflection.b(NativeBarcodeSelectionSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new w(json));
            this.f124721a.onSettingsDeserializationStarted((BarcodeSelectionDeserializer) orPut, barcodeSelectionSettings, jsonValue);
        }
    }

    public BarcodeSelectionDeserializerListenerReversedAdapter(BarcodeSelectionDeserializerListener _BarcodeSelectionDeserializerListener, BarcodeSelectionDeserializer _BarcodeSelectionDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeSelectionDeserializerListener, "_BarcodeSelectionDeserializerListener");
        Intrinsics.j(_BarcodeSelectionDeserializer, "_BarcodeSelectionDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124721a = _BarcodeSelectionDeserializerListener;
        this.proxyCache = proxyCache;
        this.f124723c = new WeakReference(_BarcodeSelectionDeserializer);
    }
}
