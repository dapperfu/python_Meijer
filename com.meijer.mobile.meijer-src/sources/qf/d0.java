package qf;

import Vd.AbstractC5516j;
import Vd.InterfaceC5509c;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f158348a = H.c("awaitEvenIfOnMainThread task continuation executor");

    public static boolean c(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Deprecated
    public static <T> T b(AbstractC5516j<T> abstractC5516j) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC5516j.j(f158348a, new InterfaceC5509c() { // from class: qf.c0
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j2) {
                return d0.a(countDownLatch, abstractC5516j2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (abstractC5516j.r()) {
            return abstractC5516j.n();
        }
        if (abstractC5516j.p()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC5516j.q()) {
            throw new IllegalStateException(abstractC5516j.m());
        }
        throw new TimeoutException();
    }

    public static /* synthetic */ Object a(CountDownLatch countDownLatch, AbstractC5516j abstractC5516j) {
        countDownLatch.countDown();
        return null;
    }
}
