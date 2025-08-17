package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import android.os.Handler;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.x;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.AbstractC13141u0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13119j;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13131p;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13133q;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.L;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.X;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class x extends NativeBarcodeCountStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121678a;

    public x(J owner) {
        Intrinsics.j(owner, "owner");
        this.f121678a = new WeakReference(owner);
    }

    public static final void a(x this$0, ArrayList arrayList) {
        t tVar;
        BarcodeCountView barcodeCountView;
        Intrinsics.j(this$0, "this$0");
        J j10 = (J) this$0.f121678a.get();
        if (j10 == null || (tVar = j10.f121633s) == null || (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get()) == null) {
            return;
        }
        BarcodeCountView.access$onBarcodeStatusesLoading(barcodeCountView);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onAbortStatusMode() {
        BarcodeCountView barcodeCountView;
        J j10 = (J) this.f121678a.get();
        if (j10 != null) {
            t tVar = j10.f121633s;
            if (tVar != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get()) != null) {
                barcodeCountView.b();
            }
            j10.f121630p.setStatusModeEnabled$scandit_barcode_capture(false);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onBarcodeStatusesLoading(final ArrayList arrayList) {
        Handler handler;
        J j10 = (J) this.f121678a.get();
        if (j10 == null || (handler = j10.f121638x) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: Lt.d
            @Override // java.lang.Runnable
            public final void run() {
                x.a(this.f18744a, arrayList);
            }
        });
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onBarcodeStatusesReady(ArrayList statusList) {
        J j10;
        t tVar;
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        if (statusList == null || (j10 = (J) this.f121678a.get()) == null || (tVar = j10.f121633s) == null) {
            return;
        }
        Intrinsics.j(statusList, "statusList");
        BarcodeCountView barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get();
        if (barcodeCountView == null || (barcodeIndicatorPresenter = barcodeCountView.f120837g) == null) {
            return;
        }
        barcodeIndicatorPresenter.a(statusList);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onHideLoading() {
        J j10 = (J) this.f121678a.get();
        if (j10 != null) {
            C13133q c13133q = (C13133q) j10.f121621g;
            C13119j onFinished = C13119j.f122021a;
            Intrinsics.j(onFinished, "onFinished");
            c13133q.f122063g.a(new C13131p(c13133q, true, onFinished));
            L.a((X) j10.f121627m, false, "");
            if (j10.f121610A) {
                return;
            }
            AbstractC13141u0.b(j10.f121615a, true);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onShowLoading() {
        J j10 = (J) this.f121678a.get();
        if (j10 != null) {
            C13133q c13133q = (C13133q) j10.f121621g;
            C13119j onFinished = C13119j.f122021a;
            Intrinsics.j(onFinished, "onFinished");
            c13133q.f122063g.a(new C13131p(c13133q, false, onFinished));
            L.a((X) j10.f121627m, true, j10.f121631q);
            AbstractC13141u0.b(j10.f121615a, false);
        }
    }
}
