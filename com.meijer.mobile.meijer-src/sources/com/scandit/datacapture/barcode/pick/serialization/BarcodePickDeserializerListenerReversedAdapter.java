package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializerListener;", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;", "_BarcodePickDeserializerListener", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "_BarcodePickDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "(Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;", "settings", "onSettingsDeserializationStarted", "(Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onSettingsDeserializationFinished", "onModeDeserializationFinished", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodePickDeserializerListenerReversedAdapter extends NativeBarcodePickDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickDeserializerListener f124563a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f124565c;

    public /* synthetic */ BarcodePickDeserializerListenerReversedAdapter(BarcodePickDeserializerListener barcodePickDeserializerListener, BarcodePickDeserializer barcodePickDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodePickDeserializerListener, barcodePickDeserializer, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener
    public void onModeDeserializationFinished(NativeBarcodePickDeserializer deserializer, NativeBarcodePick mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f124565c.get();
        if (barcodePickDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodePickDeserializer.class), null, deserializer, new l(barcodePickDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodePick barcodePickConvert = BarcodeNativeTypeFactory.INSTANCE.convert(mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new m(json));
            this.f124563a.onModeDeserializationFinished((BarcodePickDeserializer) orPut, barcodePickConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener
    public void onModeDeserializationStarted(NativeBarcodePickDeserializer deserializer, NativeBarcodePick mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f124565c.get();
        if (barcodePickDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodePickDeserializer.class), null, deserializer, new n(barcodePickDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodePick barcodePickConvert = BarcodeNativeTypeFactory.INSTANCE.convert(mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new o(json));
            this.f124563a.onModeDeserializationStarted((BarcodePickDeserializer) orPut, barcodePickConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener
    public void onSettingsDeserializationFinished(NativeBarcodePickDeserializer deserializer, NativeBarcodePickSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f124565c.get();
        if (barcodePickDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodePickDeserializer.class), null, deserializer, new p(barcodePickDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodePickSettings barcodePickSettings = (BarcodePickSettings) this.proxyCache.require(Reflection.b(NativeBarcodePickSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new q(json));
            this.f124563a.onSettingsDeserializationFinished((BarcodePickDeserializer) orPut, barcodePickSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener
    public void onSettingsDeserializationStarted(NativeBarcodePickDeserializer deserializer, NativeBarcodePickSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f124565c.get();
        if (barcodePickDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodePickDeserializer.class), null, deserializer, new r(barcodePickDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodePickSettings barcodePickSettings = (BarcodePickSettings) this.proxyCache.require(Reflection.b(NativeBarcodePickSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new s(json));
            this.f124563a.onSettingsDeserializationStarted((BarcodePickDeserializer) orPut, barcodePickSettings, jsonValue);
        }
    }

    public BarcodePickDeserializerListenerReversedAdapter(BarcodePickDeserializerListener _BarcodePickDeserializerListener, BarcodePickDeserializer _BarcodePickDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodePickDeserializerListener, "_BarcodePickDeserializerListener");
        Intrinsics.j(_BarcodePickDeserializer, "_BarcodePickDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124563a = _BarcodePickDeserializerListener;
        this.proxyCache = proxyCache;
        this.f124565c = new WeakReference(_BarcodePickDeserializer);
    }
}
