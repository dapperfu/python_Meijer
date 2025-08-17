package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.io.Closeable;
import java.util.concurrent.Future;

/* loaded from: classes7.dex */
public interface b0 extends Closeable {
    void D0(String str, N n10);

    LDValue J1(String str, LDValue lDValue);

    boolean J3(String str, boolean z10);

    void k0(String str, N n10);

    Future<Void> o2(LDContext lDContext);

    String v1(String str, String str2);
}
