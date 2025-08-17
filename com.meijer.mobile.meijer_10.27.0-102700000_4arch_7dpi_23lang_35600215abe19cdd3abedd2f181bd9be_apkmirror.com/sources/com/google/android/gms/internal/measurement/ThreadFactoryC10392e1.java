package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ThreadFactoryC10392e1 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f82168a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f82168a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }

    ThreadFactoryC10392e1(C10544v1 c10544v1) {
        Objects.requireNonNull(c10544v1);
        this.f82168a = Executors.defaultThreadFactory();
    }
}
