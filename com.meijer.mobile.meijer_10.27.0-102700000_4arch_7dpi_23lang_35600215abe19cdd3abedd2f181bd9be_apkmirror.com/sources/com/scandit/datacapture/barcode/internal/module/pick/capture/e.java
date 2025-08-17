package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSession;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e implements BarcodePickScanningListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f122432a;

    public e(BarcodePickInternal owner) {
        Intrinsics.j(owner, "owner");
        this.f122432a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener
    public final void onScanningSessionCompleted(BarcodePick barcodePick, BarcodePickScanningSession session) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(barcodePick, "barcodePick");
        Intrinsics.j(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122432a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f122415g) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickScanningListener) it.next()).onScanningSessionCompleted(barcodePick, session);
        }
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener
    public final void onScanningSessionUpdated(BarcodePick barcodePick, BarcodePickScanningSession session) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(barcodePick, "barcodePick");
        Intrinsics.j(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122432a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f122415g) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickScanningListener) it.next()).onScanningSessionUpdated(barcodePick, session);
        }
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener
    public final void onObservationStarted(BarcodePick barcodePick) {
        BarcodePickScanningListener.DefaultImpls.onObservationStarted(this, barcodePick);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener
    public final void onObservationStopped(BarcodePick barcodePick) {
        BarcodePickScanningListener.DefaultImpls.onObservationStopped(this, barcodePick);
    }
}
