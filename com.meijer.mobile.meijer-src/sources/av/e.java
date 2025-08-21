package av;

import cv.C13558a;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes10.dex */
public final class e {
    public static void a(CountDownLatch countDownLatch, Ju.b bVar) throws InterruptedException {
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
        if (C13558a.j()) {
            if ((Thread.currentThread() instanceof Xu.g) || C13558a.q()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
