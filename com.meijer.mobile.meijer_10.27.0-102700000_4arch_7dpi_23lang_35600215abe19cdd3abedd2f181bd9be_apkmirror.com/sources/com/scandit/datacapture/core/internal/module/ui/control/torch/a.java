package com.scandit.datacapture.core.internal.module.ui.control.torch;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.ui.control.k;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements FrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    public final Set f125212a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f125213b;

    public a(Set wantedStates, k action) {
        Intrinsics.j(wantedStates, "wantedStates");
        Intrinsics.j(action, "action");
        this.f125212a = wantedStates;
        this.f125213b = action;
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onObservationStarted(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        if (this.f125212a.contains(frameSource.getCurrentState())) {
            this.f125213b.invoke(frameSource);
            frameSource.removeListener(this);
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onObservationStopped(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        frameSource.removeListener(this);
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onStateChanged(FrameSource frameSource, FrameSourceState newState) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(newState, "newState");
        if (this.f125212a.contains(frameSource.getCurrentState())) {
            this.f125213b.invoke(frameSource);
            frameSource.removeListener(this);
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSourceListener
    public final void onFrameOutput(FrameSource frameSource, FrameData frameData) {
        FrameSourceListener.DefaultImpls.onFrameOutput(this, frameSource, frameData);
    }
}
