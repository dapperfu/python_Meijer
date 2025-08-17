package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSession;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class d implements com.scandit.datacapture.barcode.pick.capture.BarcodePickListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f122431a;

    public d(BarcodePickInternal owner) {
        Intrinsics.j(owner, "owner");
        this.f122431a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickListener
    public final void onObservationStarted(BarcodePick barcodePick) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(barcodePick, "barcodePick");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122431a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f122416h) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.pick.capture.BarcodePickListener) it.next()).onObservationStarted(barcodePick);
        }
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickListener
    public final void onObservationStopped(BarcodePick barcodePick) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(barcodePick, "barcodePick");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122431a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f122416h) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.pick.capture.BarcodePickListener) it.next()).onObservationStopped(barcodePick);
        }
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickListener
    public final void onSessionUpdated(BarcodePick barcodePick, BarcodePickSession session) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(barcodePick, "barcodePick");
        Intrinsics.j(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f122431a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f122416h) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.scandit.datacapture.barcode.pick.capture.BarcodePickListener) it.next()).onSessionUpdated(barcodePick, session);
        }
    }
}
