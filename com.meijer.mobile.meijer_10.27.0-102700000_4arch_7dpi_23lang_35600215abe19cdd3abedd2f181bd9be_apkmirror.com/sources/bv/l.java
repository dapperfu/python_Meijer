package bv;

import Pu.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f60827a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f60828b;

    /* renamed from: c, reason: collision with root package name */
    static final AtomicReference<ScheduledExecutorService> f60829c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    static final Map<ScheduledThreadPoolExecutor, Object> f60830d = new ConcurrentHashMap();

    static final class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(l.f60830d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    l.f60830d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }

        a() {
        }
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        e(f60827a, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    static final class b implements o<String, String> {
        b() {
        }

        @Override // Pu.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean zB = b(true, "rx2.purge-enabled", true, true, bVar);
        f60827a = zB;
        f60828b = c(zB, "rx2.purge-period-seconds", 1, 1, bVar);
        d();
    }

    static boolean b(boolean z10, String str, boolean z11, boolean z12, o<String, String> oVar) {
        String strApply;
        if (!z10) {
            return z12;
        }
        try {
            strApply = oVar.apply(str);
        } catch (Throwable unused) {
        }
        return strApply == null ? z11 : "true".equals(strApply);
    }

    static int c(boolean z10, String str, int i10, int i11, o<String, String> oVar) {
        String strApply;
        if (!z10) {
            return i11;
        }
        try {
            strApply = oVar.apply(str);
        } catch (Throwable unused) {
        }
        return strApply == null ? i10 : Integer.parseInt(strApply);
    }

    public static void d() {
        f(f60827a);
    }

    static void e(boolean z10, ScheduledExecutorService scheduledExecutorService) {
        if (z10 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f60830d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void f(boolean z10) {
        if (!z10) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f60829c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new h("RxSchedulerPurge"));
            if (U.d.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                a aVar = new a();
                int i10 = f60828b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, i10, i10, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
