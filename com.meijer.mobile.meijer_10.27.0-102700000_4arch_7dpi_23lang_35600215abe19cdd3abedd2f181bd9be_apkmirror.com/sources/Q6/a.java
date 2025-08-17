package Q6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u000bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d¨\u0006#"}, d2 = {"LQ6/a;", "", "Ljava/util/concurrent/ExecutorService;", "errorExecutor", "sessionExecutor", "ioExecutor", "internalReportExecutor", "defaultExecutor", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "", "a", "(Ljava/util/concurrent/ExecutorService;)V", "LQ6/n;", "taskType", "Ljava/lang/Runnable;", "runnable", "Ljava/util/concurrent/Future;", "c", "(LQ6/n;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "T", "Ljava/util/concurrent/Callable;", "callable", "d", "(LQ6/n;Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "b", "()V", "Ljava/util/concurrent/ExecutorService;", "getErrorExecutor$bugsnag_android_core_release", "()Ljava/util/concurrent/ExecutorService;", "getSessionExecutor$bugsnag_android_core_release", "getIoExecutor$bugsnag_android_core_release", "getInternalReportExecutor$bugsnag_android_core_release", "e", "getDefaultExecutor$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ExecutorService errorExecutor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ExecutorService sessionExecutor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ExecutorService ioExecutor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ExecutorService internalReportExecutor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ExecutorService defaultExecutor;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\"\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\f\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LQ6/a$a;", "V", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/FutureTask;", "delegate", "LQ6/n;", "taskType", "<init>", "(Ljava/util/concurrent/FutureTask;LQ6/n;)V", "", "a", "()V", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "", "p0", "cancel", "(Z)Z", "isCancelled", "()Z", "isDone", "Ljava/util/concurrent/FutureTask;", "b", "LQ6/n;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: Q6.a$a, reason: collision with other inner class name */
    private static final class FutureC0684a<V> implements Future<V> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FutureTask<V> delegate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final n taskType;

        @Override // java.util.concurrent.Future
        public V get() {
            a();
            return this.delegate.get();
        }

        private final void a() {
            if (this.delegate.isDone()) {
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.f(threadCurrentThread, "JThread.currentThread()");
            if (c.b(threadCurrentThread) == this.taskType) {
                this.delegate.run();
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean p02) {
            return this.delegate.cancel(p02);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegate.isDone();
        }

        public FutureC0684a(FutureTask<V> futureTask, n nVar) {
            this.delegate = futureTask;
            this.taskType = nVar;
        }

        @Override // java.util.concurrent.Future
        public V get(long timeout, TimeUnit unit) {
            a();
            return this.delegate.get(timeout, unit);
        }
    }

    public a() {
        this(null, null, null, null, null, 31, null);
    }

    public a(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ExecutorService executorService5) {
        this.errorExecutor = executorService;
        this.sessionExecutor = executorService2;
        this.ioExecutor = executorService3;
        this.internalReportExecutor = executorService4;
        this.defaultExecutor = executorService5;
    }

    private final void a(ExecutorService executorService) throws InterruptedException {
        try {
            executorService.awaitTermination(1500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
    }

    public final void b() {
        this.internalReportExecutor.shutdownNow();
        this.defaultExecutor.shutdownNow();
        this.errorExecutor.shutdown();
        this.sessionExecutor.shutdown();
        this.ioExecutor.shutdown();
        a(this.errorExecutor);
        a(this.sessionExecutor);
        a(this.ioExecutor);
    }

    public final <T> Future<T> d(n taskType, Callable<T> callable) throws RejectedExecutionException {
        FutureTask futureTask = new FutureTask(callable);
        int i10 = b.$EnumSwitchMapping$0[taskType.ordinal()];
        if (i10 == 1) {
            this.errorExecutor.execute(futureTask);
        } else if (i10 == 2) {
            this.sessionExecutor.execute(futureTask);
        } else if (i10 == 3) {
            this.ioExecutor.execute(futureTask);
        } else if (i10 == 4) {
            this.internalReportExecutor.execute(futureTask);
        } else if (i10 == 5) {
            this.defaultExecutor.execute(futureTask);
        }
        return new FutureC0684a(futureTask, taskType);
    }

    public /* synthetic */ a(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ExecutorService executorService5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? c.a("Bugsnag Error thread", n.ERROR_REQUEST, true) : executorService, (i10 & 2) != 0 ? c.a("Bugsnag Session thread", n.SESSION_REQUEST, true) : executorService2, (i10 & 4) != 0 ? c.a("Bugsnag IO thread", n.IO, true) : executorService3, (i10 & 8) != 0 ? c.a("Bugsnag Internal Report thread", n.INTERNAL_REPORT, false) : executorService4, (i10 & 16) != 0 ? c.a("Bugsnag Default thread", n.DEFAULT, false) : executorService5);
    }

    public final Future<?> c(n taskType, Runnable runnable) throws RejectedExecutionException {
        Callable<Object> callable = Executors.callable(runnable);
        Intrinsics.f(callable, "Executors.callable(runnable)");
        return d(taskType, callable);
    }
}
