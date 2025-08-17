package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b extends NativeBarcodeCountViewHandler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120850a;

    public b(BarcodeCountView owner) {
        Intrinsics.j(owner, "owner");
        this.f120850a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void clear() {
        BarcodeCountUiPresenter barcodeCountUiPresenter;
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120850a.get();
        if (barcodeCountView == null || (barcodeCountUiPresenter = barcodeCountView.f120835e) == null) {
            return;
        }
        barcodeCountUiPresenter.f();
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void hideClassificationPopupForNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode, NativeBarcodeCountNotInListStatus nativeBarcodeCountNotInListStatus) {
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120850a.get();
        if (barcodeCountView != null) {
            BarcodeCountView.access$hideActionPopup(barcodeCountView, nativeTrackedBarcode);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void setEnableProgressBar(boolean z10) {
        BarcodeCountUiPresenter barcodeCountUiPresenter;
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120850a.get();
        if (barcodeCountView == null || (barcodeCountUiPresenter = barcodeCountView.f120835e) == null) {
            return;
        }
        barcodeCountUiPresenter.d(z10);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void setEnableShutterAnimation(boolean z10) {
        BarcodeCountUiPresenter barcodeCountUiPresenter;
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120850a.get();
        if (barcodeCountView == null || (barcodeCountUiPresenter = barcodeCountView.f120835e) == null) {
            return;
        }
        barcodeCountUiPresenter.e(z10);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void setProgressBarState(int i10, int i11) {
        BarcodeCountUiPresenter barcodeCountUiPresenter;
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120850a.get();
        if (barcodeCountView == null || (barcodeCountUiPresenter = barcodeCountView.f120835e) == null) {
            return;
        }
        barcodeCountUiPresenter.a(i10, i11);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void setShutterDimmed(boolean z10) {
        BarcodeCountUiPresenter barcodeCountUiPresenter;
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120850a.get();
        if (barcodeCountView == null || (barcodeCountUiPresenter = barcodeCountView.f120835e) == null) {
            return;
        }
        barcodeCountUiPresenter.c(!z10);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler
    public final void showClassificationPopupForNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode, NativeBarcodeCountNotInListStatus nativeBarcodeCountNotInListStatus) {
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120850a.get();
        if (barcodeCountView != null) {
            BarcodeCountView.access$showActionPopup(barcodeCountView, nativeTrackedBarcode, nativeBarcodeCountNotInListStatus);
        }
    }
}
