package qv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import vv.C17652h;
import vv.C17653i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j1 {
    public static final Object a(Continuation<? super Unit> continuation) {
        C17652h c17652h;
        Object objF;
        CoroutineContext context = continuation.getContext();
        E0.i(context);
        Continuation continuationC = IntrinsicsKt.c(continuation);
        if (continuationC instanceof C17652h) {
            c17652h = (C17652h) continuationC;
        } else {
            c17652h = null;
        }
        if (c17652h == null) {
            objF = Unit.f142422a;
        } else {
            if (C17653i.d(c17652h.dispatcher, context)) {
                c17652h.m(context, Unit.f142422a);
            } else {
                i1 i1Var = new i1();
                CoroutineContext coroutineContextM0 = context.m0(i1Var);
                Unit unit = Unit.f142422a;
                c17652h.m(coroutineContextM0, unit);
                if (!i1Var.dispatcherWasUnconfined || C17653i.e(c17652h)) {
                    objF = IntrinsicsKt.f();
                } else {
                    objF = unit;
                }
            }
            objF = IntrinsicsKt.f();
        }
        if (objF == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        if (objF == IntrinsicsKt.f()) {
            return objF;
        }
        return Unit.f142422a;
    }
}
