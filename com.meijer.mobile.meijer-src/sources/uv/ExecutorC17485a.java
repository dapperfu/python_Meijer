package uv;

import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.C15787T;
import mv.C15793c;
import rv.C16950E;
import rv.z;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u00012\u00020\u0002:\u0003A :B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010\u0013J)\u0010(\u001a\u00020\u00182\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u00182\n\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\u001aJ1\u00108\u001a\u00020\u00182\n\u00105\u001a\u00060,j\u0002`-2\f\b\u0002\u00107\u001a\u00060\u000ej\u0002`62\b\b\u0002\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\f2\n\u00105\u001a\u00060,j\u0002`-2\n\u00107\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0018¢\u0006\u0004\b<\u00102J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010CR\u0014\u0010G\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001e\u0010L\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000J8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010KR\u0011\u0010M\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bM\u0010\u001fR\u000b\u0010O\u001a\u00020N8\u0002X\u0082\u0004R\u000b\u0010P\u001a\u00020N8\u0002X\u0082\u0004R\u000b\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¨\u0006R"}, d2 = {"Luv/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Luv/h;", "task", "", "b", "(Luv/h;)Z", "Luv/a$c;", "w", "()Luv/a$c;", "worker", "u", "(Luv/a$c;)I", "stateSnapshot", "", "J", "(J)V", "state", "R", "(J)Z", "Y", "()Z", "c", "()I", "fair", "O", "(Luv/a$c;Luv/h;Z)Luv/h;", "g", "oldIndex", "newIndex", "A", "(Luv/a$c;II)V", "z", "(Luv/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "H", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "h", "(Ljava/lang/Runnable;ZZ)V", "d", "(Ljava/lang/Runnable;Z)Luv/h;", "K", "toString", "()Ljava/lang/String;", "D", "(Luv/h;)V", "a", "I", "Ljava/lang/String;", "Luv/d;", "e", "Luv/d;", "globalCpuQueue", "f", "globalBlockingQueue", "Lrv/z;", "Lrv/z;", "workers", "isTerminated", "", "parkedWorkersStack", "controlState", "_isTerminated", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uv.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ExecutorC17485a implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f164604i = AtomicLongFieldUpdater.newUpdater(ExecutorC17485a.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f164605j = AtomicLongFieldUpdater.newUpdater(ExecutorC17485a.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f164606k = AtomicIntegerFieldUpdater.newUpdater(ExecutorC17485a.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final C16950E f164607l = new C16950E("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final int corePoolSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final int maxPoolSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final long idleWorkerKeepAliveNs;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final String schedulerName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final C17488d globalCpuQueue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final C17488d globalBlockingQueue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final z<c> workers;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\u0010\u001c\u001a\u00060\u0004j\u0002`\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\fJ\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u0019R*\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0016\u00107\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010C\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010*R\u0016\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010ER\b\u0010F\u001a\u00020<8\u0006¨\u0006G"}, d2 = {"Luv/a$c;", "Ljava/lang/Thread;", "<init>", "(Luv/a;)V", "", "index", "(Luv/a;I)V", "", "q", "()Z", "", "n", "()V", "r", "j", "Luv/h;", "task", "b", "(Luv/h;)V", "l", "u", "e", "()Luv/h;", "scanLocalQueue", "c", "(Z)Luv/h;", "m", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "t", "(I)Luv/h;", "Luv/a$d;", "newState", "s", "(Luv/a$d;)Z", "run", "upperBound", "k", "(I)I", "mayHaveLocalTasks", "f", "indexInArray", "I", "g", "()I", "o", "(I)V", "Luv/l;", "a", "Luv/l;", "localQueue", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTask", "Luv/a$d;", "state", "", "d", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: uv.a$c */
    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f164615i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final C17496l localQueue;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Ref.ObjectRef<AbstractRunnableC17492h> stolenTask;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public d state;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long terminationDeadline;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long minDelayUntilStealableTaskNs;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int rngState;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(ExecutorC17485a.this.getClass().getClassLoader());
            this.localQueue = new C17496l();
            this.stolenTask = new Ref.ObjectRef<>();
            this.state = d.f164627d;
            this.nextParkedWorker = ExecutorC17485a.f164607l;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final AbstractRunnableC17492h m() {
            if (k(2) == 0) {
                AbstractRunnableC17492h abstractRunnableC17492hE = ExecutorC17485a.this.globalCpuQueue.e();
                return abstractRunnableC17492hE != null ? abstractRunnableC17492hE : ExecutorC17485a.this.globalBlockingQueue.e();
            }
            AbstractRunnableC17492h abstractRunnableC17492hE2 = ExecutorC17485a.this.globalBlockingQueue.e();
            return abstractRunnableC17492hE2 != null ? abstractRunnableC17492hE2 : ExecutorC17485a.this.globalCpuQueue.e();
        }

        private final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (!ExecutorC17485a.this.isTerminated() && this.state != d.f164628e) {
                    AbstractRunnableC17492h abstractRunnableC17492hF = f(this.mayHaveLocalTasks);
                    if (abstractRunnableC17492hF != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        b(abstractRunnableC17492hF);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            r();
                        } else if (z10) {
                            s(d.f164626c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            s(d.f164628e);
        }

        private final void b(AbstractRunnableC17492h task) {
            this.terminationDeadline = 0L;
            if (this.state == d.f164626c) {
                this.state = d.f164625b;
            }
            if (!task.taskContext) {
                ExecutorC17485a.this.D(task);
                return;
            }
            if (s(d.f164625b)) {
                ExecutorC17485a.this.K();
            }
            ExecutorC17485a.this.D(task);
            ExecutorC17485a.j().addAndGet(ExecutorC17485a.this, -2097152L);
            if (this.state != d.f164628e) {
                this.state = d.f164627d;
            }
        }

        private final AbstractRunnableC17492h c(boolean scanLocalQueue) {
            AbstractRunnableC17492h abstractRunnableC17492hM;
            AbstractRunnableC17492h abstractRunnableC17492hM2;
            if (scanLocalQueue) {
                boolean z10 = k(ExecutorC17485a.this.corePoolSize * 2) == 0;
                if (z10 && (abstractRunnableC17492hM2 = m()) != null) {
                    return abstractRunnableC17492hM2;
                }
                AbstractRunnableC17492h abstractRunnableC17492hK = this.localQueue.k();
                if (abstractRunnableC17492hK != null) {
                    return abstractRunnableC17492hK;
                }
                if (!z10 && (abstractRunnableC17492hM = m()) != null) {
                    return abstractRunnableC17492hM;
                }
            } else {
                AbstractRunnableC17492h abstractRunnableC17492hM3 = m();
                if (abstractRunnableC17492hM3 != null) {
                    return abstractRunnableC17492hM3;
                }
            }
            return t(3);
        }

        private final AbstractRunnableC17492h e() {
            AbstractRunnableC17492h abstractRunnableC17492hL = this.localQueue.l();
            if (abstractRunnableC17492hL != null) {
                return abstractRunnableC17492hL;
            }
            AbstractRunnableC17492h abstractRunnableC17492hE = ExecutorC17485a.this.globalBlockingQueue.e();
            return abstractRunnableC17492hE == null ? t(1) : abstractRunnableC17492hE;
        }

        private final boolean j() {
            return this.nextParkedWorker != ExecutorC17485a.f164607l;
        }

        private final void l() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + ExecutorC17485a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(ExecutorC17485a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                u();
            }
        }

        private final boolean q() {
            long j10;
            if (this.state == d.f164624a) {
                return true;
            }
            ExecutorC17485a executorC17485a = ExecutorC17485a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterJ = ExecutorC17485a.j();
            do {
                j10 = atomicLongFieldUpdaterJ.get(executorC17485a);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC17485a.j().compareAndSet(executorC17485a, j10, j10 - 4398046511104L));
            this.state = d.f164624a;
            return true;
        }

        private final AbstractRunnableC17492h t(int stealingMode) {
            int i10 = (int) (ExecutorC17485a.j().get(ExecutorC17485a.this) & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iK = k(i10);
            ExecutorC17485a executorC17485a = ExecutorC17485a.this;
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                iK++;
                if (iK > i10) {
                    iK = 1;
                }
                c cVarB = executorC17485a.workers.b(iK);
                if (cVarB != null && cVarB != this) {
                    long jR = cVarB.localQueue.r(stealingMode, this.stolenTask);
                    if (jR == -1) {
                        Ref.ObjectRef<AbstractRunnableC17492h> objectRef = this.stolenTask;
                        AbstractRunnableC17492h abstractRunnableC17492h = objectRef.f143742a;
                        objectRef.f143742a = null;
                        return abstractRunnableC17492h;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        private final void u() {
            ExecutorC17485a executorC17485a = ExecutorC17485a.this;
            synchronized (executorC17485a.workers) {
                try {
                    if (executorC17485a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC17485a.j().get(executorC17485a) & 2097151)) <= executorC17485a.corePoolSize) {
                        return;
                    }
                    if (f164615i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        o(0);
                        executorC17485a.A(this, i10, 0);
                        int andDecrement = (int) (ExecutorC17485a.j().getAndDecrement(executorC17485a) & 2097151);
                        if (andDecrement != i10) {
                            c cVarB = executorC17485a.workers.b(andDecrement);
                            Intrinsics.g(cVarB);
                            c cVar = cVarB;
                            executorC17485a.workers.c(i10, cVar);
                            cVar.o(i10);
                            executorC17485a.A(cVar, andDecrement, i10);
                        }
                        executorC17485a.workers.c(andDecrement, null);
                        Unit unit = Unit.f143329a;
                        this.state = d.f164628e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: g, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        /* renamed from: h, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final int k(int upperBound) {
            int i10 = this.rngState;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.rngState = i13;
            int i14 = upperBound - 1;
            return (i14 & upperBound) == 0 ? i13 & i14 : (i13 & a.e.API_PRIORITY_OTHER) % upperBound;
        }

        public final void o(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC17485a.this.schedulerName);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean s(d newState) {
            d dVar = this.state;
            boolean z10 = dVar == d.f164624a;
            if (z10) {
                ExecutorC17485a.j().addAndGet(ExecutorC17485a.this, 4398046511104L);
            }
            if (dVar != newState) {
                this.state = newState;
            }
            return z10;
        }

        private final void r() {
            if (!j()) {
                ExecutorC17485a.this.z(this);
                return;
            }
            f164615i.set(this, -1);
            while (j() && f164615i.get(this) == -1 && !ExecutorC17485a.this.isTerminated() && this.state != d.f164628e) {
                s(d.f164626c);
                Thread.interrupted();
                l();
            }
        }

        public final AbstractRunnableC17492h f(boolean mayHaveLocalTasks) {
            if (q()) {
                return c(mayHaveLocalTasks);
            }
            return e();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public c(ExecutorC17485a executorC17485a, int i10) {
            this();
            o(i10);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Luv/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uv.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f164624a = new d("CPU_ACQUIRED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f164625b = new d("BLOCKING", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f164626c = new d("PARKING", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final d f164627d = new d("DORMANT", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final d f164628e = new d("TERMINATED", 4);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ d[] f164629f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f164630g;

        static {
            d[] dVarArrA = a();
            f164629f = dVarArrA;
            f164630g = EnumEntriesKt.a(dVarArrA);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f164624a, f164625b, f164626c, f164627d, f164628e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f164629f.clone();
        }

        private d(String str, int i10) {
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        i(this, command, false, false, 6, null);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uv.a$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f164626c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f164625b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f164624a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f164627d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f164628e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final AbstractRunnableC17492h O(c cVar, AbstractRunnableC17492h abstractRunnableC17492h, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.state) == d.f164628e) {
            return abstractRunnableC17492h;
        }
        if (!abstractRunnableC17492h.taskContext && dVar == d.f164625b) {
            return abstractRunnableC17492h;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.a(abstractRunnableC17492h, z10);
    }

    static /* synthetic */ boolean T(ExecutorC17485a executorC17485a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f164605j.get(executorC17485a);
        }
        return executorC17485a.R(j10);
    }

    private final boolean b(AbstractRunnableC17492h task) {
        return task.taskContext ? this.globalBlockingQueue.a(task) : this.globalCpuQueue.a(task);
    }

    private final int c() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f164605j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iF = RangesKt.f(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iF >= this.corePoolSize) {
                    return 0;
                }
                if (i10 >= this.maxPoolSize) {
                    return 0;
                }
                int i11 = ((int) (j().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.workers.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.workers.c(i11, cVar);
                if (i11 != ((int) (2097151 & f164605j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iF + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void i(ExecutorC17485a executorC17485a, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        executorC17485a.h(runnable, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater j() {
        return f164605j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        H(10000L);
    }

    public final AbstractRunnableC17492h d(Runnable block, boolean taskContext) {
        long jA = C17494j.f164648f.a();
        if (!(block instanceof AbstractRunnableC17492h)) {
            return C17494j.b(block, jA, taskContext);
        }
        AbstractRunnableC17492h abstractRunnableC17492h = (AbstractRunnableC17492h) block;
        abstractRunnableC17492h.submissionTime = jA;
        abstractRunnableC17492h.taskContext = taskContext;
        return abstractRunnableC17492h;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.workers.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.workers.b(i15);
            if (cVarB != null) {
                int i16 = cVarB.localQueue.i();
                int i17 = b.$EnumSwitchMapping$0[cVarB.state.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14++;
                }
            }
        }
        long j10 = f164605j.get(this);
        return this.schedulerName + '@' + C15787T.b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.c() + ", global blocking queue size = " + this.globalBlockingQueue.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public ExecutorC17485a(int i10, int i11, long j10, String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 > 0) {
                        this.globalCpuQueue = new C17488d();
                        this.globalBlockingQueue = new C17488d();
                        this.workers = new z<>((i10 + 1) * 2);
                        this.controlState$volatile = i10 << 42;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    private final void J(long stateSnapshot) {
        if (Y() || R(stateSnapshot)) {
            return;
        }
        Y();
    }

    private final boolean R(long state) {
        if (RangesKt.f(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iC = c();
            if (iC == 1 && this.corePoolSize > 1) {
                c();
            }
            if (iC > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean Y() {
        c cVarW;
        do {
            cVarW = w();
            if (cVarW == null) {
                return false;
            }
        } while (!c.f164615i.compareAndSet(cVarW, -1, 0));
        LockSupport.unpark(cVarW);
        return true;
    }

    private final c g() {
        c cVar;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof c) {
            cVar = (c) threadCurrentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !Intrinsics.e(ExecutorC17485a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final int u(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f164607l) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar = (c) nextParkedWorker;
            int indexInArray = cVar.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar.getNextParkedWorker();
        }
        return -1;
    }

    private final c w() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f164604i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.workers.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iU = u(cVarB);
            if (iU >= 0 && f164604i.compareAndSet(this, j10, iU | j11)) {
                cVarB.p(f164607l);
                return cVarB;
            }
        }
    }

    public final void A(c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f164604i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iU = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iU == oldIndex) {
                if (newIndex == 0) {
                    iU = u(worker);
                } else {
                    iU = newIndex;
                }
            }
            if (iU >= 0) {
                if (f164604i.compareAndSet(this, j10, j11 | iU)) {
                    return;
                }
            }
        }
    }

    public final void D(AbstractRunnableC17492h task) {
        try {
            task.run();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                C15793c.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            uv.a$c r0 = r7.g()
            rv.z<uv.a$c> r1 = r7.workers
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            rv.z<uv.a$c> r4 = r7.workers
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.Intrinsics.g(r4)
            uv.a$c r4 = (uv.ExecutorC17485a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            uv.l r4 = r4.localQueue
            uv.d r5 = r7.globalBlockingQueue
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            uv.d r8 = r7.globalBlockingQueue
            r8.b()
            uv.d r8 = r7.globalCpuQueue
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            uv.h r8 = r0.f(r2)
            if (r8 != 0) goto L8b
        L5f:
            uv.d r8 = r7.globalCpuQueue
            java.lang.Object r8 = r8.e()
            uv.h r8 = (uv.AbstractRunnableC17492h) r8
            if (r8 != 0) goto L8b
            uv.d r8 = r7.globalBlockingQueue
            java.lang.Object r8 = r8.e()
            uv.h r8 = (uv.AbstractRunnableC17492h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            uv.a$d r8 = uv.ExecutorC17485a.d.f164628e
            r0.s(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = j()
            r8.set(r7, r0)
            return
        L8b:
            r7.D(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uv.ExecutorC17485a.H(long):void");
    }

    public final void K() {
        if (Y() || T(this, 0L, 1, null)) {
            return;
        }
        Y();
    }

    public final void h(Runnable block, boolean taskContext, boolean fair) {
        long jAddAndGet;
        C15793c.a();
        AbstractRunnableC17492h abstractRunnableC17492hD = d(block, taskContext);
        boolean z10 = abstractRunnableC17492hD.taskContext;
        if (z10) {
            jAddAndGet = f164605j.addAndGet(this, 2097152L);
        } else {
            jAddAndGet = 0;
        }
        AbstractRunnableC17492h abstractRunnableC17492hO = O(g(), abstractRunnableC17492hD, fair);
        if (abstractRunnableC17492hO != null && !b(abstractRunnableC17492hO)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z10) {
            J(jAddAndGet);
        } else {
            K();
        }
    }

    public final boolean isTerminated() {
        if (f164606k.get(this) == 1) {
            return true;
        }
        return false;
    }

    public final boolean z(c worker) {
        long j10;
        int indexInArray;
        if (worker.getNextParkedWorker() == f164607l) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f164604i;
            do {
                j10 = atomicLongFieldUpdater.get(this);
                indexInArray = worker.getIndexInArray();
                worker.p(this.workers.b((int) (2097151 & j10)));
            } while (!f164604i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | indexInArray));
            return true;
        }
        return false;
    }
}
