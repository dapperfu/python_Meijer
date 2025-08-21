package Sf;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Sf.a f34568a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Sf.a f34569b;

    /* renamed from: Sf.b$b, reason: collision with other inner class name */
    private static class C0772b implements Sf.a {
        private C0772b() {
        }

        @Override // Sf.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0772b c0772b = new C0772b();
        f34568a = c0772b;
        f34569b = c0772b;
    }

    public static Sf.a a() {
        return f34569b;
    }
}
