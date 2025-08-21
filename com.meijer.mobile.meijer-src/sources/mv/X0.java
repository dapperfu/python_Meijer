package mv;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import sv.C17169b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aL\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmv/C0;", "parent", "Lmv/A;", "a", "(Lmv/C0;)Lmv/A;", "R", "Lkotlin/Function2;", "Lmv/O;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class X0 {
    public static final InterfaceC15769A a(C0 c02) {
        return new W0(c02);
    }

    public static /* synthetic */ InterfaceC15769A b(C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return a(c02);
    }

    public static final <R> Object c(Function2<? super InterfaceC15783O, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        V0 v02 = new V0(continuation.getContext(), continuation);
        Object objD = C17169b.d(v02, v02, function2);
        if (objD == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objD;
    }
}
