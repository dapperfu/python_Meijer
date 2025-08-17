package kotlin;

import H1.r;
import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.l0;
import g0.InterfaceC14164k;
import java.util.List;
import java.util.Map;
import kotlin.EnumC13827z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b.\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÁ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b+\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b2\u0010.R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b/\u0010.R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u00107\u001a\u0004\b6\u00108R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b9\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010.R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\bD\u00108R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b=\u0010GR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010HR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bI\u00108R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\bJ\u0010(\u001a\u0004\bK\u0010*R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\bL\u0010*R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bE\u0010OR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u00060P8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010RR\u0014\u0010U\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010.R'\u0010Z\u001a\u0015\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020!\u0018\u00010V¢\u0006\u0002\bX8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010YR\u0014\u0010\\\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010.R\u001a\u0010_\u001a\u00020]8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010^R\u0014\u0010`\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0011\u0010a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bB\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Lo0/t;", "Lo0/n;", "Landroidx/compose/ui/layout/J;", "", "Lo0/e;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Lf0/z;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "Lg0/k;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "Lqv/O;", "coroutineScope", "<init>", "(Ljava/util/List;IIILf0/z;IIZILo0/e;Lo0/e;FIZLg0/k;Landroidx/compose/ui/layout/J;ZLjava/util/List;Ljava/util/List;Lqv/O;)V", "", "s", "()V", "delta", "l", "(I)Lo0/t;", "a", "Ljava/util/List;", "h", "()Ljava/util/List;", "b", "I", "g", "()I", "c", "i", "d", "e", "Lf0/z;", "getOrientation", "()Lf0/z;", "f", "Z", "()Z", "j", "Lo0/e;", "u", "()Lo0/e;", "k", "p", "F", "q", "()F", "m", "v", "n", "o", "Lg0/k;", "()Lg0/k;", "Landroidx/compose/ui/layout/J;", "getRemeasureNeeded", "r", "getExtraPagesBefore", "getExtraPagesAfter", "t", "Lqv/O;", "()Lqv/O;", "", "Landroidx/compose/ui/layout/a;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "LH1/r;", "()J", "viewportSize", "beforeContentPadding", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15984t implements InterfaceC15978n, J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<C15969e> visiblePagesInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int pageSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pageSpacing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final EnumC13827z orientation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int beyondViewportPageCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C15969e firstVisiblePage;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C15969e currentPage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float currentPageOffsetFraction;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int firstVisiblePageScrollOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollForward;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14164k snapPosition;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final J measureResult;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List<C15969e> extraPagesBefore;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final List<C15969e> extraPagesAfter;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    public C15984t(List<C15969e> list, int i10, int i11, int i12, EnumC13827z enumC13827z, int i13, int i14, boolean z10, int i15, C15969e c15969e, C15969e c15969e2, float f10, int i16, boolean z11, InterfaceC14164k interfaceC14164k, J j10, boolean z12, List<C15969e> list2, List<C15969e> list3, InterfaceC16622O interfaceC16622O) {
        this.visiblePagesInfo = list;
        this.pageSize = i10;
        this.pageSpacing = i11;
        this.afterContentPadding = i12;
        this.orientation = enumC13827z;
        this.viewportStartOffset = i13;
        this.viewportEndOffset = i14;
        this.reverseLayout = z10;
        this.beyondViewportPageCount = i15;
        this.firstVisiblePage = c15969e;
        this.currentPage = c15969e2;
        this.currentPageOffsetFraction = f10;
        this.firstVisiblePageScrollOffset = i16;
        this.canScrollForward = z11;
        this.snapPosition = interfaceC14164k;
        this.measureResult = j10;
        this.remeasureNeeded = z12;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = interfaceC16622O;
    }

    @Override // kotlin.InterfaceC15978n
    /* renamed from: b, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // kotlin.InterfaceC15978n
    /* renamed from: c, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // kotlin.InterfaceC15978n
    /* renamed from: e, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // kotlin.InterfaceC15978n
    /* renamed from: f, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // kotlin.InterfaceC15978n
    /* renamed from: g, reason: from getter */
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.ui.layout.J
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // kotlin.InterfaceC15978n
    public EnumC13827z getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.ui.layout.J
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // kotlin.InterfaceC15978n
    public List<C15969e> h() {
        return this.visiblePagesInfo;
    }

    @Override // kotlin.InterfaceC15978n
    /* renamed from: i, reason: from getter */
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // kotlin.InterfaceC15978n
    /* renamed from: j, reason: from getter */
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    @Override // kotlin.InterfaceC15978n
    /* renamed from: k, reason: from getter */
    public InterfaceC14164k getSnapPosition() {
        return this.snapPosition;
    }

    public final C15984t l(int delta) {
        int i10;
        int pageSize = getPageSize() + getPageSpacing();
        if (!this.remeasureNeeded && !h().isEmpty() && this.firstVisiblePage != null && (i10 = this.firstVisiblePageScrollOffset - delta) >= 0 && i10 < pageSize) {
            float f10 = pageSize != 0 ? delta / pageSize : 0.0f;
            float f11 = this.currentPageOffsetFraction - f10;
            if (this.currentPage != null && f11 < 0.5f && f11 > -0.5f) {
                C15969e c15969e = (C15969e) CollectionsKt.s0(h());
                C15969e c15969e2 = (C15969e) CollectionsKt.D0(h());
                if (delta >= 0 ? Math.min(getViewportStartOffset() - c15969e.getOffset(), getViewportEndOffset() - c15969e2.getOffset()) > delta : Math.min((c15969e.getOffset() + pageSize) - getViewportStartOffset(), (c15969e2.getOffset() + pageSize) - getViewportEndOffset()) > (-delta)) {
                    List<C15969e> listH = h();
                    int size = listH.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        listH.get(i11).a(delta);
                    }
                    List<C15969e> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        list.get(i12).a(delta);
                    }
                    List<C15969e> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        list2.get(i13).a(delta);
                    }
                    return new C15984t(h(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f10, this.firstVisiblePageScrollOffset - delta, this.canScrollForward || delta > 0, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope);
                }
            }
        }
        return null;
    }

    public final boolean m() {
        C15969e c15969e = this.firstVisiblePage;
        return ((c15969e != null ? c15969e.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: o, reason: from getter */
    public final InterfaceC16622O getCoroutineScope() {
        return this.coroutineScope;
    }

    /* renamed from: p, reason: from getter */
    public final C15969e getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: q, reason: from getter */
    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    @Override // androidx.compose.ui.layout.J
    public Map<AbstractC5774a, Integer> r() {
        return this.measureResult.r();
    }

    @Override // androidx.compose.ui.layout.J
    public void s() {
        this.measureResult.s();
    }

    @Override // androidx.compose.ui.layout.J
    public Function1<l0, Unit> t() {
        return this.measureResult.t();
    }

    /* renamed from: u, reason: from getter */
    public final C15969e getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* renamed from: v, reason: from getter */
    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    @Override // kotlin.InterfaceC15978n
    public long a() {
        return r.c((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // kotlin.InterfaceC15978n
    public int d() {
        return -getViewportStartOffset();
    }

    public /* synthetic */ C15984t(List list, int i10, int i11, int i12, EnumC13827z enumC13827z, int i13, int i14, boolean z10, int i15, C15969e c15969e, C15969e c15969e2, float f10, int i16, boolean z11, InterfaceC14164k interfaceC14164k, J j10, boolean z12, List list2, List list3, InterfaceC16622O interfaceC16622O, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i10, i11, i12, enumC13827z, i13, i14, z10, i15, c15969e, c15969e2, f10, i16, z11, interfaceC14164k, j10, z12, (i17 & 131072) != 0 ? CollectionsKt.m() : list2, (i17 & 262144) != 0 ? CollectionsKt.m() : list3, interfaceC16622O);
    }
}
