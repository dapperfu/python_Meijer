package av;

import cv.C13558a;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class k {
    public static void a(s<?> sVar, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thB = cVar.b();
            if (thB != null) {
                sVar.onError(thB);
            } else {
                sVar.onComplete();
            }
        }
    }

    public static void b(lw.b<?> bVar, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thB = cVar.b();
            if (thB != null) {
                bVar.onError(thB);
            } else {
                bVar.onComplete();
            }
        }
    }

    public static void c(s<?> sVar, Throwable th2, AtomicInteger atomicInteger, c cVar) {
        if (cVar.a(th2)) {
            if (atomicInteger.getAndIncrement() == 0) {
                sVar.onError(cVar.b());
                return;
            }
            return;
        }
        C13558a.s(th2);
    }

    public static void d(lw.b<?> bVar, Throwable th2, AtomicInteger atomicInteger, c cVar) {
        if (cVar.a(th2)) {
            if (atomicInteger.getAndIncrement() == 0) {
                bVar.onError(cVar.b());
                return;
            }
            return;
        }
        C13558a.s(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(s<? super T> sVar, T t10, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            sVar.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thB = cVar.b();
                if (thB != null) {
                    sVar.onError(thB);
                } else {
                    sVar.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void f(lw.b<? super T> bVar, T t10, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thB = cVar.b();
                if (thB != null) {
                    bVar.onError(thB);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }
}
