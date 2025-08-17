package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016¨\u0006%"}, d2 = {"Landroidx/compose/runtime/v1;", "", "LO0/b;", "Landroidx/compose/runtime/SlotTable;", "table", "", "parent", "Landroidx/compose/runtime/GroupSourceInformation;", "group", "Landroidx/compose/runtime/w1;", "path", "<init>", "(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;Landroidx/compose/runtime/w1;)V", "", "hasNext", "()Z", "a", "()LO0/b;", "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "b", "I", "getParent", "()I", "c", "Landroidx/compose/runtime/GroupSourceInformation;", "getGroup", "()Landroidx/compose/runtime/GroupSourceInformation;", "d", "Landroidx/compose/runtime/w1;", "getPath", "()Landroidx/compose/runtime/w1;", "e", "version", "f", "index", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class v1 implements Iterator<O0.b>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final GroupSourceInformation group;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w1 path;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int index;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O0.b next() {
        Object obj;
        ArrayList<Object> arrayListE = this.group.e();
        if (arrayListE != null) {
            int i10 = this.index;
            this.index = i10 + 1;
            obj = arrayListE.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof Anchor) {
            return new X0(this.table, ((Anchor) obj).getLocation(), this.version);
        }
        if (obj instanceof GroupSourceInformation) {
            return new x1(this.table, this.parent, (GroupSourceInformation) obj, new M0(this.path, this.index - 1));
        }
        ComposerKt.u("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> arrayListE = this.group.e();
        return arrayListE != null && this.index < arrayListE.size();
    }

    public v1(SlotTable slotTable, int i10, GroupSourceInformation groupSourceInformation, w1 w1Var) {
        this.table = slotTable;
        this.parent = i10;
        this.group = groupSourceInformation;
        this.path = w1Var;
        this.version = slotTable.getVersion();
    }
}
