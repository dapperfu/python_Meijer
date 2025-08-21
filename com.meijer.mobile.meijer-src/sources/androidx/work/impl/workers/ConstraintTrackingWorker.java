package androidx.work.impl.workers;

import S4.i;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.model.WorkSpec;
import com.google.common.util.concurrent.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15805i;
import mv.C15830u0;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/c;", "delegate", "LS4/i;", "workConstraintsTracker", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "i", "(Landroidx/work/c;LS4/i;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "h", "Landroidx/work/WorkerParameters;", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters workerParameters;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "stopReason", "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends CancellationException {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int stopReason;

        /* renamed from: a, reason: from getter */
        public final int getStopReason() {
            return this.stopReason;
        }

        public a(int i10) {
            this.stopReason = i10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Landroidx/work/c$a;", "<anonymous>", "(Lmv/O;)Landroidx/work/c$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2", f = "ConstraintTrackingWorker.kt", l = {58}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super c.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f59545a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConstraintTrackingWorker.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super c.a> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f59545a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            this.f59545a = 1;
            Object objJ = constraintTrackingWorker.j(this);
            if (objJ == objF) {
                return objF;
            }
            return objJ;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", l = {125}, m = "runWorker")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f59547a;

        /* renamed from: c, reason: collision with root package name */
        int f59549c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59547a = obj;
            this.f59549c |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.i(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lmv/O;)Landroidx/work/c$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", l = {134}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super c.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f59550a;

        /* renamed from: b, reason: collision with root package name */
        Object f59551b;

        /* renamed from: c, reason: collision with root package name */
        int f59552c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f59553d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f59554e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f59555f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ WorkSpec f59556g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1", f = "ConstraintTrackingWorker.kt", l = {129}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f59557a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f59558b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ WorkSpec f59559c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f59560d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ q<c.a> f59561e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f59558b, this.f59559c, this.f59560d, this.f59561e, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, WorkSpec workSpec, AtomicInteger atomicInteger, q<c.a> qVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f59558b = iVar;
                this.f59559c = workSpec;
                this.f59560d = atomicInteger;
                this.f59561e = qVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f59557a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    i iVar = this.f59558b;
                    WorkSpec workSpec = this.f59559c;
                    this.f59557a = 1;
                    obj = Z4.a.c(iVar, workSpec, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                this.f59560d.set(((Number) obj).intValue());
                this.f59561e.cancel(true);
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f59554e, this.f59555f, this.f59556g, continuation);
            dVar.f59553d = obj;
            return dVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.work.c cVar, i iVar, WorkSpec workSpec, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f59554e = cVar;
            this.f59555f = iVar;
            this.f59556g = workSpec;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super c.a> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, mv.C0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", l = {97}, m = "setupAndRunConstraintTrackingWork")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f59562a;

        /* renamed from: b, reason: collision with root package name */
        Object f59563b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f59564c;

        /* renamed from: e, reason: collision with root package name */
        int f59566e;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59564c = obj;
            this.f59566e |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.j(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Landroidx/work/c$a;", "<anonymous>", "(Lmv/O;)Landroidx/work/c$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", f = "ConstraintTrackingWorker.kt", l = {98}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super c.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f59567a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f59569c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f59570d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ WorkSpec f59571e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConstraintTrackingWorker.this.new f(this.f59569c, this.f59570d, this.f59571e, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.work.c cVar, i iVar, WorkSpec workSpec, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f59569c = cVar;
            this.f59570d = iVar;
            this.f59571e = workSpec;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super c.a> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f59567a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            androidx.work.c cVar = this.f59569c;
            i iVar = this.f59570d;
            WorkSpec workSpec = this.f59571e;
            this.f59567a = 1;
            Object objI = constraintTrackingWorker.i(cVar, iVar, workSpec, this);
            if (objI == objF) {
                return objF;
            }
            return objI;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.j(appContext, "appContext");
        Intrinsics.j(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(androidx.work.c r5, S4.i r6, androidx.work.impl.model.WorkSpec r7, kotlin.coroutines.Continuation<? super androidx.work.c.a> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.c
            if (r0 == 0) goto L13
            r0 = r8
            androidx.work.impl.workers.ConstraintTrackingWorker$c r0 = (androidx.work.impl.workers.ConstraintTrackingWorker.c) r0
            int r1 = r0.f59549c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59549c = r1
            goto L18
        L13:
            androidx.work.impl.workers.ConstraintTrackingWorker$c r0 = new androidx.work.impl.workers.ConstraintTrackingWorker$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f59547a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f59549c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r8)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r8)
            androidx.work.impl.workers.ConstraintTrackingWorker$d r8 = new androidx.work.impl.workers.ConstraintTrackingWorker$d
            r2 = 0
            r8.<init>(r5, r6, r7, r2)
            r0.f59549c = r3
            java.lang.Object r8 = mv.C15784P.g(r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "delegate: ListenableWork….cancel()\n        }\n    }"
            kotlin.jvm.internal.Intrinsics.i(r8, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.i(androidx.work.c, S4.i, androidx.work.impl.model.WorkSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation<? super androidx.work.c.a> r15) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public Object b(Continuation<? super c.a> continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.i(backgroundExecutor, "backgroundExecutor");
        return C15805i.g(C15830u0.b(backgroundExecutor), new b(null), continuation);
    }
}
