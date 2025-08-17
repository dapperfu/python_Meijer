package kotlin;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.InterfaceC17153g;
import vv.C17638L;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Luv/A;", "T", "Ltv/g;", "downstream", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "<init>", "(Ltv/g;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/coroutines/CoroutineContext;", "", "b", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "c", "Lkotlin/jvm/functions/Function2;", "emitRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.A, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C17332A<T> implements InterfaceC17153g<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext emitContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object countOrElement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function2<T, Continuation<? super Unit>, Object> emitRef;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    /* renamed from: uv.A$a */
    static final class a extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163528a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f163529b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g<T> f163530c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163530c = interfaceC17153g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f163530c, continuation);
            aVar.f163529b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, Continuation<? super Unit> continuation) {
            return ((a) create(t10, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163528a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Object obj2 = this.f163529b;
                InterfaceC17153g<T> interfaceC17153g = this.f163530c;
                this.f163528a = 1;
                if (interfaceC17153g.emit(obj2, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Override // tv.InterfaceC17153g
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        Object objB = C17337e.b(this.emitContext, t10, this.countOrElement, this.emitRef, continuation);
        return objB == IntrinsicsKt.f() ? objB : Unit.f142422a;
    }

    public C17332A(InterfaceC17153g<? super T> interfaceC17153g, CoroutineContext coroutineContext) {
        this.emitContext = coroutineContext;
        this.countOrElement = C17638L.g(coroutineContext);
        this.emitRef = new a(interfaceC17153g, null);
    }
}
