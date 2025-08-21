package com.scandit.datacapture.barcode.internal.module.pick;

import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements FrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f123358a;

    public a(Function1 block) {
        Intrinsics.j(block, "block");
        this.f123358a = block;
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onFrameOutput(FrameSource frameSource, FrameData frame) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(frame, "frame");
        if (frameSource.getCurrentState() != FrameSourceState.ON) {
            return;
        }
        ImageBuffer imageBuffer = frame.getImageBuffer();
        int width = imageBuffer.getWidth();
        if (imageBuffer.getHeight() <= 0 || width <= 0) {
            return;
        }
        frameSource.removeListener(this);
        this.f123358a.invoke(frame);
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
