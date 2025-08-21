package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import android.os.Handler;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.x;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.AbstractC13274u0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13252j;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13264p;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13266q;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.L;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.X;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class x extends NativeBarcodeCountStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f122630a;

    public x(J owner) {
        Intrinsics.j(owner, "owner");
        this.f122630a = new WeakReference(owner);
    }

    public static final void a(x this$0, ArrayList arrayList) {
        t tVar;
        BarcodeCountView barcodeCountView;
        Intrinsics.j(this$0, "this$0");
        J j10 = (J) this$0.f122630a.get();
        if (j10 == null || (tVar = j10.f122585s) == null || (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get()) == null) {
            return;
        }
        BarcodeCountView.access$onBarcodeStatusesLoading(barcodeCountView);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onAbortStatusMode() {
        BarcodeCountView barcodeCountView;
        J j10 = (J) this.f122630a.get();
        if (j10 != null) {
            t tVar = j10.f122585s;
            if (tVar != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get()) != null) {
                barcodeCountView.b();
            }
            j10.f122582p.setStatusModeEnabled$scandit_barcode_capture(false);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onBarcodeStatusesLoading(final ArrayList arrayList) {
        Handler handler;
        J j10 = (J) this.f122630a.get();
        if (j10 == null || (handler = j10.f122590x) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: Lt.d
            @Override // java.lang.Runnable
            public final void run() {
                x.a(this.f19488a, arrayList);
            }
        });
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onBarcodeStatusesReady(ArrayList statusList) {
        J j10;
        t tVar;
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        if (statusList == null || (j10 = (J) this.f122630a.get()) == null || (tVar = j10.f122585s) == null) {
            return;
        }
        Intrinsics.j(statusList, "statusList");
        BarcodeCountView barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get();
        if (barcodeCountView == null || (barcodeIndicatorPresenter = barcodeCountView.f121789g) == null) {
            return;
        }
        barcodeIndicatorPresenter.a(statusList);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onHideLoading() {
        J j10 = (J) this.f122630a.get();
        if (j10 != null) {
            C13266q c13266q = (C13266q) j10.f122573g;
            C13252j onFinished = C13252j.f122973a;
            Intrinsics.j(onFinished, "onFinished");
            c13266q.f123015g.a(new C13264p(c13266q, true, onFinished));
            L.a((X) j10.f122579m, false, "");
            if (j10.f122562A) {
                return;
            }
            AbstractC13274u0.b(j10.f122567a, true);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onShowLoading() {
        J j10 = (J) this.f122630a.get();
        if (j10 != null) {
            C13266q c13266q = (C13266q) j10.f122573g;
            C13252j onFinished = C13252j.f122973a;
            Intrinsics.j(onFinished, "onFinished");
            c13266q.f123015g.a(new C13264p(c13266q, false, onFinished));
            L.a((X) j10.f122579m, true, j10.f122583q);
            AbstractC13274u0.b(j10.f122567a, false);
        }
    }
}
