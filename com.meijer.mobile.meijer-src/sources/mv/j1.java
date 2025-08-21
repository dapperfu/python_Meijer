package mv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import rv.C16971h;
import rv.C16972i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j1 {
    public static final Object a(Continuation<? super Unit> continuation) {
        C16971h c16971h;
        Object objF;
        CoroutineContext context = continuation.getContext();
        E0.i(context);
        Continuation continuationC = IntrinsicsKt.c(continuation);
        if (continuationC instanceof C16971h) {
            c16971h = (C16971h) continuationC;
        } else {
            c16971h = null;
        }
        if (c16971h == null) {
            objF = Unit.f143329a;
        } else {
            if (C16972i.d(c16971h.dispatcher, context)) {
                c16971h.l(context, Unit.f143329a);
            } else {
                i1 i1Var = new i1();
                CoroutineContext coroutineContextN0 = context.n0(i1Var);
                Unit unit = Unit.f143329a;
                c16971h.l(coroutineContextN0, unit);
                if (!i1Var.dispatcherWasUnconfined || C16972i.e(c16971h)) {
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
        return Unit.f143329a;
    }
}
