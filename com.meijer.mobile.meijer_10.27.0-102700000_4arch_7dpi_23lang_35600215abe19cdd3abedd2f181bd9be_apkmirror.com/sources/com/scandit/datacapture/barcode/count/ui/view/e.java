package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.capture.BarcodeCountFeedbackChangeListener;
import com.scandit.datacapture.barcode.count.feedback.BarcodeCountFeedback;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e implements BarcodeCountFeedbackChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120854a;

    public e(BarcodeCountView owner) {
        Intrinsics.j(owner, "owner");
        this.f120854a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountFeedbackChangeListener
    public final void feedbackChanged(BarcodeCountFeedback feedback) {
        BarcodeCountUiPresenter barcodeCountUiPresenter;
        Intrinsics.j(feedback, "feedback");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120854a.get();
        if (barcodeCountView == null || (barcodeCountUiPresenter = barcodeCountView.f120835e) == null) {
            return;
        }
        barcodeCountUiPresenter.a(feedback);
    }
}
