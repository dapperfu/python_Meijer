package com.scandit.datacapture.core.internal.module.framesave;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeFrameSaveSessionListener {
    public abstract void onFrameSaveFailure(NativeFrameSaveSession nativeFrameSaveSession, String str, long j10);

    public abstract void onFrameSaveSuccess(NativeFrameSaveSession nativeFrameSaveSession, String str, long j10);

    public abstract void onObservationStarted(NativeFrameSaveSession nativeFrameSaveSession);

    public abstract void onObservationStopped(NativeFrameSaveSession nativeFrameSaveSession);
}
