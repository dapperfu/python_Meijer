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
public final class C17807w {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw0/p$a;", "c", "()Lw0/p$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.w$a */
    static final class a extends Lambda implements Function0<Selection.AnchorInfo> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17799o f166776f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f166777g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f166778h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC17764C f166779i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Lazy<Integer> f166780j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C17799o c17799o, int i10, int i11, InterfaceC17764C interfaceC17764C, Lazy<Integer> lazy) {
            super(0);
            this.f166776f = c17799o;
            this.f166777g = i10;
            this.f166778h = i11;
            this.f166779i = interfaceC17764C;
            this.f166780j = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Selection.AnchorInfo invoke() {
            return C17807w.k(this.f166776f, C17807w.m(this.f166780j), this.f166777g, this.f166778h, this.f166779i.getIsStartHandle(), this.f166779i.f() == EnumC17789e.f166722a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.w$b */
    static final class b extends Lambda implements Function0<Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17799o f166781f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f166782g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17799o c17799o, int i10) {
            super(0);
            this.f166781f = c17799o;
            this.f166782g = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f166781f.getTextLayoutResult().q(this.f166782g));
        }
    }

    private static final Selection.AnchorInfo f(C17799o c17799o, boolean z10, boolean z11, int i10, InterfaceC17787c interfaceC17787c) {
        int rawStartHandleOffset = z11 ? c17799o.getRawStartHandleOffset() : c17799o.getRawEndHandleOffset();
        if (i10 != c17799o.getSlot()) {
            return c17799o.a(rawStartHandleOffset);
        }
        long jA = interfaceC17787c.a(c17799o, rawStartHandleOffset);
        return c17799o.a(z10 ^ z11 ? y.n(jA) : y.i(jA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection e(InterfaceC17764C interfaceC17764C, InterfaceC17787c interfaceC17787c) {
        boolean z10;
        if (interfaceC17764C.f() == EnumC17789e.f166722a) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new Selection(f(interfaceC17764C.j(), z10, true, interfaceC17764C.getStartSlot(), interfaceC17787c), f(interfaceC17764C.i(), z10, false, interfaceC17764C.getEndSlot(), interfaceC17787c), z10);
    }

    private static final Selection.AnchorInfo g(Selection.AnchorInfo anchorInfo, C17799o c17799o, int i10) {
        return Selection.AnchorInfo.b(anchorInfo, c17799o.getTextLayoutResult().c(i10), i10, 0L, 4, null);
    }

    public static final Selection h(Selection selection, InterfaceC17764C interfaceC17764C) {
        if (C17766E.d(selection, interfaceC17764C)) {
            String strC = interfaceC17764C.getInfo().c();
            if (interfaceC17764C.getSize() > 1 || interfaceC17764C.getPreviousSelection() == null || strC.length() == 0) {
                return selection;
            }
            return i(selection, interfaceC17764C);
        }
        return selection;
    }

    private static final Selection i(Selection selection, InterfaceC17764C interfaceC17764C) {
        boolean z10;
        int iA;
        C17799o c17799oB = interfaceC17764C.getInfo();
        String strC = c17799oB.c();
        int rawStartHandleOffset = c17799oB.getRawStartHandleOffset();
        int length = strC.length();
        if (rawStartHandleOffset == 0) {
            int iA2 = I.a(strC, 0);
            if (interfaceC17764C.getIsStartHandle()) {
                return Selection.b(selection, g(selection.getStart(), c17799oB, iA2), null, true, 2, null);
            }
            return Selection.b(selection, null, g(selection.getEnd(), c17799oB, iA2), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iB = I.b(strC, length);
            if (interfaceC17764C.getIsStartHandle()) {
                return Selection.b(selection, g(selection.getStart(), c17799oB, iB), null, false, 2, null);
            }
            return Selection.b(selection, null, g(selection.getEnd(), c17799oB, iB), true, 1, null);
        }
        Selection selectionH = interfaceC17764C.getPreviousSelection();
        if (selectionH != null && selectionH.getHandlesCrossed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (interfaceC17764C.getIsStartHandle() ^ z10) {
            iA = I.b(strC, rawStartHandleOffset);
        } else {
            iA = I.a(strC, rawStartHandleOffset);
        }
        if (interfaceC17764C.getIsStartHandle()) {
            return Selection.b(selection, g(selection.getStart(), c17799oB, iA), null, z10, 2, null);
        }
        return Selection.b(selection, null, g(selection.getEnd(), c17799oB, iA), z10, 1, null);
    }

    private static final boolean j(C17799o c17799o, int i10, boolean z10) {
        boolean z11;
        if (c17799o.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i10 == c17799o.getRawPreviousHandleOffset()) {
            return false;
        }
        if (c17799o.d() == EnumC17789e.f166722a) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 ^ z11) {
            if (i10 < c17799o.getRawPreviousHandleOffset()) {
                return true;
            }
            return false;
        }
        if (i10 > c17799o.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo k(C17799o c17799o, int i10, int i11, int i12, boolean z10, boolean z11) {
        int iU;
        int iP;
        long jC = c17799o.getTextLayoutResult().C(i11);
        if (c17799o.getTextLayoutResult().q(y.n(jC)) == i10) {
            iU = y.n(jC);
        } else if (i10 >= c17799o.getTextLayoutResult().n()) {
            iU = c17799o.getTextLayoutResult().u(c17799o.getTextLayoutResult().n() - 1);
        } else {
            iU = c17799o.getTextLayoutResult().u(i10);
        }
        if (c17799o.getTextLayoutResult().q(y.i(jC)) == i10) {
            iP = y.i(jC);
        } else if (i10 >= c17799o.getTextLayoutResult().n()) {
            iP = TextLayoutResult.p(c17799o.getTextLayoutResult(), c17799o.getTextLayoutResult().n() - 1, false, 2, null);
        } else {
            iP = TextLayoutResult.p(c17799o.getTextLayoutResult(), i10, false, 2, null);
        }
        if (iU == i12) {
            return c17799o.a(iP);
        }
        if (iP == i12) {
            return c17799o.a(iU);
        }
        if (!(z10 ^ z11) ? i11 >= iU : i11 > iP) {
            iU = iP;
        }
        return c17799o.a(iU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo l(InterfaceC17764C interfaceC17764C, C17799o c17799o, Selection.AnchorInfo anchorInfo) {
        int rawEndHandleOffset;
        int iE;
        int rawStartHandleOffset;
        if (interfaceC17764C.getIsStartHandle()) {
            rawEndHandleOffset = c17799o.getRawStartHandleOffset();
        } else {
            rawEndHandleOffset = c17799o.getRawEndHandleOffset();
        }
        int i10 = rawEndHandleOffset;
        if (interfaceC17764C.getIsStartHandle()) {
            iE = interfaceC17764C.getStartSlot();
        } else {
            iE = interfaceC17764C.getEndSlot();
        }
        if (iE != c17799o.getSlot()) {
            return c17799o.a(i10);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143288c;
        Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new b(c17799o, i10));
        if (interfaceC17764C.getIsStartHandle()) {
            rawStartHandleOffset = c17799o.getRawEndHandleOffset();
        } else {
            rawStartHandleOffset = c17799o.getRawStartHandleOffset();
        }
        Lazy lazyA2 = LazyKt.a(lazyThreadSafetyMode, new a(c17799o, i10, rawStartHandleOffset, interfaceC17764C, lazyA));
        if (c17799o.getSelectableId() != anchorInfo.getSelectableId()) {
            return n(lazyA2);
        }
        int rawPreviousHandleOffset = c17799o.getRawPreviousHandleOffset();
        if (i10 == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (m(lazyA) != c17799o.getTextLayoutResult().q(rawPreviousHandleOffset)) {
            return n(lazyA2);
        }
        int offset = anchorInfo.getOffset();
        long jC = c17799o.getTextLayoutResult().C(offset);
        if (!j(c17799o, i10, interfaceC17764C.getIsStartHandle())) {
            return c17799o.a(i10);
        }
        if (offset != y.n(jC) && offset != y.i(jC)) {
            return c17799o.a(i10);
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
