package P0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qv.C0;
import qv.C16623P;
import qv.E0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B1\b\u0002\u0012&\u0010\b\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¢\u0006\u0004\b\t\u0010\nJ]\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f21\u0010\u0014\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0088\u0001\b\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¨\u0006\u001a"}, d2 = {"LP0/n;", "T", "", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "LP0/n$a;", "Landroidx/compose/ui/AtomicReference;", "currentSessionHolder", "b", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "R", "Lkotlin/Function1;", "Lqv/O;", "sessionInitializer", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "Lkotlin/coroutines/Continuation;", "session", "d", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class n<T> {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LP0/n$a;", "T", "", "Lqv/C0;", "job", "value", "<init>", "(Lqv/C0;Ljava/lang/Object;)V", "a", "Lqv/C0;", "()Lqv/C0;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C0 job;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final T value;

        /* renamed from: a, reason: from getter */
        public final C0 getJob() {
            return this.job;
        }

        public final T b() {
            return this.value;
        }

        public a(C0 c02, T t10) {
            this.job = c02;
            this.value = t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lqv/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend")
    static final class b<R> extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24578a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24579b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC16622O, T> f24580c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicReference<a<T>> f24581d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> f24582e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super InterfaceC16622O, ? extends T> function1, AtomicReference<a<T>> atomicReference, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f24580c = function1;
            this.f24581d = atomicReference;
            this.f24582e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f24580c, this.f24581d, this.f24582e, continuation);
            bVar.f24579b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super R> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            a<T> aVar;
            C0 job;
            a<T> aVar2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f24578a;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            aVar2 = (a) this.f24579b;
                            try {
                                ResultKt.b(obj);
                                U.d.a(this.f24581d, aVar2, null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                U.d.a(this.f24581d, aVar2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) this.f24579b;
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f24579b;
                    aVar = new a<>(E0.k(interfaceC16622O.getCoroutineContext()), this.f24580c.invoke(interfaceC16622O));
                    a<T> andSet = this.f24581d.getAndSet(aVar);
                    if (andSet != null && (job = andSet.getJob()) != null) {
                        this.f24579b = aVar;
                        this.f24578a = 1;
                        if (E0.g(job, this) != objF) {
                        }
                        return objF;
                    }
                }
                Function2<T, Continuation<? super R>, Object> function2 = this.f24582e;
                T tB = aVar.b();
                this.f24579b = aVar;
                this.f24578a = 2;
                obj = function2.invoke(tB, this);
                if (obj != objF) {
                    aVar2 = aVar;
                    U.d.a(this.f24581d, aVar2, null);
                    return obj;
                }
                return objF;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                U.d.a(this.f24581d, aVar2, null);
                throw th;
            }
        }
    }

    private static <T> AtomicReference<a<T>> b(AtomicReference<a<T>> atomicReference) {
        return atomicReference;
    }

    public static <T> AtomicReference<a<T>> a() {
        return b(new AtomicReference(null));
    }

    public static final <R> Object d(AtomicReference<a<T>> atomicReference, Function1<? super InterfaceC16622O, ? extends T> function1, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return C16623P.g(new b(function1, atomicReference, function2, null), continuation);
    }

    public static final T c(AtomicReference<a<T>> atomicReference) {
        a<T> aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }
}
