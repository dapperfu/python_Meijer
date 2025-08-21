package androidx.compose.runtime.snapshots;

import J0.n;
import M0.p;
import M0.w;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eRF\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010$R\u001a\u0010.\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R,\u00109\u001a\u00060)j\u0002`52\n\u00106\u001a\u00060)j\u0002`58V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010-\"\u0004\b7\u00108R$\u0010?\u001a\u00020:2\u0006\u00106\u001a\u00020:8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/runtime/snapshots/m;", "Landroidx/compose/runtime/snapshots/g;", "previousSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "", "mergeParentObservers", "ownsPreviousSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/g;Lkotlin/jvm/functions/Function1;ZZ)V", "d", "()V", "LM0/w;", "state", "p", "(LM0/w;)V", "readObserver", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "o", "snapshot", "", "D", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "E", "g", "Landroidx/compose/runtime/snapshots/g;", "h", "Z", "i", "<set-?>", "j", "Lkotlin/jvm/functions/Function1;", "B", "()Lkotlin/jvm/functions/Function1;", "F", "(Lkotlin/jvm/functions/Function1;)V", "k", "writeObserver", "", "l", "J", "C", "()J", "threadId", "m", "getRoot", "()Landroidx/compose/runtime/snapshots/g;", "root", "A", "currentSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "setSnapshotId$runtime_release", "(J)V", "snapshotId", "Landroidx/compose/runtime/snapshots/i;", "f", "()Landroidx/compose/runtime/snapshots/i;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/i;)V", "invalid", "()Z", "readOnly", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m extends g {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g previousSnapshot;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean ownsPreviousSnapshot;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Function1<Object, Unit> readObserver;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Unit> writeObserver;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long threadId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final g root;

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        g gVar;
        t(true);
        if (!this.ownsPreviousSnapshot || (gVar = this.previousSnapshot) == null) {
            return;
        }
        gVar.d();
    }

    private final g A() {
        g gVar = this.previousSnapshot;
        return gVar == null ? j.f50651k : gVar;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> g() {
        return this.readObserver;
    }

    /* renamed from: C, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    public void F(Function1<Object, Unit> function1) {
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public Function1<Object, Unit> k() {
        return this.writeObserver;
    }

    public m(g gVar, Function1<Object, Unit> function1, boolean z10, boolean z11) {
        Function1<Object, Unit> function1G;
        super(j.f50642b, i.INSTANCE.a(), null);
        this.previousSnapshot = gVar;
        this.mergeParentObservers = z10;
        this.ownsPreviousSnapshot = z11;
        this.readObserver = j.K(function1, (gVar == null || (function1G = gVar.g()) == null) ? j.f50651k.g() : function1G, z10);
        this.threadId = n.a();
        this.root = this;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: f */
    public i getInvalid() {
        return A().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean h() {
        return A().h();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: i */
    public long getSnapshotId() {
        return A().getSnapshotId();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
        A().o();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(w state) {
        A().p(state);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(Function1<Object, Unit> readObserver) {
        Function1<Object, Unit> function1L = j.L(readObserver, g(), false, 4, null);
        if (!this.mergeParentObservers) {
            return j.E(A().x(null), function1L, true);
        }
        return A().x(function1L);
    }
}
