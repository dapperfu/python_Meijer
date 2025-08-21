package kotlin;

import d0.EnumC13564E;
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
import mv.C0;
import mv.C15784P;
import mv.InterfaceC15783O;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0015j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lx0/C0;", "", "<init>", "()V", "Lx0/C0$a;", "mutator", "", "f", "(Lx0/C0$a;)V", "R", "Ld0/E;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "d", "(Ld0/E;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "e", "(Lkotlin/jvm/functions/Function0;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material/InternalAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lwv/a;", "b", "Lwv/a;", "mutex", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.C0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17939C0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex = wv.g.b(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lx0/C0$a;", "", "Ld0/E;", "priority", "Lmv/C0;", "job", "<init>", "(Ld0/E;Lmv/C0;)V", "other", "", "a", "(Lx0/C0$a;)Z", "", "b", "()V", "Ld0/E;", "getPriority", "()Ld0/E;", "Lmv/C0;", "getJob", "()Lmv/C0;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C0$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EnumC13564E priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C0 job;

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            C0.a.a(this.job, null, 1, null);
        }

        public a(EnumC13564E enumC13564E, C0 c02) {
            this.priority = enumC13564E;
            this.job = c02;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lmv/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {180, 103}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: x0.C0$b */
    static final class b<R> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f167861a;

        /* renamed from: b, reason: collision with root package name */
        Object f167862b;

        /* renamed from: c, reason: collision with root package name */
        Object f167863c;

        /* renamed from: d, reason: collision with root package name */
        int f167864d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f167865e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC13564E f167866f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17939C0 f167867g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super R>, Object> f167868h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(EnumC13564E enumC13564E, C17939C0 c17939c0, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f167866f = enumC13564E;
            this.f167867g = c17939c0;
            this.f167868h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f167866f, this.f167867g, this.f167868h, continuation);
            bVar.f167865e = obj;
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
            C17939C0 c17939c0;
            Function1<Continuation<? super R>, Object> function1;
            Throwable th2;
            C17939C0 c17939c02;
            a aVar2;
            InterfaceC17929a interfaceC17929a2;
            Object objF = IntrinsicsKt.f();
            ?? r12 = this.f167864d;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                c17939c02 = (C17939C0) this.f167862b;
                                interfaceC17929a2 = (InterfaceC17929a) this.f167861a;
                                aVar2 = (a) this.f167865e;
                                try {
                                    ResultKt.b(obj);
                                    U.d.a(c17939c02.currentMutator, aVar2, null);
                                    interfaceC17929a2.h(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    U.d.a(c17939c02.currentMutator, aVar2, null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c17939c0 = (C17939C0) this.f167863c;
                        function1 = (Function1) this.f167862b;
                        InterfaceC17929a interfaceC17929a3 = (InterfaceC17929a) this.f167861a;
                        aVar = (a) this.f167865e;
                        ResultKt.b(obj);
                        interfaceC17929a = interfaceC17929a3;
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f167865e;
                        EnumC13564E enumC13564E = this.f167866f;
                        CoroutineContext.Element elementG = interfaceC15783O.getCoroutineContext().g(C0.INSTANCE);
                        Intrinsics.g(elementG);
                        a aVar3 = new a(enumC13564E, (C0) elementG);
                        this.f167867g.f(aVar3);
                        interfaceC17929a = this.f167867g.mutex;
                        Function1<Continuation<? super R>, Object> function12 = this.f167868h;
                        C17939C0 c17939c03 = this.f167867g;
                        this.f167865e = aVar3;
                        this.f167861a = interfaceC17929a;
                        this.f167862b = function12;
                        this.f167863c = c17939c03;
                        this.f167864d = 1;
                        if (interfaceC17929a.g(null, this) != objF) {
                            aVar = aVar3;
                            c17939c0 = c17939c03;
                            function1 = function12;
                        }
                        return objF;
                    }
                    this.f167865e = aVar;
                    this.f167861a = interfaceC17929a;
                    this.f167862b = c17939c0;
                    this.f167863c = null;
                    this.f167864d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objF) {
                        c17939c02 = c17939c0;
                        interfaceC17929a2 = interfaceC17929a;
                        obj = objInvoke;
                        aVar2 = aVar;
                        U.d.a(c17939c02.currentMutator, aVar2, null);
                        interfaceC17929a2.h(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    c17939c02 = c17939c0;
                    aVar2 = aVar;
                    U.d.a(c17939c02.currentMutator, aVar2, null);
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

    public final <R> Object d(EnumC13564E enumC13564E, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return C15784P.g(new b(enumC13564E, this, function1, null), continuation);
    }

    public final boolean e(Function0<Unit> block) {
        boolean zB = InterfaceC17929a.C2673a.b(this.mutex, null, 1, null);
        if (!zB) {
            return zB;
        }
        try {
            block.invoke();
            return zB;
        } finally {
            InterfaceC17929a.C2673a.c(this.mutex, null, 1, null);
        }
    }
}
