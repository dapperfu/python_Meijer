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
import o2.InterfaceC16068a;
import o2.i;

/* loaded from: classes.dex */
class h {

    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f141392a;

        /* renamed from: b, reason: collision with root package name */
        private int f141393b;

        /* renamed from: k2.h$a$a, reason: collision with other inner class name */
        private static class C2240a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            private final int f141394a;

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f141394a);
                super.run();
            }

            C2240a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f141394a = i10;
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C2240a(runnable, this.f141392a, this.f141393b);
        }

        a(String str, int i10) {
            this.f141392a = str;
            this.f141393b = i10;
        }
    }

    private static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f141395a;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f141395a.post((Runnable) i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f141395a + " is shutting down");
        }

        b(Handler handler) {
            this.f141395a = (Handler) i.g(handler);
        }
    }

    private static class c<T> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Callable<T> f141396a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC16068a<T> f141397b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f141398c;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16068a f141399a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f141400b;

            a(InterfaceC16068a interfaceC16068a, Object obj) {
                this.f141399a = interfaceC16068a;
                this.f141400b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f141399a.accept(this.f141400b);
            }
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            T tCall;
            try {
                tCall = this.f141396a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f141398c.post(new a(this.f141397b, tCall));
        }

        c(Handler handler, Callable<T> callable, InterfaceC16068a<T> interfaceC16068a) {
            this.f141396a = callable;
            this.f141397b = interfaceC16068a;
            this.f141398c = handler;
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

    static <T> void c(Executor executor, Callable<T> callable, InterfaceC16068a<T> interfaceC16068a) {
        executor.execute(new c(C15080b.a(), callable, interfaceC16068a));
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
