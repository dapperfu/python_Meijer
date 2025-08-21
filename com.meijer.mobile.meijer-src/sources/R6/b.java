package R6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b!\u0010 R\u001a\u0010\u0005\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b#\u0010 R\u001a\u0010\u0007\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b$\u0010 ¨\u0006%"}, d2 = {"LR6/b;", "", "Ljava/util/concurrent/ExecutorService;", "errorExecutor", "sessionExecutor", "ioExecutor", "internalReportExecutor", "defaultExecutor", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "", "a", "(Ljava/util/concurrent/ExecutorService;)V", "LR6/t;", "taskType", "Ljava/lang/Runnable;", "runnable", "Ljava/util/concurrent/Future;", "d", "(LR6/t;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "T", "Ljava/util/concurrent/Callable;", "callable", "e", "(LR6/t;Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "task", "b", "(LR6/t;Ljava/lang/Runnable;)V", "c", "()V", "Ljava/util/concurrent/ExecutorService;", "getErrorExecutor$bugsnag_android_core_release", "()Ljava/util/concurrent/ExecutorService;", "getSessionExecutor$bugsnag_android_core_release", "getIoExecutor$bugsnag_android_core_release", "getInternalReportExecutor$bugsnag_android_core_release", "getDefaultExecutor$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LR6/b$a;", "V", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/FutureTask;", "delegate", "LR6/t;", "taskType", "<init>", "(Ljava/util/concurrent/FutureTask;LR6/t;)V", "", "a", "()V", "", "p0", "cancel", "(Z)Z", "isCancelled", "()Z", "isDone", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "Ljava/util/concurrent/FutureTask;", "b", "LR6/t;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class a<V> implements Future<V> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FutureTask<V> delegate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final t taskType;

        @Override // java.util.concurrent.Future
        public V get() {
            a();
            return this.delegate.get();
        }

        private final void a() {
            if (this.delegate.isDone() || d.d(Thread.currentThread()) != this.taskType) {
                return;
            }
            this.delegate.run();
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

        public a(FutureTask<V> futureTask, t tVar) {
            this.delegate = futureTask;
            this.taskType = tVar;
        }

        @Override // java.util.concurrent.Future
        public V get(long timeout, TimeUnit unit) {
            a();
            return this.delegate.get(timeout, unit);
        }
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: R6.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0735b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            iArr[t.ERROR_REQUEST.ordinal()] = 1;
            iArr[t.SESSION_REQUEST.ordinal()] = 2;
            iArr[t.IO.ordinal()] = 3;
            iArr[t.INTERNAL_REPORT.ordinal()] = 4;
            iArr[t.DEFAULT.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ExecutorService executorService5) {
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

    public final void b(t taskType, Runnable task) {
        int i10 = C0735b.$EnumSwitchMapping$0[taskType.ordinal()];
        if (i10 == 1) {
            this.errorExecutor.execute(task);
            return;
        }
        if (i10 == 2) {
            this.sessionExecutor.execute(task);
            return;
        }
        if (i10 == 3) {
            this.ioExecutor.execute(task);
        } else if (i10 == 4) {
            this.internalReportExecutor.execute(task);
        } else {
            if (i10 != 5) {
                return;
            }
            this.defaultExecutor.execute(task);
        }
    }

    public final void c() {
        this.internalReportExecutor.shutdownNow();
        this.defaultExecutor.shutdownNow();
        this.errorExecutor.shutdown();
        this.sessionExecutor.shutdown();
        this.ioExecutor.shutdown();
        a(this.errorExecutor);
        a(this.sessionExecutor);
        a(this.ioExecutor);
    }

    public final <T> Future<T> e(t taskType, Callable<T> callable) throws RejectedExecutionException {
        FutureTask futureTask = new FutureTask(callable);
        b(taskType, futureTask);
        return new a(futureTask, taskType);
    }

    public final Future<?> d(t taskType, Runnable runnable) throws RejectedExecutionException {
        return e(taskType, Executors.callable(runnable));
    }

    public /* synthetic */ b(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ExecutorService executorService5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? d.b("Bugsnag Error thread", t.ERROR_REQUEST, true) : executorService, (i10 & 2) != 0 ? d.b("Bugsnag Session thread", t.SESSION_REQUEST, true) : executorService2, (i10 & 4) != 0 ? d.b("Bugsnag IO thread", t.IO, true) : executorService3, (i10 & 8) != 0 ? d.b("Bugsnag Internal Report thread", t.INTERNAL_REPORT, false) : executorService4, (i10 & 16) != 0 ? d.b("Bugsnag Default thread", t.DEFAULT, false) : executorService5);
    }
}
