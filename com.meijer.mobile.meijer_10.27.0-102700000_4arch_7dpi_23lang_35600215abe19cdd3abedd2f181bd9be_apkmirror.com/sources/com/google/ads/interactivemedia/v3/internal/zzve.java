package com.google.ads.interactivemedia.v3.internal;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
final class zzve implements ThreadFactory {
    final /* synthetic */ ThreadFactory zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ AtomicLong zzc;

    zzve(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = threadFactory;
        this.zzb = str;
        this.zzc = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.zza.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.zzb;
        if (str != null) {
            AtomicLong atomicLong = this.zzc;
            Objects.requireNonNull(atomicLong);
            threadNewThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        return threadNewThread;
    }
}
