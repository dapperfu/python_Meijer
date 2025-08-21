package mv;

import java.util.concurrent.CancellationException;
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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coroutineContext", "d", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.z0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15840z0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mv.z0$a */
    static final class a<T> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151776a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f151777b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<T> f151778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends T> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f151778c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f151778c, continuation);
            aVar.f151777b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super T> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f151776a == 0) {
                ResultKt.b(obj);
                return C15840z0.d(((InterfaceC15783O) this.f151777b).getCoroutineContext(), this.f151778c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> Object b(CoroutineContext coroutineContext, Function0<? extends T> function0, Continuation<? super T> continuation) {
        return C15805i.g(coroutineContext, new a(function0, null), continuation);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Function0 function0, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        return b(coroutineContext, function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(CoroutineContext coroutineContext, Function0<? extends T> function0) throws Throwable {
        try {
            b1 b1Var = new b1();
            b1Var.B(E0.k(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                b1Var.y();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
