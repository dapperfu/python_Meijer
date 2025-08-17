package androidx.compose.runtime.snapshots;

import M0.w;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B3\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010#R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001d¨\u0006'"}, d2 = {"Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/g;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/i;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/i;Lkotlin/jvm/functions/Function1;)V", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "o", "()V", "d", "snapshot", "m", "(Landroidx/compose/runtime/snapshots/g;)V", "n", "LM0/w;", "state", "p", "(LM0/w;)V", "g", "Lkotlin/jvm/functions/Function1;", "A", "()Lkotlin/jvm/functions/Function1;", "", "h", "I", "snapshots", "", "()Z", "readOnly", "k", "writeObserver", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Unit> readObserver;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    public f(long j10, i iVar, Function1<Object, Unit> function1) {
        super(j10, iVar, null);
        this.readObserver = function1;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean h() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public Function1<Object, Unit> k() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> g() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void m(g snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void n(g snapshot) {
        int i10 = this.snapshots - 1;
        this.snapshots = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        if (!getDisposed()) {
            n(this);
            super.d();
            N0.c.d(this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(w state) {
        j.Z();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(Function1<Object, Unit> readObserver) {
        Map<N0.b, N0.a> mapD;
        j.g0(this);
        E0.e eVar = N0.c.f21265a;
        if (eVar != null) {
            Pair<N0.a, Map<N0.b, N0.a>> pairE = N0.c.e(eVar, this, true, readObserver, null);
            N0.a aVarC = pairE.c();
            Function1<Object, Unit> function1A = aVarC.a();
            aVarC.b();
            mapD = pairE.d();
            readObserver = function1A;
        } else {
            mapD = null;
        }
        d dVar = new d(getSnapshotId(), getInvalid(), j.L(readObserver, g(), false, 4, null), this);
        if (eVar != null) {
            N0.c.b(eVar, this, dVar, mapD);
        }
        return dVar;
    }
}
