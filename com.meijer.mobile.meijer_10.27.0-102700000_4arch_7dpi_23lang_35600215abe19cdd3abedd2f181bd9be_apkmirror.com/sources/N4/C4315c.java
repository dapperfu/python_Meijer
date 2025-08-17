package N4;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import qv.AbstractC16618K;
import qv.C16669u0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "isTaskExecutor", "Ljava/util/concurrent/Executor;", "e", "(Z)Ljava/util/concurrent/Executor;", "LN4/K;", "f", "()LN4/K;", "Lkotlin/coroutines/CoroutineContext;", "d", "(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: N4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4315c {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"N4/c$a", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadCount", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N4.c$a */
    public static final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicInteger threadCount = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21379b;

        a(boolean z10) {
            this.f21379b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Intrinsics.j(runnable, "runnable");
            return new Thread(runnable, (this.f21379b ? "WM.task-" : "androidx.work-") + this.threadCount.incrementAndGet());
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"N4/c$b", "LN4/K;", "", "isEnabled", "()Z", "", "label", "", "a", "(Ljava/lang/String;)V", "d", "()V", "methodName", "", "cookie", "c", "(Ljava/lang/String;I)V", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N4.c$b */
    public static final class b implements K {
        @Override // N4.K
        public void a(String label) {
            Intrinsics.j(label, "label");
            G4.a.c(label);
        }

        @Override // N4.K
        public void b(String methodName, int cookie) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.j(methodName, "methodName");
            G4.a.d(methodName, cookie);
        }

        @Override // N4.K
        public void c(String methodName, int cookie) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.j(methodName, "methodName");
            G4.a.a(methodName, cookie);
        }

        b() {
        }

        @Override // N4.K
        public void d() {
            G4.a.f();
        }

        @Override // N4.K
        public boolean isEnabled() {
            return G4.a.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor d(CoroutineContext coroutineContext) {
        ContinuationInterceptor continuationInterceptor = coroutineContext != null ? (ContinuationInterceptor) coroutineContext.g(ContinuationInterceptor.INSTANCE) : null;
        AbstractC16618K abstractC16618K = continuationInterceptor instanceof AbstractC16618K ? (AbstractC16618K) continuationInterceptor : null;
        if (abstractC16618K != null) {
            return C16669u0.a(abstractC16618K);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor e(boolean z10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
        Intrinsics.i(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K f() {
        return new b();
    }
}
