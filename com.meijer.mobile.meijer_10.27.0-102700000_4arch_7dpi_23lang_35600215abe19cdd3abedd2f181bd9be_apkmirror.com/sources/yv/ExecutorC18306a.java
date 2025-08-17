package yv;

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
import qv.C16626T;
import qv.C16632c;
import vv.C17631E;
import vv.z;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u00012\u00020\u0002:\u0003A :B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010\u0013J)\u0010(\u001a\u00020\u00182\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u00182\n\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\u001aJ1\u00108\u001a\u00020\u00182\n\u00105\u001a\u00060,j\u0002`-2\f\b\u0002\u00107\u001a\u00060\u000ej\u0002`62\b\b\u0002\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\f2\n\u00105\u001a\u00060,j\u0002`-2\n\u00107\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0018¢\u0006\u0004\b<\u00102J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010<R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010CR\u0014\u0010G\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001e\u0010L\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000J8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010KR\u0011\u0010M\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bM\u0010\u001fR\u000b\u0010O\u001a\u00020N8\u0002X\u0082\u0004R\u000b\u0010P\u001a\u00020N8\u0002X\u0082\u0004R\u000b\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¨\u0006R"}, d2 = {"Lyv/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lyv/h;", "task", "", "b", "(Lyv/h;)Z", "Lyv/a$c;", "w", "()Lyv/a$c;", "worker", "u", "(Lyv/a$c;)I", "stateSnapshot", "", "H", "(J)V", "state", "O", "(J)Z", "Z", "()Z", "c", "()I", "fair", "K", "(Lyv/a$c;Lyv/h;Z)Lyv/h;", "g", "oldIndex", "newIndex", "A", "(Lyv/a$c;II)V", "z", "(Lyv/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "D", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "h", "(Ljava/lang/Runnable;ZZ)V", "d", "(Ljava/lang/Runnable;Z)Lyv/h;", "J", "toString", "()Ljava/lang/String;", "B", "(Lyv/h;)V", "a", "I", "Ljava/lang/String;", "Lyv/d;", "e", "Lyv/d;", "globalCpuQueue", "f", "globalBlockingQueue", "Lvv/z;", "Lvv/z;", "workers", "isTerminated", "", "parkedWorkersStack", "controlState", "_isTerminated", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yv.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ExecutorC18306a implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f171318i = AtomicLongFieldUpdater.newUpdater(ExecutorC18306a.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f171319j = AtomicLongFieldUpdater.newUpdater(ExecutorC18306a.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f171320k = AtomicIntegerFieldUpdater.newUpdater(ExecutorC18306a.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final C17631E f171321l = new C17631E("NOT_IN_STACK");
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
    public final C18309d globalCpuQueue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final C18309d globalBlockingQueue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final z<c> workers;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\u0010\u001c\u001a\u00060\u0004j\u0002`\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\fJ\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u0019R*\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0016\u00107\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010C\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010*R\u0016\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010ER\b\u0010F\u001a\u00020<8\u0006¨\u0006G"}, d2 = {"Lyv/a$c;", "Ljava/lang/Thread;", "<init>", "(Lyv/a;)V", "", "index", "(Lyv/a;I)V", "", "q", "()Z", "", "n", "()V", "r", "j", "Lyv/h;", "task", "b", "(Lyv/h;)V", "l", "u", "e", "()Lyv/h;", "scanLocalQueue", "c", "(Z)Lyv/h;", "m", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "t", "(I)Lyv/h;", "Lyv/a$d;", "newState", "s", "(Lyv/a$d;)Z", "run", "upperBound", "k", "(I)I", "mayHaveLocalTasks", "f", "indexInArray", "I", "g", "()I", "o", "(I)V", "Lyv/l;", "a", "Lyv/l;", "localQueue", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTask", "Lyv/a$d;", "state", "", "d", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yv.a$c */
    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f171329i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final C18317l localQueue;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Ref.ObjectRef<AbstractRunnableC18313h> stolenTask;

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
            setContextClassLoader(ExecutorC18306a.this.getClass().getClassLoader());
            this.localQueue = new C18317l();
            this.stolenTask = new Ref.ObjectRef<>();
            this.state = d.f171341d;
            this.nextParkedWorker = ExecutorC18306a.f171321l;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final AbstractRunnableC18313h m() {
            if (k(2) == 0) {
                AbstractRunnableC18313h abstractRunnableC18313hE = ExecutorC18306a.this.globalCpuQueue.e();
                return abstractRunnableC18313hE != null ? abstractRunnableC18313hE : ExecutorC18306a.this.globalBlockingQueue.e();
            }
            AbstractRunnableC18313h abstractRunnableC18313hE2 = ExecutorC18306a.this.globalBlockingQueue.e();
            return abstractRunnableC18313hE2 != null ? abstractRunnableC18313hE2 : ExecutorC18306a.this.globalCpuQueue.e();
        }

        private final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (!ExecutorC18306a.this.isTerminated() && this.state != d.f171342e) {
                    AbstractRunnableC18313h abstractRunnableC18313hF = f(this.mayHaveLocalTasks);
                    if (abstractRunnableC18313hF != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        b(abstractRunnableC18313hF);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            r();
                        } else if (z10) {
                            s(d.f171340c);
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
            s(d.f171342e);
        }

        private final void b(AbstractRunnableC18313h task) {
            this.terminationDeadline = 0L;
            if (this.state == d.f171340c) {
                this.state = d.f171339b;
            }
            if (!task.taskContext) {
                ExecutorC18306a.this.B(task);
                return;
            }
            if (s(d.f171339b)) {
                ExecutorC18306a.this.J();
            }
            ExecutorC18306a.this.B(task);
            ExecutorC18306a.j().addAndGet(ExecutorC18306a.this, -2097152L);
            if (this.state != d.f171342e) {
                this.state = d.f171341d;
            }
        }

        private final AbstractRunnableC18313h c(boolean scanLocalQueue) {
            AbstractRunnableC18313h abstractRunnableC18313hM;
            AbstractRunnableC18313h abstractRunnableC18313hM2;
            if (scanLocalQueue) {
                boolean z10 = k(ExecutorC18306a.this.corePoolSize * 2) == 0;
                if (z10 && (abstractRunnableC18313hM2 = m()) != null) {
                    return abstractRunnableC18313hM2;
                }
                AbstractRunnableC18313h abstractRunnableC18313hK = this.localQueue.k();
                if (abstractRunnableC18313hK != null) {
                    return abstractRunnableC18313hK;
                }
                if (!z10 && (abstractRunnableC18313hM = m()) != null) {
                    return abstractRunnableC18313hM;
                }
            } else {
                AbstractRunnableC18313h abstractRunnableC18313hM3 = m();
                if (abstractRunnableC18313hM3 != null) {
                    return abstractRunnableC18313hM3;
                }
            }
            return t(3);
        }

        private final AbstractRunnableC18313h e() {
            AbstractRunnableC18313h abstractRunnableC18313hL = this.localQueue.l();
            if (abstractRunnableC18313hL != null) {
                return abstractRunnableC18313hL;
            }
            AbstractRunnableC18313h abstractRunnableC18313hE = ExecutorC18306a.this.globalBlockingQueue.e();
            return abstractRunnableC18313hE == null ? t(1) : abstractRunnableC18313hE;
        }

        private final boolean j() {
            return this.nextParkedWorker != ExecutorC18306a.f171321l;
        }

        private final void l() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + ExecutorC18306a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(ExecutorC18306a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                u();
            }
        }

        private final boolean q() {
            long j10;
            if (this.state == d.f171338a) {
                return true;
            }
            ExecutorC18306a executorC18306a = ExecutorC18306a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterJ = ExecutorC18306a.j();
            do {
                j10 = atomicLongFieldUpdaterJ.get(executorC18306a);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC18306a.j().compareAndSet(executorC18306a, j10, j10 - 4398046511104L));
            this.state = d.f171338a;
            return true;
        }

        private final AbstractRunnableC18313h t(int stealingMode) {
            int i10 = (int) (ExecutorC18306a.j().get(ExecutorC18306a.this) & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iK = k(i10);
            ExecutorC18306a executorC18306a = ExecutorC18306a.this;
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                iK++;
                if (iK > i10) {
                    iK = 1;
                }
                c cVarB = executorC18306a.workers.b(iK);
                if (cVarB != null && cVarB != this) {
                    long jR = cVarB.localQueue.r(stealingMode, this.stolenTask);
                    if (jR == -1) {
                        Ref.ObjectRef<AbstractRunnableC18313h> objectRef = this.stolenTask;
                        AbstractRunnableC18313h abstractRunnableC18313h = objectRef.f142835a;
                        objectRef.f142835a = null;
                        return abstractRunnableC18313h;
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
            ExecutorC18306a executorC18306a = ExecutorC18306a.this;
            synchronized (executorC18306a.workers) {
                try {
                    if (executorC18306a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC18306a.j().get(executorC18306a) & 2097151)) <= executorC18306a.corePoolSize) {
                        return;
                    }
                    if (f171329i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        o(0);
                        executorC18306a.A(this, i10, 0);
                        int andDecrement = (int) (ExecutorC18306a.j().getAndDecrement(executorC18306a) & 2097151);
                        if (andDecrement != i10) {
                            c cVarB = executorC18306a.workers.b(andDecrement);
                            Intrinsics.g(cVarB);
                            c cVar = cVarB;
                            executorC18306a.workers.c(i10, cVar);
                            cVar.o(i10);
                            executorC18306a.A(cVar, andDecrement, i10);
                        }
                        executorC18306a.workers.c(andDecrement, null);
                        Unit unit = Unit.f142422a;
                        this.state = d.f171342e;
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
            sb2.append(ExecutorC18306a.this.schedulerName);
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
            boolean z10 = dVar == d.f171338a;
            if (z10) {
                ExecutorC18306a.j().addAndGet(ExecutorC18306a.this, 4398046511104L);
            }
            if (dVar != newState) {
                this.state = newState;
            }
            return z10;
        }

        private final void r() {
            if (!j()) {
                ExecutorC18306a.this.z(this);
                return;
            }
            f171329i.set(this, -1);
            while (j() && f171329i.get(this) == -1 && !ExecutorC18306a.this.isTerminated() && this.state != d.f171342e) {
                s(d.f171340c);
                Thread.interrupted();
                l();
            }
        }

        public final AbstractRunnableC18313h f(boolean mayHaveLocalTasks) {
            if (q()) {
                return c(mayHaveLocalTasks);
            }
            return e();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public c(ExecutorC18306a executorC18306a, int i10) {
            this();
            o(i10);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lyv/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yv.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f171338a = new d("CPU_ACQUIRED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f171339b = new d("BLOCKING", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f171340c = new d("PARKING", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final d f171341d = new d("DORMANT", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final d f171342e = new d("TERMINATED", 4);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ d[] f171343f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f171344g;

        static {
            d[] dVarArrA = a();
            f171343f = dVarArrA;
            f171344g = EnumEntriesKt.a(dVarArrA);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f171338a, f171339b, f171340c, f171341d, f171342e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f171343f.clone();
        }

        private d(String str, int i10) {
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        i(this, command, false, false, 6, null);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yv.a$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f171340c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f171339b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f171338a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f171341d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f171342e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final AbstractRunnableC18313h K(c cVar, AbstractRunnableC18313h abstractRunnableC18313h, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.state) == d.f171342e) {
            return abstractRunnableC18313h;
        }
        if (!abstractRunnableC18313h.taskContext && dVar == d.f171339b) {
            return abstractRunnableC18313h;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.a(abstractRunnableC18313h, z10);
    }

    static /* synthetic */ boolean T(ExecutorC18306a executorC18306a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f171319j.get(executorC18306a);
        }
        return executorC18306a.O(j10);
    }

    private final boolean b(AbstractRunnableC18313h task) {
        return task.taskContext ? this.globalBlockingQueue.a(task) : this.globalCpuQueue.a(task);
    }

    private final int c() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f171319j.get(this);
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
                if (i11 != ((int) (2097151 & f171319j.incrementAndGet(this)))) {
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

    public static /* synthetic */ void i(ExecutorC18306a executorC18306a, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        executorC18306a.h(runnable, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater j() {
        return f171319j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        D(10000L);
    }

    public final AbstractRunnableC18313h d(Runnable block, boolean taskContext) {
        long jA = C18315j.f171362f.a();
        if (!(block instanceof AbstractRunnableC18313h)) {
            return C18315j.b(block, jA, taskContext);
        }
        AbstractRunnableC18313h abstractRunnableC18313h = (AbstractRunnableC18313h) block;
        abstractRunnableC18313h.submissionTime = jA;
        abstractRunnableC18313h.taskContext = taskContext;
        return abstractRunnableC18313h;
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
        long j10 = f171319j.get(this);
        return this.schedulerName + '@' + C16626T.b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.c() + ", global blocking queue size = " + this.globalBlockingQueue.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public ExecutorC18306a(int i10, int i11, long j10, String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 > 0) {
                        this.globalCpuQueue = new C18309d();
                        this.globalBlockingQueue = new C18309d();
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

    private final void H(long stateSnapshot) {
        if (Z() || O(stateSnapshot)) {
            return;
        }
        Z();
    }

    private final boolean O(long state) {
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

    private final boolean Z() {
        c cVarW;
        do {
            cVarW = w();
            if (cVarW == null) {
                return false;
            }
        } while (!c.f171329i.compareAndSet(cVarW, -1, 0));
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
        if (cVar == null || !Intrinsics.e(ExecutorC18306a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final int u(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f171321l) {
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
        AtomicLongFieldUpdater atomicLongFieldUpdater = f171318i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.workers.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iU = u(cVarB);
            if (iU >= 0 && f171318i.compareAndSet(this, j10, iU | j11)) {
                cVarB.p(f171321l);
                return cVarB;
            }
        }
    }

    public final void A(c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f171318i;
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
                if (f171318i.compareAndSet(this, j10, j11 | iU)) {
                    return;
                }
            }
        }
    }

    public final void B(AbstractRunnableC18313h task) {
        try {
            task.run();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                C16632c.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            yv.a$c r0 = r7.g()
            vv.z<yv.a$c> r1 = r7.workers
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
            vv.z<yv.a$c> r4 = r7.workers
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.Intrinsics.g(r4)
            yv.a$c r4 = (yv.ExecutorC18306a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            yv.l r4 = r4.localQueue
            yv.d r5 = r7.globalBlockingQueue
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            yv.d r8 = r7.globalBlockingQueue
            r8.b()
            yv.d r8 = r7.globalCpuQueue
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            yv.h r8 = r0.f(r2)
            if (r8 != 0) goto L8b
        L5f:
            yv.d r8 = r7.globalCpuQueue
            java.lang.Object r8 = r8.e()
            yv.h r8 = (yv.AbstractRunnableC18313h) r8
            if (r8 != 0) goto L8b
            yv.d r8 = r7.globalBlockingQueue
            java.lang.Object r8 = r8.e()
            yv.h r8 = (yv.AbstractRunnableC18313h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            yv.a$d r8 = yv.ExecutorC18306a.d.f171342e
            r0.s(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = j()
            r8.set(r7, r0)
            return
        L8b:
            r7.B(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.ExecutorC18306a.D(long):void");
    }

    public final void J() {
        if (Z() || T(this, 0L, 1, null)) {
            return;
        }
        Z();
    }

    public final void h(Runnable block, boolean taskContext, boolean fair) {
        long jAddAndGet;
        C16632c.a();
        AbstractRunnableC18313h abstractRunnableC18313hD = d(block, taskContext);
        boolean z10 = abstractRunnableC18313hD.taskContext;
        if (z10) {
            jAddAndGet = f171319j.addAndGet(this, 2097152L);
        } else {
            jAddAndGet = 0;
        }
        AbstractRunnableC18313h abstractRunnableC18313hK = K(g(), abstractRunnableC18313hD, fair);
        if (abstractRunnableC18313hK != null && !b(abstractRunnableC18313hK)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z10) {
            H(jAddAndGet);
        } else {
            J();
        }
    }

    public final boolean isTerminated() {
        if (f171320k.get(this) == 1) {
            return true;
        }
        return false;
    }

    public final boolean z(c worker) {
        long j10;
        int indexInArray;
        if (worker.getNextParkedWorker() == f171321l) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f171318i;
            do {
                j10 = atomicLongFieldUpdater.get(this);
                indexInArray = worker.getIndexInArray();
                worker.p(this.workers.b((int) (2097151 & j10)));
            } while (!f171318i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | indexInArray));
            return true;
        }
        return false;
    }
}
