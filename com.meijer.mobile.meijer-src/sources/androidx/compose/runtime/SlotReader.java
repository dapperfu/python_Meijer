package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010$J\r\u0010(\u001a\u00020\"¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\"¢\u0006\u0004\b+\u0010$J\u0015\u0010,\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u0010$J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010@\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010?R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0014\u0010D\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010?R6\u0010I\u001a\"\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u00010Ej\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u0001`G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010HR$\u0010N\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\bL\u0010MR$\u0010P\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\bO\u0010*R$\u0010R\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bQ\u0010*R$\u0010T\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bS\u0010*R\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010VR\u0016\u0010Y\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?R\u0016\u0010[\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010?R\u0016\u0010]\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010?R$\u0010`\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010K\u001a\u0004\b_\u0010MR\u0011\u0010b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\ba\u0010*R\u0011\u0010c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b?\u0010MR\u0011\u0010e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010MR\u0011\u0010g\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bf\u0010MR\u0011\u0010i\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bh\u0010*R\u0011\u0010j\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bZ\u0010*R\u0011\u0010k\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010*R\u0011\u0010m\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bl\u0010*R\u0011\u0010o\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bn\u0010MR\u0013\u0010p\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b^\u0010!R\u0013\u0010q\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bX\u0010!R\u0011\u0010s\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\br\u0010*R\u0011\u0010u\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bt\u0010*¨\u0006v"}, d2 = {"Landroidx/compose/runtime/W0;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "", "index", "M", "([II)Ljava/lang/Object;", "b", "O", "P", "(I)I", "", "J", "(I)Z", "N", "L", "(I)Ljava/lang/Object;", "E", "C", "G", "D", "z", "F", "e", "A", "group", "B", "(II)Ljava/lang/Object;", "K", "()Ljava/lang/Object;", "", "c", "()V", "f", "d", "U", "V", "S", "()I", "T", "Q", "(I)V", "R", "g", "", "Landroidx/compose/runtime/V;", "h", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/Anchor;", "a", "(I)Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/SlotTable;", "y", "()Landroidx/compose/runtime/SlotTable;", "[I", "groups", "I", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sourceInformationMap", "<set-?>", "Z", "i", "()Z", "closed", "k", "currentGroup", "j", "currentEnd", "u", "parent", "Landroidx/compose/runtime/P;", "Landroidx/compose/runtime/P;", "currentSlotStack", "l", "emptyCount", "m", "currentSlot", "n", "currentSlotEnd", "o", "r", "hadNext", "x", "size", "isNode", "H", "isGroupEnd", "t", "inEmpty", "p", "groupSize", "groupEnd", "groupKey", "q", "groupSlotIndex", "s", "hasObjectKey", "groupObjectKey", "groupAux", "v", "parentNodes", "w", "remainingSlots", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.W0, reason: from toString */
/* loaded from: classes.dex */
public final class SlotReader {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] groups;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int groupsSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object[] slots;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int slotsSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private int current;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private int end;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private int parent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final P currentSlotStack;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int emptyCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean hadNext;

    public final void d() {
        this.closed = true;
        this.table.h(this, this.sourceInformationMap);
    }

    private final Object M(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return (iArr[i11 + 1] & 1073741824) != 0 ? this.slots[iArr[i11 + 4]] : Composer.INSTANCE.a();
    }

    private final Object O(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.s(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0 ? this.slots[SlotTableKt.n(iArr, i10)] : Composer.INSTANCE.a();
    }

    public final Object A(int index) {
        return B(this.current, index);
    }

    public final Object B(int group, int index) {
        int iU = SlotTableKt.u(this.groups, group);
        int i10 = group + 1;
        int i11 = iU + index;
        return i11 < (i10 < this.groupsSize ? this.groups[(i10 * 5) + 4] : this.slotsSize) ? this.slots[i11] : Composer.INSTANCE.a();
    }

    public final int C(int index) {
        return this.groups[index * 5];
    }

    public final Object D(int index) {
        return O(this.groups, index);
    }

    public final int E(int index) {
        return SlotTableKt.p(this.groups, index);
    }

    public final boolean F(int index) {
        return (this.groups[(index * 5) + 1] & 134217728) != 0;
    }

    public final boolean G(int index) {
        return (this.groups[(index * 5) + 1] & 536870912) != 0;
    }

    public final boolean I() {
        return (this.groups[(this.current * 5) + 1] & 1073741824) != 0;
    }

    public final boolean J(int index) {
        return (this.groups[(index * 5) + 1] & 1073741824) != 0;
    }

    public final Object K() {
        int i10;
        if (this.emptyCount > 0 || (i10 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.INSTANCE.a();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i10 + 1;
        return objArr[i10];
    }

    public final Object L(int index) {
        int[] iArr = this.groups;
        if ((iArr[(index * 5) + 1] & 1073741824) != 0) {
            return M(iArr, index);
        }
        return null;
    }

    public final int N(int index) {
        return this.groups[(index * 5) + 1] & 67108863;
    }

    public final int P(int index) {
        return this.groups[(index * 5) + 2];
    }

    public final void Q(int index) {
        if (!(this.emptyCount == 0)) {
            ComposerKt.t("Cannot reposition while in an empty region");
        }
        this.current = index;
        int i10 = this.groupsSize;
        int i11 = index < i10 ? this.groups[(index * 5) + 2] : -1;
        this.parent = i11;
        if (i11 < 0) {
            this.end = i10;
        } else {
            this.end = i11 + SlotTableKt.p(this.groups, i11);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void R(int index) {
        int iP = SlotTableKt.p(this.groups, index) + index;
        int i10 = this.current;
        if (!(i10 >= index && i10 <= iP)) {
            ComposerKt.t("Index " + index + " is not a parent of " + i10);
        }
        this.parent = index;
        this.end = iP;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int S() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.t("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i10 = this.current;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.current = i10 + SlotTableKt.p(iArr, i10);
        return i11;
    }

    public final void T() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.t("Cannot skip the enclosing group while in an empty region");
        }
        this.current = this.end;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void U() {
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i10 = this.parent;
            int i11 = this.current;
            if (!(this.groups[(i11 * 5) + 2] == i10)) {
                C5899z0.a("Invalid slot table detected");
            }
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            if (map != null && (groupSourceInformation = map.get(a(i10))) != null) {
                groupSourceInformation.j(this.table, i11);
            }
            P p10 = this.currentSlotStack;
            int i12 = this.currentSlot;
            int i13 = this.currentSlotEnd;
            if (i12 == 0 && i13 == 0) {
                p10.h(-1);
            } else {
                p10.h(i12);
            }
            this.parent = i11;
            this.end = SlotTableKt.p(this.groups, i11) + i11;
            int i14 = i11 + 1;
            this.current = i14;
            this.currentSlot = SlotTableKt.u(this.groups, i11);
            this.currentSlotEnd = i11 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i14 * 5) + 4];
        }
    }

    public final void V() {
        if (this.emptyCount <= 0) {
            if (!((this.groups[(this.current * 5) + 1] & 1073741824) != 0)) {
                C5899z0.a("Expected a node group");
            }
            U();
        }
    }

    public final Anchor a(int index) {
        ArrayList<Anchor> arrayListQ = this.table.q();
        int iT = SlotTableKt.t(arrayListQ, index, this.groupsSize);
        if (iT >= 0) {
            return arrayListQ.get(iT);
        }
        Anchor anchor = new Anchor(index);
        arrayListQ.add(-(iT + 1), anchor);
        return anchor;
    }

    public final void c() {
        this.emptyCount++;
    }

    public final boolean e(int index) {
        return (this.groups[(index * 5) + 1] & 67108864) != 0;
    }

    public final void f() {
        if (!(this.emptyCount > 0)) {
            C5899z0.a("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void g() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                ComposerKt.t("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i10 = iArr[(this.parent * 5) + 2];
            this.parent = i10;
            this.end = i10 < 0 ? this.groupsSize : SlotTableKt.p(iArr, i10) + i10;
            int iG = this.currentSlotStack.g();
            if (iG < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = iG;
                this.currentSlotEnd = i10 >= this.groupsSize - 1 ? this.slotsSize : this.groups[((i10 + 1) * 5) + 4];
            }
        }
    }

    public final List<V> h() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i10 = 0;
            int iP = this.current;
            while (true) {
                int i11 = i10;
                if (iP >= this.end) {
                    break;
                }
                int[] iArr = this.groups;
                int i12 = iP * 5;
                int i13 = iArr[i12];
                Object objO = O(iArr, iP);
                int i14 = 1;
                int i15 = this.groups[i12 + 1];
                if ((1073741824 & i15) == 0) {
                    i14 = i15 & 67108863;
                }
                i10 = i11 + 1;
                arrayList.add(new V(i13, objO, iP, i14, i11));
                iP += SlotTableKt.p(this.groups, iP);
            }
        }
        return arrayList;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: j, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: k, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final Object l() {
        int i10 = this.current;
        if (i10 < this.end) {
            return b(this.groups, i10);
        }
        return 0;
    }

    public final int m() {
        return this.end;
    }

    public final int n() {
        int i10 = this.current;
        if (i10 < this.end) {
            return this.groups[i10 * 5];
        }
        return 0;
    }

    public final Object o() {
        int i10 = this.current;
        if (i10 < this.end) {
            return O(this.groups, i10);
        }
        return null;
    }

    public final int p() {
        return SlotTableKt.p(this.groups, this.current);
    }

    public final int q() {
        return this.currentSlot - SlotTableKt.u(this.groups, this.parent);
    }

    /* renamed from: r, reason: from getter */
    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean s() {
        int i10 = this.current;
        return i10 < this.end && (this.groups[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean t() {
        return this.emptyCount > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + n() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    /* renamed from: u, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int v() {
        int i10 = this.parent;
        if (i10 >= 0) {
            return this.groups[(i10 * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int w() {
        return this.currentSlotEnd - this.currentSlot;
    }

    /* renamed from: x, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* renamed from: y, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final Object z(int index) {
        return b(this.groups, index);
    }

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new P();
    }

    public final boolean H() {
        if (!t() && this.current != this.end) {
            return false;
        }
        return true;
    }
}
