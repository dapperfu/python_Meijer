package com.scandit.datacapture.core.internal.module.https;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeHttpsSession {
    public abstract NativeHttpsSessionConfiguration getConfiguration();

    public abstract NativeHttpsSessionDelegate getDelegate();

    public abstract void setDelegate(NativeHttpsSessionDelegate nativeHttpsSessionDelegate);

    public abstract void shouldAllowExpiredCertificates(boolean z10);

    public abstract NativeHttpsTask startRequest(NativeHttpsRequest nativeHttpsRequest);
}
