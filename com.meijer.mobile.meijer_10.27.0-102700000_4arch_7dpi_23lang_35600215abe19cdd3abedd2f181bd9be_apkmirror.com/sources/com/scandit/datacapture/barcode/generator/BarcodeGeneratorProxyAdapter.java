package com.scandit.datacapture.barcode.generator;

import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGenerator;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorProxyAdapter;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorProxy;", "Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;", "_NativeBarcodeGenerator", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;", "Lcom/scandit/datacapture/core/internal/sdk/component/NativeDataCaptureComponent;", "_dataCaptureComponentImpl", "()Lcom/scandit/datacapture/core/internal/sdk/component/NativeDataCaptureComponent;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "getId", "()Ljava/lang/String;", PreferencesHelper.PREF_ID, "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeGeneratorProxyAdapter implements BarcodeGeneratorProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeGenerator f121031a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureComponent f121033c;

    public BarcodeGeneratorProxyAdapter(NativeBarcodeGenerator _NativeBarcodeGenerator, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeGenerator, "_NativeBarcodeGenerator");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121031a = _NativeBarcodeGenerator;
        this.proxyCache = proxyCache;
        NativeDataCaptureComponent nativeDataCaptureComponentAsDataCaptureComponent = _NativeBarcodeGenerator.asDataCaptureComponent();
        Intrinsics.i(nativeDataCaptureComponentAsDataCaptureComponent, "asDataCaptureComponent(...)");
        this.f121033c = nativeDataCaptureComponentAsDataCaptureComponent;
    }

    @Override // com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    /* renamed from: _dataCaptureComponentImpl, reason: from getter */
    public NativeDataCaptureComponent getF121033c() {
        return this.f121033c;
    }

    @Override // com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeGenerator getF121031a() {
        return this.f121031a;
    }

    @Override // com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    public String getId() {
        String identifier = this.f121031a.getIdentifier();
        Intrinsics.g(identifier);
        return identifier;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodeGeneratorProxyAdapter(NativeBarcodeGenerator nativeBarcodeGenerator, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeGenerator, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
