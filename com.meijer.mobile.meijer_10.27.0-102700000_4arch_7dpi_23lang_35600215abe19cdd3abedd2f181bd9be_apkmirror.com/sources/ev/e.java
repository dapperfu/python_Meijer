package ev;

import gv.C14313a;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public final class e {
    public static void a(CountDownLatch countDownLatch, Nu.b bVar) throws InterruptedException {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            b();
            countDownLatch.await();
        } catch (InterruptedException e10) {
            bVar.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e10);
        }
    }

    public static void b() {
        if (C14313a.j()) {
            if ((Thread.currentThread() instanceof bv.g) || C14313a.q()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
