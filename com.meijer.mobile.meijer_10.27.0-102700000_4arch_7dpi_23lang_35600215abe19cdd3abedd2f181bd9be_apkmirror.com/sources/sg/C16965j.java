package sg;

import Cd.AbstractExecutorServiceC3002u;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: sg.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16965j extends AbstractExecutorServiceC3002u {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f160461b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f160462a;

    static /* synthetic */ void d(Runnable runnable) {
        f160461b.set(new ArrayDeque());
        runnable.run();
    }

    @Override // Cd.c0
    protected final /* synthetic */ Object a() {
        return this.f160462a;
    }

    @Override // Cd.AbstractExecutorServiceC3002u
    protected final ExecutorService b() {
        return this.f160462a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f160461b.get();
        if (deque == null || deque.size() > 1) {
            this.f160462a.execute(new Runnable() { // from class: sg.v
                @Override // java.lang.Runnable
                public final void run() {
                    C16965j.e((Deque) C16965j.f160461b.get(), runnable);
                }
            });
        } else {
            e(deque, runnable);
        }
    }

    public C16965j() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: sg.w
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: sg.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16965j.d(runnable);
                    }
                });
            }
        });
        this.f160462a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Deque deque, Runnable runnable) {
        com.google.android.gms.common.internal.r.l(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }
}
