package com.launchdarkly.sdk.android;

import java.io.Closeable;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes8.dex */
interface v0 extends Closeable {
    ScheduledFuture<?> V2(Runnable runnable, long j10);

    void s2(Runnable runnable);

    ScheduledFuture<?> y0(Runnable runnable, long j10, long j11);
}
