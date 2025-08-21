package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f89476e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f89477a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f89478b;

    /* renamed from: c, reason: collision with root package name */
    private final int f89479c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f89480d;

    public static /* synthetic */ void a(b bVar, Runnable runnable) throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(bVar.f89479c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f89480d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f89476e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                b.a(this.f89474a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f89478b, Long.valueOf(this.f89477a.getAndIncrement())));
        return threadNewThread;
    }

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f89478b = str;
        this.f89479c = i10;
        this.f89480d = threadPolicy;
    }
}
