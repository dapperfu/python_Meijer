package kotlin;

import Z.C5524w;
import Z.M;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b3\u00104R'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020%0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010<R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u0016\u0010A\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Lw0/D;", "", "LU0/f;", "currentPosition", "previousHandlePosition", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "", "isStartHandle", "Lw0/p;", "previousSelection", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "<init>", "(JJLandroidx/compose/ui/layout/LayoutCoordinates;ZLw0/p;Ljava/util/Comparator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "slot", "Lw0/f;", "xPositionDirection", "yPositionDirection", "i", "(ILw0/f;Lw0/f;)I", "Lw0/C;", "b", "()Lw0/C;", "selectableId", "rawStartHandleOffset", "startXHandleDirection", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "Lu1/v;", "textLayoutResult", "Lw0/o;", "a", "(JILw0/f;Lw0/f;ILw0/f;Lw0/f;ILu1/v;)Lw0/o;", "J", "d", "()J", "e", "c", "Landroidx/compose/ui/layout/LayoutCoordinates;", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Z", "h", "()Z", "Lw0/p;", "f", "()Lw0/p;", "Ljava/util/Comparator;", "g", "()Ljava/util/Comparator;", "LZ/M;", "LZ/M;", "selectableIdToInfoListIndex", "", "Ljava/util/List;", "infoList", "I", "startSlot", "j", "endSlot", "k", "currentSlot", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17695D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long currentPosition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long previousHandlePosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LayoutCoordinates containerCoordinates;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isStartHandle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Selection previousSelection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Comparator<Long> selectableIdOrderingComparator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final M selectableIdToInfoListIndex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<C17729o> infoList;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int startSlot;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int endSlot;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    public /* synthetic */ C17695D(long j10, long j11, LayoutCoordinates layoutCoordinates, boolean z10, Selection selection, Comparator comparator, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, layoutCoordinates, z10, selection, comparator);
    }

    private final int i(int slot, EnumC17720f xPositionDirection, EnumC17720f yPositionDirection) {
        if (slot == -1) {
            int i10 = a.$EnumSwitchMapping$0[C17696E.f(xPositionDirection, yPositionDirection).ordinal()];
            if (i10 == 1) {
                return this.currentSlot - 1;
            }
            if (i10 == 2) {
                return this.currentSlot;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return slot;
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.D$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17720f.values().length];
            try {
                iArr[EnumC17720f.f165516a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17720f.f165517b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17720f.f165518c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private C17695D(long j10, long j11, LayoutCoordinates layoutCoordinates, boolean z10, Selection selection, Comparator<Long> comparator) {
        this.currentPosition = j10;
        this.previousHandlePosition = j11;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z10;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        this.selectableIdToInfoListIndex = C5524w.a();
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }

    public final C17729o a(long selectableId, int rawStartHandleOffset, EnumC17720f startXHandleDirection, EnumC17720f startYHandleDirection, int rawEndHandleOffset, EnumC17720f endXHandleDirection, EnumC17720f endYHandleDirection, int rawPreviousHandleOffset, TextLayoutResult textLayoutResult) {
        this.currentSlot += 2;
        C17729o c17729o = new C17729o(selectableId, this.currentSlot, rawStartHandleOffset, rawEndHandleOffset, rawPreviousHandleOffset, textLayoutResult);
        this.startSlot = i(this.startSlot, startXHandleDirection, startYHandleDirection);
        this.endSlot = i(this.endSlot, endXHandleDirection, endYHandleDirection);
        this.selectableIdToInfoListIndex.n(selectableId, this.infoList.size());
        this.infoList.add(c17729o);
        return c17729o;
    }

    public final InterfaceC17694C b() {
        int i10 = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            C17729o c17729o = (C17729o) CollectionsKt.U0(this.infoList);
            int i11 = this.startSlot;
            int i12 = i11 == -1 ? i10 : i11;
            int i13 = this.endSlot;
            return new SingleSelectionLayout(this.isStartHandle, i12, i13 == -1 ? i10 : i13, this.previousSelection, c17729o);
        }
        M m10 = this.selectableIdToInfoListIndex;
        List<C17729o> list = this.infoList;
        int i14 = this.startSlot;
        int i15 = i14 == -1 ? i10 : i14;
        int i16 = this.endSlot;
        return new C17724j(m10, list, i15, i16 == -1 ? i10 : i16, this.isStartHandle, this.previousSelection);
    }

    /* renamed from: c, reason: from getter */
    public final LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }

    /* renamed from: d, reason: from getter */
    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    /* renamed from: e, reason: from getter */
    public final long getPreviousHandlePosition() {
        return this.previousHandlePosition;
    }

    /* renamed from: f, reason: from getter */
    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final Comparator<Long> g() {
        return this.selectableIdOrderingComparator;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsStartHandle() {
        return this.isStartHandle;
    }
}
