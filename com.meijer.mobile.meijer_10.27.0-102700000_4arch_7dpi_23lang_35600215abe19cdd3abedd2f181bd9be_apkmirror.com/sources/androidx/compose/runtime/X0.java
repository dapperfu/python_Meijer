package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/X0;", "LO0/b;", "", "Landroidx/compose/runtime/SlotTable;", "table", "", "group", "version", "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "", "a", "()V", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "b", "I", "getGroup", "()I", "c", "getVersion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class X0 implements O0.b, Iterable<O0.b>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int group;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int version;

    private final void a() {
        if (this.table.getVersion() != this.version) {
            SlotTableKt.v();
        }
    }

    public X0(SlotTable slotTable, int i10, int i11) {
        this.table = slotTable;
        this.group = i10;
        this.version = i11;
    }

    @Override // java.lang.Iterable
    public Iterator<O0.b> iterator() {
        a();
        GroupSourceInformation groupSourceInformationG = this.table.G(this.group);
        if (groupSourceInformationG != null) {
            SlotTable slotTable = this.table;
            int i10 = this.group;
            return new v1(slotTable, i10, groupSourceInformationG, new C5697b(i10));
        }
        SlotTable slotTable2 = this.table;
        int i11 = this.group;
        return new N(slotTable2, i11 + 1, i11 + SlotTableKt.p(slotTable2.getGroups(), this.group));
    }
}
