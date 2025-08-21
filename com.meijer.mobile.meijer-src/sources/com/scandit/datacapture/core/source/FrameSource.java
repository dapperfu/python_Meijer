package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import kotlin.Metadata;

@ProxyBaseClass(NativeFrameSource.class)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\"\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/source/FrameSource;", "", "currentState", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "getDesiredState", "_frameSourceImpl", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "addListener", "", "listener", "Lcom/scandit/datacapture/core/source/FrameSourceListener;", "removeListener", "switchToDesiredState", "whenDone", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FrameSource {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void switchToDesiredState$default(FrameSource frameSource, FrameSourceState frameSourceState, Callback callback, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchToDesiredState");
            }
            if ((i10 & 2) != 0) {
                callback = null;
            }
            frameSource.switchToDesiredState(frameSourceState, callback);
        }
    }

    @NativeImpl
    NativeFrameSource _frameSourceImpl();

    void addListener(FrameSourceListener listener);

    FrameSourceState getCurrentState();

    FrameSourceState getDesiredState();

    void removeListener(FrameSourceListener listener);

    void switchToDesiredState(FrameSourceState desiredState, Callback<? super Boolean> whenDone);
}
