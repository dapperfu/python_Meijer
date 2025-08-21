package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes12.dex */
public final class h extends NativeBarcodeFindListener {

    /* renamed from: a, reason: collision with root package name */
    public final InternalBarcodeFindListener f123083a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f123084b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f123085c;

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onItemListUpdatedInternal(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        if (((BarcodeFind) this.f123085c.get()) != null) {
            this.f123083a.c(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onObservationStarted(NativeBarcodeFind mode) {
        Intrinsics.j(mode, "mode");
        BarcodeFind barcodeFind = (BarcodeFind) this.f123085c.get();
        if (barcodeFind != null) {
            Object orPut = this.f123084b.getOrPut(Reflection.b(NativeBarcodeFind.class), null, mode, new d(barcodeFind));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f123083a.a((BarcodeFind) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onObservationStopped(NativeBarcodeFind mode) {
        Intrinsics.j(mode, "mode");
        BarcodeFind barcodeFind = (BarcodeFind) this.f123085c.get();
        if (barcodeFind != null) {
            Object orPut = this.f123084b.getOrPut(Reflection.b(NativeBarcodeFind.class), null, mode, new e(barcodeFind));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f123083a.b((BarcodeFind) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSearchPaused(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        if (((BarcodeFind) this.f123085c.get()) != null) {
            this.f123083a.a(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSearchStarted() {
        if (((BarcodeFind) this.f123085c.get()) != null) {
            this.f123083a.onSearchStarted();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSearchStopped(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        if (((BarcodeFind) this.f123085c.get()) != null) {
            this.f123083a.b(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSessionUpdated(NativeBarcodeFind mode, NativeBarcodeFindSession session, NativeFrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeFind barcodeFind = (BarcodeFind) this.f123085c.get();
        if (barcodeFind != null) {
            Object orPut = this.f123084b.getOrPut(Reflection.b(NativeBarcodeFind.class), null, mode, new f(barcodeFind));
            Intrinsics.i(orPut, "getOrPut(...)");
            FrameData frameData = (FrameData) this.f123084b.getOrPut(Reflection.b(NativeFrameData.class), null, data, new g(data));
            this.f123083a.a((BarcodeFind) orPut, session, frameData);
        }
    }

    public h(InternalBarcodeFindListener _InternalBarcodeFindListener, BarcodeFind _BarcodeFind) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_InternalBarcodeFindListener, "_InternalBarcodeFindListener");
        Intrinsics.j(_BarcodeFind, "_BarcodeFind");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123083a = _InternalBarcodeFindListener;
        this.f123084b = proxyCache;
        this.f123085c = new WeakReference(_BarcodeFind);
    }
}
