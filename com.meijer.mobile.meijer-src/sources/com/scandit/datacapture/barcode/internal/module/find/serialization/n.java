package com.scandit.datacapture.barcode.internal.module.find.serialization;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializer;
import com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes12.dex */
public final class n extends NativeBarcodeFindDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final e f123099a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f123100b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f123101c;

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerListener
    public final void onModeDeserializationFinished(NativeBarcodeFindDeserializer deserializer, NativeBarcodeFind mode, NativeJsonValue json) {
        BarcodeFindDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.f123101c.get();
        if (barcodeFindDeserializer != null) {
            Object orPut = this.f123100b.getOrPut(Reflection.b(NativeBarcodeFindDeserializer.class), null, deserializer, new f(barcodeFindDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeFindDeserializer deserializer2 = (BarcodeFindDeserializer) orPut;
            BarcodeFind mode2 = (BarcodeFind) this.f123100b.require(Reflection.b(NativeBarcodeFind.class), null, mode);
            JsonValue json2 = (JsonValue) this.f123100b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new g(json));
            com.scandit.datacapture.barcode.find.serialization.b bVar = (com.scandit.datacapture.barcode.find.serialization.b) this.f123099a;
            bVar.getClass();
            Intrinsics.j(deserializer2, "deserializer");
            Intrinsics.j(mode2, "mode");
            Intrinsics.j(json2, "json");
            BarcodeFindDeserializer barcodeFindDeserializer2 = (BarcodeFindDeserializer) bVar.f121925a.get();
            if (barcodeFindDeserializer2 == null || (listener = barcodeFindDeserializer2.getListener()) == null) {
                return;
            }
            listener.onModeDeserializationFinished(deserializer2, mode2, json2);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerListener
    public final void onModeDeserializationStarted(NativeBarcodeFindDeserializer deserializer, NativeBarcodeFind mode, NativeJsonValue json) {
        BarcodeFindDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.f123101c.get();
        if (barcodeFindDeserializer != null) {
            Object orPut = this.f123100b.getOrPut(Reflection.b(NativeBarcodeFindDeserializer.class), null, deserializer, new h(barcodeFindDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeFindDeserializer deserializer2 = (BarcodeFindDeserializer) orPut;
            BarcodeFind mode2 = (BarcodeFind) this.f123100b.require(Reflection.b(NativeBarcodeFind.class), null, mode);
            JsonValue json2 = (JsonValue) this.f123100b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new i(json));
            com.scandit.datacapture.barcode.find.serialization.b bVar = (com.scandit.datacapture.barcode.find.serialization.b) this.f123099a;
            bVar.getClass();
            Intrinsics.j(deserializer2, "deserializer");
            Intrinsics.j(mode2, "mode");
            Intrinsics.j(json2, "json");
            BarcodeFindDeserializer barcodeFindDeserializer2 = (BarcodeFindDeserializer) bVar.f121925a.get();
            if (barcodeFindDeserializer2 == null || (listener = barcodeFindDeserializer2.getListener()) == null) {
                return;
            }
            listener.onModeDeserializationStarted(deserializer2, mode2, json2);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerListener
    public final void onSettingsDeserializationFinished(NativeBarcodeFindDeserializer deserializer, NativeBarcodeFindSettings settings, NativeJsonValue json) {
        BarcodeFindDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.f123101c.get();
        if (barcodeFindDeserializer != null) {
            Object orPut = this.f123100b.getOrPut(Reflection.b(NativeBarcodeFindDeserializer.class), null, deserializer, new j(barcodeFindDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeFindDeserializer deserializer2 = (BarcodeFindDeserializer) orPut;
            BarcodeFindSettings settings2 = (BarcodeFindSettings) this.f123100b.require(Reflection.b(NativeBarcodeFindSettings.class), null, settings);
            JsonValue json2 = (JsonValue) this.f123100b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new k(json));
            com.scandit.datacapture.barcode.find.serialization.b bVar = (com.scandit.datacapture.barcode.find.serialization.b) this.f123099a;
            bVar.getClass();
            Intrinsics.j(deserializer2, "deserializer");
            Intrinsics.j(settings2, "settings");
            Intrinsics.j(json2, "json");
            BarcodeFindDeserializer barcodeFindDeserializer2 = (BarcodeFindDeserializer) bVar.f121925a.get();
            if (barcodeFindDeserializer2 == null || (listener = barcodeFindDeserializer2.getListener()) == null) {
                return;
            }
            listener.onSettingsDeserializationFinished(deserializer2, settings2, json2);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerListener
    public final void onSettingsDeserializationStarted(NativeBarcodeFindDeserializer deserializer, NativeBarcodeFindSettings settings, NativeJsonValue json) {
        BarcodeFindDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.f123101c.get();
        if (barcodeFindDeserializer != null) {
            Object orPut = this.f123100b.getOrPut(Reflection.b(NativeBarcodeFindDeserializer.class), null, deserializer, new l(barcodeFindDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeFindDeserializer deserializer2 = (BarcodeFindDeserializer) orPut;
            BarcodeFindSettings settings2 = (BarcodeFindSettings) this.f123100b.require(Reflection.b(NativeBarcodeFindSettings.class), null, settings);
            JsonValue json2 = (JsonValue) this.f123100b.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new m(json));
            com.scandit.datacapture.barcode.find.serialization.b bVar = (com.scandit.datacapture.barcode.find.serialization.b) this.f123099a;
            bVar.getClass();
            Intrinsics.j(deserializer2, "deserializer");
            Intrinsics.j(settings2, "settings");
            Intrinsics.j(json2, "json");
            BarcodeFindDeserializer barcodeFindDeserializer2 = (BarcodeFindDeserializer) bVar.f121925a.get();
            if (barcodeFindDeserializer2 == null || (listener = barcodeFindDeserializer2.getListener()) == null) {
                return;
            }
            listener.onSettingsDeserializationStarted(deserializer2, settings2, json2);
        }
    }

    public n(com.scandit.datacapture.barcode.find.serialization.b _BarcodeFindDeserializerInternalListener, BarcodeFindDeserializer _BarcodeFindDeserializer) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_BarcodeFindDeserializerInternalListener, "_BarcodeFindDeserializerInternalListener");
        Intrinsics.j(_BarcodeFindDeserializer, "_BarcodeFindDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123099a = _BarcodeFindDeserializerInternalListener;
        this.f123100b = proxyCache;
        this.f123101c = new WeakReference(_BarcodeFindDeserializer);
    }
}
