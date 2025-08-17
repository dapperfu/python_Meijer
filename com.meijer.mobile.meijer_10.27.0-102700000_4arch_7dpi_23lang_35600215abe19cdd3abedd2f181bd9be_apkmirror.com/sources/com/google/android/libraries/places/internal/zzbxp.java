package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
final class zzbxp implements Runnable {
    final /* synthetic */ CyclicBarrier zza;
    final /* synthetic */ CountDownLatch zzb;

    zzbxp(zzbxt zzbxtVar, CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch) {
        this.zza = cyclicBarrier;
        this.zzb = countDownLatch;
        Objects.requireNonNull(zzbxtVar);
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, TimeoutException, BrokenBarrierException {
        try {
            this.zza.await(1000L, TimeUnit.MILLISECONDS);
            this.zzb.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (BrokenBarrierException | TimeoutException unused2) {
        }
    }
}
