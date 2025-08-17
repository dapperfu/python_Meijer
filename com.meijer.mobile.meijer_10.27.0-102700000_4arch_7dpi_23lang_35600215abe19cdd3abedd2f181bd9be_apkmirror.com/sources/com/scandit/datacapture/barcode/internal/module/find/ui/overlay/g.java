package com.scandit.datacapture.barcode.internal.module.find.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class g extends NativeBarcodeFindGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeFindGuidanceHandler f122265a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f122266b;

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setAllItemsFound(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f122266b.get()) != null) {
            this.f122265a.f(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setInitialGuidance(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f122266b.get()) != null) {
            this.f122265a.b(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setItemListUpdated(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f122266b.get()) != null) {
            this.f122265a.c(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setMoveCloserGuidance(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f122266b.get()) != null) {
            this.f122265a.a(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setTapShutterToPause(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f122266b.get()) != null) {
            this.f122265a.e(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setTapShutterToResume(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f122266b.get()) != null) {
            this.f122265a.d(z10, text);
        }
    }

    public g(BarcodeFindGuidanceHandler _BarcodeFindGuidanceHandler, BarcodeFindBasicOverlay _BarcodeFindBasicOverlay) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_BarcodeFindGuidanceHandler, "_BarcodeFindGuidanceHandler");
        Intrinsics.j(_BarcodeFindBasicOverlay, "_BarcodeFindBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122265a = _BarcodeFindGuidanceHandler;
        this.f122266b = new WeakReference(_BarcodeFindBasicOverlay);
    }
}
