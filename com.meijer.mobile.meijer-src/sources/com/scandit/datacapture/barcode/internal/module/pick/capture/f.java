package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f implements BarcodePickListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123385a;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode) {
        Intrinsics.j(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode) {
        Intrinsics.j(mode, "mode");
    }

    public f(BarcodePickInternal owner) {
        Intrinsics.j(owner, "owner");
        this.f123385a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, Map requestedData) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(mode, "mode");
        Intrinsics.j(requestedData, "requestedData");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f123385a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f123365e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(mode, requestedData);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode, v session, FrameData data) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f123385a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f123365e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).b(mode, session, data);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, String id2, boolean z10) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(mode, "mode");
        Intrinsics.j(id2, "id");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f123385a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f123365e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(mode, id2, z10);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(TrackedObject trackedObject) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f123385a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f123365e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(trackedObject);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, v session, FrameData frameData) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f123385a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.f123365e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(mode, session, frameData);
        }
    }
}
