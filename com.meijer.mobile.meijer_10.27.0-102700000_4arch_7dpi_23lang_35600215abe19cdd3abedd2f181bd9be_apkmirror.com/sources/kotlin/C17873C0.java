package kotlin;

import Av.a;
import d0.EnumC13431E;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.C16623P;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0015j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lx0/C0;", "", "<init>", "()V", "Lx0/C0$a;", "mutator", "", "f", "(Lx0/C0$a;)V", "R", "Ld0/E;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "d", "(Ld0/E;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "e", "(Lkotlin/jvm/functions/Function0;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material/InternalAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "LAv/a;", "b", "LAv/a;", "mutex", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.C0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17873C0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Av.a mutex = Av.g.b(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lx0/C0$a;", "", "Ld0/E;", "priority", "Lqv/C0;", "job", "<init>", "(Ld0/E;Lqv/C0;)V", "other", "", "a", "(Lx0/C0$a;)Z", "", "b", "()V", "Ld0/E;", "getPriority", "()Ld0/E;", "Lqv/C0;", "getJob", "()Lqv/C0;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C0$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EnumC13431E priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C0 job;

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            C0.a.a(this.job, null, 1, null);
        }

        public a(EnumC13431E enumC13431E, C0 c02) {
            this.priority = enumC13431E;
            this.job = c02;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lqv/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {180, 103}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: x0.C0$b */
    static final class b<R> extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f166773a;

        /* renamed from: b, reason: collision with root package name */
        Object f166774b;

        /* renamed from: c, reason: collision with root package name */
        Object f166775c;

        /* renamed from: d, reason: collision with root package name */
        int f166776d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f166777e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC13431E f166778f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17873C0 f166779g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super R>, Object> f166780h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(EnumC13431E enumC13431E, C17873C0 c17873c0, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f166778f = enumC13431E;
            this.f166779g = c17873c0;
            this.f166780h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f166778f, this.f166779g, this.f166780h, continuation);
            bVar.f166777e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super R> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Av.a, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Av.a aVar;
            a aVar2;
            C17873C0 c17873c0;
            Function1<Continuation<? super R>, Object> function1;
            Throwable th2;
            C17873C0 c17873c02;
            a aVar3;
            Av.a aVar4;
            Object objF = IntrinsicsKt.f();
            ?? r12 = this.f166776d;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                c17873c02 = (C17873C0) this.f166774b;
                                aVar4 = (Av.a) this.f166773a;
                                aVar3 = (a) this.f166777e;
                                try {
                                    ResultKt.b(obj);
                                    U.d.a(c17873c02.currentMutator, aVar3, null);
                                    aVar4.h(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    U.d.a(c17873c02.currentMutator, aVar3, null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c17873c0 = (C17873C0) this.f166775c;
                        function1 = (Function1) this.f166774b;
                        Av.a aVar5 = (Av.a) this.f166773a;
                        aVar2 = (a) this.f166777e;
                        ResultKt.b(obj);
                        aVar = aVar5;
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f166777e;
                        EnumC13431E enumC13431E = this.f166778f;
                        CoroutineContext.Element elementG = interfaceC16622O.getCoroutineContext().g(C0.INSTANCE);
                        Intrinsics.g(elementG);
                        a aVar6 = new a(enumC13431E, (C0) elementG);
                        this.f166779g.f(aVar6);
                        aVar = this.f166779g.mutex;
                        Function1<Continuation<? super R>, Object> function12 = this.f166780h;
                        C17873C0 c17873c03 = this.f166779g;
                        this.f166777e = aVar6;
                        this.f166773a = aVar;
                        this.f166774b = function12;
                        this.f166775c = c17873c03;
                        this.f166776d = 1;
                        if (aVar.g(null, this) != objF) {
                            aVar2 = aVar6;
                            c17873c0 = c17873c03;
                            function1 = function12;
                        }
                        return objF;
                    }
                    this.f166777e = aVar2;
                    this.f166773a = aVar;
                    this.f166774b = c17873c0;
                    this.f166775c = null;
                    this.f166776d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objF) {
                        c17873c02 = c17873c0;
                        aVar4 = aVar;
                        obj = objInvoke;
                        aVar3 = aVar2;
                        U.d.a(c17873c02.currentMutator, aVar3, null);
                        aVar4.h(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    c17873c02 = c17873c0;
                    aVar3 = aVar2;
                    U.d.a(c17873c02.currentMutator, aVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.h(null);
                throw th5;
            }
        }
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

    public final <R> Object d(EnumC13431E enumC13431E, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return C16623P.g(new b(enumC13431E, this, function1, null), continuation);
    }

    public final boolean e(Function0<Unit> block) {
        boolean zB = a.C0027a.b(this.mutex, null, 1, null);
        if (!zB) {
            return zB;
        }
        try {
            block.invoke();
            return zB;
        } finally {
            a.C0027a.c(this.mutex, null, 1, null);
        }
    }
}
