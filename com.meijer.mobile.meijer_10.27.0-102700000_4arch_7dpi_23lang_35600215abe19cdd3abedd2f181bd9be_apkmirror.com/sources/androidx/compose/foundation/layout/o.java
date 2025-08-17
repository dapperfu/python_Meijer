package androidx.compose.foundation.layout;

import Z.C5516n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016 B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/o;", "", "", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/r;", "overflow", "Lj0/B;", "constraints", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILandroidx/compose/foundation/layout/r;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/layout/o$b;", "wrapInfo", "", "hasNext", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "Landroidx/compose/foundation/layout/o$a;", "a", "(Landroidx/compose/foundation/layout/o$b;ZIIII)Landroidx/compose/foundation/layout/o$a;", "nextItemHasNext", "LZ/n;", "leftOver", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "b", "(ZIJLZ/n;IIIZZ)Landroidx/compose/foundation/layout/o$b;", "I", "Landroidx/compose/foundation/layout/r;", "c", "J", "d", "e", "f", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxItemsInMainAxis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FlowLayoutOverflowState overflow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSpacing;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/o$a;", "", "Landroidx/compose/ui/layout/I;", "ellipsis", "Landroidx/compose/ui/layout/f0;", "placeable", "LZ/n;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(Landroidx/compose/ui/layout/I;Landroidx/compose/ui/layout/f0;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Landroidx/compose/ui/layout/I;", "()Landroidx/compose/ui/layout/I;", "b", "Landroidx/compose/ui/layout/f0;", "d", "()Landroidx/compose/ui/layout/f0;", "c", "J", "()J", "Z", "()Z", "e", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.ui.layout.I ellipsis;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final f0 placeable;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long ellipsisSize;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean placeEllipsisOnLastContentLine;

        public /* synthetic */ a(androidx.compose.ui.layout.I i10, f0 f0Var, long j10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, f0Var, j10, z10);
        }

        private a(androidx.compose.ui.layout.I i10, f0 f0Var, long j10, boolean z10) {
            this.ellipsis = i10;
            this.placeable = f0Var;
            this.ellipsisSize = j10;
            this.placeEllipsisOnLastContentLine = z10;
        }

        /* renamed from: a, reason: from getter */
        public final androidx.compose.ui.layout.I getEllipsis() {
            return this.ellipsis;
        }

        /* renamed from: b, reason: from getter */
        public final long getEllipsisSize() {
            return this.ellipsisSize;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        /* renamed from: d, reason: from getter */
        public final f0 getPlaceable() {
            return this.placeable;
        }

        public final void e(boolean z10) {
            this.placeEllipsisOnLastContentLine = z10;
        }

        public /* synthetic */ a(androidx.compose.ui.layout.I i10, f0 f0Var, long j10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, f0Var, j10, (i11 & 8) != 0 ? true : z10, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/o$b;", "", "", "isLastItemInLine", "isLastItemInContainer", "<init>", "(ZZ)V", "a", "Z", "b", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isLastItemInLine;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isLastItemInContainer;

        /* renamed from: a, reason: from getter */
        public final boolean getIsLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsLastItemInLine() {
            return this.isLastItemInLine;
        }

        public b(boolean z10, boolean z11) {
            this.isLastItemInLine = z10;
            this.isLastItemInContainer = z11;
        }
    }

    public /* synthetic */ o(int i10, FlowLayoutOverflowState flowLayoutOverflowState, long j10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, flowLayoutOverflowState, j10, i11, i12, i13);
    }

    private o(int i10, FlowLayoutOverflowState flowLayoutOverflowState, long j10, int i11, int i12, int i13) {
        this.maxItemsInMainAxis = i10;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j10;
        this.maxLines = i11;
        this.mainAxisSpacing = i12;
        this.crossAxisSpacing = i13;
    }

    public final b b(boolean nextItemHasNext, int nextIndexInLine, long leftOver, C5516n nextSize, int lineIndex, int totalCrossAxisSize, int currentLineCrossAxisSize, boolean isWrappingRound, boolean isEllipsisWrap) {
        int i10 = totalCrossAxisSize + currentLineCrossAxisSize;
        if (nextSize == null) {
            return new b(true, true);
        }
        if (this.overflow.getType() != q.a.f48678a && (lineIndex >= this.maxLines || C5516n.f(leftOver) - C5516n.f(nextSize.getPackedValue()) < 0)) {
            return new b(true, true);
        }
        if (nextIndexInLine != 0 && (nextIndexInLine >= this.maxItemsInMainAxis || C5516n.e(leftOver) - C5516n.e(nextSize.getPackedValue()) < 0)) {
            return isWrappingRound ? new b(true, true) : new b(true, b(nextItemHasNext, 0, C5516n.b(H1.b.l(this.constraints), (C5516n.f(leftOver) - this.crossAxisSpacing) - currentLineCrossAxisSize), C5516n.a(C5516n.b(C5516n.e(nextSize.getPackedValue()) - this.mainAxisSpacing, C5516n.f(nextSize.getPackedValue()))), lineIndex + 1, i10, 0, true, false).getIsLastItemInContainer());
        }
        int iMax = totalCrossAxisSize + Math.max(currentLineCrossAxisSize, C5516n.f(nextSize.getPackedValue()));
        C5516n c5516nF = isEllipsisWrap ? null : this.overflow.f(nextItemHasNext, lineIndex, iMax);
        if (c5516nF != null) {
            c5516nF.getPackedValue();
            if (nextIndexInLine + 1 >= this.maxItemsInMainAxis || ((C5516n.e(leftOver) - C5516n.e(nextSize.getPackedValue())) - this.mainAxisSpacing) - C5516n.e(c5516nF.getPackedValue()) < 0) {
                if (isEllipsisWrap) {
                    return new b(true, true);
                }
                b bVarB = b(false, 0, C5516n.b(H1.b.l(this.constraints), (C5516n.f(leftOver) - this.crossAxisSpacing) - Math.max(currentLineCrossAxisSize, C5516n.f(nextSize.getPackedValue()))), c5516nF, lineIndex + 1, iMax, 0, true, true);
                return new b(bVarB.getIsLastItemInContainer(), bVarB.getIsLastItemInContainer());
            }
        }
        return new b(false, false);
    }

    public final a a(b wrapInfo, boolean hasNext, int lastContentLineIndex, int totalCrossAxisSize, int leftOverMainAxis, int nextIndexInLine) {
        a aVarE;
        boolean z10;
        if (!wrapInfo.getIsLastItemInContainer() || (aVarE = this.overflow.e(hasNext, lastContentLineIndex, totalCrossAxisSize)) == null) {
            return null;
        }
        if (lastContentLineIndex >= 0 && (nextIndexInLine == 0 || (leftOverMainAxis - C5516n.e(aVarE.getEllipsisSize()) >= 0 && nextIndexInLine < this.maxItemsInMainAxis))) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVarE.e(z10);
        return aVarE;
    }
}
