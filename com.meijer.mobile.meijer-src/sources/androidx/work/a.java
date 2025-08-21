package androidx.work;

import O4.AbstractC4365m;
import O4.C4355c;
import O4.C4358f;
import O4.C4375x;
import O4.I;
import O4.InterfaceC4354b;
import O4.J;
import O4.K;
import O4.Q;
import O4.S;
import P4.C4570e;
import com.google.android.gms.common.api.a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import mv.C15800f0;
import mv.C15830u0;
import o2.InterfaceC16068a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 S2\u00020\u0001:\u0003\u0007\r\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010/\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001a\u0010.R\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u001f\u00106\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010.R\u001f\u00108\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b7\u0010.R\u0019\u0010<\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b1\u0010:\u001a\u0004\b\u0012\u0010;R\u0017\u0010@\u001a\u00020=8G¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b4\u0010?R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\b0\u0010?R\u0017\u0010C\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b%\u0010?R\u0017\u0010D\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b7\u0010>\u001a\u0004\b\r\u0010?R\u0017\u0010E\u001a\u00020=8G¢\u0006\f\n\u0004\b\u001c\u0010>\u001a\u0004\b,\u0010?R\u0017\u0010H\u001a\u00020F8G¢\u0006\f\n\u0004\b5\u0010G\u001a\u0004\bH\u0010IR \u0010M\u001a\u00020F8GX\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010G\u0012\u0004\bK\u0010L\u001a\u0004\bJ\u0010IR\u0017\u0010R\u001a\u00020N8G¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bA\u0010Q¨\u0006T"}, d2 = {"Landroidx/work/a;", "", "Landroidx/work/a$a;", "builder", "<init>", "(Landroidx/work/a$a;)V", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "o", "()Lkotlin/coroutines/CoroutineContext;", "workerCoroutineContext", "c", "m", "taskExecutor", "LO4/b;", "LO4/b;", "()LO4/b;", "clock", "LO4/S;", "e", "LO4/S;", "q", "()LO4/S;", "workerFactory", "LO4/m;", "f", "LO4/m;", "()LO4/m;", "inputMergerFactory", "LO4/I;", "g", "LO4/I;", "k", "()LO4/I;", "runnableScheduler", "Lo2/a;", "", "h", "Lo2/a;", "()Lo2/a;", "initializationExceptionHandler", "i", "l", "schedulingExceptionHandler", "LO4/Q;", "j", "r", "workerInitializationExceptionHandler", "p", "workerExecutionExceptionHandler", "", "Ljava/lang/String;", "()Ljava/lang/String;", "defaultProcessName", "", "I", "()I", "minimumLoggingLevel", "n", "minJobSchedulerId", "maxJobSchedulerId", "contentUriTriggerWorkersLimit", "maxSchedulerLimit", "", "Z", "isUsingDefaultTaskExecutor", "()Z", "s", "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "isMarkingJobsAsImportantWhileForeground", "LO4/K;", "t", "LO4/K;", "()LO4/K;", "tracer", "u", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workerCoroutineContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor taskExecutor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4354b clock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final S workerFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC4365m inputMergerFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final I runnableScheduler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16068a<Throwable> initializationExceptionHandler;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16068a<Throwable> schedulingExceptionHandler;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16068a<Q> workerInitializationExceptionHandler;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16068a<Q> workerExecutionExceptionHandler;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String defaultProcessName;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int minimumLoggingLevel;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int minJobSchedulerId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int maxJobSchedulerId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int contentUriTriggerWorkersLimit;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int maxSchedulerLimit;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isUsingDefaultTaskExecutor;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isMarkingJobsAsImportantWhileForeground;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final K tracer;

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R$\u00101\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u0013\u0010.\"\u0004\b/\u00100R$\u00108\u001a\u0004\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010@\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b,\u0010=\"\u0004\b>\u0010?R*\u0010D\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R*\u0010I\u001a\n\u0012\u0004\u0012\u00020E\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R*\u0010M\u001a\n\u0012\u0004\u0012\u00020E\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010=\"\u0004\bL\u0010?R$\u0010T\u001a\u0004\u0018\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\b!\u0010Q\"\u0004\bR\u0010SR\"\u0010Z\u001a\u00020U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010V\u001a\u0004\b;\u0010W\"\u0004\bX\u0010YR\"\u0010\\\u001a\u00020U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010V\u001a\u0004\bO\u0010W\"\u0004\b[\u0010YR\"\u0010^\u001a\u00020U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010V\u001a\u0004\bF\u0010W\"\u0004\b]\u0010YR\"\u0010a\u001a\u00020U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010V\u001a\u0004\bJ\u0010W\"\u0004\b`\u0010YR\"\u0010c\u001a\u00020U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010V\u001a\u0004\b\u001a\u0010W\"\u0004\bb\u0010YR\"\u0010i\u001a\u00020d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010e\u001a\u0004\bA\u0010f\"\u0004\bg\u0010hR$\u0010o\u001a\u0004\u0018\u00010j8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010k\u001a\u0004\b_\u0010l\"\u0004\bm\u0010n¨\u0006p"}, d2 = {"Landroidx/work/a$a;", "", "<init>", "()V", "LO4/S;", "workerFactory", "u", "(LO4/S;)Landroidx/work/a$a;", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "q", "()Lkotlin/coroutines/CoroutineContext;", "setWorkerContext$work_runtime_release", "(Lkotlin/coroutines/CoroutineContext;)V", "workerContext", "c", "LO4/S;", "s", "()LO4/S;", "setWorkerFactory$work_runtime_release", "(LO4/S;)V", "LO4/m;", "d", "LO4/m;", "g", "()LO4/m;", "setInputMergerFactory$work_runtime_release", "(LO4/m;)V", "inputMergerFactory", "o", "setTaskExecutor$work_runtime_release", "taskExecutor", "LO4/b;", "f", "LO4/b;", "()LO4/b;", "setClock$work_runtime_release", "(LO4/b;)V", "clock", "LO4/I;", "LO4/I;", "m", "()LO4/I;", "setRunnableScheduler$work_runtime_release", "(LO4/I;)V", "runnableScheduler", "Lo2/a;", "", "h", "Lo2/a;", "()Lo2/a;", "setInitializationExceptionHandler$work_runtime_release", "(Lo2/a;)V", "initializationExceptionHandler", "i", "n", "setSchedulingExceptionHandler$work_runtime_release", "schedulingExceptionHandler", "LO4/Q;", "j", "t", "setWorkerInitializationExceptionHandler$work_runtime_release", "workerInitializationExceptionHandler", "k", "r", "setWorkerExecutionExceptionHandler$work_runtime_release", "workerExecutionExceptionHandler", "", "l", "Ljava/lang/String;", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "defaultProcessName", "", "I", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "loggingLevel", "setMinJobSchedulerId$work_runtime_release", "minJobSchedulerId", "setMaxJobSchedulerId$work_runtime_release", "maxJobSchedulerId", "p", "setMaxSchedulerLimit$work_runtime_release", "maxSchedulerLimit", "setContentUriTriggerWorkersLimit$work_runtime_release", "contentUriTriggerWorkersLimit", "", "Z", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "markJobsAsImportantWhileForeground", "LO4/K;", "LO4/K;", "()LO4/K;", "setTracer$work_runtime_release", "(LO4/K;)V", "tracer", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C1169a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Executor executor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private CoroutineContext workerContext;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private S workerFactory;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private AbstractC4365m inputMergerFactory;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Executor taskExecutor;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private InterfaceC4354b clock;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private I runnableScheduler;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private InterfaceC16068a<Throwable> initializationExceptionHandler;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private InterfaceC16068a<Throwable> schedulingExceptionHandler;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private InterfaceC16068a<Q> workerInitializationExceptionHandler;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private InterfaceC16068a<Q> workerExecutionExceptionHandler;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private String defaultProcessName;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private int minJobSchedulerId;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private K tracer;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private int loggingLevel = 4;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int maxJobSchedulerId = a.e.API_PRIORITY_OTHER;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private int maxSchedulerLimit = 20;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private int contentUriTriggerWorkersLimit = 8;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean markJobsAsImportantWhileForeground = true;

        public final a a() {
            return new a(this);
        }

        /* renamed from: b, reason: from getter */
        public final InterfaceC4354b getClock() {
            return this.clock;
        }

        /* renamed from: c, reason: from getter */
        public final int getContentUriTriggerWorkersLimit() {
            return this.contentUriTriggerWorkersLimit;
        }

        /* renamed from: d, reason: from getter */
        public final String getDefaultProcessName() {
            return this.defaultProcessName;
        }

        /* renamed from: e, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        public final InterfaceC16068a<Throwable> f() {
            return this.initializationExceptionHandler;
        }

        /* renamed from: g, reason: from getter */
        public final AbstractC4365m getInputMergerFactory() {
            return this.inputMergerFactory;
        }

        /* renamed from: h, reason: from getter */
        public final int getLoggingLevel() {
            return this.loggingLevel;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getMarkJobsAsImportantWhileForeground() {
            return this.markJobsAsImportantWhileForeground;
        }

        /* renamed from: j, reason: from getter */
        public final int getMaxJobSchedulerId() {
            return this.maxJobSchedulerId;
        }

        /* renamed from: k, reason: from getter */
        public final int getMaxSchedulerLimit() {
            return this.maxSchedulerLimit;
        }

        /* renamed from: l, reason: from getter */
        public final int getMinJobSchedulerId() {
            return this.minJobSchedulerId;
        }

        /* renamed from: m, reason: from getter */
        public final I getRunnableScheduler() {
            return this.runnableScheduler;
        }

        public final InterfaceC16068a<Throwable> n() {
            return this.schedulingExceptionHandler;
        }

        /* renamed from: o, reason: from getter */
        public final Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        /* renamed from: p, reason: from getter */
        public final K getTracer() {
            return this.tracer;
        }

        /* renamed from: q, reason: from getter */
        public final CoroutineContext getWorkerContext() {
            return this.workerContext;
        }

        public final InterfaceC16068a<Q> r() {
            return this.workerExecutionExceptionHandler;
        }

        /* renamed from: s, reason: from getter */
        public final S getWorkerFactory() {
            return this.workerFactory;
        }

        public final InterfaceC16068a<Q> t() {
            return this.workerInitializationExceptionHandler;
        }

        public final C1169a u(S workerFactory) {
            Intrinsics.j(workerFactory, "workerFactory");
            this.workerFactory = workerFactory;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/work/a$c;", "", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "workManagerConfiguration", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        a a();
    }

    public a(C1169a builder) {
        Intrinsics.j(builder, "builder");
        CoroutineContext workerContext = builder.getWorkerContext();
        Executor executor = builder.getExecutor();
        if (executor == null) {
            executor = workerContext != null ? C4355c.d(workerContext) : null;
            if (executor == null) {
                executor = C4355c.e(false);
            }
        }
        this.executor = executor;
        this.workerCoroutineContext = workerContext == null ? builder.getExecutor() != null ? C15830u0.b(executor) : C15800f0.a() : workerContext;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor() == null;
        Executor taskExecutor = builder.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? C4355c.e(true) : taskExecutor;
        InterfaceC4354b clock = builder.getClock();
        this.clock = clock == null ? new J() : clock;
        S workerFactory = builder.getWorkerFactory();
        this.workerFactory = workerFactory == null ? C4358f.f23176a : workerFactory;
        AbstractC4365m inputMergerFactory = builder.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? C4375x.f23219a : inputMergerFactory;
        I runnableScheduler = builder.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new C4570e() : runnableScheduler;
        this.minimumLoggingLevel = builder.getLoggingLevel();
        this.minJobSchedulerId = builder.getMinJobSchedulerId();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit();
        this.initializationExceptionHandler = builder.f();
        this.schedulingExceptionHandler = builder.n();
        this.workerInitializationExceptionHandler = builder.t();
        this.workerExecutionExceptionHandler = builder.r();
        this.defaultProcessName = builder.getDefaultProcessName();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit();
        this.isMarkingJobsAsImportantWhileForeground = builder.getMarkJobsAsImportantWhileForeground();
        K tracer = builder.getTracer();
        this.tracer = tracer == null ? C4355c.f() : tracer;
    }

    /* renamed from: a, reason: from getter */
    public final InterfaceC4354b getClock() {
        return this.clock;
    }

    /* renamed from: b, reason: from getter */
    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    /* renamed from: c, reason: from getter */
    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    /* renamed from: d, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    public final InterfaceC16068a<Throwable> e() {
        return this.initializationExceptionHandler;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC4365m getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    /* renamed from: g, reason: from getter */
    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    /* renamed from: h, reason: from getter */
    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    /* renamed from: i, reason: from getter */
    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    /* renamed from: j, reason: from getter */
    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    /* renamed from: k, reason: from getter */
    public final I getRunnableScheduler() {
        return this.runnableScheduler;
    }

    public final InterfaceC16068a<Throwable> l() {
        return this.schedulingExceptionHandler;
    }

    /* renamed from: m, reason: from getter */
    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    /* renamed from: n, reason: from getter */
    public final K getTracer() {
        return this.tracer;
    }

    /* renamed from: o, reason: from getter */
    public final CoroutineContext getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    public final InterfaceC16068a<Q> p() {
        return this.workerExecutionExceptionHandler;
    }

    /* renamed from: q, reason: from getter */
    public final S getWorkerFactory() {
        return this.workerFactory;
    }

    public final InterfaceC16068a<Q> r() {
        return this.workerInitializationExceptionHandler;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }
}
