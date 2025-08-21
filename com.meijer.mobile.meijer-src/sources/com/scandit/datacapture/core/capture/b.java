package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.capture.DataCaptureContextListener;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.source.FrameSource;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements DataCaptureContextListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125012a;

    public b(DataCaptureContext owner) {
        Intrinsics.j(owner, "owner");
        this.f125012a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onFrameSourceChanged(DataCaptureContext dataCaptureContext, FrameSource frameSource) {
        CopyOnWriteArraySet<DataCaptureContextListener> listeners$scandit_capture_core;
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        DataCaptureContext dataCaptureContext2 = (DataCaptureContext) this.f125012a.get();
        if (dataCaptureContext2 == null || (listeners$scandit_capture_core = dataCaptureContext2.getListeners$scandit_capture_core()) == null) {
            return;
        }
        Iterator<T> it = listeners$scandit_capture_core.iterator();
        while (it.hasNext()) {
            ((DataCaptureContextListener) it.next()).onFrameSourceChanged(dataCaptureContext, frameSource);
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onModeAdded(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
        CopyOnWriteArraySet<DataCaptureContextListener> listeners$scandit_capture_core;
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(dataCaptureMode, "dataCaptureMode");
        DataCaptureContext dataCaptureContext2 = (DataCaptureContext) this.f125012a.get();
        if (dataCaptureContext2 == null || (listeners$scandit_capture_core = dataCaptureContext2.getListeners$scandit_capture_core()) == null) {
            return;
        }
        Iterator<T> it = listeners$scandit_capture_core.iterator();
        while (it.hasNext()) {
            ((DataCaptureContextListener) it.next()).onModeAdded(dataCaptureContext, dataCaptureMode);
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onModeRemoved(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
        CopyOnWriteArraySet<DataCaptureContextListener> listeners$scandit_capture_core;
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(dataCaptureMode, "dataCaptureMode");
        DataCaptureContext dataCaptureContext2 = (DataCaptureContext) this.f125012a.get();
        if (dataCaptureContext2 == null || (listeners$scandit_capture_core = dataCaptureContext2.getListeners$scandit_capture_core()) == null) {
            return;
        }
        Iterator<T> it = listeners$scandit_capture_core.iterator();
        while (it.hasNext()) {
            ((DataCaptureContextListener) it.next()).onModeRemoved(dataCaptureContext, dataCaptureMode);
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onObservationStarted(DataCaptureContext dataCaptureContext) {
        List listJ1;
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        DataCaptureContext dataCaptureContext2 = (DataCaptureContext) this.f125012a.get();
        if (dataCaptureContext2 != null) {
            synchronized (dataCaptureContext2.f124987e) {
                dataCaptureContext2.f124988f = true;
                listJ1 = CollectionsKt.j1(dataCaptureContext2.getListeners$scandit_capture_core());
            }
            Iterator it = listJ1.iterator();
            while (it.hasNext()) {
                ((DataCaptureContextListener) it.next()).onObservationStarted(dataCaptureContext);
            }
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onStatusChanged(DataCaptureContext dataCaptureContext, ContextStatus contextStatus) {
        CopyOnWriteArraySet<DataCaptureContextListener> listeners$scandit_capture_core;
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(contextStatus, "contextStatus");
        DataCaptureContext dataCaptureContext2 = (DataCaptureContext) this.f125012a.get();
        if (dataCaptureContext2 == null || (listeners$scandit_capture_core = dataCaptureContext2.getListeners$scandit_capture_core()) == null) {
            return;
        }
        Iterator<T> it = listeners$scandit_capture_core.iterator();
        while (it.hasNext()) {
            ((DataCaptureContextListener) it.next()).onStatusChanged(dataCaptureContext, contextStatus);
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onObservationStopped(DataCaptureContext dataCaptureContext) {
        DataCaptureContextListener.DefaultImpls.onObservationStopped(this, dataCaptureContext);
    }
}
