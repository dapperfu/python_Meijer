package com.scandit.datacapture.barcode.find.serialization;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings;
import com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerProxy;", "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/NativeBarcodeFindDeserializer;", "_NativeBarcodeFindDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/find/serialization/NativeBarcodeFindDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/find/serialization/NativeBarcodeFindDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "", "json", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "_modeFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "mode", "_updateModeFromJson", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "settings", "_updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/find/serialization/BarcodeFindDeserializerHelper;", "_helper", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeFindDeserializerProxyAdapter implements BarcodeFindDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeFindDeserializer f120968a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureModeDeserializer f120970c;

    public BarcodeFindDeserializerProxyAdapter(NativeBarcodeFindDeserializer _NativeBarcodeFindDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeFindDeserializer, "_NativeBarcodeFindDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120968a = _NativeBarcodeFindDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeFindDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.i(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "asDataCaptureModeDeserializer(...)");
        this.f120970c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeFindDeserializer getF120968a() {
        return this.f120968a;
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getF123616c() {
        return this.f120970c;
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    public BarcodeFind _modeFromJson(String json) {
        Intrinsics.j(json, "json");
        NativeBarcodeFind nativeBarcodeFindBarcodeFindFromJson = this.f120968a.barcodeFindFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeFind.class);
        Intrinsics.g(nativeBarcodeFindBarcodeFindFromJson);
        return (BarcodeFind) proxyCache.require(kClassB, null, nativeBarcodeFindBarcodeFindFromJson);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    public BarcodeFindSettings _settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        NativeBarcodeFindSettings nativeBarcodeFindSettings = this.f120968a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeFindSettings.class);
        Intrinsics.g(nativeBarcodeFindSettings);
        return (BarcodeFindSettings) proxyCache.require(kClassB, null, nativeBarcodeFindSettings);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    public BarcodeFind _updateModeFromJson(BarcodeFind mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        NativeBarcodeFind nativeBarcodeFind_impl = mode.getF120952a();
        this.proxyCache.put(Reflection.b(NativeBarcodeFind.class), null, nativeBarcodeFind_impl, mode);
        NativeBarcodeFind nativeBarcodeFindUpdateBarcodeFindFromJson = this.f120968a.updateBarcodeFindFromJson(nativeBarcodeFind_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeFind.class);
        Intrinsics.g(nativeBarcodeFindUpdateBarcodeFindFromJson);
        return (BarcodeFind) proxyCache.require(kClassB, null, nativeBarcodeFindUpdateBarcodeFindFromJson);
    }

    @Override // com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializerProxy
    public BarcodeFindSettings _updateSettingsFromJson(BarcodeFindSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        NativeBarcodeFindSettings nativeBarcodeFindSettings_impl = settings.getF120957a();
        this.proxyCache.put(Reflection.b(NativeBarcodeFindSettings.class), null, nativeBarcodeFindSettings_impl, settings);
        NativeBarcodeFindSettings nativeBarcodeFindSettingsUpdateSettingsFromJson = this.f120968a.updateSettingsFromJson(nativeBarcodeFindSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeFindSettings.class);
        Intrinsics.g(nativeBarcodeFindSettingsUpdateSettingsFromJson);
        return (BarcodeFindSettings) proxyCache.require(kClassB, null, nativeBarcodeFindSettingsUpdateSettingsFromJson);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    public BarcodeFindDeserializerHelper get_helper() {
        return (BarcodeFindDeserializerHelper) this.proxyCache.requireByValue(Reflection.b(BarcodeFindDeserializerHelper.class), this.f120968a.getHelper());
    }

    public /* synthetic */ BarcodeFindDeserializerProxyAdapter(NativeBarcodeFindDeserializer nativeBarcodeFindDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFindDeserializer, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
