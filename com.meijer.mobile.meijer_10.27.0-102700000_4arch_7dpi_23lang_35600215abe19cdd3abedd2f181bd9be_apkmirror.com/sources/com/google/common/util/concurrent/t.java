package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public interface t extends ScheduledExecutorService, s {
    @Override // java.util.concurrent.ScheduledExecutorService
    r<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> r<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    r<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    r<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit);
}
