package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.android.LDFailure;
import mg.InterfaceC15616b;

@InterfaceC15616b(LDFailureSerialization.class)
/* loaded from: classes7.dex */
public class LDInvalidResponseCodeFailure extends LDFailure {
    private final int responseCode;
    private final boolean retryable;

    public LDInvalidResponseCodeFailure(String str, int i10, boolean z10) {
        super(str, LDFailure.a.UNEXPECTED_RESPONSE_CODE);
        this.responseCode = i10;
        this.retryable = z10;
    }

    public int b() {
        return this.responseCode;
    }

    public boolean c() {
        return this.retryable;
    }

    public LDInvalidResponseCodeFailure(String str, Throwable th2, int i10, boolean z10) {
        super(str, th2, LDFailure.a.UNEXPECTED_RESPONSE_CODE);
        this.responseCode = i10;
        this.retryable = z10;
    }
}
