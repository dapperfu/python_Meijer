package kotlin;

import Z.AbstractC5523v;
import Z.AbstractC5526y;
import Z.C5527z;
import Z.O;
import i0.C14589e;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Selection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0+2\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010:\u001a\u0004\b=\u0010<R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b1\u0010?R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010<R\u0014\u0010H\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010GR\u0014\u0010K\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010N\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010JR\u0014\u0010O\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010JR\u0014\u0010Q\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010J¨\u0006R"}, d2 = {"Lw0/j;", "Lw0/C;", "LZ/v;", "selectableIdToInfoListIndex", "", "Lw0/o;", "infoList", "", "startSlot", "endSlot", "", "isStartHandle", "Lw0/p;", "previousSelection", "<init>", "(LZ/v;Ljava/util/List;IIZLw0/p;)V", "other", "q", "(Lw0/j;)Z", "LZ/O;", "selection", "info", "minOffset", "maxOffset", "", "n", "(LZ/O;Lw0/p;Lw0/o;II)V", "slot", "isStartSlot", "s", "(IZ)I", "isMinimumSlot", "r", "", PreferencesHelper.PREF_ID, "o", "(J)I", "Lkotlin/Function1;", "block", "g", "(Lkotlin/jvm/functions/Function1;)V", "l", "(Lw0/C;)Z", "LZ/y;", "d", "(Lw0/p;)LZ/y;", "", "toString", "()Ljava/lang/String;", "a", "LZ/v;", "getSelectableIdToInfoListIndex", "()LZ/v;", "b", "Ljava/util/List;", "getInfoList", "()Ljava/util/List;", "c", "I", "k", "()I", "e", "Z", "()Z", "f", "Lw0/p;", "h", "()Lw0/p;", "getSize", "size", "Lw0/e;", "()Lw0/e;", "crossStatus", "j", "()Lw0/o;", "startInfo", "i", "endInfo", "currentInfo", "firstInfo", "p", "lastInfo", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17724j implements InterfaceC17694C {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5523v selectableIdToInfoListIndex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<C17729o> infoList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int startSlot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int endSlot;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isStartHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Selection previousSelection;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw0/o;", "info", "", "a", "(Lw0/o;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.j$b */
    static final class b extends Lambda implements Function1<C17729o, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ O<Selection> f165535g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Selection f165536h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O<Selection> o10, Selection selection) {
            super(1);
            this.f165535g = o10;
            this.f165536h = selection;
        }

        public final void a(C17729o c17729o) {
            C17724j.this.n(this.f165535g, this.f165536h, c17729o, 0, c17729o.l());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C17729o c17729o) {
            a(c17729o);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.j$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17719e.values().length];
            try {
                iArr[EnumC17719e.f165513c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17719e.f165512b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17719e.f165511a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int o(long id2) {
        try {
            return this.selectableIdToInfoListIndex.b(id2);
        } catch (NoSuchElementException e10) {
            throw new IllegalStateException("Invalid selectableId: " + id2, e10);
        }
    }

    private final int r(int slot, boolean isMinimumSlot) {
        return (slot - (!isMinimumSlot ? 1 : 0)) / 2;
    }

    @Override // kotlin.InterfaceC17694C
    /* renamed from: a, reason: from getter */
    public boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // kotlin.InterfaceC17694C
    /* renamed from: e, reason: from getter */
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // kotlin.InterfaceC17694C
    public int getSize() {
        return this.infoList.size();
    }

    @Override // kotlin.InterfaceC17694C
    /* renamed from: h, reason: from getter */
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // kotlin.InterfaceC17694C
    public C17729o i() {
        return this.infoList.get(s(getEndSlot(), false));
    }

    @Override // kotlin.InterfaceC17694C
    public C17729o j() {
        return this.infoList.get(s(getStartSlot(), true));
    }

    @Override // kotlin.InterfaceC17694C
    /* renamed from: k, reason: from getter */
    public int getStartSlot() {
        return this.startSlot;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MultiSelectionLayout(isStartHandle=");
        sb2.append(getIsStartHandle());
        sb2.append(", startPosition=");
        boolean z10 = true;
        float f10 = 2;
        sb2.append((getStartSlot() + 1) / f10);
        sb2.append(", endPosition=");
        sb2.append((getEndSlot() + 1) / f10);
        sb2.append(", crossed=");
        sb2.append(f());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[\n\t");
        List<C17729o> list = this.infoList;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            C17729o c17729o = list.get(i10);
            if (z10) {
                z10 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i10++;
            sb4.append(i10);
            sb4.append(" -> ");
            sb4.append(c17729o);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        String string = sb3.toString();
        Intrinsics.i(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        return sb2.toString();
    }

    public C17724j(AbstractC5523v abstractC5523v, List<C17729o> list, int i10, int i11, boolean z10, Selection selection) {
        this.selectableIdToInfoListIndex = abstractC5523v;
        this.infoList = list;
        this.startSlot = i10;
        this.endSlot = i11;
        this.isStartHandle = z10;
        this.previousSelection = selection;
        if (!(list.size() > 1)) {
            C14589e.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(O<Selection> o10, Selection selection, C17729o c17729o, int i10, int i11) {
        Selection selectionM;
        boolean z10;
        if (selection.getHandlesCrossed()) {
            selectionM = c17729o.m(i11, i10);
        } else {
            selectionM = c17729o.m(i10, i11);
        }
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C14589e.c("minOffset should be less than or equal to maxOffset: " + selectionM);
        }
        o10.n(c17729o.getSelectableId(), selectionM);
    }

    private final boolean q(C17724j other) {
        if (getSize() != other.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.infoList.get(i10).n(other.infoList.get(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int s(int r4, boolean r5) {
        /*
            r3 = this;
            w0.e r0 = r3.f()
            int[] r1 = kotlin.C17724j.a.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L17
            r2 = 2
            if (r0 == r2) goto L21
            r2 = 3
            if (r0 != r2) goto L1b
            if (r5 != 0) goto L19
        L17:
            r5 = r1
            goto L21
        L19:
            r5 = 0
            goto L21
        L1b:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L21:
            int r4 = r3.r(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17724j.s(int, boolean):int");
    }

    @Override // kotlin.InterfaceC17694C
    /* renamed from: b */
    public C17729o getInfo() {
        if (getIsStartHandle()) {
            return j();
        }
        return i();
    }

    @Override // kotlin.InterfaceC17694C
    public C17729o c() {
        if (f() == EnumC17719e.f165511a) {
            return i();
        }
        return j();
    }

    @Override // kotlin.InterfaceC17694C
    public AbstractC5526y<Selection> d(Selection selection) {
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        boolean z10;
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            if ((selection.getHandlesCrossed() && selection.getStart().getOffset() >= selection.getEnd().getOffset()) || (!selection.getHandlesCrossed() && selection.getStart().getOffset() <= selection.getEnd().getOffset())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C14589e.c("unexpectedly miss-crossed selection: " + selection);
            }
            return C5527z.b(selection.getStart().getSelectableId(), selection);
        }
        O<Selection> oC = C5527z.c();
        if (selection.getHandlesCrossed()) {
            start = selection.getEnd();
        } else {
            start = selection.getStart();
        }
        n(oC, selection, c(), start.getOffset(), c().l());
        g(new b(oC, selection));
        if (selection.getHandlesCrossed()) {
            end = selection.getStart();
        } else {
            end = selection.getEnd();
        }
        n(oC, selection, p(), 0, end.getOffset());
        return oC;
    }

    @Override // kotlin.InterfaceC17694C
    public EnumC17719e f() {
        if (getStartSlot() < getEndSlot()) {
            return EnumC17719e.f165512b;
        }
        if (getStartSlot() > getEndSlot()) {
            return EnumC17719e.f165511a;
        }
        return this.infoList.get(getStartSlot() / 2).d();
    }

    @Override // kotlin.InterfaceC17694C
    public void g(Function1<? super C17729o, Unit> block) {
        int iO = o(c().getSelectableId());
        int iO2 = o(p().getSelectableId());
        int i10 = iO + 1;
        if (i10 < iO2) {
            while (i10 < iO2) {
                block.invoke(this.infoList.get(i10));
                i10++;
            }
        }
    }

    @Override // kotlin.InterfaceC17694C
    public boolean l(InterfaceC17694C other) {
        if (getPreviousSelection() != null && other != null && (other instanceof C17724j) && getIsStartHandle() == other.getIsStartHandle() && getStartSlot() == other.getStartSlot() && getEndSlot() == other.getEndSlot() && !q((C17724j) other)) {
            return false;
        }
        return true;
    }

    public C17729o p() {
        if (f() == EnumC17719e.f165511a) {
            return j();
        }
        return i();
    }
}
