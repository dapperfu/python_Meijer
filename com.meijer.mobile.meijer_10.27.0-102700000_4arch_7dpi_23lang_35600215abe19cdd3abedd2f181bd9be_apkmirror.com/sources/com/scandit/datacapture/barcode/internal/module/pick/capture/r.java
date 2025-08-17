package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes11.dex */
public final class r extends NativeBarcodePickListener {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickListener f122445a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f122446b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f122447c;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onItemResponseReceived(NativeBarcodePick mode, String id2, boolean z10) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(id2, "id");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122447c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.f122446b.getOrPut(Reflection.b(NativeBarcodePick.class), null, mode, new h(barcodePickInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f122445a.a((BarcodePickInternal) orPut, id2, z10);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onObservationStarted(NativeBarcodePick mode) {
        Intrinsics.j(mode, "mode");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122447c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.f122446b.getOrPut(Reflection.b(NativeBarcodePick.class), null, mode, new i(barcodePickInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f122445a.a((BarcodePickInternal) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onObservationStopped(NativeBarcodePick mode) {
        Intrinsics.j(mode, "mode");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122447c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.f122446b.getOrPut(Reflection.b(NativeBarcodePick.class), null, mode, new j(barcodePickInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f122445a.b((BarcodePickInternal) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onPickUpdated(NativeBarcodePick mode, NativeBarcodePickSession session, NativeFrameData nativeFrameData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122447c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.f122446b.getOrPut(Reflection.b(NativeBarcodePick.class), null, mode, new l(barcodePickInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f122445a.a((BarcodePickInternal) orPut, (v) this.f122446b.getOrPut(Reflection.b(NativeBarcodePickSession.class), null, session, new m(barcodePickInternal)), nativeFrameData != null ? (FrameData) this.f122446b.getOrPut(Reflection.b(NativeFrameData.class), null, nativeFrameData, new k(nativeFrameData)) : null);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onSessionUpdated(NativeBarcodePick mode, NativeBarcodePickSession session, NativeFrameData frameData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(frameData, "frameData");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122447c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.f122446b.getOrPut(Reflection.b(NativeBarcodePick.class), null, mode, new o(barcodePickInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            v vVar = (v) this.f122446b.getOrPut(Reflection.b(NativeBarcodePickSession.class), null, session, new p(barcodePickInternal));
            FrameData frameData2 = (FrameData) this.f122446b.getOrPut(Reflection.b(NativeFrameData.class), null, frameData, new n(frameData));
            this.f122445a.b((BarcodePickInternal) orPut, vVar, frameData2);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onStyleShouldBeRequested(NativeBarcodePick mode, HashMap requestedData) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(requestedData, "requestedData");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122447c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.f122446b.getOrPut(Reflection.b(NativeBarcodePick.class), null, mode, new q(barcodePickInternal));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f122445a.a((BarcodePickInternal) orPut, requestedData);
        }
    }

    public r(f barcodePickListener, BarcodePickInternal mode) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(barcodePickListener, "barcodePickListener");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122445a = barcodePickListener;
        this.f122446b = proxyCache;
        this.f122447c = new WeakReference(mode);
    }
}
