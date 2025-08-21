package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.selection.capture.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13402c implements BarcodeSelectionListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124760a;

    public C13402c(BarcodeSelection owner) {
        Intrinsics.j(owner, "owner");
        this.f124760a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener
    public final void onSelectionUpdated(BarcodeSelection barcodeSelection, BarcodeSelectionSession session, FrameData frameData) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(barcodeSelection, "barcodeSelection");
        Intrinsics.j(session, "session");
        BarcodeSelection barcodeSelection2 = (BarcodeSelection) this.f124760a.get();
        if (barcodeSelection2 == null || (copyOnWriteArraySet = barcodeSelection2.f124700e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodeSelectionListener) it.next()).onSelectionUpdated(barcodeSelection, session, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener
    public final void onSessionUpdated(BarcodeSelection barcodeSelection, BarcodeSelectionSession session, FrameData frameData) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(barcodeSelection, "barcodeSelection");
        Intrinsics.j(session, "session");
        BarcodeSelection barcodeSelection2 = (BarcodeSelection) this.f124760a.get();
        if (barcodeSelection2 == null || (copyOnWriteArraySet = barcodeSelection2.f124700e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodeSelectionListener) it.next()).onSessionUpdated(barcodeSelection, session, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener
    public final void onObservationStarted(BarcodeSelection barcodeSelection) {
        BarcodeSelectionListener.DefaultImpls.onObservationStarted(this, barcodeSelection);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionListener
    public final void onObservationStopped(BarcodeSelection barcodeSelection) {
        BarcodeSelectionListener.DefaultImpls.onObservationStopped(this, barcodeSelection);
    }
}
