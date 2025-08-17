package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeAr;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerProxy;", "Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializer;", "_NativeBarcodeArDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/NativeBarcodeArDeserializer;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "", "json", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "_modeFromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "mode", "_updateModeFromJson", "(Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "_settingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "settings", "_updateSettingsFromJson", "(Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/BarcodeArDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/BarcodeArDeserializerHelper;", "_helper", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArDeserializerProxyAdapter implements BarcodeArDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeArDeserializer f120114a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureModeDeserializer f120116c;

    public BarcodeArDeserializerProxyAdapter(NativeBarcodeArDeserializer _NativeBarcodeArDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeArDeserializer, "_NativeBarcodeArDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120114a = _NativeBarcodeArDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodeArDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.i(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "asDataCaptureModeDeserializer(...)");
        this.f120116c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeArDeserializer getF120114a() {
        return this.f120114a;
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getF123616c() {
        return this.f120116c;
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    public BarcodeAr _modeFromJson(DataCaptureContext context, String json) {
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        NativeDataCaptureContext nativeDataCaptureContext_impl = context.getF124053a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, context);
        NativeBarcodeAr nativeBarcodeArBarcodeArFromJson = this.f120114a.barcodeArFromJson(nativeDataCaptureContext_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(nativeBarcodeArBarcodeArFromJson);
        return barcodeNativeTypeFactory.convert(nativeBarcodeArBarcodeArFromJson);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    public BarcodeArSettings _settingsFromJson(String json) {
        Intrinsics.j(json, "json");
        NativeBarcodeArSettings nativeBarcodeArSettings = this.f120114a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeArSettings.class);
        Intrinsics.g(nativeBarcodeArSettings);
        return (BarcodeArSettings) proxyCache.require(kClassB, null, nativeBarcodeArSettings);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    public BarcodeAr _updateModeFromJson(BarcodeAr mode, String json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcodeAr nativeBarcodeArUpdateBarcodeArFromJson = this.f120114a.updateBarcodeArFromJson(barcodeNativeTypeFactory.convert(mode), CoreNativeTypeFactory.INSTANCE.convert(json));
        Intrinsics.g(nativeBarcodeArUpdateBarcodeArFromJson);
        return barcodeNativeTypeFactory.convert(nativeBarcodeArUpdateBarcodeArFromJson);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerProxy
    public BarcodeArSettings _updateSettingsFromJson(BarcodeArSettings settings, String json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        NativeBarcodeArSettings f120100a = settings.getF120100a();
        this.proxyCache.put(Reflection.b(NativeBarcodeArSettings.class), null, f120100a, settings);
        NativeBarcodeArSettings nativeBarcodeArSettingsUpdateSettingsFromJson = this.f120114a.updateSettingsFromJson(f120100a, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeBarcodeArSettings.class);
        Intrinsics.g(nativeBarcodeArSettingsUpdateSettingsFromJson);
        return (BarcodeArSettings) proxyCache.require(kClassB, null, nativeBarcodeArSettingsUpdateSettingsFromJson);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer
    public BarcodeArDeserializerHelper get_helper() {
        return (BarcodeArDeserializerHelper) this.proxyCache.requireByValue(Reflection.b(BarcodeArDeserializerHelper.class), this.f120114a.getHelper());
    }

    public /* synthetic */ BarcodeArDeserializerProxyAdapter(NativeBarcodeArDeserializer nativeBarcodeArDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeArDeserializer, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
