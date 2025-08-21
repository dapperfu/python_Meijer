package com.scandit.datacapture.barcode.internal.module.ar.capture;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArListener;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSession;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements BarcodeArListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f122011a;

    public b(BarcodeArInternal owner) {
        Intrinsics.j(owner, "owner");
        this.f122011a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
    public final void onSessionUpdated(BarcodeAr barcodeAr, BarcodeArSession session, FrameData frameData) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(barcodeAr, "barcodeAr");
        Intrinsics.j(session, "session");
        Intrinsics.j(frameData, "frameData");
        BarcodeArInternal barcodeArInternal = (BarcodeArInternal) this.f122011a.get();
        if (barcodeArInternal == null || (copyOnWriteArraySet = barcodeArInternal.f122006g) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodeArListener) it.next()).onSessionUpdated(barcodeAr, session, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
    public final void onObservationStarted(BarcodeAr barcodeAr) {
        BarcodeArListener.DefaultImpls.onObservationStarted(this, barcodeAr);
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
    public final void onObservationStopped(BarcodeAr barcodeAr) {
        BarcodeArListener.DefaultImpls.onObservationStopped(this, barcodeAr);
    }
}
