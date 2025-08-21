package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayCallback;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class g implements BarcodeCountBasicOverlayCallback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121808a;

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayCallback
    public final void cleanUpOverlayViews() {
    }

    public g(BarcodeCountView owner) {
        Intrinsics.j(owner, "owner");
        this.f121808a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayCallback
    public final void onDataCaptureViewSizeChanged() {
        WeakReference weakReference;
        BarcodeCount barcodeCount;
        NativeBarcodeCountSession session;
        BarcodeCountView barcodeCountView;
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        BarcodeCountView barcodeCountView2 = (BarcodeCountView) this.f121808a.get();
        if (barcodeCountView2 == null || (weakReference = barcodeCountView2.f121794l) == null || (barcodeCount = (BarcodeCount) weakReference.get()) == null || (session = barcodeCount.getF121563a().getSession()) == null) {
            return;
        }
        InternalBarcodeCountSession internalBarcodeCountSession = new InternalBarcodeCountSession(new f(session));
        if (internalBarcodeCountSession.c() || (barcodeCountView = (BarcodeCountView) this.f121808a.get()) == null || (barcodeIndicatorPresenter = barcodeCountView.f121789g) == null) {
            return;
        }
        barcodeIndicatorPresenter.a(internalBarcodeCountSession.b(), internalBarcodeCountSession.i(), internalBarcodeCountSession.l(), internalBarcodeCountSession.h(), internalBarcodeCountSession.g());
    }
}
