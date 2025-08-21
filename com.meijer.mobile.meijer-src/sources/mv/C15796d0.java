package mv;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rv.C16957L;
import rv.C16971h;
import rv.C16972i;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "Lmv/c0;", "", "mode", "", "a", "(Lmv/c0;I)V", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", "d", "(Lmv/c0;Lkotlin/coroutines/Continuation;Z)V", "e", "(Lmv/c0;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.d0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15796d0 {
    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    private static final void e(AbstractC15794c0<?> abstractC15794c0) {
        AbstractC15812l0 abstractC15812l0B = a1.f151702a.b();
        if (abstractC15812l0B.d1()) {
            abstractC15812l0B.Y0(abstractC15794c0);
            return;
        }
        abstractC15812l0B.a1(true);
        try {
            d(abstractC15794c0, abstractC15794c0.e(), true);
            do {
            } while (abstractC15812l0B.h1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final <T> void a(AbstractC15794c0<? super T> abstractC15794c0, int i10) {
        boolean z10;
        Continuation<? super T> continuationE = abstractC15794c0.e();
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (continuationE instanceof C16971h) && b(i10) == b(abstractC15794c0.resumeMode)) {
            C16971h c16971h = (C16971h) continuationE;
            AbstractC15779K abstractC15779K = c16971h.dispatcher;
            CoroutineContext f143270a = c16971h.getContext();
            if (C16972i.d(abstractC15779K, f143270a)) {
                C16972i.c(abstractC15779K, f143270a, abstractC15794c0);
                return;
            } else {
                e(abstractC15794c0);
                return;
            }
        }
        d(abstractC15794c0, continuationE, z10);
    }

    public static final <T> void d(AbstractC15794c0<? super T> abstractC15794c0, Continuation<? super T> continuation, boolean z10) {
        Object objG;
        f1<?> f1VarM;
        Object objI = abstractC15794c0.i();
        Throwable thF = abstractC15794c0.f(objI);
        if (thF != null) {
            Result.Companion companion = Result.INSTANCE;
            objG = ResultKt.a(thF);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objG = abstractC15794c0.g(objI);
        }
        Object objB = Result.b(objG);
        if (z10) {
            Intrinsics.h(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C16971h c16971h = (C16971h) continuation;
            Continuation<T> continuation2 = c16971h.continuation;
            Object obj = c16971h.countOrElement;
            CoroutineContext f143270a = continuation2.getContext();
            Object objI2 = C16957L.i(f143270a, obj);
            if (objI2 != C16957L.f159623a) {
                f1VarM = C15777I.m(continuation2, f143270a, objI2);
            } else {
                f1VarM = null;
            }
            try {
                c16971h.continuation.resumeWith(objB);
                Unit unit = Unit.f143329a;
                if (f1VarM != null && !f1VarM.k1()) {
                    return;
                }
                C16957L.f(f143270a, objI2);
                return;
            } catch (Throwable th2) {
                if (f1VarM == null || f1VarM.k1()) {
                    C16957L.f(f143270a, objI2);
                }
                throw th2;
            }
        }
        continuation.resumeWith(objB);
    }
}
