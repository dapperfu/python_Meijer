package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import android.os.Handler;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.v;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class v implements com.scandit.datacapture.barcode.internal.module.count.ui.cluster.r {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121676a;

    public final void a(final int i10) {
        Handler handler;
        J j10 = (J) this.f121676a.get();
        if (j10 == null || (handler = j10.f121638x) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: Lt.c
            @Override // java.lang.Runnable
            public final void run() {
                v.a(this.f18742a, i10);
            }
        });
    }

    public v(J owner) {
        Intrinsics.j(owner, "owner");
        this.f121676a = new WeakReference(owner);
    }

    public static final void a(v this$0, int i10) {
        t tVar;
        BarcodeCountView barcodeCountView;
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        Intrinsics.j(this$0, "this$0");
        J j10 = (J) this$0.f121676a.get();
        if (j10 == null || (tVar = j10.f121633s) == null || (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get()) == null || (barcodeIndicatorPresenter = barcodeCountView.f120837g) == null) {
            return;
        }
        barcodeIndicatorPresenter.a(i10);
    }
}
