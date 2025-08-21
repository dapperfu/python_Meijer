package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001#B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/runtime/l1;", "LM0/x;", "Landroidx/compose/runtime/k0;", "LM0/l;", "", "value", "<init>", "(J)V", "LM0/y;", "", "f", "(LM0/y;)V", "previous", "current", "applied", "k", "(LM0/y;LM0/y;LM0/y;)LM0/y;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/l1$a;", "b", "Landroidx/compose/runtime/l1$a;", "next", "t", "()LM0/y;", "firstStateRecord", "c", "()J", "I", "longValue", "Landroidx/compose/runtime/n1;", "e", "()Landroidx/compose/runtime/n1;", "policy", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.l1, reason: from toString */
/* loaded from: classes.dex */
public class MutableLongState extends M0.x implements InterfaceC5870k0, M0.l<Long> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a next;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/l1$a;", "LM0/y;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "value", "<init>", "(JJ)V", "", "c", "(LM0/y;)V", "d", "()LM0/y;", "e", "(J)LM0/y;", "J", "j", "()J", "k", "(J)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.l1$a */
    private static final class a extends M0.y {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long value;

        @Override // M0.y
        public void c(M0.y value) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.value = ((a) value).value;
        }

        @Override // M0.y
        public M0.y e(long snapshotId) {
            return new a(snapshotId, this.value);
        }

        /* renamed from: j, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        public final void k(long j10) {
            this.value = j10;
        }

        public a(long j10, long j11) {
            super(j10);
            this.value = j11;
        }

        @Override // M0.y
        public M0.y d() {
            return e(androidx.compose.runtime.snapshots.j.I().getSnapshotId());
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5870k0
    public void I(long j10) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) androidx.compose.runtime.snapshots.j.G(this.next);
        if (aVar.getValue() != j10) {
            a aVar2 = this.next;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                ((a) androidx.compose.runtime.snapshots.j.S(aVar2, this, gVarC, aVar)).k(j10);
                Unit unit = Unit.f143329a;
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5870k0, androidx.compose.runtime.InterfaceC5837a0
    public long c() {
        return ((a) androidx.compose.runtime.snapshots.j.X(this.next, this)).getValue();
    }

    @Override // M0.w
    public void f(M0.y value) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (a) value;
    }

    @Override // M0.w
    public M0.y k(M0.y previous, M0.y current, M0.y applied) {
        Intrinsics.h(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        Intrinsics.h(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) current).getValue() == ((a) applied).getValue()) {
            return current;
        }
        return null;
    }

    @Override // M0.w
    /* renamed from: t */
    public M0.y getFirstStateRecord() {
        return this.next;
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) androidx.compose.runtime.snapshots.j.G(this.next)).getValue() + ")@" + hashCode();
    }

    public MutableLongState(long j10) {
        androidx.compose.runtime.snapshots.g gVarI = androidx.compose.runtime.snapshots.j.I();
        a aVar = new a(gVarI.getSnapshotId(), j10);
        if (!(gVarI instanceof androidx.compose.runtime.snapshots.a)) {
            aVar.h(new a(M0.g.c(1), j10));
        }
        this.next = aVar;
    }

    @Override // M0.l
    public n1<Long> e() {
        return o1.r();
    }
}
