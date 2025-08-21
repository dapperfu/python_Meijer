package pv;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC16771c;
import kotlin.C16770b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15819p;
import rv.C16967d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpv/T;", "Lqv/c;", "Lpv/Q;", "<init>", "()V", "flow", "", "d", "(Lpv/Q;)Z", "", "Lkotlin/coroutines/Continuation;", "", "f", "(Lpv/Q;)[Lkotlin/coroutines/Continuation;", "g", "h", "()Z", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
final class T extends AbstractC16771c<Q<?>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // kotlin.AbstractC16771c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Q<?> flow) {
        if (C16967d.a(this._state) != null) {
            return false;
        }
        C16967d.b(this._state, S.f157481a);
        return true;
    }

    public final Object e(Continuation<? super Unit> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        if (!U.d.a(this._state, S.f157481a, c15819p)) {
            Result.Companion companion = Result.INSTANCE;
            c15819p.resumeWith(Result.b(Unit.f143329a));
        }
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU == IntrinsicsKt.f() ? objU : Unit.f143329a;
    }

    @Override // kotlin.AbstractC16771c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation<Unit>[] b(Q<?> flow) {
        C16967d.b(this._state, null);
        return C16770b.f159011a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objA = C16967d.a(atomicReference);
            if (objA == null || objA == S.f157482b) {
                return;
            }
            if (objA == S.f157481a) {
                if (U.d.a(this._state, objA, S.f157482b)) {
                    return;
                }
            } else if (U.d.a(this._state, objA, S.f157481a)) {
                Result.Companion companion = Result.INSTANCE;
                ((C15819p) objA).resumeWith(Result.b(Unit.f143329a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this._state.getAndSet(S.f157481a);
        Intrinsics.g(andSet);
        return andSet == S.f157482b;
    }
}
