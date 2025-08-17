package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.source.S;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements S {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125909a;

    public a(BitmapFrameSource owner) {
        Intrinsics.j(owner, "owner");
        this.f125909a = new WeakReference(owner);
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
        BitmapFrameSource bitmapFrameSource = (BitmapFrameSource) this.f125909a.get();
        if (bitmapFrameSource == null || (copyOnWriteArraySet = bitmapFrameSource.f125876b) == null) {
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
        BitmapFrameSource bitmapFrameSource = (BitmapFrameSource) this.f125909a.get();
        if (bitmapFrameSource == null || (copyOnWriteArraySet = bitmapFrameSource.f125876b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((FrameSourceListener) it.next()).onStateChanged(frameSource, newState);
        }
    }
}
