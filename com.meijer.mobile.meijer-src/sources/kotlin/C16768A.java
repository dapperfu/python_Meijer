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
import pv.InterfaceC16562g;
import rv.C16957L;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lqv/A;", "T", "Lpv/g;", "downstream", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "<init>", "(Lpv/g;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/coroutines/CoroutineContext;", "", "b", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "c", "Lkotlin/jvm/functions/Function2;", "emitRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.A, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C16768A<T> implements InterfaceC16562g<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext emitContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object countOrElement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function2<T, Continuation<? super Unit>, Object> emitRef;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    /* renamed from: qv.A$a */
    static final class a extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159004a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f159005b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g<T> f159006c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f159006c = interfaceC16562g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f159006c, continuation);
            aVar.f159005b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, Continuation<? super Unit> continuation) {
            return ((a) create(t10, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159004a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Object obj2 = this.f159005b;
                InterfaceC16562g<T> interfaceC16562g = this.f159006c;
                this.f159004a = 1;
                if (interfaceC16562g.emit(obj2, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Override // pv.InterfaceC16562g
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        Object objB = C16773e.b(this.emitContext, t10, this.countOrElement, this.emitRef, continuation);
        return objB == IntrinsicsKt.f() ? objB : Unit.f143329a;
    }

    public C16768A(InterfaceC16562g<? super T> interfaceC16562g, CoroutineContext coroutineContext) {
        this.emitContext = coroutineContext;
        this.countOrElement = C16957L.g(coroutineContext);
        this.emitRef = new a(interfaceC16562g, null);
    }
}
