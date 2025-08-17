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
    private String f88044a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f88045b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f88046c = null;

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f88047d = null;

    /* renamed from: e, reason: collision with root package name */
    private ThreadFactory f88048e = null;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f88049a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88050b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f88051c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f88052d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f88053e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f88054f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f88049a = threadFactory;
            this.f88050b = str;
            this.f88051c = atomicLong;
            this.f88052d = bool;
            this.f88053e = num;
            this.f88054f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f88049a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f88050b;
            if (str != null) {
                AtomicLong atomicLong = this.f88051c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(A.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f88052d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f88053e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f88054f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public A f(String str) {
        d(str, 0);
        this.f88044a = str;
        return this;
    }

    public A g(int i10) {
        Be.p.i(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        Be.p.i(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f88046c = Integer.valueOf(i10);
        return this;
    }

    private static ThreadFactory c(A a10) {
        String str = a10.f88044a;
        Boolean bool = a10.f88045b;
        Integer num = a10.f88046c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = a10.f88047d;
        ThreadFactory threadFactoryDefaultThreadFactory = a10.f88048e;
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
        this.f88045b = Boolean.valueOf(z10);
        return this;
    }
}
