package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class r implements FrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f122913a;

    public r(J j10) {
        this.f122913a = j10;
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onFrameOutput(FrameSource frameSource, FrameData frame) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(frame, "frame");
        if (frameSource.getCurrentState() == FrameSourceState.ON) {
            frameSource.removeListener(this);
            this.f122913a.invoke();
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onObservationStarted(FrameSource frameSource) {
        FrameSourceListener.DefaultImpls.onObservationStarted(this, frameSource);
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onObservationStopped(FrameSource frameSource) {
        FrameSourceListener.DefaultImpls.onObservationStopped(this, frameSource);
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onStateChanged(FrameSource frameSource, FrameSourceState frameSourceState) {
        FrameSourceListener.DefaultImpls.onStateChanged(this, frameSource, frameSourceState);
    }
}
