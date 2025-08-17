package tv;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC17335c;
import kotlin.C17334b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;
import vv.C17648d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ltv/T;", "Luv/c;", "Ltv/Q;", "<init>", "()V", "flow", "", "d", "(Ltv/Q;)Z", "", "Lkotlin/coroutines/Continuation;", "", "f", "(Ltv/Q;)[Lkotlin/coroutines/Continuation;", "g", "h", "()Z", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class T extends AbstractC17335c<Q<?>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // kotlin.AbstractC17335c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Q<?> flow) {
        if (C17648d.a(this._state) != null) {
            return false;
        }
        C17648d.b(this._state, S.f162167a);
        return true;
    }

    public final Object e(Continuation<? super Unit> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        if (!U.d.a(this._state, S.f162167a, c16658p)) {
            Result.Companion companion = Result.INSTANCE;
            c16658p.resumeWith(Result.b(Unit.f142422a));
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV == IntrinsicsKt.f() ? objV : Unit.f142422a;
    }

    @Override // kotlin.AbstractC17335c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation<Unit>[] b(Q<?> flow) {
        C17648d.b(this._state, null);
        return C17334b.f163535a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objA = C17648d.a(atomicReference);
            if (objA == null || objA == S.f162168b) {
                return;
            }
            if (objA == S.f162167a) {
                if (U.d.a(this._state, objA, S.f162168b)) {
                    return;
                }
            } else if (U.d.a(this._state, objA, S.f162167a)) {
                Result.Companion companion = Result.INSTANCE;
                ((C16658p) objA).resumeWith(Result.b(Unit.f142422a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this._state.getAndSet(S.f162167a);
        Intrinsics.g(andSet);
        return andSet == S.f162168b;
    }
}
