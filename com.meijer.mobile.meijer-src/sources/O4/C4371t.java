package O4;

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
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lmv/Q;", "start", "Lkotlin/Function2;", "Lmv/O;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/common/util/concurrent/q;", "j", "(Lkotlin/coroutines/CoroutineContext;Lmv/Q;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/q;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O4.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4371t {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: O4.t$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f23204a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23205b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC15783O, Continuation<? super T>, Object> f23206c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.a<T> f23207d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2, c.a<T> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f23206c = function2;
            this.f23207d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f23206c, this.f23207d, continuation);
            aVar.f23205b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f23204a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f23205b;
                    Function2<InterfaceC15783O, Continuation<? super T>, Object> function2 = this.f23206c;
                    this.f23204a = 1;
                    obj = function2.invoke(interfaceC15783O, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                this.f23207d.c(obj);
            } catch (CancellationException unused) {
                this.f23207d.d();
            } catch (Throwable th2) {
                this.f23207d.f(th2);
            }
            return Unit.f143329a;
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
        com.google.common.util.concurrent.q<V> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: O4.o
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return C4371t.g(executor, debugTag, block, aVar);
            }
        });
        Intrinsics.i(qVarA, "getFuture { completer ->… }\n        debugTag\n    }");
        return qVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Executor executor, String str, final Function0 function0, final c.a completer) {
        Intrinsics.j(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.a(new Runnable() { // from class: O4.q
            @Override // java.lang.Runnable
            public final void run() {
                C4371t.h(atomicBoolean);
            }
        }, EnumC4359g.INSTANCE);
        executor.execute(new Runnable() { // from class: O4.r
            @Override // java.lang.Runnable
            public final void run() {
                C4371t.i(atomicBoolean, completer, function0);
            }
        });
        return str;
    }

    public static final <T> com.google.common.util.concurrent.q<T> j(final CoroutineContext context, final EnumC15785Q start, final Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.j(context, "context");
        Intrinsics.j(start, "start");
        Intrinsics.j(block, "block");
        com.google.common.util.concurrent.q<T> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: O4.p
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return C4371t.l(context, start, block, aVar);
            }
        });
        Intrinsics.i(qVarA, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return qVarA;
    }

    public static /* synthetic */ com.google.common.util.concurrent.q k(CoroutineContext coroutineContext, EnumC15785Q enumC15785Q, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        if ((i10 & 2) != 0) {
            enumC15785Q = EnumC15785Q.f151685a;
        }
        return j(coroutineContext, enumC15785Q, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(CoroutineContext coroutineContext, EnumC15785Q enumC15785Q, Function2 function2, c.a completer) {
        Intrinsics.j(completer, "completer");
        final C0 c02 = (C0) coroutineContext.g(C0.INSTANCE);
        completer.a(new Runnable() { // from class: O4.s
            @Override // java.lang.Runnable
            public final void run() {
                C4371t.m(c02);
            }
        }, EnumC4359g.INSTANCE);
        return C15809k.d(C15784P.a(coroutineContext), null, enumC15785Q, new a(function2, completer, null), 1, null);
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
