package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class d implements BarcodeCountBasicOverlayUiListener {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiListener f120852a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f120853b;

    public d(BarcodeCountView owner, BarcodeCountViewUiListener barcodeCountViewUiListener) {
        Intrinsics.j(owner, "owner");
        this.f120852a = barcodeCountViewUiListener;
        this.f120853b = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener
    public final void onExitButtonTapped(BarcodeCountBasicOverlay overlay) {
        BarcodeCountViewUiListener barcodeCountViewUiListener;
        Intrinsics.j(overlay, "overlay");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120853b.get();
        if (barcodeCountView == null || (barcodeCountViewUiListener = this.f120852a) == null) {
            return;
        }
        barcodeCountViewUiListener.onExitButtonTapped(barcodeCountView);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener
    public final void onListButtonTapped(BarcodeCountBasicOverlay overlay) {
        BarcodeCountViewUiListener barcodeCountViewUiListener;
        Intrinsics.j(overlay, "overlay");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120853b.get();
        if (barcodeCountView == null || (barcodeCountViewUiListener = this.f120852a) == null) {
            return;
        }
        barcodeCountViewUiListener.onListButtonTapped(barcodeCountView);
    }
}
