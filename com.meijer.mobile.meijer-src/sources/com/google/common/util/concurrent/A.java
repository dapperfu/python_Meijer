package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private String f88884a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f88885b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f88886c = null;

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f88887d = null;

    /* renamed from: e, reason: collision with root package name */
    private ThreadFactory f88888e = null;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f88889a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88890b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f88891c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f88892d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f88893e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f88894f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f88889a = threadFactory;
            this.f88890b = str;
            this.f88891c = atomicLong;
            this.f88892d = bool;
            this.f88893e = num;
            this.f88894f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f88889a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f88890b;
            if (str != null) {
                AtomicLong atomicLong = this.f88891c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(A.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f88892d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f88893e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f88894f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public A f(String str) {
        d(str, 0);
        this.f88884a = str;
        return this;
    }

    public A g(int i10) {
        De.p.i(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        De.p.i(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f88886c = Integer.valueOf(i10);
        return this;
    }

    private static ThreadFactory c(A a10) {
        String str = a10.f88884a;
        Boolean bool = a10.f88885b;
        Integer num = a10.f88886c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = a10.f88887d;
        ThreadFactory threadFactoryDefaultThreadFactory = a10.f88888e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public A e(boolean z10) {
        this.f88885b = Boolean.valueOf(z10);
        return this;
    }
}
