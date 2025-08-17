package tv;

import kotlin.C17349q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\nH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a.\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ltv/f;", "", "a", "(Ltv/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lqv/O;", "scope", "Lqv/C0;", "d", "(Ltv/f;Lqv/O;)Lqv/C0;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "action", "b", "(Ltv/f;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltv/g;", "flow", "c", "(Ltv/g;Ltv/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: tv.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final /* synthetic */ class C17157k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: tv.k$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<T> f162219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC17152f<? extends T> interfaceC17152f, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f162219b = interfaceC17152f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f162219b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f162218a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f<T> interfaceC17152f = this.f162219b;
                this.f162218a = 1;
                if (C17154h.j(interfaceC17152f, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public static final Object a(InterfaceC17152f<?> interfaceC17152f, Continuation<? super Unit> continuation) {
        Object objCollect = interfaceC17152f.collect(C17349q.f163602a, continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
    }

    public static final <T> C0 d(InterfaceC17152f<? extends T> interfaceC17152f, InterfaceC16622O interfaceC16622O) {
        return C16648k.d(interfaceC16622O, null, null, new a(interfaceC17152f, null), 3, null);
    }

    public static final <T> Object b(InterfaceC17152f<? extends T> interfaceC17152f, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objJ = C17154h.j(C17159m.b(C17154h.K(interfaceC17152f, function2), 0, null, 2, null), continuation);
        if (objJ == IntrinsicsKt.f()) {
            return objJ;
        }
        return Unit.f142422a;
    }

    public static final <T> Object c(InterfaceC17153g<? super T> interfaceC17153g, InterfaceC17152f<? extends T> interfaceC17152f, Continuation<? super Unit> continuation) {
        C17154h.y(interfaceC17153g);
        Object objCollect = interfaceC17152f.collect(interfaceC17153g, continuation);
        if (objCollect == IntrinsicsKt.f()) {
            return objCollect;
        }
        return Unit.f142422a;
    }
}
