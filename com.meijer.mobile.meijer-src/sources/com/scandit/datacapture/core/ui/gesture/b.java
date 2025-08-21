package com.scandit.datacapture.core.ui.gesture;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements ZoomGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f127056a;

    public b(SwipeToZoom owner) {
        Intrinsics.j(owner, "owner");
        this.f127056a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGestureListener
    public final void onZoomInGesture(ZoomGesture zoomGesture) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(zoomGesture, "zoomGesture");
        SwipeToZoom swipeToZoom = (SwipeToZoom) this.f127056a.get();
        if (swipeToZoom == null || (copyOnWriteArraySet = swipeToZoom.f127043b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ZoomGestureListener) it.next()).onZoomInGesture(zoomGesture);
        }
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGestureListener
    public final void onZoomOutGesture(ZoomGesture zoomGesture) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(zoomGesture, "zoomGesture");
        SwipeToZoom swipeToZoom = (SwipeToZoom) this.f127056a.get();
        if (swipeToZoom == null || (copyOnWriteArraySet = swipeToZoom.f127043b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ZoomGestureListener) it.next()).onZoomOutGesture(zoomGesture);
        }
    }
}
