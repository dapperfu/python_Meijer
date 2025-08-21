package d0;

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
import mv.C0;
import mv.C15784P;
import mv.InterfaceC15783O;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u0003R(\u0010\u001f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Ld0/F;", "", "<init>", "()V", "Ld0/F$a;", "mutator", "", "h", "(Ld0/F$a;)V", "R", "Ld0/E;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "d", "(Ld0/E;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "f", "(Ljava/lang/Object;Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "()Z", "i", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lwv/a;", "b", "Lwv/a;", "mutex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13565F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex = wv.g.b(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ld0/F$a;", "", "Ld0/E;", "priority", "Lmv/C0;", "job", "<init>", "(Ld0/E;Lmv/C0;)V", "other", "", "a", "(Ld0/F$a;)Z", "", "b", "()V", "Ld0/E;", "getPriority", "()Ld0/E;", "Lmv/C0;", "getJob", "()Lmv/C0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d0.F$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EnumC13564E priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C0 job;

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            this.job.d(new MutationInterruptedException());
        }

        public a(EnumC13564E enumC13564E, C0 c02) {
            this.priority = enumC13564E;
            this.job = c02;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lmv/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {210, 125}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: d0.F$b */
    static final class b<R> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f127656a;

        /* renamed from: b, reason: collision with root package name */
        Object f127657b;

        /* renamed from: c, reason: collision with root package name */
        Object f127658c;

        /* renamed from: d, reason: collision with root package name */
        int f127659d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f127660e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC13564E f127661f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C13565F f127662g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super R>, Object> f127663h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(EnumC13564E enumC13564E, C13565F c13565f, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f127661f = enumC13564E;
            this.f127662g = c13565f;
            this.f127663h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f127661f, this.f127662g, this.f127663h, continuation);
            bVar.f127660e = obj;
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
            C13565F c13565f;
            Function1<Continuation<? super R>, Object> function1;
            Throwable th2;
            C13565F c13565f2;
            a aVar2;
            InterfaceC17929a interfaceC17929a2;
            Object objF = IntrinsicsKt.f();
            ?? r12 = this.f127659d;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                c13565f2 = (C13565F) this.f127657b;
                                interfaceC17929a2 = (InterfaceC17929a) this.f127656a;
                                aVar2 = (a) this.f127660e;
                                try {
                                    ResultKt.b(obj);
                                    U.d.a(c13565f2.currentMutator, aVar2, null);
                                    interfaceC17929a2.h(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    U.d.a(c13565f2.currentMutator, aVar2, null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c13565f = (C13565F) this.f127658c;
                        function1 = (Function1) this.f127657b;
                        InterfaceC17929a interfaceC17929a3 = (InterfaceC17929a) this.f127656a;
                        aVar = (a) this.f127660e;
                        ResultKt.b(obj);
                        interfaceC17929a = interfaceC17929a3;
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f127660e;
                        EnumC13564E enumC13564E = this.f127661f;
                        CoroutineContext.Element elementG = interfaceC15783O.getCoroutineContext().g(C0.INSTANCE);
                        Intrinsics.g(elementG);
                        a aVar3 = new a(enumC13564E, (C0) elementG);
                        this.f127662g.h(aVar3);
                        interfaceC17929a = this.f127662g.mutex;
                        Function1<Continuation<? super R>, Object> function12 = this.f127663h;
                        C13565F c13565f3 = this.f127662g;
                        this.f127660e = aVar3;
                        this.f127656a = interfaceC17929a;
                        this.f127657b = function12;
                        this.f127658c = c13565f3;
                        this.f127659d = 1;
                        if (interfaceC17929a.g(null, this) != objF) {
                            aVar = aVar3;
                            c13565f = c13565f3;
                            function1 = function12;
                        }
                        return objF;
                    }
                    this.f127660e = aVar;
                    this.f127656a = interfaceC17929a;
                    this.f127657b = c13565f;
                    this.f127658c = null;
                    this.f127659d = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != objF) {
                        c13565f2 = c13565f;
                        interfaceC17929a2 = interfaceC17929a;
                        obj = objInvoke;
                        aVar2 = aVar;
                        U.d.a(c13565f2.currentMutator, aVar2, null);
                        interfaceC17929a2.h(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    c13565f2 = c13565f;
                    aVar2 = aVar;
                    U.d.a(c13565f2.currentMutator, aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.h(null);
                throw th5;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lmv/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {210, 165}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: d0.F$c */
    static final class c<R> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f127664a;

        /* renamed from: b, reason: collision with root package name */
        Object f127665b;

        /* renamed from: c, reason: collision with root package name */
        Object f127666c;

        /* renamed from: d, reason: collision with root package name */
        Object f127667d;

        /* renamed from: e, reason: collision with root package name */
        int f127668e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f127669f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC13564E f127670g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C13565F f127671h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> f127672i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f127673j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(EnumC13564E enumC13564E, C13565F c13565f, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f127670g = enumC13564E;
            this.f127671h = c13565f;
            this.f127672i = function2;
            this.f127673j = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f127670g, this.f127671h, this.f127672i, this.f127673j, continuation);
            cVar.f127669f = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super R> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, wv.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC17929a interfaceC17929a;
            Function2 function2;
            a aVar;
            C13565F c13565f;
            Object obj2;
            Throwable th2;
            C13565F c13565f2;
            a aVar2;
            InterfaceC17929a interfaceC17929a2;
            Object objF = IntrinsicsKt.f();
            ?? r12 = this.f127668e;
            try {
                try {
                    if (r12 != 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                c13565f2 = (C13565F) this.f127665b;
                                interfaceC17929a2 = (InterfaceC17929a) this.f127664a;
                                aVar2 = (a) this.f127669f;
                                try {
                                    ResultKt.b(obj);
                                    U.d.a(c13565f2.currentMutator, aVar2, null);
                                    interfaceC17929a2.h(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    U.d.a(c13565f2.currentMutator, aVar2, null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c13565f = (C13565F) this.f127667d;
                        obj2 = this.f127666c;
                        function2 = (Function2) this.f127665b;
                        InterfaceC17929a interfaceC17929a3 = (InterfaceC17929a) this.f127664a;
                        aVar = (a) this.f127669f;
                        ResultKt.b(obj);
                        interfaceC17929a = interfaceC17929a3;
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f127669f;
                        EnumC13564E enumC13564E = this.f127670g;
                        CoroutineContext.Element elementG = interfaceC15783O.getCoroutineContext().g(C0.INSTANCE);
                        Intrinsics.g(elementG);
                        a aVar3 = new a(enumC13564E, (C0) elementG);
                        this.f127671h.h(aVar3);
                        interfaceC17929a = this.f127671h.mutex;
                        function2 = this.f127672i;
                        Object obj3 = this.f127673j;
                        C13565F c13565f3 = this.f127671h;
                        this.f127669f = aVar3;
                        this.f127664a = interfaceC17929a;
                        this.f127665b = function2;
                        this.f127666c = obj3;
                        this.f127667d = c13565f3;
                        this.f127668e = 1;
                        if (interfaceC17929a.g(null, this) != objF) {
                            aVar = aVar3;
                            c13565f = c13565f3;
                            obj2 = obj3;
                        }
                        return objF;
                    }
                    this.f127669f = aVar;
                    this.f127664a = interfaceC17929a;
                    this.f127665b = c13565f;
                    this.f127666c = null;
                    this.f127667d = null;
                    this.f127668e = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke != objF) {
                        c13565f2 = c13565f;
                        interfaceC17929a2 = interfaceC17929a;
                        obj = objInvoke;
                        aVar2 = aVar;
                        U.d.a(c13565f2.currentMutator, aVar2, null);
                        interfaceC17929a2.h(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th2 = th4;
                    c13565f2 = c13565f;
                    aVar2 = aVar;
                    U.d.a(c13565f2.currentMutator, aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.h(null);
                throw th5;
            }
        }
    }

    public static /* synthetic */ Object e(C13565F c13565f, EnumC13564E enumC13564E, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC13564E = EnumC13564E.f127647a;
        }
        return c13565f.d(enumC13564E, function1, continuation);
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

    public final <R> Object d(EnumC13564E enumC13564E, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return C15784P.g(new b(enumC13564E, this, function1, null), continuation);
    }

    public final <T, R> Object f(T t10, EnumC13564E enumC13564E, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return C15784P.g(new c(enumC13564E, this, function2, t10, null), continuation);
    }

    @PublishedApi
    public final boolean g() {
        return InterfaceC17929a.C2673a.b(this.mutex, null, 1, null);
    }

    @PublishedApi
    public final void i() {
        InterfaceC17929a.C2673a.c(this.mutex, null, 1, null);
    }
}
