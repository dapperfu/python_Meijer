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

/* loaded from: classes11.dex */
public final class h extends NativeBarcodeFindListener {

    /* renamed from: a, reason: collision with root package name */
    public final InternalBarcodeFindListener f122131a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f122132b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f122133c;

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onItemListUpdatedInternal(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        if (((BarcodeFind) this.f122133c.get()) != null) {
            this.f122131a.c(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onObservationStarted(NativeBarcodeFind mode) {
        Intrinsics.j(mode, "mode");
        BarcodeFind barcodeFind = (BarcodeFind) this.f122133c.get();
        if (barcodeFind != null) {
            Object orPut = this.f122132b.getOrPut(Reflection.b(NativeBarcodeFind.class), null, mode, new d(barcodeFind));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f122131a.a((BarcodeFind) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onObservationStopped(NativeBarcodeFind mode) {
        Intrinsics.j(mode, "mode");
        BarcodeFind barcodeFind = (BarcodeFind) this.f122133c.get();
        if (barcodeFind != null) {
            Object orPut = this.f122132b.getOrPut(Reflection.b(NativeBarcodeFind.class), null, mode, new e(barcodeFind));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f122131a.b((BarcodeFind) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSearchPaused(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        if (((BarcodeFind) this.f122133c.get()) != null) {
            this.f122131a.a(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSearchStarted() {
        if (((BarcodeFind) this.f122133c.get()) != null) {
            this.f122131a.onSearchStarted();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSearchStopped(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        if (((BarcodeFind) this.f122133c.get()) != null) {
            this.f122131a.b(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSessionUpdated(NativeBarcodeFind mode, NativeBarcodeFindSession session, NativeFrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeFind barcodeFind = (BarcodeFind) this.f122133c.get();
        if (barcodeFind != null) {
            Object orPut = this.f122132b.getOrPut(Reflection.b(NativeBarcodeFind.class), null, mode, new f(barcodeFind));
            Intrinsics.i(orPut, "getOrPut(...)");
            FrameData frameData = (FrameData) this.f122132b.getOrPut(Reflection.b(NativeFrameData.class), null, data, new g(data));
            this.f122131a.a((BarcodeFind) orPut, session, frameData);
        }
    }

    public h(InternalBarcodeFindListener _InternalBarcodeFindListener, BarcodeFind _BarcodeFind) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_InternalBarcodeFindListener, "_InternalBarcodeFindListener");
        Intrinsics.j(_BarcodeFind, "_BarcodeFind");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122131a = _InternalBarcodeFindListener;
        this.f122132b = proxyCache;
        this.f122133c = new WeakReference(_BarcodeFind);
    }
}
