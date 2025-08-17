package k2;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o2.InterfaceC15993a;
import o2.i;

/* loaded from: classes.dex */
class h {

    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f141199a;

        /* renamed from: b, reason: collision with root package name */
        private int f141200b;

        /* renamed from: k2.h$a$a, reason: collision with other inner class name */
        private static class C2236a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            private final int f141201a;

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f141201a);
                super.run();
            }

            C2236a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f141201a = i10;
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C2236a(runnable, this.f141199a, this.f141200b);
        }

        a(String str, int i10) {
            this.f141199a = str;
            this.f141200b = i10;
        }
    }

    private static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f141202a;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f141202a.post((Runnable) i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f141202a + " is shutting down");
        }

        b(Handler handler) {
            this.f141202a = (Handler) i.g(handler);
        }
    }

    private static class c<T> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Callable<T> f141203a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC15993a<T> f141204b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f141205c;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC15993a f141206a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f141207b;

            a(InterfaceC15993a interfaceC15993a, Object obj) {
                this.f141206a = interfaceC15993a;
                this.f141207b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f141206a.accept(this.f141207b);
            }
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            T tCall;
            try {
                tCall = this.f141203a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f141205c.post(new a(this.f141204b, tCall));
        }

        c(Handler handler, Callable<T> callable, InterfaceC15993a<T> interfaceC15993a) {
            this.f141203a = callable;
            this.f141204b = interfaceC15993a;
            this.f141205c = handler;
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static <T> void c(Executor executor, Callable<T> callable, InterfaceC15993a<T> interfaceC15993a) {
        executor.execute(new c(C15089b.a(), callable, interfaceC15993a));
    }

    static <T> T d(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
