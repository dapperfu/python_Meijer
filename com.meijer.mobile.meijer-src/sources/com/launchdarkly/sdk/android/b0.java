package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.io.Closeable;
import java.util.concurrent.Future;

/* loaded from: classes8.dex */
public interface b0 extends Closeable {
    void B0(String str, N n10);

    boolean I3(String str, boolean z10);

    LDValue L1(String str, LDValue lDValue);

    void l0(String str, N n10);

    Future<Void> m2(LDContext lDContext);

    String t1(String str, String str2);
}
