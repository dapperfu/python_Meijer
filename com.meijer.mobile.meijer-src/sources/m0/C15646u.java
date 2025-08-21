package m0;

import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.l0;
import g0.C14287e;
import java.util.List;
import java.util.Map;
import kotlin.EnumC13937z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b/\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÔ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u00123\u0010\u001a\u001a/\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u0013\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u00109R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b,\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bK\u00103\u001a\u0004\bL\u00105RD\u0010\u001a\u001a/\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u00138\u0006¢\u0006\f\n\u0004\b8\u0010M\u001a\u0004\bN\u0010OR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010P\u001a\u0004\bD\u0010QR\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\b>\u00105R\u001a\u0010\u001e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\b6\u00105R\u001a\u0010\u001f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b@\u00105R\u001a\u0010 \u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\bR\u00109R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010#\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u00103\u001a\u0004\b2\u00105R\u001a\u0010$\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00103\u001a\u0004\bB\u00105R \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00050W8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010YR\u0014\u0010\\\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u00105R'\u0010`\u001a\u0015\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020'\u0018\u00010\u0013¢\u0006\u0002\b^8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010OR\u0014\u0010b\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u00105R\u0011\u0010c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bK\u00109R\u001a\u0010f\u001a\u00020d8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u0010eR\u0014\u0010g\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Lm0/u;", "Lm0/r;", "Landroidx/compose/ui/layout/J;", "Lm0/x;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lmv/O;", "coroutineScope", "LH1/d;", "density", "slotsPerLine", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "", "Lkotlin/Pair;", "LH1/b;", "prefetchInfoRetriever", "Lm0/v;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Lf0/z;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Lm0/x;IZFLandroidx/compose/ui/layout/J;FZLmv/O;LH1/d;ILkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLf0/z;II)V", "", "s", "()V", "delta", "updateAnimations", "i", "(IZ)Lm0/u;", "a", "Lm0/x;", "o", "()Lm0/x;", "b", "I", "p", "()I", "c", "Z", "k", "()Z", "d", "F", "l", "()F", "e", "Landroidx/compose/ui/layout/J;", "f", "v", "g", "getRemeasureNeeded", "h", "Lmv/O;", "m", "()Lmv/O;", "LH1/d;", "n", "()LH1/d;", "j", "getSlotsPerLine", "Lkotlin/jvm/functions/Function1;", "q", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "()Ljava/util/List;", "u", "Lf0/z;", "getOrientation", "()Lf0/z;", "r", "", "Landroidx/compose/ui/layout/a;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "t", "rulers", "getWidth", "width", "canScrollBackward", "LH1/r;", "()J", "viewportSize", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15646u implements InterfaceC15643r, androidx.compose.ui.layout.J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15649x firstVisibleLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int firstVisibleLineScrollOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollForward;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float consumedScroll;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.layout.J measureResult;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float scrollBackAmount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int slotsPerLine;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Function1<Integer, List<Pair<Integer, H1.b>>> prefetchInfoRetriever;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<C15647v> visibleItemsInfo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final EnumC13937z orientation;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    @Override // m0.InterfaceC15643r
    /* renamed from: b, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // m0.InterfaceC15643r
    /* renamed from: c, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // m0.InterfaceC15643r
    /* renamed from: e, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // m0.InterfaceC15643r
    /* renamed from: f, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // m0.InterfaceC15643r
    /* renamed from: g, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.ui.layout.J
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // m0.InterfaceC15643r
    public EnumC13937z getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.ui.layout.J
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // m0.InterfaceC15643r
    public List<C15647v> h() {
        return this.visibleItemsInfo;
    }

    public final C15646u i(int delta, boolean updateAnimations) {
        C15649x c15649x;
        if (!this.remeasureNeeded && !h().isEmpty() && (c15649x = this.firstVisibleLine) != null) {
            int mainAxisSizeWithSpacings = c15649x.getMainAxisSizeWithSpacings();
            int i10 = this.firstVisibleLineScrollOffset - delta;
            if (i10 >= 0 && i10 < mainAxisSizeWithSpacings) {
                C15647v c15647v = (C15647v) CollectionsKt.s0(h());
                C15647v c15647v2 = (C15647v) CollectionsKt.D0(h());
                if (!c15647v.getNonScrollableItem() && !c15647v2.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - C14287e.b(c15647v, getOrientation()), getViewportEndOffset() - C14287e.b(c15647v2, getOrientation())) > delta : Math.min((C14287e.b(c15647v, getOrientation()) + c15647v.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (C14287e.b(c15647v2, getOrientation()) + c15647v2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    List<C15647v> listH = h();
                    int size = listH.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        listH.get(i11).o(delta, updateAnimations);
                    }
                    return new C15646u(this.firstVisibleLine, this.firstVisibleLineScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.slotsPerLine, this.prefetchInfoRetriever, h(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing());
                }
            }
        }
        return null;
    }

    public final boolean j() {
        C15649x c15649x = this.firstVisibleLine;
        return ((c15649x != null ? c15649x.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: l, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* renamed from: m, reason: from getter */
    public final InterfaceC15783O getCoroutineScope() {
        return this.coroutineScope;
    }

    /* renamed from: n, reason: from getter */
    public final H1.d getDensity() {
        return this.density;
    }

    /* renamed from: o, reason: from getter */
    public final C15649x getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    /* renamed from: p, reason: from getter */
    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    public final Function1<Integer, List<Pair<Integer, H1.b>>> q() {
        return this.prefetchInfoRetriever;
    }

    @Override // androidx.compose.ui.layout.J
    public Map<AbstractC5916a, Integer> r() {
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
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: v, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15646u(C15649x c15649x, int i10, boolean z10, float f10, androidx.compose.ui.layout.J j10, float f11, boolean z11, InterfaceC15783O interfaceC15783O, H1.d dVar, int i11, Function1<? super Integer, ? extends List<Pair<Integer, H1.b>>> function1, List<C15647v> list, int i12, int i13, int i14, boolean z12, EnumC13937z enumC13937z, int i15, int i16) {
        this.firstVisibleLine = c15649x;
        this.firstVisibleLineScrollOffset = i10;
        this.canScrollForward = z10;
        this.consumedScroll = f10;
        this.measureResult = j10;
        this.scrollBackAmount = f11;
        this.remeasureNeeded = z11;
        this.coroutineScope = interfaceC15783O;
        this.density = dVar;
        this.slotsPerLine = i11;
        this.prefetchInfoRetriever = function1;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i12;
        this.viewportEndOffset = i13;
        this.totalItemsCount = i14;
        this.reverseLayout = z12;
        this.orientation = enumC13937z;
        this.afterContentPadding = i15;
        this.mainAxisItemSpacing = i16;
    }

    @Override // m0.InterfaceC15643r
    public long a() {
        return H1.r.c((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // m0.InterfaceC15643r
    public int d() {
        return -getViewportStartOffset();
    }
}
