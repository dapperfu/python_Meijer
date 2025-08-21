package ug;

import Ed.AbstractExecutorServiceC3205u;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ug.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17412j extends AbstractExecutorServiceC3205u {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f163947b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f163948a;

    static /* synthetic */ void d(Runnable runnable) {
        f163947b.set(new ArrayDeque());
        runnable.run();
    }

    @Override // Ed.c0
    protected final /* synthetic */ Object a() {
        return this.f163948a;
    }

    @Override // Ed.AbstractExecutorServiceC3205u
    protected final ExecutorService b() {
        return this.f163948a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f163947b.get();
        if (deque == null || deque.size() > 1) {
            this.f163948a.execute(new Runnable() { // from class: ug.v
                @Override // java.lang.Runnable
                public final void run() {
                    C17412j.e((Deque) C17412j.f163947b.get(), runnable);
                }
            });
        } else {
            e(deque, runnable);
        }
    }

    public C17412j() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: ug.w
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: ug.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17412j.d(runnable);
                    }
                });
            }
        });
        this.f163948a = threadPoolExecutor;
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
