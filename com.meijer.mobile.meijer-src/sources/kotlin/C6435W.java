package kotlin;

import androidx.compose.animation.core.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15784P;
import mv.InterfaceC15783O;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lc0/W;", "", "<init>", "()V", "Lc0/W$a;", "mutator", "", "f", "(Lc0/W$a;)V", "R", "Lc0/V;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "d", "(Lc0/V;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lwv/a;", "b", "Lwv/a;", "mutex", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6435W {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex = wv.g.b(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lc0/W$a;", "", "Lc0/V;", "priority", "Lmv/C0;", "job", "<init>", "(Lc0/V;Lmv/C0;)V", "other", "", "a", "(Lc0/W$a;)Z", "", "b", "()V", "Lc0/V;", "getPriority", "()Lc0/V;", "Lmv/C0;", "getJob", "()Lmv/C0;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c0.W$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EnumC6434V priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C0 job;

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            this.job.d(new MutationInterruptedException());
        }

        public a(EnumC6434V enumC6434V, C0 c02) {
            this.priority = enumC6434V;
            this.job = c02;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lmv/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {176, 124}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: c0.W$b */
    static final class b<R> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f60767a;

        /* renamed from: b, reason: collision with root package name */
        Object f60768b;

        /* renamed from: c, reason: collision with root package name */
        Object f60769c;

        /* renamed from: d, reason: collision with root package name */
        int f60770d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f60771e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC6434V f60772f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6435W f60773g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super R>, Object> f60774h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(EnumC6434V enumC6434V, C6435W c6435w, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f60772f = enumC6434V;
            this.f60773g = c6435w;
            this.f60774h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f60772f, this.f60773g, this.f60774h, continuation);
            bVar.f60771e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super R> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, wv.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC17929a interfaceC17929a;
            a aVar;
            C6435W c6435w;
            Function1<Continuation<? super R>, Object> function1;
            Throwable th2;
            C6435W c6435w2;
            a aVar2;
            InterfaceC17929a interfaceC17929a2;
            Object objF = IntrinsicsKt.f();
            ?? r12 = this.f60770d;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                c6435w2 = (C6435W) this.f60768b;
                                interfaceC17929a2 = (InterfaceC17929a) this.f60767a;
                                aVar2 = (a) this.f60771e;
                                try {
                                    ResultKt.b(obj);
                                    U.d.a(c6435w2.currentMutator, aVar2, null);
                                    interfaceC17929a2.h(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    U.d.a(c6435w2.currentMutator, aVar2, null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6435w = (C6435W) this.f60769c;
                        function1 = (Function1) this.f60768b;
                        InterfaceC17929a interfaceC17929a3 = (InterfaceC17929a) this.f60767a;
                        aVar = (a) this.f60771e;
                        ResultKt.b(obj);
                        interfaceC17929a = interfaceC17929a3;
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f60771e;
                        EnumC6434V enumC6434V = this.f60772f;
                        CoroutineContext.Element elementG = interfaceC15783O.getCoroutineContext().g(C0.INSTANCE);
                        Intrinsics.g(elementG);
                        a aVar3 = new a(enumC6434V, (C0) elementG);
                        this.f60773g.f(aVar3);
                        interfaceC17929a = this.f60773g.mutex;
                        Function1<Continuation<? super R>, Object> function12 = this.f60774h;
                        C6435W c6435w3 = this.f60773g;
                        this.f60771e = aVar3;
                        this.f60767a = interfaceC17929a;
                        this.f60768b = function12;
                        this.f60769c = c6435w3;
                        this.f60770d = 1;
                        if (interfaceC17929a.g(null, this) != objF) {
                            aVar = aVar3;
                            c6435w = c6435w3;
                            function1 = function12;
                        }
                        return objF;
                    }
                    this.f60771e = aVar;
                    this.f60767a = interfaceC17929a;
                    this.f60768b = c6435w;
                    this.f60769c = null;
                    this.f60770d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objF) {
                        c6435w2 = c6435w;
                        interfaceC17929a2 = interfaceC17929a;
                        obj = objInvoke;
                        aVar2 = aVar;
                        U.d.a(c6435w2.currentMutator, aVar2, null);
                        interfaceC17929a2.h(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    c6435w2 = c6435w;
                    aVar2 = aVar;
                    U.d.a(c6435w2.currentMutator, aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.h(null);
                throw th5;
            }
        }
    }

    public static /* synthetic */ Object e(C6435W c6435w, EnumC6434V enumC6434V, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC6434V = EnumC6434V.f60758a;
        }
        return c6435w.d(enumC6434V, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a mutator) {
        a aVar;
        do {
            aVar = this.currentMutator.get();
            if (aVar != null && !mutator.a(aVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!U.d.a(this.currentMutator, aVar, mutator));
        if (aVar != null) {
            aVar.b();
        }
    }

    public final <R> Object d(EnumC6434V enumC6434V, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return C15784P.g(new b(enumC6434V, this, function1, null), continuation);
    }
}
