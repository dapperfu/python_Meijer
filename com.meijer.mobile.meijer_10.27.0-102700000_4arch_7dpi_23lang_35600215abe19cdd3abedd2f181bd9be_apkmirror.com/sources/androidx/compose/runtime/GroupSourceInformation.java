package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u0017J\u0015\u0010$\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b-\u0010'R6\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010.j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010;\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010%\u001a\u0004\b=\u0010'\"\u0004\b>\u0010\u0017¨\u0006?"}, d2 = {"Landroidx/compose/runtime/GroupSourceInformation;", "", "", "key", "", "sourceInformation", "dataStartOffset", "<init>", "(ILjava/lang/String;I)V", "h", "()Landroidx/compose/runtime/GroupSourceInformation;", "group", "", "a", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/Anchor;", "anchor", "", "g", "(Landroidx/compose/runtime/Anchor;)Z", "dataOffset", "l", "d", "(I)V", "Landroidx/compose/runtime/SlotWriter;", "writer", "k", "(Landroidx/compose/runtime/SlotWriter;I)V", "Landroidx/compose/runtime/SlotTable;", "table", "j", "(Landroidx/compose/runtime/SlotTable;I)V", "predecessor", "b", "(Landroidx/compose/runtime/SlotWriter;II)V", "c", "i", "I", "f", "()I", "Ljava/lang/String;", "getSourceInformation", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "getDataStartOffset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "groups", "Ljava/util/ArrayList;", "e", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "dataEndOffset", "getDataEndOffset", "setDataEndOffset", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GroupSourceInformation {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String sourceInformation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean closed;
    private int dataEndOffset;
    private final int dataStartOffset;
    private ArrayList<Object> groups;
    private final int key;

    public final void c(int dataOffset) {
        this.closed = true;
        this.dataEndOffset = dataOffset;
    }

    private final void a(Object group) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(group);
    }

    private final boolean g(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (Intrinsics.e(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).g(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final GroupSourceInformation h() {
        Object obj;
        GroupSourceInformation groupSourceInformationH;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).closed) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        GroupSourceInformation groupSourceInformation = obj instanceof GroupSourceInformation ? (GroupSourceInformation) obj : null;
        return (groupSourceInformation == null || (groupSourceInformationH = groupSourceInformation.h()) == null) ? this : groupSourceInformationH;
    }

    public final void b(SlotWriter writer, int predecessor, int group) {
        Anchor anchorN1;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i10 = 0;
        if (predecessor >= 0 && (anchorN1 = writer.n1(predecessor)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                }
                Object obj = arrayList.get(i10);
                if (Intrinsics.e(obj, anchorN1) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).g(anchorN1))) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        arrayList.add(i10, writer.D(group));
    }

    public final ArrayList<Object> e() {
        return this.groups;
    }

    /* renamed from: f, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    public final boolean i(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (Intrinsics.e(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).i(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public GroupSourceInformation(int i10, String str, int i11) {
        this.key = i10;
        this.sourceInformation = str;
        this.dataStartOffset = i11;
    }

    public final void d(int dataOffset) {
        h().c(dataOffset);
    }

    public final void j(SlotTable table, int group) {
        h().a(table.a(group));
    }

    public final void k(SlotWriter writer, int group) {
        h().a(writer.D(group));
    }

    public final void l(int key, String sourceInformation, int dataOffset) {
        h().a(new GroupSourceInformation(key, sourceInformation, dataOffset));
    }
}
