package com.scandit.datacapture.core.internal.module.https;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeHttpsSessionConfiguration {
    final boolean allowsCellularAccess;
    final int timeoutInterval;

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeHttpsSessionConfiguration)) {
            return false;
        }
        NativeHttpsSessionConfiguration nativeHttpsSessionConfiguration = (NativeHttpsSessionConfiguration) obj;
        return this.timeoutInterval == nativeHttpsSessionConfiguration.timeoutInterval && this.allowsCellularAccess == nativeHttpsSessionConfiguration.allowsCellularAccess;
    }

    public boolean getAllowsCellularAccess() {
        return this.allowsCellularAccess;
    }

    public int getTimeoutInterval() {
        return this.timeoutInterval;
    }

    public int hashCode() {
        return ((this.timeoutInterval + 527) * 31) + (this.allowsCellularAccess ? 1 : 0);
    }

    public String toString() {
        return "NativeHttpsSessionConfiguration{timeoutInterval=" + this.timeoutInterval + ",allowsCellularAccess=" + this.allowsCellularAccess + "}";
    }

    public NativeHttpsSessionConfiguration(int i10, boolean z10) {
        this.timeoutInterval = i10;
        this.allowsCellularAccess = z10;
    }
}
