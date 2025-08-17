package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001&B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Landroidx/compose/runtime/m1;", "T", "LM0/x;", "LM0/l;", "value", "Landroidx/compose/runtime/n1;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/n1;)V", "LM0/y;", "", "f", "(LM0/y;)V", "previous", "current", "applied", "k", "(LM0/y;LM0/y;LM0/y;)LM0/y;", "", "toString", "()Ljava/lang/String;", "b", "Landroidx/compose/runtime/n1;", "e", "()Landroidx/compose/runtime/n1;", "Landroidx/compose/runtime/m1$a;", "c", "Landroidx/compose/runtime/m1$a;", "next", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "v", "()LM0/y;", "firstStateRecord", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.m1, reason: from toString */
/* loaded from: classes.dex */
public class MutableState<T> extends M0.x implements M0.l<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n1<T> policy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a<T> next;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\t\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/m1$a;", "T", "LM0/y;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "myValue", "<init>", "(JLjava/lang/Object;)V", "value", "", "c", "(LM0/y;)V", "j", "()Landroidx/compose/runtime/m1$a;", "k", "(J)Landroidx/compose/runtime/m1$a;", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "m", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.m1$a */
    private static final class a<T> extends M0.y {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private T value;

        @Override // M0.y
        public void c(M0.y value) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.value = ((a) value).value;
        }

        @Override // M0.y
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<T> d() {
            return new a<>(androidx.compose.runtime.snapshots.j.I().getSnapshotId(), this.value);
        }

        @Override // M0.y
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<T> e(long snapshotId) {
            return new a<>(androidx.compose.runtime.snapshots.j.I().getSnapshotId(), this.value);
        }

        public final T l() {
            return this.value;
        }

        public final void m(T t10) {
            this.value = t10;
        }

        public a(long j10, T t10) {
            super(j10);
            this.value = t10;
        }
    }

    @Override // M0.l
    public n1<T> e() {
        return this.policy;
    }

    @Override // M0.w
    public void f(M0.y value) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (a) value;
    }

    @Override // androidx.compose.runtime.InterfaceC5730l0, androidx.compose.runtime.z1
    public T getValue() {
        return (T) ((a) androidx.compose.runtime.snapshots.j.X(this.next, this)).l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.w
    public M0.y k(M0.y previous, M0.y current, M0.y applied) {
        Intrinsics.h(previous, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) previous;
        Intrinsics.h(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) current;
        Intrinsics.h(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) applied;
        if (e().b(aVar2.l(), aVar3.l())) {
            return current;
        }
        Object objA = e().a(aVar.l(), aVar2.l(), aVar3.l());
        if (objA == null) {
            return null;
        }
        a aVarE = aVar3.e(aVar3.getSnapshotId());
        aVarE.m(objA);
        return aVarE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC5730l0
    public void setValue(T t10) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) androidx.compose.runtime.snapshots.j.G(this.next);
        if (e().b(aVar.l(), t10)) {
            return;
        }
        a<T> aVar2 = this.next;
        synchronized (androidx.compose.runtime.snapshots.j.J()) {
            gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
            ((a) androidx.compose.runtime.snapshots.j.S(aVar2, this, gVarC, aVar)).m(t10);
            Unit unit = Unit.f142422a;
        }
        androidx.compose.runtime.snapshots.j.Q(gVarC, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) androidx.compose.runtime.snapshots.j.G(this.next)).l() + ")@" + hashCode();
    }

    @Override // M0.w
    /* renamed from: v */
    public M0.y getFirstStateRecord() {
        return this.next;
    }

    public MutableState(T t10, n1<T> n1Var) {
        this.policy = n1Var;
        androidx.compose.runtime.snapshots.g gVarI = androidx.compose.runtime.snapshots.j.I();
        a<T> aVar = new a<>(gVarI.getSnapshotId(), t10);
        if (!(gVarI instanceof androidx.compose.runtime.snapshots.a)) {
            aVar.h(new a(M0.g.c(1), t10));
        }
        this.next = aVar;
    }
}
