package kotlin;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C0;
import vv.C17627A;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luv/t;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "b", "(Luv/t;Lkotlin/coroutines/CoroutineContext;)V", "Lqv/C0;", "collectJob", "d", "(Lqv/C0;Lqv/C0;)Lqv/C0;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17354w {
    @JvmName
    public static final void b(final C17352t<?> c17352t, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.b(0, new Function2() { // from class: uv.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C17354w.c(c17352t, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue() == c17352t.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c17352t.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final C0 d(C0 c02, C0 c03) {
        while (c02 != null) {
            if (c02 == c03 || !(c02 instanceof C17627A)) {
                return c02;
            }
            c02 = ((C17627A) c02).s0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(C17352t c17352t, int i10, CoroutineContext.Element element) {
        CoroutineContext.Key<?> key = element.getKey();
        CoroutineContext.Element elementG = c17352t.collectContext.g(key);
        if (key != C0.INSTANCE) {
            if (element != elementG) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        C0 c02 = (C0) elementG;
        Intrinsics.h(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        C0 c0D = d((C0) element, c02);
        if (c0D == c02) {
            if (c02 == null) {
                return i10;
            }
            return i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + c0D + ", expected child of " + c02 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
