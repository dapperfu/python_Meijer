package M0;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0006R$\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"LM0/y;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "()V", "value", "", "c", "(LM0/y;)V", "d", "()LM0/y;", "e", "(J)LM0/y;", "a", "J", "g", "()J", "i", "b", "LM0/y;", "f", "h", "next", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long snapshotId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private y next;

    public y(long j10) {
        this.snapshotId = j10;
    }

    public abstract void c(y value);

    public abstract y d();

    /* renamed from: f, reason: from getter */
    public final y getNext() {
        return this.next;
    }

    /* renamed from: g, reason: from getter */
    public final long getSnapshotId() {
        return this.snapshotId;
    }

    public final void h(y yVar) {
        this.next = yVar;
    }

    public final void i(long j10) {
        this.snapshotId = j10;
    }

    public y() {
        this(androidx.compose.runtime.snapshots.j.I().getSnapshotId());
    }

    public y e(long snapshotId) {
        y yVarD = d();
        yVarD.snapshotId = snapshotId;
        return yVarD;
    }
}
