package androidx.compose.runtime.snapshots;

import M0.w;
import M0.y;
import Z.X;
import androidx.compose.runtime.snapshots.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/c;", "Landroidx/compose/runtime/snapshots/b;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/i;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/b;)V", "U", "()V", "d", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "s", "Landroidx/compose/runtime/snapshots/b;", "getParent", "()Landroidx/compose/runtime/snapshots/b;", "", "t", "Z", "deactivated", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final b parent;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean deactivated;

    private final void U() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.n(this);
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() throws Throwable {
        c cVar;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new h.a(this);
        }
        X<w> xE = E();
        long snapshotId = getSnapshotId();
        Map<y, ? extends y> mapR = xE != null ? j.R(this.parent.getSnapshotId(), this, this.parent.getInvalid()) : null;
        synchronized (j.J()) {
            try {
                j.g0(this);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (xE == null || xE.get_size() == 0) {
                    cVar = this;
                    b();
                } else {
                    cVar = this;
                    h hVarJ = cVar.J(this.parent.getSnapshotId(), xE, mapR, this.parent.getInvalid());
                    if (!Intrinsics.e(hVarJ, h.b.f50404a)) {
                        return hVarJ;
                    }
                    X<w> xE2 = cVar.parent.E();
                    if (xE2 != null) {
                        xE2.i(xE);
                    } else {
                        cVar.parent.Q(xE);
                        Q(null);
                    }
                }
                if (cVar.parent.getSnapshotId() < snapshotId) {
                    cVar.parent.B();
                }
                b bVar = cVar.parent;
                bVar.u(bVar.getInvalid().p(snapshotId).o(getPreviousIds()));
                cVar.parent.K(snapshotId);
                cVar.parent.M(y());
                cVar.parent.L(getPreviousIds());
                cVar.parent.N(getPreviousPinnedSnapshots());
                Unit unit = Unit.f142422a;
                P(true);
                U();
                N0.c.c(this, xE);
                return h.b.f50404a;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public c(long j10, i iVar, Function1<Object, Unit> function1, Function1<Object, Unit> function12, b bVar) {
        super(j10, iVar, function1, function12);
        this.parent = bVar;
        bVar.m(this);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        if (!getDisposed()) {
            super.d();
            U();
        }
    }
}
