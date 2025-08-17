package com.scandit.datacapture.core.internal.sdk.common;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeContextStatus {
    final int code;
    final String message;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        return "NativeContextStatus{message=" + this.message + ",code=" + this.code + "}";
    }

    public NativeContextStatus(String str, int i10) {
        this.message = str;
        this.code = i10;
    }
}
