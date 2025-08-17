package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class h extends NativeBarcodePickGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickGuidanceHandler f122540a;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void hideLoadingPopup() {
        this.f122540a.a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void setInitialGuidance(boolean z10, String text) {
        Intrinsics.j(text, "text");
        this.f122540a.b(z10, text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void setMoveCloserGuidance(boolean z10, String text) {
        Intrinsics.j(text, "text");
        this.f122540a.a(z10, text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void setTapShutterToPauseGuidance(boolean z10, String text) {
        Intrinsics.j(text, "text");
        this.f122540a.c(z10, text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickGuidanceHandler
    public final void showLoadingPopup(boolean z10) {
        this.f122540a.a(z10);
    }

    public h(BarcodePickGuidanceHandler _BarcodePickGuidanceHandler) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_BarcodePickGuidanceHandler, "_BarcodePickGuidanceHandler");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122540a = _BarcodePickGuidanceHandler;
    }
}
