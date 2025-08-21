package com.fullstory;

/* loaded from: classes.dex */
public interface FSStatusListener {
    void onFSDisabled(FSReason fSReason);

    void onFSError(FSReason fSReason);

    void onSession(FSSessionData fSSessionData);

    void onSessionDisabled(FSReason fSReason);
}
