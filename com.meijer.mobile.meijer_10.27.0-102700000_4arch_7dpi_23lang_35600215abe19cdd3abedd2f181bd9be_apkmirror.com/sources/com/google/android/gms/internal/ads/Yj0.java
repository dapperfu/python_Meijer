package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public interface Yj0 extends ScheduledExecutorService, Xj0 {
    Wj0 c0(Callable callable, long j10, TimeUnit timeUnit);
}
