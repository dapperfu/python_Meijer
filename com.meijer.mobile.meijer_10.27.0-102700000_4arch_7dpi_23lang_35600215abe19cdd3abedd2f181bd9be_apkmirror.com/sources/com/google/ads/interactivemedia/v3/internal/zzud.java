package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public abstract class zzud extends zzqv implements Future {
    protected zzud() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return zzb().get();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqv
    protected /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    protected abstract Future zzb();

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzb().get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return zzb().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zzb().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zzb().isDone();
    }
}
