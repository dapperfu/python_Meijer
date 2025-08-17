package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureList;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements BarcodeCountCaptureListListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120849a;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f120849a
            java.lang.Object r0 = r0.get()
            com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView r0 = (com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView) r0
            if (r0 == 0) goto L20
            java.lang.ref.WeakReference r0 = com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView.access$getMode$p(r0)
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.get()
            com.scandit.datacapture.barcode.count.capture.BarcodeCount r0 = (com.scandit.datacapture.barcode.count.capture.BarcodeCount) r0
            if (r0 == 0) goto L20
            boolean r0 = r0._shouldDisableModeWhenCaptureListCompleted()
            r1 = 1
            if (r0 != r1) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            java.lang.ref.WeakReference r0 = r4.f120849a
            java.lang.Object r0 = r0.get()
            com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView r0 = (com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView) r0
            if (r0 == 0) goto L39
            android.os.Handler r2 = com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView.access$getMainHandler$p(r0)
            com.scandit.datacapture.barcode.count.ui.view.r r3 = new com.scandit.datacapture.barcode.count.ui.view.r
            r3.<init>()
            r0 = 300(0x12c, double:1.48E-321)
            r2.postDelayed(r3, r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.count.ui.view.a.a():void");
    }

    public a(BarcodeCountView owner) {
        Intrinsics.j(owner, "owner");
        this.f120849a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener
    public final void onCaptureListCompleted(BarcodeCountCaptureList list, BarcodeCountCaptureListSession session) {
        Intrinsics.j(list, "list");
        Intrinsics.j(session, "session");
        a();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener
    public final void onCaptureListSessionUpdated(BarcodeCountCaptureList list, BarcodeCountCaptureListSession session) {
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        Intrinsics.j(list, "list");
        Intrinsics.j(session, "session");
        onObservationStarted(list);
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120849a.get();
        if (barcodeCountView == null || (barcodeIndicatorPresenter = barcodeCountView.f120837g) == null) {
            return;
        }
        barcodeIndicatorPresenter.a(session);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener
    public final void onObservationStarted(BarcodeCountCaptureList list) {
        Intrinsics.j(list, "list");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120849a.get();
        if (barcodeCountView == null || barcodeCountView.f120845o) {
            return;
        }
        BarcodeCountView.access$setListUiEnabled(barcodeCountView, true, list.getTargetBarcodesQuantity$scandit_barcode_capture());
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener
    public final void onObservationStopped(BarcodeCountCaptureList list) {
        Intrinsics.j(list, "list");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120849a.get();
        if (barcodeCountView == null || !barcodeCountView.f120845o) {
            return;
        }
        BarcodeCountView.access$setListUiEnabled(barcodeCountView, false, list.getTargetBarcodesQuantity$scandit_barcode_capture());
    }

    public static final void a(BarcodeCountView owner, boolean z10) {
        Intrinsics.j(owner, "$owner");
        BarcodeCountViewListener listener = owner.getListener();
        if (listener != null) {
            listener.onCaptureListCompleted(owner);
        }
        if (z10) {
            owner.disableScanningAndResetBarcodeIndicators$scandit_barcode_capture();
        }
    }
}
