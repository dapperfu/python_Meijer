package androidx.compose.runtime.snapshots;

import J0.n;
import M0.p;
import M0.w;
import Z.X;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001b\u001a\u00020\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\"\u0010!R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&RF\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.RF\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b&\u0010.R\u001a\u00105\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R,\u0010=\u001a\u000601j\u0002`92\n\u0010:\u001a\u000601j\u0002`98V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u00104\"\u0004\b)\u0010<R$\u0010B\u001a\u00020>2\u0006\u0010:\u001a\u00020>8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\b'\u0010AR4\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010C2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010C8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010M\u001a\u00020I2\u0006\u0010:\u001a\u00020I8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\b/\u0010LR\u0014\u0010P\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Landroidx/compose/runtime/snapshots/l;", "Landroidx/compose/runtime/snapshots/b;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "d", "()V", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "LM0/w;", "state", "p", "(LM0/w;)V", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "R", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/b;", "o", "snapshot", "", "W", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "X", "s", "Landroidx/compose/runtime/snapshots/b;", "t", "Z", "u", "<set-?>", "v", "Lkotlin/jvm/functions/Function1;", "H", "()Lkotlin/jvm/functions/Function1;", "Y", "(Lkotlin/jvm/functions/Function1;)V", "w", "k", "", "J", "V", "()J", "threadId", "U", "()Landroidx/compose/runtime/snapshots/b;", "currentSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "i", "(J)V", "snapshotId", "Landroidx/compose/runtime/snapshots/i;", "f", "()Landroidx/compose/runtime/snapshots/i;", "(Landroidx/compose/runtime/snapshots/i;)V", "invalid", "LZ/X;", "E", "()LZ/X;", "Q", "(LZ/X;)V", "modified", "", "j", "()I", "(I)V", "writeCount", "h", "()Z", "readOnly", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l extends b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final b parentSnapshot;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean ownsParentSnapshot;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function1<Object, Unit> readObserver;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Function1<Object, Unit> writeObserver;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long threadId;

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        b bVar;
        t(true);
        if (!this.ownsParentSnapshot || (bVar = this.parentSnapshot) == null) {
            return;
        }
        bVar.d();
    }

    private final b U() {
        b bVar = this.parentSnapshot;
        return bVar == null ? j.f50651k : bVar;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> g() {
        return this.readObserver;
    }

    /* renamed from: V, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    public void Y(Function1<Object, Unit> function1) {
        this.readObserver = function1;
    }

    public void Z(Function1<Object, Unit> function1) {
        this.writeObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public Function1<Object, Unit> k() {
        return this.writeObserver;
    }

    public l(b bVar, Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z10, boolean z11) {
        Function1<Object, Unit> function1K;
        Function1<Object, Unit> function1G;
        super(j.f50642b, i.INSTANCE.a(), j.K(function1, (bVar == null || (function1G = bVar.g()) == null) ? j.f50651k.g() : function1G, z10), j.M(function12, (bVar == null || (function1K = bVar.k()) == null) ? j.f50651k.k() : function1K));
        this.parentSnapshot = bVar;
        this.mergeParentObservers = z10;
        this.ownsParentSnapshot = z11;
        this.readObserver = super.g();
        this.writeObserver = super.k();
        this.threadId = n.a();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        return U().C();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public X<w> E() {
        return U().E();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public void Q(X<w> x10) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public b R(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Function1<Object, Unit> function1L = j.L(readObserver, g(), false, 4, null);
        Function1<Object, Unit> function1M = j.M(writeObserver, k());
        if (!this.mergeParentObservers) {
            return new l(U().R(null, function1M), function1L, function1M, false, true);
        }
        return U().R(function1L, function1M);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: f */
    public i getInvalid() {
        return U().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public boolean h() {
        return U().h();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: i */
    public long getSnapshotId() {
        return U().getSnapshotId();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: j */
    public int getWriteCount() {
        return U().getWriteCount();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void o() {
        U().o();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void p(w state) {
        U().p(state);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void u(i iVar) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void v(long j10) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void w(int i10) {
        U().w(i10);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public g x(Function1<Object, Unit> readObserver) {
        Function1<Object, Unit> function1L = j.L(readObserver, g(), false, 4, null);
        if (!this.mergeParentObservers) {
            return j.E(U().x(null), function1L, true);
        }
        return U().x(function1L);
    }
}
