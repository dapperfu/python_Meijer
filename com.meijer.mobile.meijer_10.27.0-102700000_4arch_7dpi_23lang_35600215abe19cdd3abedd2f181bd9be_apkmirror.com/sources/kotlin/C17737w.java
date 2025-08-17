package kotlin;

import androidx.compose.foundation.text.I;
import androidx.compose.ui.text.y;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Selection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a#\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\t*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0011\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a#\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\"\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lw0/C;", "Lw0/o;", "info", "Lw0/p$a;", "previousSelectionAnchor", "l", "(Lw0/C;Lw0/o;Lw0/p$a;)Lw0/p$a;", "", "currentRawOffset", "", "isStart", "j", "(Lw0/o;IZ)Z", "currentLine", "currentOffset", "otherOffset", "crossed", "k", "(Lw0/o;IIIZZ)Lw0/p$a;", "layout", "Lw0/c;", "boundaryFunction", "Lw0/p;", "e", "(Lw0/C;Lw0/c;)Lw0/p;", "slot", "f", "(Lw0/o;ZZILw0/c;)Lw0/p$a;", "h", "(Lw0/p;Lw0/C;)Lw0/p;", "i", "newOffset", "g", "(Lw0/p$a;Lw0/o;I)Lw0/p$a;", "currentRawLine", "anchorSnappedToWordBoundary", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17737w {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw0/p$a;", "c", "()Lw0/p$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.w$a */
    static final class a extends Lambda implements Function0<Selection.AnchorInfo> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17729o f165565f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f165566g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f165567h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC17694C f165568i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Lazy<Integer> f165569j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C17729o c17729o, int i10, int i11, InterfaceC17694C interfaceC17694C, Lazy<Integer> lazy) {
            super(0);
            this.f165565f = c17729o;
            this.f165566g = i10;
            this.f165567h = i11;
            this.f165568i = interfaceC17694C;
            this.f165569j = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Selection.AnchorInfo invoke() {
            return C17737w.k(this.f165565f, C17737w.m(this.f165569j), this.f165566g, this.f165567h, this.f165568i.getIsStartHandle(), this.f165568i.f() == EnumC17719e.f165511a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.w$b */
    static final class b extends Lambda implements Function0<Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17729o f165570f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f165571g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17729o c17729o, int i10) {
            super(0);
            this.f165570f = c17729o;
            this.f165571g = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f165570f.getTextLayoutResult().q(this.f165571g));
        }
    }

    private static final Selection.AnchorInfo f(C17729o c17729o, boolean z10, boolean z11, int i10, InterfaceC17717c interfaceC17717c) {
        int rawStartHandleOffset = z11 ? c17729o.getRawStartHandleOffset() : c17729o.getRawEndHandleOffset();
        if (i10 != c17729o.getSlot()) {
            return c17729o.a(rawStartHandleOffset);
        }
        long jA = interfaceC17717c.a(c17729o, rawStartHandleOffset);
        return c17729o.a(z10 ^ z11 ? y.n(jA) : y.i(jA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection e(InterfaceC17694C interfaceC17694C, InterfaceC17717c interfaceC17717c) {
        boolean z10;
        if (interfaceC17694C.f() == EnumC17719e.f165511a) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new Selection(f(interfaceC17694C.j(), z10, true, interfaceC17694C.getStartSlot(), interfaceC17717c), f(interfaceC17694C.i(), z10, false, interfaceC17694C.getEndSlot(), interfaceC17717c), z10);
    }

    private static final Selection.AnchorInfo g(Selection.AnchorInfo anchorInfo, C17729o c17729o, int i10) {
        return Selection.AnchorInfo.b(anchorInfo, c17729o.getTextLayoutResult().c(i10), i10, 0L, 4, null);
    }

    public static final Selection h(Selection selection, InterfaceC17694C interfaceC17694C) {
        if (C17696E.d(selection, interfaceC17694C)) {
            String strC = interfaceC17694C.getInfo().c();
            if (interfaceC17694C.getSize() > 1 || interfaceC17694C.getPreviousSelection() == null || strC.length() == 0) {
                return selection;
            }
            return i(selection, interfaceC17694C);
        }
        return selection;
    }

    private static final Selection i(Selection selection, InterfaceC17694C interfaceC17694C) {
        boolean z10;
        int iA;
        C17729o c17729oB = interfaceC17694C.getInfo();
        String strC = c17729oB.c();
        int rawStartHandleOffset = c17729oB.getRawStartHandleOffset();
        int length = strC.length();
        if (rawStartHandleOffset == 0) {
            int iA2 = I.a(strC, 0);
            if (interfaceC17694C.getIsStartHandle()) {
                return Selection.b(selection, g(selection.getStart(), c17729oB, iA2), null, true, 2, null);
            }
            return Selection.b(selection, null, g(selection.getEnd(), c17729oB, iA2), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iB = I.b(strC, length);
            if (interfaceC17694C.getIsStartHandle()) {
                return Selection.b(selection, g(selection.getStart(), c17729oB, iB), null, false, 2, null);
            }
            return Selection.b(selection, null, g(selection.getEnd(), c17729oB, iB), true, 1, null);
        }
        Selection selectionH = interfaceC17694C.getPreviousSelection();
        if (selectionH != null && selectionH.getHandlesCrossed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (interfaceC17694C.getIsStartHandle() ^ z10) {
            iA = I.b(strC, rawStartHandleOffset);
        } else {
            iA = I.a(strC, rawStartHandleOffset);
        }
        if (interfaceC17694C.getIsStartHandle()) {
            return Selection.b(selection, g(selection.getStart(), c17729oB, iA), null, z10, 2, null);
        }
        return Selection.b(selection, null, g(selection.getEnd(), c17729oB, iA), z10, 1, null);
    }

    private static final boolean j(C17729o c17729o, int i10, boolean z10) {
        boolean z11;
        if (c17729o.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i10 == c17729o.getRawPreviousHandleOffset()) {
            return false;
        }
        if (c17729o.d() == EnumC17719e.f165511a) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 ^ z11) {
            if (i10 < c17729o.getRawPreviousHandleOffset()) {
                return true;
            }
            return false;
        }
        if (i10 > c17729o.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo k(C17729o c17729o, int i10, int i11, int i12, boolean z10, boolean z11) {
        int iU;
        int iP;
        long jC = c17729o.getTextLayoutResult().C(i11);
        if (c17729o.getTextLayoutResult().q(y.n(jC)) == i10) {
            iU = y.n(jC);
        } else if (i10 >= c17729o.getTextLayoutResult().n()) {
            iU = c17729o.getTextLayoutResult().u(c17729o.getTextLayoutResult().n() - 1);
        } else {
            iU = c17729o.getTextLayoutResult().u(i10);
        }
        if (c17729o.getTextLayoutResult().q(y.i(jC)) == i10) {
            iP = y.i(jC);
        } else if (i10 >= c17729o.getTextLayoutResult().n()) {
            iP = TextLayoutResult.p(c17729o.getTextLayoutResult(), c17729o.getTextLayoutResult().n() - 1, false, 2, null);
        } else {
            iP = TextLayoutResult.p(c17729o.getTextLayoutResult(), i10, false, 2, null);
        }
        if (iU == i12) {
            return c17729o.a(iP);
        }
        if (iP == i12) {
            return c17729o.a(iU);
        }
        if (!(z10 ^ z11) ? i11 >= iU : i11 > iP) {
            iU = iP;
        }
        return c17729o.a(iU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo l(InterfaceC17694C interfaceC17694C, C17729o c17729o, Selection.AnchorInfo anchorInfo) {
        int rawEndHandleOffset;
        int iE;
        int rawStartHandleOffset;
        if (interfaceC17694C.getIsStartHandle()) {
            rawEndHandleOffset = c17729o.getRawStartHandleOffset();
        } else {
            rawEndHandleOffset = c17729o.getRawEndHandleOffset();
        }
        int i10 = rawEndHandleOffset;
        if (interfaceC17694C.getIsStartHandle()) {
            iE = interfaceC17694C.getStartSlot();
        } else {
            iE = interfaceC17694C.getEndSlot();
        }
        if (iE != c17729o.getSlot()) {
            return c17729o.a(i10);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f142381c;
        Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new b(c17729o, i10));
        if (interfaceC17694C.getIsStartHandle()) {
            rawStartHandleOffset = c17729o.getRawEndHandleOffset();
        } else {
            rawStartHandleOffset = c17729o.getRawStartHandleOffset();
        }
        Lazy lazyA2 = LazyKt.a(lazyThreadSafetyMode, new a(c17729o, i10, rawStartHandleOffset, interfaceC17694C, lazyA));
        if (c17729o.getSelectableId() != anchorInfo.getSelectableId()) {
            return n(lazyA2);
        }
        int rawPreviousHandleOffset = c17729o.getRawPreviousHandleOffset();
        if (i10 == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (m(lazyA) != c17729o.getTextLayoutResult().q(rawPreviousHandleOffset)) {
            return n(lazyA2);
        }
        int offset = anchorInfo.getOffset();
        long jC = c17729o.getTextLayoutResult().C(offset);
        if (!j(c17729o, i10, interfaceC17694C.getIsStartHandle())) {
            return c17729o.a(i10);
        }
        if (offset != y.n(jC) && offset != y.i(jC)) {
            return c17729o.a(i10);
        }
        return n(lazyA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    private static final Selection.AnchorInfo n(Lazy<Selection.AnchorInfo> lazy) {
        return lazy.getValue();
    }
}
