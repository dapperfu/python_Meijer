package pv;

import kotlin.C16785q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\nH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a.\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpv/f;", "", "a", "(Lpv/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lmv/O;", "scope", "Lmv/C0;", "d", "(Lpv/f;Lmv/O;)Lmv/C0;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "action", "b", "(Lpv/f;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpv/g;", "flow", "c", "(Lpv/g;Lpv/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: pv.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C16566k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: pv.k$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157532a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f<T> f157533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16561f<? extends T> interfaceC16561f, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f157533b = interfaceC16561f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f157533b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157532a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f<T> interfaceC16561f = this.f157533b;
                this.f157532a = 1;
                if (C16563h.j(interfaceC16561f, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public static final Object a(InterfaceC16561f<?> interfaceC16561f, Continuation<? super Unit> continuation) {
        Object objCollect = interfaceC16561f.collect(C16785q.f159078a, continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
    }

    public static final <T> C0 d(InterfaceC16561f<? extends T> interfaceC16561f, InterfaceC15783O interfaceC15783O) {
        return C15809k.d(interfaceC15783O, null, null, new a(interfaceC16561f, null), 3, null);
    }

    public static final <T> Object b(InterfaceC16561f<? extends T> interfaceC16561f, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objJ = C16563h.j(C16568m.b(C16563h.K(interfaceC16561f, function2), 0, null, 2, null), continuation);
        if (objJ == IntrinsicsKt.f()) {
            return objJ;
        }
        return Unit.f143329a;
    }

    public static final <T> Object c(InterfaceC16562g<? super T> interfaceC16562g, InterfaceC16561f<? extends T> interfaceC16561f, Continuation<? super Unit> continuation) {
        C16563h.y(interfaceC16562g);
        Object objCollect = interfaceC16561f.collect(interfaceC16562g, continuation);
        if (objCollect == IntrinsicsKt.f()) {
            return objCollect;
        }
        return Unit.f143329a;
    }
}
