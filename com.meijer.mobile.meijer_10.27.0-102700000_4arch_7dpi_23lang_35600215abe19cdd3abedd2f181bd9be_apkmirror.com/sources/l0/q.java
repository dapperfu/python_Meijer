package l0;

import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.l0;
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

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b.\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010H\u001a\u0004\b=\u0010IR\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\b7\u0010.R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b/\u0010.R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b9\u0010.R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bJ\u00102R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b+\u0010.R\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010,\u001a\u0004\b;\u0010.R \u0010R\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00050O8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010QR\u0014\u0010T\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010.R'\u0010Z\u001a\u0015\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020 \u0018\u00010U¢\u0006\u0002\bW8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010.R\u0011\u0010]\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bD\u00102R\u001a\u0010_\u001a\u00020^8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010GR\u0014\u0010`\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Ll0/q;", "Ll0/n;", "Landroidx/compose/ui/layout/J;", "Ll0/r;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lqv/O;", "coroutineScope", "LH1/d;", "density", "LH1/b;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Lf0/z;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Ll0/r;IZFLandroidx/compose/ui/layout/J;FZLqv/O;LH1/d;JLjava/util/List;IIIZLf0/z;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "s", "()V", "delta", "updateAnimations", "i", "(IZ)Ll0/q;", "a", "Ll0/r;", "p", "()Ll0/r;", "b", "I", "q", "()I", "c", "Z", "k", "()Z", "d", "F", "m", "()F", "e", "Landroidx/compose/ui/layout/J;", "f", "v", "g", "getRemeasureNeeded", "h", "Lqv/O;", "n", "()Lqv/O;", "LH1/d;", "o", "()LH1/d;", "j", "J", "l", "()J", "Ljava/util/List;", "()Ljava/util/List;", "u", "Lf0/z;", "getOrientation", "()Lf0/z;", "r", "", "Landroidx/compose/ui/layout/a;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "canScrollBackward", "LH1/r;", "viewportSize", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class q implements n, J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r firstVisibleItem;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int firstVisibleItemScrollOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollForward;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float consumedScroll;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final J measureResult;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float scrollBackAmount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long childConstraints;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<r> visibleItemsInfo;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final EnumC13827z orientation;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    public /* synthetic */ q(r rVar, int i10, boolean z10, float f10, J j10, float f11, boolean z11, InterfaceC16622O interfaceC16622O, H1.d dVar, long j11, List list, int i11, int i12, int i13, boolean z12, EnumC13827z enumC13827z, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, i10, z10, f10, j10, f11, z11, interfaceC16622O, dVar, j11, list, i11, i12, i13, z12, enumC13827z, i14, i15);
    }

    private q(r rVar, int i10, boolean z10, float f10, J j10, float f11, boolean z11, InterfaceC16622O interfaceC16622O, H1.d dVar, long j11, List<r> list, int i11, int i12, int i13, boolean z12, EnumC13827z enumC13827z, int i14, int i15) {
        this.firstVisibleItem = rVar;
        this.firstVisibleItemScrollOffset = i10;
        this.canScrollForward = z10;
        this.consumedScroll = f10;
        this.measureResult = j10;
        this.scrollBackAmount = f11;
        this.remeasureNeeded = z11;
        this.coroutineScope = interfaceC16622O;
        this.density = dVar;
        this.childConstraints = j11;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i11;
        this.viewportEndOffset = i12;
        this.totalItemsCount = i13;
        this.reverseLayout = z12;
        this.orientation = enumC13827z;
        this.afterContentPadding = i14;
        this.mainAxisItemSpacing = i15;
    }

    @Override // l0.n
    /* renamed from: b, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // l0.n
    /* renamed from: c, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // l0.n
    /* renamed from: e, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // l0.n
    /* renamed from: f, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // l0.n
    /* renamed from: g, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.ui.layout.J
    /* renamed from: getHeight */
    public int getF51060b() {
        return this.measureResult.getF51060b();
    }

    @Override // l0.n
    public EnumC13827z getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.ui.layout.J
    /* renamed from: getWidth */
    public int getF51059a() {
        return this.measureResult.getF51059a();
    }

    @Override // l0.n
    public List<r> h() {
        return this.visibleItemsInfo;
    }

    public final q i(int delta, boolean updateAnimations) {
        r rVar;
        if (!this.remeasureNeeded && !h().isEmpty() && (rVar = this.firstVisibleItem) != null) {
            int mainAxisSizeWithSpacings = rVar.getMainAxisSizeWithSpacings();
            int i10 = this.firstVisibleItemScrollOffset - delta;
            if (i10 >= 0 && i10 < mainAxisSizeWithSpacings) {
                r rVar2 = (r) CollectionsKt.s0(h());
                r rVar3 = (r) CollectionsKt.D0(h());
                if (!rVar2.getNonScrollableItem() && !rVar3.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - rVar2.getOffset(), getViewportEndOffset() - rVar3.getOffset()) > delta : Math.min((rVar2.getOffset() + rVar2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (rVar3.getOffset() + rVar3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    List<r> listH = h();
                    int size = listH.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        listH.get(i11).c(delta, updateAnimations);
                    }
                    return new q(this.firstVisibleItem, this.firstVisibleItemScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.childConstraints, h(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing(), null);
                }
            }
        }
        return null;
    }

    public final boolean j() {
        r rVar = this.firstVisibleItem;
        return ((rVar != null ? rVar.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: l, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    /* renamed from: m, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* renamed from: n, reason: from getter */
    public final InterfaceC16622O getCoroutineScope() {
        return this.coroutineScope;
    }

    /* renamed from: o, reason: from getter */
    public final H1.d getDensity() {
        return this.density;
    }

    /* renamed from: p, reason: from getter */
    public final r getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    /* renamed from: q, reason: from getter */
    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
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
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: v, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    @Override // l0.n
    public long a() {
        return H1.r.c((getF51060b() & 4294967295L) | (getF51059a() << 32));
    }

    @Override // l0.n
    public int d() {
        return -getViewportStartOffset();
    }
}
