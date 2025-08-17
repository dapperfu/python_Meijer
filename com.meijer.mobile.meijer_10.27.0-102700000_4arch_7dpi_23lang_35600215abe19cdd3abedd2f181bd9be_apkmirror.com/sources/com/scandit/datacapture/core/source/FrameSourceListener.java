package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.data.FrameData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/source/FrameSourceListener;", "", "onFrameOutput", "", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "frame", "Lcom/scandit/datacapture/core/data/FrameData;", "onObservationStarted", "onObservationStopped", "onStateChanged", "newState", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FrameSourceListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onFrameOutput(FrameSourceListener frameSourceListener, FrameSource frameSource, FrameData frame) {
            Intrinsics.j(frameSource, "frameSource");
            Intrinsics.j(frame, "frame");
        }

        public static void onObservationStarted(FrameSourceListener frameSourceListener, FrameSource frameSource) {
            Intrinsics.j(frameSource, "frameSource");
        }

        public static void onObservationStopped(FrameSourceListener frameSourceListener, FrameSource frameSource) {
            Intrinsics.j(frameSource, "frameSource");
        }

        public static void onStateChanged(FrameSourceListener frameSourceListener, FrameSource frameSource, FrameSourceState newState) {
            Intrinsics.j(frameSource, "frameSource");
            Intrinsics.j(newState, "newState");
        }
    }

    void onFrameOutput(FrameSource frameSource, FrameData frame);

    void onObservationStarted(FrameSource frameSource);

    void onObservationStopped(FrameSource frameSource);

    void onStateChanged(FrameSource frameSource, FrameSourceState newState);
}
