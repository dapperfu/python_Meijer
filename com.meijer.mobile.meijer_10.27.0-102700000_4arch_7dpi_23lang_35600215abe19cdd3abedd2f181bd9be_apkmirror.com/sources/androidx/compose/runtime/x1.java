package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/compose/runtime/x1;", "LO0/b;", "", "Landroidx/compose/runtime/SlotTable;", "table", "", "parent", "Landroidx/compose/runtime/GroupSourceInformation;", "sourceInformation", "Landroidx/compose/runtime/w1;", "identityPath", "<init>", "(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;Landroidx/compose/runtime/w1;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "b", "I", "getParent", "()I", "c", "Landroidx/compose/runtime/GroupSourceInformation;", "getSourceInformation", "()Landroidx/compose/runtime/GroupSourceInformation;", "d", "Landroidx/compose/runtime/w1;", "getIdentityPath", "()Landroidx/compose/runtime/w1;", "", "e", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "f", "Ljava/lang/Iterable;", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class x1 implements O0.b, Iterable<O0.b>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final GroupSourceInformation sourceInformation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w1 identityPath;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Iterable<O0.b> compositionGroups = this;

    @Override // java.lang.Iterable
    public Iterator<O0.b> iterator() {
        return new v1(this.table, this.parent, this.sourceInformation, this.identityPath);
    }

    public x1(SlotTable slotTable, int i10, GroupSourceInformation groupSourceInformation, w1 w1Var) {
        this.table = slotTable;
        this.parent = i10;
        this.sourceInformation = groupSourceInformation;
        this.identityPath = w1Var;
        this.key = Integer.valueOf(groupSourceInformation.getKey());
    }
}
