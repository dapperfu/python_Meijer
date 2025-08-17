package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/N;", "", "LO0/b;", "Landroidx/compose/runtime/SlotTable;", "table", "", "start", "end", "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "", "c", "()V", "", "hasNext", "()Z", "a", "()LO0/b;", "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "b", "I", "getEnd", "()I", "index", "d", "version", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class N implements Iterator<O0.b>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int version;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final void c() {
        if (this.table.getVersion() != this.version) {
            SlotTableKt.v();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    public N(SlotTable slotTable, int i10, int i11) {
        this.table = slotTable;
        this.end = i11;
        this.index = i10;
        this.version = slotTable.getVersion();
        if (slotTable.getWriter()) {
            SlotTableKt.v();
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O0.b next() {
        c();
        int i10 = this.index;
        this.index = SlotTableKt.p(this.table.getGroups(), i10) + i10;
        return new X0(this.table, i10, this.version);
    }
}
