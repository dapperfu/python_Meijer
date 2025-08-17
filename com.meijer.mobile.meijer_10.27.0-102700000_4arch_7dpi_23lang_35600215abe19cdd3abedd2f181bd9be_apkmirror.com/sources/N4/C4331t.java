package N4;

import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C0;
import qv.C16623P;
import qv.C16648k;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lqv/Q;", "start", "Lkotlin/Function2;", "Lqv/O;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/common/util/concurrent/q;", "j", "(Lkotlin/coroutines/CoroutineContext;Lqv/Q;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/q;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: N4.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4331t {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: N4.t$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f21431a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21432b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC16622O, Continuation<? super T>, Object> f21433c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.a<T> f21434d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> function2, c.a<T> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21433c = function2;
            this.f21434d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f21433c, this.f21434d, continuation);
            aVar.f21432b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f21431a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f21432b;
                    Function2<InterfaceC16622O, Continuation<? super T>, Object> function2 = this.f21433c;
                    this.f21431a = 1;
                    obj = function2.invoke(interfaceC16622O, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                this.f21434d.c(obj);
            } catch (CancellationException unused) {
                this.f21434d.d();
            } catch (Throwable th2) {
                this.f21434d.f(th2);
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    public static final <V> com.google.common.util.concurrent.q<V> f(final Executor executor, final String debugTag, final Function0<? extends V> block) {
        Intrinsics.j(executor, "<this>");
        Intrinsics.j(debugTag, "debugTag");
        Intrinsics.j(block, "block");
        com.google.common.util.concurrent.q<V> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: N4.o
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return C4331t.g(executor, debugTag, block, aVar);
            }
        });
        Intrinsics.i(qVarA, "getFuture { completer ->… }\n        debugTag\n    }");
        return qVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Executor executor, String str, final Function0 function0, final c.a completer) {
        Intrinsics.j(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.a(new Runnable() { // from class: N4.q
            @Override // java.lang.Runnable
            public final void run() {
                C4331t.h(atomicBoolean);
            }
        }, EnumC4319g.INSTANCE);
        executor.execute(new Runnable() { // from class: N4.r
            @Override // java.lang.Runnable
            public final void run() {
                C4331t.i(atomicBoolean, completer, function0);
            }
        });
        return str;
    }

    public static final <T> com.google.common.util.concurrent.q<T> j(final CoroutineContext context, final EnumC16624Q start, final Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.j(context, "context");
        Intrinsics.j(start, "start");
        Intrinsics.j(block, "block");
        com.google.common.util.concurrent.q<T> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: N4.p
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return C4331t.l(context, start, block, aVar);
            }
        });
        Intrinsics.i(qVarA, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return qVarA;
    }

    public static /* synthetic */ com.google.common.util.concurrent.q k(CoroutineContext coroutineContext, EnumC16624Q enumC16624Q, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f142646a;
        }
        if ((i10 & 2) != 0) {
            enumC16624Q = EnumC16624Q.f157611a;
        }
        return j(coroutineContext, enumC16624Q, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(CoroutineContext coroutineContext, EnumC16624Q enumC16624Q, Function2 function2, c.a completer) {
        Intrinsics.j(completer, "completer");
        final C0 c02 = (C0) coroutineContext.g(C0.INSTANCE);
        completer.a(new Runnable() { // from class: N4.s
            @Override // java.lang.Runnable
            public final void run() {
                C4331t.m(c02);
            }
        }, EnumC4319g.INSTANCE);
        return C16648k.d(C16623P.a(coroutineContext), null, enumC16624Q, new a(function2, completer, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(C0 c02) {
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AtomicBoolean atomicBoolean, c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }
}
