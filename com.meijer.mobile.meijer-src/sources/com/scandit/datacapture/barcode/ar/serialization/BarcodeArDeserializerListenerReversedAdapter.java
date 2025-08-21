package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeAr;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerListener;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializerListener;", "Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerListener;", "_BarcodeArDeserializerListener", "Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializer;", "_BarcodeArDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerListener;Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "(Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializer;Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onModeDeserializationFinished", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSettings;", "settings", "onSettingsDeserializationStarted", "(Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializer;Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSettings;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onSettingsDeserializationFinished", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArDeserializerListenerReversedAdapter extends NativeBarcodeArDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeArDeserializerListener f121063a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f121065c;

    public /* synthetic */ BarcodeArDeserializerListenerReversedAdapter(BarcodeArDeserializerListener barcodeArDeserializerListener, BarcodeArDeserializer barcodeArDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeArDeserializerListener, barcodeArDeserializer, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerListener
    public void onModeDeserializationFinished(NativeBarcodeArDeserializer deserializer, NativeBarcodeAr mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeArDeserializer barcodeArDeserializer = (BarcodeArDeserializer) this.f121065c.get();
        if (barcodeArDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeArDeserializer.class), null, deserializer, new c(barcodeArDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeAr barcodeArConvert = BarcodeNativeTypeFactory.INSTANCE.convert(mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new d(json));
            this.f121063a.onModeDeserializationFinished((BarcodeArDeserializer) orPut, barcodeArConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerListener
    public void onModeDeserializationStarted(NativeBarcodeArDeserializer deserializer, NativeBarcodeAr mode, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeArDeserializer barcodeArDeserializer = (BarcodeArDeserializer) this.f121065c.get();
        if (barcodeArDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeArDeserializer.class), null, deserializer, new e(barcodeArDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeAr barcodeArConvert = BarcodeNativeTypeFactory.INSTANCE.convert(mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new f(json));
            this.f121063a.onModeDeserializationStarted((BarcodeArDeserializer) orPut, barcodeArConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerListener
    public void onSettingsDeserializationFinished(NativeBarcodeArDeserializer deserializer, NativeBarcodeArSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeArDeserializer barcodeArDeserializer = (BarcodeArDeserializer) this.f121065c.get();
        if (barcodeArDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeArDeserializer.class), null, deserializer, new g(barcodeArDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeArSettings barcodeArSettings = (BarcodeArSettings) this.proxyCache.require(Reflection.b(NativeBarcodeArSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new h(json));
            this.f121063a.onSettingsDeserializationFinished((BarcodeArDeserializer) orPut, barcodeArSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerListener
    public void onSettingsDeserializationStarted(NativeBarcodeArDeserializer deserializer, NativeBarcodeArSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeArDeserializer barcodeArDeserializer = (BarcodeArDeserializer) this.f121065c.get();
        if (barcodeArDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeArDeserializer.class), null, deserializer, new i(barcodeArDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeArSettings barcodeArSettings = (BarcodeArSettings) this.proxyCache.require(Reflection.b(NativeBarcodeArSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new j(json));
            this.f121063a.onSettingsDeserializationStarted((BarcodeArDeserializer) orPut, barcodeArSettings, jsonValue);
        }
    }

    public BarcodeArDeserializerListenerReversedAdapter(BarcodeArDeserializerListener _BarcodeArDeserializerListener, BarcodeArDeserializer _BarcodeArDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeArDeserializerListener, "_BarcodeArDeserializerListener");
        Intrinsics.j(_BarcodeArDeserializer, "_BarcodeArDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121063a = _BarcodeArDeserializerListener;
        this.proxyCache = proxyCache;
        this.f121065c = new WeakReference(_BarcodeArDeserializer);
    }
}
