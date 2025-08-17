package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativePlatformHintPresenter {
    public abstract void hideGuidance(NativeGuidanceHint nativeGuidanceHint);

    public abstract void hideToast(NativeToastHint nativeToastHint);

    public abstract void setHintPresenter(NativeHintPresenterV2 nativeHintPresenterV2);

    public abstract void showGuidance(NativeGuidanceHint nativeGuidanceHint);

    public abstract void showToast(NativeToastHint nativeToastHint);

    public abstract void startUpdateTimer(long j10);

    public abstract void stopUpdateTimer();
}
