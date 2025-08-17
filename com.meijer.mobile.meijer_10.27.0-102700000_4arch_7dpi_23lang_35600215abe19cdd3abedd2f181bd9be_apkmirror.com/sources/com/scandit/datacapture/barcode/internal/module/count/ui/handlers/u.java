package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13132p0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13139t0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13150z;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13126m0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.P0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.Z0;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class u implements InternalBarcodeCountListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121675a;

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(InternalBarcodeCountSession session, TrackedBarcode trackedBarcode) {
        Intrinsics.j(session, "session");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
    }

    public u(J owner) {
        Intrinsics.j(owner, "owner");
        this.f121675a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(BarcodeCount mode, InternalBarcodeCountSession session, FrameData data) {
        BarcodeIndicatorPresenter barcodeIndicatorPresenter;
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        J j10 = (J) this.f121675a.get();
        if (j10 == null || session.c()) {
            return;
        }
        InterfaceC13126m0 interfaceC13126m0 = j10.f121620f;
        boolean z10 = session.k() > 0;
        C13139t0 c13139t0 = (C13139t0) interfaceC13126m0;
        c13139t0.f122075c = z10;
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c cVar = c13139t0.f122077e;
        if (cVar != null) {
            ViewExtensionsKt.runOnMainThread(cVar, new C13132p0(z10));
        }
        if (!j10.f121635u) {
            com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.A a10 = j10.f121616b;
            C13150z onFinished = C13150z.f122113a;
            com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F f10 = (com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) a10;
            f10.getClass();
            Intrinsics.j(session, "session");
            Intrinsics.j(onFinished, "onFinished");
            f10.a(session.k(), onFinished);
        }
        if (j10.f121639y.x() && !j10.f121611B) {
            P0.b((Z0) j10.f121623i, !session.d().isEmpty());
        }
        t tVar = j10.f121633s;
        if (tVar != null) {
            Intrinsics.j(session, "session");
            BarcodeCountView barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get();
            if (barcodeCountView == null || (barcodeIndicatorPresenter = barcodeCountView.f120837g) == null) {
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
        J j10 = (J) this.f121675a.get();
        if (j10 != null) {
            j10.f121611B = false;
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
