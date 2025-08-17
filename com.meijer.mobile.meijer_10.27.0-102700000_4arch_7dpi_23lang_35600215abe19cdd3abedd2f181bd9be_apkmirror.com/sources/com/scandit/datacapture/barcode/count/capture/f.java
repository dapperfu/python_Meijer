package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.data.Cluster;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSessionCallback;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f implements InternalBarcodeCountListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120636a;

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(InternalBarcodeCountSession session, TrackedBarcode trackedBarcode) {
        Intrinsics.j(session, "session");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
    }

    public f(BarcodeCount owner) {
        Intrinsics.j(owner, "owner");
        this.f120636a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(BarcodeCount mode, InternalBarcodeCountSession session, FrameData data) {
        CopyOnWriteArrayList<BarcodeCountListener> listeners$scandit_barcode_capture;
        CopyOnWriteArrayList<InternalBarcodeCountListener> internalListeners$scandit_barcode_capture;
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeCount barcodeCount = (BarcodeCount) this.f120636a.get();
        if (barcodeCount != null && (internalListeners$scandit_barcode_capture = barcodeCount.getInternalListeners$scandit_barcode_capture()) != null) {
            Iterator<T> it = internalListeners$scandit_barcode_capture.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeCountListener) it.next()).a(mode, session, data);
            }
        }
        BarcodeCount barcodeCount2 = (BarcodeCount) this.f120636a.get();
        if (barcodeCount2 == null || (listeners$scandit_barcode_capture = barcodeCount2.getListeners$scandit_barcode_capture()) == null) {
            return;
        }
        BarcodeCountSession barcodeCountSessionA = a(session);
        Iterator<T> it2 = listeners$scandit_barcode_capture.iterator();
        while (it2.hasNext()) {
            ((BarcodeCountListener) it2.next()).onSessionUpdated(mode, barcodeCountSessionA, data);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void b(BarcodeCount mode, InternalBarcodeCountSession session, FrameData data) {
        CopyOnWriteArrayList<BarcodeCountListener> listeners$scandit_barcode_capture;
        CopyOnWriteArrayList<InternalBarcodeCountListener> internalListeners$scandit_barcode_capture;
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeCount barcodeCount = (BarcodeCount) this.f120636a.get();
        if (barcodeCount != null && (internalListeners$scandit_barcode_capture = barcodeCount.getInternalListeners$scandit_barcode_capture()) != null) {
            Iterator<T> it = internalListeners$scandit_barcode_capture.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeCountListener) it.next()).b(mode, session, data);
            }
        }
        BarcodeCount barcodeCount2 = (BarcodeCount) this.f120636a.get();
        if (barcodeCount2 == null || (listeners$scandit_barcode_capture = barcodeCount2.getListeners$scandit_barcode_capture()) == null) {
            return;
        }
        BarcodeCountSession barcodeCountSessionA = a(session);
        Iterator<T> it2 = listeners$scandit_barcode_capture.iterator();
        while (it2.hasNext()) {
            ((BarcodeCountListener) it2.next()).onScan(mode, barcodeCountSessionA, data);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void onObservationStarted(BarcodeCount mode) {
        CopyOnWriteArrayList<BarcodeCountListener> listeners$scandit_barcode_capture;
        CopyOnWriteArrayList<InternalBarcodeCountListener> internalListeners$scandit_barcode_capture;
        Intrinsics.j(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f120636a.get();
        if (barcodeCount != null && (internalListeners$scandit_barcode_capture = barcodeCount.getInternalListeners$scandit_barcode_capture()) != null) {
            Iterator<T> it = internalListeners$scandit_barcode_capture.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeCountListener) it.next()).onObservationStarted(mode);
            }
        }
        BarcodeCount barcodeCount2 = (BarcodeCount) this.f120636a.get();
        if (barcodeCount2 == null || (listeners$scandit_barcode_capture = barcodeCount2.getListeners$scandit_barcode_capture()) == null) {
            return;
        }
        Iterator<T> it2 = listeners$scandit_barcode_capture.iterator();
        while (it2.hasNext()) {
            ((BarcodeCountListener) it2.next()).onObservationStarted(mode);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void onObservationStopped(BarcodeCount mode) {
        CopyOnWriteArrayList<BarcodeCountListener> listeners$scandit_barcode_capture;
        CopyOnWriteArrayList<InternalBarcodeCountListener> internalListeners$scandit_barcode_capture;
        Intrinsics.j(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f120636a.get();
        if (barcodeCount != null && (internalListeners$scandit_barcode_capture = barcodeCount.getInternalListeners$scandit_barcode_capture()) != null) {
            Iterator<T> it = internalListeners$scandit_barcode_capture.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeCountListener) it.next()).onObservationStopped(mode);
            }
        }
        BarcodeCount barcodeCount2 = (BarcodeCount) this.f120636a.get();
        if (barcodeCount2 == null || (listeners$scandit_barcode_capture = barcodeCount2.getListeners$scandit_barcode_capture()) == null) {
            return;
        }
        Iterator<T> it2 = listeners$scandit_barcode_capture.iterator();
        while (it2.hasNext()) {
            ((BarcodeCountListener) it2.next()).onObservationStopped(mode);
        }
    }

    public static BarcodeCountSession a(InternalBarcodeCountSession internalBarcodeCountSession) {
        List listP0 = CollectionsKt.P0(internalBarcodeCountSession.i(), internalBarcodeCountSession.f().values());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listP0, 10));
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            arrayList.add(((TrackedBarcode) it.next()).getBarcode());
        }
        ArrayList<NativeCluster> clusters = internalBarcodeCountSession.a().getClusters();
        Intrinsics.i(clusters, "getClusters(...)");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(clusters, 10));
        for (NativeCluster nativeCluster : clusters) {
            Intrinsics.g(nativeCluster);
            arrayList2.add(new Cluster(nativeCluster));
        }
        return new BarcodeCountSession(arrayList, arrayList2, internalBarcodeCountSession.e(), internalBarcodeCountSession.b(), internalBarcodeCountSession.j(), new InternalBarcodeCountSessionCallback(new c(internalBarcodeCountSession), new d(internalBarcodeCountSession), new e(internalBarcodeCountSession)));
    }
}
