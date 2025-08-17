package qv;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vv.C17638L;
import vv.C17652h;
import vv.C17653i;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "Lqv/c0;", "", "mode", "", "a", "(Lqv/c0;I)V", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", "d", "(Lqv/c0;Lkotlin/coroutines/Continuation;Z)V", "e", "(Lqv/c0;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.d0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C16635d0 {
    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    private static final void e(AbstractC16633c0<?> abstractC16633c0) {
        AbstractC16651l0 abstractC16651l0B = a1.f157628a.b();
        if (abstractC16651l0B.d1()) {
            abstractC16651l0B.Z0(abstractC16633c0);
            return;
        }
        abstractC16651l0B.b1(true);
        try {
            d(abstractC16633c0, abstractC16633c0.e(), true);
            do {
            } while (abstractC16651l0B.g1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final <T> void a(AbstractC16633c0<? super T> abstractC16633c0, int i10) {
        boolean z10;
        Continuation<? super T> continuationE = abstractC16633c0.e();
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (continuationE instanceof C17652h) && b(i10) == b(abstractC16633c0.resumeMode)) {
            C17652h c17652h = (C17652h) continuationE;
            AbstractC16618K abstractC16618K = c17652h.dispatcher;
            CoroutineContext f142363a = c17652h.getContext();
            if (C17653i.d(abstractC16618K, f142363a)) {
                C17653i.c(abstractC16618K, f142363a, abstractC16633c0);
                return;
            } else {
                e(abstractC16633c0);
                return;
            }
        }
        d(abstractC16633c0, continuationE, z10);
    }

    public static final <T> void d(AbstractC16633c0<? super T> abstractC16633c0, Continuation<? super T> continuation, boolean z10) {
        Object objH;
        f1<?> f1VarM;
        Object objJ = abstractC16633c0.j();
        Throwable thG = abstractC16633c0.g(objJ);
        if (thG != null) {
            Result.Companion companion = Result.INSTANCE;
            objH = ResultKt.a(thG);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objH = abstractC16633c0.h(objJ);
        }
        Object objB = Result.b(objH);
        if (z10) {
            Intrinsics.h(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C17652h c17652h = (C17652h) continuation;
            Continuation<T> continuation2 = c17652h.continuation;
            Object obj = c17652h.countOrElement;
            CoroutineContext f142363a = continuation2.getContext();
            Object objI = C17638L.i(f142363a, obj);
            if (objI != C17638L.f165089a) {
                f1VarM = C16616I.m(continuation2, f142363a, objI);
            } else {
                f1VarM = null;
            }
            try {
                c17652h.continuation.resumeWith(objB);
                Unit unit = Unit.f142422a;
                if (f1VarM != null && !f1VarM.k1()) {
                    return;
                }
                C17638L.f(f142363a, objI);
                return;
            } catch (Throwable th2) {
                if (f1VarM == null || f1VarM.k1()) {
                    C17638L.f(f142363a, objI);
                }
                throw th2;
            }
        }
        continuation.resumeWith(objB);
    }
}
