package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f88636e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f88637a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f88638b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88639c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f88640d;

    public static /* synthetic */ void a(b bVar, Runnable runnable) throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(bVar.f88639c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f88640d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f88636e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                b.a(this.f88634a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f88638b, Long.valueOf(this.f88637a.getAndIncrement())));
        return threadNewThread;
    }

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f88638b = str;
        this.f88639c = i10;
        this.f88640d = threadPolicy;
    }
}
