package d0;

import Av.a;
import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.PublishedApi;
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
import qv.C0;
import qv.C16623P;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u0003R(\u0010\u001f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Ld0/F;", "", "<init>", "()V", "Ld0/F$a;", "mutator", "", "h", "(Ld0/F$a;)V", "R", "Ld0/E;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "d", "(Ld0/E;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "f", "(Ljava/lang/Object;Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "()Z", "i", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "LAv/a;", "b", "LAv/a;", "mutex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13432F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Av.a mutex = Av.g.b(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ld0/F$a;", "", "Ld0/E;", "priority", "Lqv/C0;", "job", "<init>", "(Ld0/E;Lqv/C0;)V", "other", "", "a", "(Ld0/F$a;)Z", "", "b", "()V", "Ld0/E;", "getPriority", "()Ld0/E;", "Lqv/C0;", "getJob", "()Lqv/C0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d0.F$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EnumC13431E priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C0 job;

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            this.job.d(new MutationInterruptedException());
        }

        public a(EnumC13431E enumC13431E, C0 c02) {
            this.priority = enumC13431E;
            this.job = c02;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lqv/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {210, 125}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: d0.F$b */
    static final class b<R> extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f126854a;

        /* renamed from: b, reason: collision with root package name */
        Object f126855b;

        /* renamed from: c, reason: collision with root package name */
        Object f126856c;

        /* renamed from: d, reason: collision with root package name */
        int f126857d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f126858e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC13431E f126859f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C13432F f126860g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super R>, Object> f126861h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(EnumC13431E enumC13431E, C13432F c13432f, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f126859f = enumC13431E;
            this.f126860g = c13432f;
            this.f126861h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f126859f, this.f126860g, this.f126861h, continuation);
            bVar.f126858e = obj;
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
            C13432F c13432f;
            Function1<Continuation<? super R>, Object> function1;
            Throwable th2;
            C13432F c13432f2;
            a aVar3;
            Av.a aVar4;
            Object objF = IntrinsicsKt.f();
            ?? r12 = this.f126857d;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                c13432f2 = (C13432F) this.f126855b;
                                aVar4 = (Av.a) this.f126854a;
                                aVar3 = (a) this.f126858e;
                                try {
                                    ResultKt.b(obj);
                                    U.d.a(c13432f2.currentMutator, aVar3, null);
                                    aVar4.h(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    U.d.a(c13432f2.currentMutator, aVar3, null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c13432f = (C13432F) this.f126856c;
                        function1 = (Function1) this.f126855b;
                        Av.a aVar5 = (Av.a) this.f126854a;
                        aVar2 = (a) this.f126858e;
                        ResultKt.b(obj);
                        aVar = aVar5;
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f126858e;
                        EnumC13431E enumC13431E = this.f126859f;
                        CoroutineContext.Element elementG = interfaceC16622O.getCoroutineContext().g(C0.INSTANCE);
                        Intrinsics.g(elementG);
                        a aVar6 = new a(enumC13431E, (C0) elementG);
                        this.f126860g.h(aVar6);
                        aVar = this.f126860g.mutex;
                        Function1<Continuation<? super R>, Object> function12 = this.f126861h;
                        C13432F c13432f3 = this.f126860g;
                        this.f126858e = aVar6;
                        this.f126854a = aVar;
                        this.f126855b = function12;
                        this.f126856c = c13432f3;
                        this.f126857d = 1;
                        if (aVar.g(null, this) != objF) {
                            aVar2 = aVar6;
                            c13432f = c13432f3;
                            function1 = function12;
                        }
                        return objF;
                    }
                    this.f126858e = aVar2;
                    this.f126854a = aVar;
                    this.f126855b = c13432f;
                    this.f126856c = null;
                    this.f126857d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objF) {
                        c13432f2 = c13432f;
                        aVar4 = aVar;
                        obj = objInvoke;
                        aVar3 = aVar2;
                        U.d.a(c13432f2.currentMutator, aVar3, null);
                        aVar4.h(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    c13432f2 = c13432f;
                    aVar3 = aVar2;
                    U.d.a(c13432f2.currentMutator, aVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.h(null);
                throw th5;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lqv/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {210, 165}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: d0.F$c */
    static final class c<R> extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f126862a;

        /* renamed from: b, reason: collision with root package name */
        Object f126863b;

        /* renamed from: c, reason: collision with root package name */
        Object f126864c;

        /* renamed from: d, reason: collision with root package name */
        Object f126865d;

        /* renamed from: e, reason: collision with root package name */
        int f126866e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f126867f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC13431E f126868g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C13432F f126869h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> f126870i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f126871j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(EnumC13431E enumC13431E, C13432F c13432f, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f126868g = enumC13431E;
            this.f126869h = c13432f;
            this.f126870i = function2;
            this.f126871j = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f126868g, this.f126869h, this.f126870i, this.f126871j, continuation);
            cVar.f126867f = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super R> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Av.a, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Av.a aVar;
            Function2 function2;
            a aVar2;
            C13432F c13432f;
            Object obj2;
            Throwable th2;
            C13432F c13432f2;
            a aVar3;
            Av.a aVar4;
            Object objF = IntrinsicsKt.f();
            ?? r12 = this.f126866e;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                c13432f2 = (C13432F) this.f126863b;
                                aVar4 = (Av.a) this.f126862a;
                                aVar3 = (a) this.f126867f;
                                try {
                                    ResultKt.b(obj);
                                    U.d.a(c13432f2.currentMutator, aVar3, null);
                                    aVar4.h(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    U.d.a(c13432f2.currentMutator, aVar3, null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c13432f = (C13432F) this.f126865d;
                        obj2 = this.f126864c;
                        function2 = (Function2) this.f126863b;
                        Av.a aVar5 = (Av.a) this.f126862a;
                        aVar2 = (a) this.f126867f;
                        ResultKt.b(obj);
                        aVar = aVar5;
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f126867f;
                        EnumC13431E enumC13431E = this.f126868g;
                        CoroutineContext.Element elementG = interfaceC16622O.getCoroutineContext().g(C0.INSTANCE);
                        Intrinsics.g(elementG);
                        a aVar6 = new a(enumC13431E, (C0) elementG);
                        this.f126869h.h(aVar6);
                        aVar = this.f126869h.mutex;
                        function2 = this.f126870i;
                        Object obj3 = this.f126871j;
                        C13432F c13432f3 = this.f126869h;
                        this.f126867f = aVar6;
                        this.f126862a = aVar;
                        this.f126863b = function2;
                        this.f126864c = obj3;
                        this.f126865d = c13432f3;
                        this.f126866e = 1;
                        if (aVar.g(null, this) != objF) {
                            aVar2 = aVar6;
                            c13432f = c13432f3;
                            obj2 = obj3;
                        }
                        return objF;
                    }
                    this.f126867f = aVar2;
                    this.f126862a = aVar;
                    this.f126863b = c13432f;
                    this.f126864c = null;
                    this.f126865d = null;
                    this.f126866e = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke != objF) {
                        c13432f2 = c13432f;
                        aVar4 = aVar;
                        obj = objInvoke;
                        aVar3 = aVar2;
                        U.d.a(c13432f2.currentMutator, aVar3, null);
                        aVar4.h(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    c13432f2 = c13432f;
                    aVar3 = aVar2;
                    U.d.a(c13432f2.currentMutator, aVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.h(null);
                throw th5;
            }
        }
    }

    public static /* synthetic */ Object e(C13432F c13432f, EnumC13431E enumC13431E, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC13431E = EnumC13431E.f126845a;
        }
        return c13432f.d(enumC13431E, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(a mutator) {
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

    public final <T, R> Object f(T t10, EnumC13431E enumC13431E, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return C16623P.g(new c(enumC13431E, this, function2, t10, null), continuation);
    }

    @PublishedApi
    public final boolean g() {
        return a.C0027a.b(this.mutex, null, 1, null);
    }

    @PublishedApi
    public final void i() {
        a.C0027a.c(this.mutex, null, 1, null);
    }
}
