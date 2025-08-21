package Qv;

import Nv.h;
import Nv.k;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001e'\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0016\u0010-\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0016\u0010.\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0016\u0010/\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0015008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0015008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00101R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00105¨\u00067"}, d2 = {"LQv/d;", "", "LQv/d$a;", "backend", "Ljava/util/logging/Logger;", "logger", "<init>", "(LQv/d$a;Ljava/util/logging/Logger;)V", "LQv/a;", "task", "", "f", "(LQv/a;)V", "", "delayNanos", "", "completedNormally", "d", "(LQv/a;JZ)V", "l", "()V", "LQv/c;", "taskQueue", "j", "(LQv/c;)V", "e", "()LQv/a;", "k", "()LQv/c;", "g", "a", "LQv/d$a;", "h", "()LQv/d$a;", "b", "Ljava/util/logging/Logger;", "i", "()Ljava/util/logging/Logger;", "", "c", "I", "nextQueueName", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "executeCallCount", "runCallCount", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: l, reason: collision with root package name */
    private static final Logger f31482l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final d f31483m;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a backend;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Logger logger;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nextQueueName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatorWaiting;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long coordinatorWakeUpAt;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int executeCallCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int runCallCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Qv.c> busyQueues;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<Qv.c> readyQueues;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Runnable runnable;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"LQv/d$a;", "", "", "b", "()J", "LQv/d;", "taskRunner", "", "f", "(LQv/d;)V", "nanos", "e", "(LQv/d;J)V", "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "c", "(Ljava/util/concurrent/BlockingQueue;)Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "runnable", "d", "(LQv/d;Ljava/lang/Runnable;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        long b();

        <T> BlockingQueue<T> c(BlockingQueue<T> queue);

        void d(d taskRunner, Runnable runnable);

        void e(d taskRunner, long nanos);

        void f(d taskRunner);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LQv/d$c;", "LQv/d$a;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "", "b", "()J", "LQv/d;", "taskRunner", "", "f", "(LQv/d;)V", "nanos", "e", "(LQv/d;J)V", "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "c", "(Ljava/util/concurrent/BlockingQueue;)Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "runnable", "d", "(LQv/d;Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadPoolExecutor;", "a", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ThreadPoolExecutor executor;

        @Override // Qv.d.a
        public <T> BlockingQueue<T> c(BlockingQueue<T> queue) {
            Intrinsics.j(queue, "queue");
            return queue;
        }

        public c(ThreadFactory threadFactory) {
            Intrinsics.j(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // Qv.d.a
        public void d(d taskRunner, Runnable runnable) {
            Intrinsics.j(taskRunner, "taskRunner");
            Intrinsics.j(runnable, "runnable");
            this.executor.execute(runnable);
        }

        @Override // Qv.d.a
        public void e(d taskRunner, long nanos) throws InterruptedException {
            Intrinsics.j(taskRunner, "taskRunner");
            if (k.f22781b && !Thread.holdsLock(taskRunner)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + taskRunner);
            }
            if (nanos > 0) {
                long j10 = nanos / 1000000;
                long j11 = nanos - (1000000 * j10);
                if (j10 > 0 || nanos > 0) {
                    taskRunner.wait(j10, (int) j11);
                }
            }
        }

        @Override // Qv.d.a
        public void f(d taskRunner) {
            Intrinsics.j(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // Qv.d.a
        public long b() {
            return System.nanoTime();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Qv/d$d", "Ljava/lang/Runnable;", "", "run", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qv.d$d, reason: collision with other inner class name */
    public static final class RunnableC0731d implements Runnable {
        RunnableC0731d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Qv.a aVarE;
            long jB;
            Qv.a aVarE2;
            d dVar = d.this;
            synchronized (dVar) {
                dVar.runCallCount++;
                aVarE = dVar.e();
            }
            if (aVarE == null) {
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            while (true) {
                try {
                    threadCurrentThread.setName(aVarE.getName());
                    Logger logger = d.this.getLogger();
                    Qv.c queue = aVarE.getQueue();
                    Intrinsics.g(queue);
                    boolean zIsLoggable = logger.isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jB = queue.getTaskRunner().getBackend().b();
                        b.c(logger, aVarE, queue, "starting");
                    } else {
                        jB = -1;
                    }
                    try {
                        long jF = aVarE.f();
                        if (zIsLoggable) {
                            b.c(logger, aVarE, queue, "finished run in " + b.b(queue.getTaskRunner().getBackend().b() - jB));
                        }
                        d dVar2 = d.this;
                        synchronized (dVar2) {
                            dVar2.d(aVarE, jF, true);
                            aVarE2 = dVar2.e();
                        }
                        if (aVarE2 == null) {
                            threadCurrentThread.setName(name);
                            return;
                        }
                        aVarE = aVarE2;
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            b.c(logger, aVarE, queue, "failed a run in " + b.b(queue.getTaskRunner().getBackend().b() - jB));
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        d dVar3 = d.this;
                        synchronized (dVar3) {
                            dVar3.d(aVarE, -1L, false);
                            Unit unit = Unit.f143329a;
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        threadCurrentThread.setName(name);
                        throw th4;
                    }
                }
            }
        }
    }

    public d(a backend, Logger logger) {
        Intrinsics.j(backend, "backend");
        Intrinsics.j(logger, "logger");
        this.backend = backend;
        this.logger = logger;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new RunnableC0731d();
    }

    public final Qv.c k() {
        int i10;
        synchronized (this) {
            i10 = this.nextQueueName;
            this.nextQueueName = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new Qv.c(this, sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.i(logger, "getLogger(...)");
        f31482l = logger;
        f31483m = new d(new c(k.p(k.f22782c + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Qv.a task, long delayNanos, boolean completedNormally) {
        if (k.f22781b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        Qv.c queue = task.getQueue();
        Intrinsics.g(queue);
        if (queue.getActiveTask() != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zF = queue.getCancelActiveTask();
        queue.p(false);
        queue.o(null);
        this.busyQueues.remove(queue);
        if (delayNanos != -1 && !zF && !queue.getShutdown()) {
            queue.n(task, delayNanos, true);
        }
        if (queue.g().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue);
        if (completedNormally) {
            return;
        }
        l();
    }

    private final void f(Qv.a task) {
        if (k.f22781b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.g(-1L);
        Qv.c queue = task.getQueue();
        Intrinsics.g(queue);
        queue.g().remove(task);
        this.readyQueues.remove(queue);
        queue.o(task);
        this.busyQueues.add(queue);
    }

    private final void l() {
        if (!k.f22781b || Thread.holdsLock(this)) {
            int i10 = this.executeCallCount;
            if (i10 > this.runCallCount) {
                return;
            }
            this.executeCallCount = i10 + 1;
            this.backend.d(this, this.runnable);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final Qv.a e() {
        boolean z10;
        if (k.f22781b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.readyQueues.isEmpty()) {
            long jB = this.backend.b();
            Iterator<Qv.c> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            Qv.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Qv.a aVar2 = it.next().g().get(0);
                long jMax = Math.max(0L, aVar2.getNextExecuteNanoTime() - jB);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z10 || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    l();
                }
                return aVar;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jB) {
                    this.backend.f(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jB + jMin;
            try {
                try {
                    this.backend.e(this, jMin);
                } catch (InterruptedException unused) {
                    g();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }

    public final void g() {
        if (k.f22781b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).b();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            Qv.c cVar = this.readyQueues.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    /* renamed from: h, reason: from getter */
    public final a getBackend() {
        return this.backend;
    }

    /* renamed from: i, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    public final void j(Qv.c taskQueue) {
        Intrinsics.j(taskQueue, "taskQueue");
        if (k.f22781b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.getActiveTask() == null) {
            if (taskQueue.g().isEmpty()) {
                this.readyQueues.remove(taskQueue);
            } else {
                h.a(this.readyQueues, taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.f(this);
        } else {
            l();
        }
    }

    public /* synthetic */ d(a aVar, Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? f31482l : logger);
    }
}
