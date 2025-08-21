package kotlin;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.C15777I;
import ov.EnumC16325a;
import ov.t;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lqv/f;", "S", "T", "Lqv/d;", "Lpv/f;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "<init>", "(Lpv/f;Lkotlin/coroutines/CoroutineContext;ILov/a;)V", "Lpv/g;", "collector", "newContext", "", "q", "(Lpv/g;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lov/t;", "scope", "i", "(Lov/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "d", "Lpv/f;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC16774f<S, T> extends AbstractC16772d<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    protected final InterfaceC16561f<S> flow;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lpv/g;", "it", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
    /* renamed from: qv.f$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159023a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f159024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC16774f<S, T> f159025c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC16774f<S, T> abstractC16774f, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f159025c = abstractC16774f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f159025c, continuation);
            aVar.f159024b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159023a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g<? super T> interfaceC16562g = (InterfaceC16562g) this.f159024b;
                AbstractC16774f<S, T> abstractC16774f = this.f159025c;
                this.f159023a = 1;
                if (abstractC16774f.r(interfaceC16562g, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    protected abstract Object r(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation);

    static /* synthetic */ <S, T> Object o(AbstractC16774f<S, T> abstractC16774f, InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
        if (abstractC16774f.capacity == -3) {
            CoroutineContext f143270a = continuation.getContext();
            CoroutineContext coroutineContextJ = C15777I.j(f143270a, abstractC16774f.context);
            if (Intrinsics.e(coroutineContextJ, f143270a)) {
                Object objR = abstractC16774f.r(interfaceC16562g, continuation);
                return objR == IntrinsicsKt.f() ? objR : Unit.f143329a;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.e(coroutineContextJ.g(companion), f143270a.g(companion))) {
                Object objQ = abstractC16774f.q(interfaceC16562g, coroutineContextJ, continuation);
                return objQ == IntrinsicsKt.f() ? objQ : Unit.f143329a;
            }
        }
        Object objCollect = super.collect(interfaceC16562g, continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
    }

    static /* synthetic */ <S, T> Object p(AbstractC16774f<S, T> abstractC16774f, t<? super T> tVar, Continuation<? super Unit> continuation) {
        Object objR = abstractC16774f.r(new C16791x(tVar), continuation);
        return objR == IntrinsicsKt.f() ? objR : Unit.f143329a;
    }

    @Override // kotlin.AbstractC16772d
    public String toString() {
        return this.flow + " -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC16774f(InterfaceC16561f<? extends S> interfaceC16561f, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a) {
        super(coroutineContext, i10, enumC16325a);
        this.flow = interfaceC16561f;
    }

    private final Object q(InterfaceC16562g<? super T> interfaceC16562g, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        return C16773e.c(coroutineContext, C16773e.d(interfaceC16562g, continuation.getContext()), null, new a(this, null), continuation, 4, null);
    }

    @Override // kotlin.AbstractC16772d, pv.InterfaceC16561f
    public Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
        return o(this, interfaceC16562g, continuation);
    }

    @Override // kotlin.AbstractC16772d
    protected Object i(t<? super T> tVar, Continuation<? super Unit> continuation) {
        return p(this, tVar, continuation);
    }
}
