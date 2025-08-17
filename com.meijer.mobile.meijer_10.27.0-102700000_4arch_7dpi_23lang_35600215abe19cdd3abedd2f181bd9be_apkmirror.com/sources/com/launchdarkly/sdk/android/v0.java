package com.launchdarkly.sdk.android;

import java.io.Closeable;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes7.dex */
interface v0 extends Closeable {
    ScheduledFuture<?> A0(Runnable runnable, long j10, long j11);

    ScheduledFuture<?> V2(Runnable runnable, long j10);

    void u2(Runnable runnable);
}
