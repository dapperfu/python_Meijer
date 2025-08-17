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
import qv.C16616I;
import sv.EnumC17050a;
import sv.t;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Luv/f;", "S", "T", "Luv/d;", "Ltv/f;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "<init>", "(Ltv/f;Lkotlin/coroutines/CoroutineContext;ILsv/a;)V", "Ltv/g;", "collector", "newContext", "", "q", "(Ltv/g;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsv/t;", "scope", "i", "(Lsv/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "d", "Ltv/f;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC17338f<S, T> extends AbstractC17336d<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    protected final InterfaceC17152f<S> flow;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltv/g;", "it", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
    /* renamed from: uv.f$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163547a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f163548b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17338f<S, T> f163549c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC17338f<S, T> abstractC17338f, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163549c = abstractC17338f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f163549c, continuation);
            aVar.f163548b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163547a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g<? super T> interfaceC17153g = (InterfaceC17153g) this.f163548b;
                AbstractC17338f<S, T> abstractC17338f = this.f163549c;
                this.f163547a = 1;
                if (abstractC17338f.r(interfaceC17153g, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    protected abstract Object r(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation);

    static /* synthetic */ <S, T> Object o(AbstractC17338f<S, T> abstractC17338f, InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
        if (abstractC17338f.capacity == -3) {
            CoroutineContext f142363a = continuation.getContext();
            CoroutineContext coroutineContextJ = C16616I.j(f142363a, abstractC17338f.context);
            if (Intrinsics.e(coroutineContextJ, f142363a)) {
                Object objR = abstractC17338f.r(interfaceC17153g, continuation);
                return objR == IntrinsicsKt.f() ? objR : Unit.f142422a;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.e(coroutineContextJ.g(companion), f142363a.g(companion))) {
                Object objQ = abstractC17338f.q(interfaceC17153g, coroutineContextJ, continuation);
                return objQ == IntrinsicsKt.f() ? objQ : Unit.f142422a;
            }
        }
        Object objCollect = super.collect(interfaceC17153g, continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
    }

    static /* synthetic */ <S, T> Object p(AbstractC17338f<S, T> abstractC17338f, t<? super T> tVar, Continuation<? super Unit> continuation) {
        Object objR = abstractC17338f.r(new C17355x(tVar), continuation);
        return objR == IntrinsicsKt.f() ? objR : Unit.f142422a;
    }

    @Override // kotlin.AbstractC17336d
    public String toString() {
        return this.flow + " -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC17338f(InterfaceC17152f<? extends S> interfaceC17152f, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a) {
        super(coroutineContext, i10, enumC17050a);
        this.flow = interfaceC17152f;
    }

    private final Object q(InterfaceC17153g<? super T> interfaceC17153g, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        return C17337e.c(coroutineContext, C17337e.d(interfaceC17153g, continuation.getContext()), null, new a(this, null), continuation, 4, null);
    }

    @Override // kotlin.AbstractC17336d, tv.InterfaceC17152f
    public Object collect(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
        return o(this, interfaceC17153g, continuation);
    }

    @Override // kotlin.AbstractC17336d
    protected Object i(t<? super T> tVar, Continuation<? super Unit> continuation) {
        return p(this, tVar, continuation);
    }
}
