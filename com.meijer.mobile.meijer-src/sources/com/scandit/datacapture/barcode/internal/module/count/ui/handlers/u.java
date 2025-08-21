package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13265p0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13272t0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13283z;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13259m0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.P0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.Z0;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class u implements InternalBarcodeCountListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f122627a;

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(InternalBarcodeCountSession session, TrackedBarcode trackedBarcode) {
        Intrinsics.j(session, "session");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
    }

    public u(J owner) {
        Intrinsics.j(owner, "owner");
        this.f122627a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(BarcodeCount mode, InternalBarcodeCountSession session, FrameData data) {
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        J j10 = (J) this.f122627a.get();
        if (j10 == null || session.c()) {
            return;
        }
        InterfaceC13259m0 interfaceC13259m0 = j10.f122572f;
        boolean z10 = session.k() > 0;
        C13272t0 c13272t0 = (C13272t0) interfaceC13259m0;
        c13272t0.f123027c = z10;
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c cVar = c13272t0.f123029e;
        if (cVar != null) {
            ViewExtensionsKt.runOnMainThread(cVar, new C13265p0(z10));
        }
        if (!j10.f122587u) {
            com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.A a10 = j10.f122568b;
            C13283z onFinished = C13283z.f123065a;
            com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F f10 = (com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) a10;
            f10.getClass();
            Intrinsics.j(session, "session");
            Intrinsics.j(onFinished, "onFinished");
            f10.a(session.k(), onFinished);
        }
        if (j10.f122591y.x() && !j10.f122563B) {
            P0.b((Z0) j10.f122575i, !session.d().isEmpty());
        }
        t tVar = j10.f122585s;
        if (tVar != null) {
            Intrinsics.j(session, "session");
            BarcodeCountView barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get();
            if (barcodeCountView == null || (barcodeIndicatorPresenter = barcodeCountView.f121789g) == null) {
                return;
            }
            barcodeIndicatorPresenter.a(session.b(), session.i(), session.l(), session.h(), session.g());
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void b(BarcodeCount mode, InternalBarcodeCountSession session, FrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        J j10 = (J) this.f122627a.get();
        if (j10 != null) {
            j10.f122563B = false;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void onObservationStarted(BarcodeCount mode) {
        Intrinsics.j(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void onObservationStopped(BarcodeCount mode) {
        Intrinsics.j(mode, "mode");
    }
}
