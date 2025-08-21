package com.scandit.datacapture.core.internal.module.https;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeHttpsTask {
    public abstract void cancel();

    public abstract NativeHttpsError getError();

    public abstract int getId();

    public abstract float getProgress();

    public abstract NativeHttpsRequest getRequest();

    public abstract NativeHttpsResponse getResponse();

    public abstract NativeHttpsTaskState getState();

    public abstract void start();
}
