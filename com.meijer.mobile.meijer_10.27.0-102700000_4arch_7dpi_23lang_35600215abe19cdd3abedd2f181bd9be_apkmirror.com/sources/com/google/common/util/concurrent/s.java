package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public interface s extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.s
    q<?> submit(Runnable runnable);

    <T> q<T> submit(Runnable runnable, T t10);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.s
    <T> q<T> submit(Callable<T> callable);

    /* bridge */ /* synthetic */ default Future submit(Runnable runnable, Object obj) {
        return submit(runnable, (Runnable) obj);
    }
}
