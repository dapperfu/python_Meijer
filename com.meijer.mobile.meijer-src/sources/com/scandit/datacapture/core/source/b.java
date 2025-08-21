package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.source.S;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements S {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f126862a;

    public b(Camera owner) {
        Intrinsics.j(owner, "owner");
        this.f126862a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void a(DataCaptureContext context) {
        Intrinsics.j(context, "context");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void b(DataCaptureContext context) {
        Intrinsics.j(context, "context");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void onFrameOutput(FrameSource frameSource, FrameData frame) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(frame, "frame");
        Camera camera = (Camera) this.f126862a.get();
        if (camera == null || (copyOnWriteArraySet = camera.f126836d) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((FrameSourceListener) it.next()).onFrameOutput(frameSource, frame);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void onObservationStarted(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void onObservationStopped(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.S
    public final void onStateChanged(FrameSource frameSource, FrameSourceState newState) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(newState, "newState");
        Camera camera = (Camera) this.f126862a.get();
        if (camera == null || (copyOnWriteArraySet = camera.f126836d) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((FrameSourceListener) it.next()).onStateChanged(frameSource, newState);
        }
    }
}
