package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class x extends NativeBarcodePickStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickStatusListenerInternal f122456a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f122457b;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onFreezed() {
        if (((BarcodePick) this.f122457b.get()) != null) {
            this.f122456a.c();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onObservationStarted(NativeBarcodePick barcodePick) {
        Intrinsics.j(barcodePick, "barcodePick");
        if (((BarcodePick) this.f122457b.get()) != null) {
            this.f122456a.onObservationStarted(BarcodeNativeTypeFactory.INSTANCE.convert(barcodePick));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onObservationStopped(NativeBarcodePick barcodePick) {
        Intrinsics.j(barcodePick, "barcodePick");
        if (((BarcodePick) this.f122457b.get()) != null) {
            this.f122456a.onObservationStopped(BarcodeNativeTypeFactory.INSTANCE.convert(barcodePick));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onPaused() {
        if (((BarcodePick) this.f122457b.get()) != null) {
            this.f122456a.d();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onStarted() {
        if (((BarcodePick) this.f122457b.get()) != null) {
            this.f122456a.a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickStatusListener
    public final void onStopped() {
        if (((BarcodePick) this.f122457b.get()) != null) {
            this.f122456a.b();
        }
    }

    public x(com.scandit.datacapture.barcode.pick.capture.a _BarcodePickStatusListenerInternal, BarcodePick _BarcodePick) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_BarcodePickStatusListenerInternal, "_BarcodePickStatusListenerInternal");
        Intrinsics.j(_BarcodePick, "_BarcodePick");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122456a = _BarcodePickStatusListenerInternal;
        this.f122457b = new WeakReference(_BarcodePick);
    }
}
