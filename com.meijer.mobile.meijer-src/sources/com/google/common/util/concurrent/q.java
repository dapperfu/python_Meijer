package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public interface q<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
