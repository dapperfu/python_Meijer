package com.scandit.datacapture.barcode.internal.module.find.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class g extends NativeBarcodeFindGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeFindGuidanceHandler f123217a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f123218b;

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setAllItemsFound(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f123218b.get()) != null) {
            this.f123217a.f(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setInitialGuidance(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f123218b.get()) != null) {
            this.f123217a.b(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setItemListUpdated(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f123218b.get()) != null) {
            this.f123217a.c(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setMoveCloserGuidance(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f123218b.get()) != null) {
            this.f123217a.a(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setTapShutterToPause(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f123218b.get()) != null) {
            this.f123217a.e(z10, text);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindGuidanceHandler
    public final void setTapShutterToResume(boolean z10, String text) {
        Intrinsics.j(text, "text");
        if (((BarcodeFindBasicOverlay) this.f123218b.get()) != null) {
            this.f123217a.d(z10, text);
        }
    }

    public g(BarcodeFindGuidanceHandler _BarcodeFindGuidanceHandler, BarcodeFindBasicOverlay _BarcodeFindBasicOverlay) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_BarcodeFindGuidanceHandler, "_BarcodeFindGuidanceHandler");
        Intrinsics.j(_BarcodeFindBasicOverlay, "_BarcodeFindBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123217a = _BarcodeFindGuidanceHandler;
        this.f123218b = new WeakReference(_BarcodeFindBasicOverlay);
    }
}
