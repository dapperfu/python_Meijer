package of;

import Td.AbstractC5232j;
import Td.InterfaceC5225c;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f153496a = H.c("awaitEvenIfOnMainThread task continuation executor");

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
    public static <T> T b(AbstractC5232j<T> abstractC5232j) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC5232j.j(f153496a, new InterfaceC5225c() { // from class: of.c0
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j2) {
                return d0.a(countDownLatch, abstractC5232j2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (abstractC5232j.r()) {
            return abstractC5232j.n();
        }
        if (abstractC5232j.p()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC5232j.q()) {
            throw new IllegalStateException(abstractC5232j.m());
        }
        throw new TimeoutException();
    }

    public static /* synthetic */ Object a(CountDownLatch countDownLatch, AbstractC5232j abstractC5232j) {
        countDownLatch.countDown();
        return null;
    }
}
