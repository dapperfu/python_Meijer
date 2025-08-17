package androidx.work;

import N4.C4322j;
import N4.C4331t;
import android.content.Context;
import androidx.work.c;
import com.google.common.util.concurrent.q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.AbstractC16618K;
import qv.C16639f0;
import qv.F0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\u00020\u00168\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/q;", "Landroidx/work/c$a;", "startWork", "()Lcom/google/common/util/concurrent/q;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LN4/j;", "e", "getForegroundInfoAsync", "", "onStopped", "()V", "f", "Landroidx/work/WorkerParameters;", "Lqv/K;", "g", "Lqv/K;", "d", "()Lqv/K;", "getCoroutineContext$annotations", "coroutineContext", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CoroutineWorker extends androidx.work.c {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters params;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K coroutineContext;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/CoroutineWorker$a;", "Lqv/K;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "L0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "R0", "(Lkotlin/coroutines/CoroutineContext;)Z", "d", "Lqv/K;", "getDispatcher", "()Lqv/K;", "dispatcher", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends AbstractC16618K {

        /* renamed from: c, reason: collision with root package name */
        public static final a f59088c = new a();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final AbstractC16618K dispatcher = C16639f0.a();

        @Override // qv.AbstractC16618K
        public void L0(CoroutineContext context, Runnable block) {
            Intrinsics.j(context, "context");
            Intrinsics.j(block, "block");
            dispatcher.L0(context, block);
        }

        @Override // qv.AbstractC16618K
        public boolean R0(CoroutineContext context) {
            Intrinsics.j(context, "context");
            return dispatcher.R0(context);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LN4/j;", "<anonymous>", "(Lqv/O;)LN4/j;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super C4322j>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f59090a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super C4322j> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f59090a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f59090a = 1;
            Object objE = coroutineWorker.e(this);
            if (objE == objF) {
                return objF;
            }
            return objE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Landroidx/work/c$a;", "<anonymous>", "(Lqv/O;)Landroidx/work/c$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {67}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super c.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f59092a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super c.a> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f59092a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f59092a = 1;
            Object objB = coroutineWorker.b(this);
            if (objB == objF) {
                return objF;
            }
            return objB;
        }
    }

    public abstract Object b(Continuation<? super c.a> continuation);

    public Object e(Continuation<? super C4322j> continuation) {
        return f(this, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.j(appContext, "appContext");
        Intrinsics.j(params, "params");
        this.params = params;
        this.coroutineContext = a.f59088c;
    }

    static /* synthetic */ Object f(CoroutineWorker coroutineWorker, Continuation<? super C4322j> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    /* renamed from: d, reason: from getter */
    public AbstractC16618K getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.work.c
    public final q<C4322j> getForegroundInfoAsync() {
        return C4331t.k(getCoroutineContext().m0(F0.b(null, 1, null)), null, new b(null), 2, null);
    }

    @Override // androidx.work.c
    public final void onStopped() {
        super.onStopped();
    }

    @Override // androidx.work.c
    public final q<c.a> startWork() {
        CoroutineContext coroutineContextL;
        if (!Intrinsics.e(getCoroutineContext(), a.f59088c)) {
            coroutineContextL = getCoroutineContext();
        } else {
            coroutineContextL = this.params.l();
        }
        Intrinsics.i(coroutineContextL, "if (coroutineContext != …rkerContext\n            }");
        return C4331t.k(coroutineContextL.m0(F0.b(null, 1, null)), null, new c(null), 2, null);
    }
}
