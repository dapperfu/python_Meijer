package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010(\n\u0002\b.\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u000b2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eH\u0000¢\u0006\u0004\b!\u0010\"J\u008f\u0001\u00101\u001a\u00020 2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b1\u00102J\u0087\u0001\u00103\u001a\u00020 2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0015¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0004\u0018\u00010\u001d2\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020 ¢\u0006\u0004\b:\u0010\u0005J\r\u0010;\u001a\u00020 ¢\u0006\u0004\b;\u0010\u0005J!\u0010=\u001a\u0004\u0018\u00010(2\u0006\u00107\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030?H\u0096\u0002¢\u0006\u0004\b@\u0010AR$\u0010%\u001a\u00020$2\u0006\u0010B\u001a\u00020$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010ER$\u0010&\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR4\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR$\u0010*\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010GR\u0014\u0010S\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010RR$\u0010#\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u00106R\"\u0010Z\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010G\u001a\u0004\bW\u0010I\"\u0004\bX\u0010YR2\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`RB\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u00106¨\u0006m"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "LO0/a;", "", "LO0/b;", "<init>", "()V", "", "index", "Landroidx/compose/runtime/Anchor;", "H", "(I)Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/W0;", "B", "()Landroidx/compose/runtime/W0;", "Landroidx/compose/runtime/SlotWriter;", "C", "()Landroidx/compose/runtime/SlotWriter;", "a", "anchor", "f", "(Landroidx/compose/runtime/Anchor;)I", "", "D", "(Landroidx/compose/runtime/Anchor;)Z", "groupIndex", "y", "(ILandroidx/compose/runtime/Anchor;)Z", "reader", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "", "h", "(Landroidx/compose/runtime/W0;Ljava/util/HashMap;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "LZ/K;", "LZ/L;", "calledByMap", "k", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;LZ/K;)V", "E", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;LZ/K;)V", "p", "()Z", "group", "G", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "n", "o", "slotIndex", "F", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "<set-?>", "[I", "getGroups", "()[I", "b", "I", "s", "()I", "c", "[Ljava/lang/Object;", "t", "()[Ljava/lang/Object;", "d", "u", "e", "readers", "Ljava/lang/Object;", "lock", "g", "Z", "x", "w", "setVersion$runtime_release", "(I)V", "version", "i", "Ljava/util/ArrayList;", "q", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "j", "Ljava/util/HashMap;", "v", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "LZ/K;", "r", "()LZ/K;", "setCalledByMap$runtime_release", "(LZ/K;)V", "isEmpty", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SlotTable implements O0.a, Iterable<O0.b>, KMappedMarker {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int groupsSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int slotsSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int readers;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean writer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int version;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Z.K<Z.L> calledByMap;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] groups = new int[0];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object[] slots = new Object[0];

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final Anchor H(int index) {
        int i10;
        if (this.writer) {
            ComposerKt.t("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i10 = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.o(this.anchors, index, i10);
    }

    public final SlotReader B() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter C() {
        if (this.writer) {
            ComposerKt.t("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            ComposerKt.t("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final void E(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors, HashMap<Anchor, GroupSourceInformation> sourceInformationMap, Z.K<Z.L> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final Object F(int group, int slotIndex) {
        int iU = SlotTableKt.u(this.groups, group);
        int i10 = group + 1;
        return (slotIndex < 0 || slotIndex >= (i10 < this.groupsSize ? this.groups[(i10 * 5) + 4] : this.slots.length) - iU) ? Composer.INSTANCE.a() : this.slots[iU + slotIndex];
    }

    public final GroupSourceInformation G(int group) {
        Anchor anchorH;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorH = H(group)) == null) {
            return null;
        }
        return map.get(anchorH);
    }

    public final Anchor a(int index) {
        if (this.writer) {
            ComposerKt.t("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (index >= 0 && index < this.groupsSize) {
            z10 = true;
        }
        if (!z10) {
            C5899z0.a("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iT = SlotTableKt.t(arrayList, index, this.groupsSize);
        if (iT >= 0) {
            return arrayList.get(iT);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iT + 1), anchor);
        return anchor;
    }

    public final int f(Anchor anchor) {
        if (this.writer) {
            ComposerKt.t("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.b()) {
            C5899z0.a("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<O0.b> iterator() {
        return new N(this, 0, this.groupsSize);
    }

    public final void n() {
        this.calledByMap = new Z.K<>(0, 1, null);
    }

    public final void o() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean p() {
        return this.groupsSize > 0 && (this.groups[1] & 67108864) != 0;
    }

    public final ArrayList<Anchor> q() {
        return this.anchors;
    }

    public final Z.K<Z.L> r() {
        return this.calledByMap;
    }

    /* renamed from: s, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* renamed from: t, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    /* renamed from: u, reason: from getter */
    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<Anchor, GroupSourceInformation> v() {
        return this.sourceInformationMap;
    }

    /* renamed from: w, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean y(int groupIndex, Anchor anchor) {
        if (this.writer) {
            ComposerKt.t("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            ComposerKt.t("Invalid group index");
        }
        if (D(anchor)) {
            int iP = SlotTableKt.p(this.groups, groupIndex) + groupIndex;
            int iA = anchor.getLocation();
            if (groupIndex <= iA && iA < iP) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(Anchor anchor) {
        int iT;
        if (anchor.b() && (iT = SlotTableKt.t(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.e(this.anchors.get(iT), anchor)) {
            return true;
        }
        return false;
    }

    public final void h(SlotReader reader, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        boolean z10;
        if (reader.getTable() == this && this.readers > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ComposerKt.t("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this.lock) {
                try {
                    HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void k(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors, HashMap<Anchor, GroupSourceInformation> sourceInformationMap, Z.K<Z.L> calledByMap) {
        boolean z10;
        if (writer.getTable() == this && this.writer) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C5899z0.a("Unexpected writer close()");
        }
        this.writer = false;
        E(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }
}
