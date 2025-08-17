package l0;

import P0.e;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.f0;
import i0.C14589e;
import java.util.List;
import kotlin.InterfaceC15765y;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010>R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00109R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00109R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109R\u001a\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b?\u0010IR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010LR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\b<\u0010RR$\u0010U\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\bT\u0010;R\u001a\u0010W\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\bV\u0010;R\u001a\u0010X\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\bM\u0010;R\u001a\u0010Z\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\bY\u00109\u001a\u0004\bC\u0010;R\u001a\u0010\\\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\bH\u0010;R\u0017\u0010^\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b]\u00109\u001a\u0004\bE\u0010;R\"\u0010a\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010>\u001a\u0004\bQ\u0010@\"\u0004\bA\u0010`R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u00109R\u0016\u0010d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u00109R\u0016\u0010f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u00109R\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010l\u001a\u00020\u0003*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010kR\u0018\u0010n\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010mR\u0014\u0010o\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010;\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"Ll0/r;", "Ll0/i;", "Ln0/y;", "", "index", "", "Landroidx/compose/ui/layout/f0;", "placeables", "", "isVertical", "LP0/e$b;", "horizontalAlignment", "LP0/e$c;", "verticalAlignment", "LH1/t;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "LH1/n;", "visualOffset", "", "key", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "LH1/b;", "constraints", "<init>", "(ILjava/util/List;ZLP0/e$b;LP0/e$c;LH1/t;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "j", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", "h", "(IIII)V", "q", "(III)V", "mainAxisLayoutSize", "r", "(I)V", "l", "(I)J", "delta", "updateAnimations", "c", "(IZ)V", "Landroidx/compose/ui/layout/f0$a;", "scope", "isLookingAhead", "p", "(Landroidx/compose/ui/layout/f0$a;Z)V", "a", "I", "getIndex", "()I", "b", "Ljava/util/List;", "Z", "k", "()Z", "d", "LP0/e$b;", "e", "LP0/e$c;", "f", "LH1/t;", "g", "i", "J", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "m", "getContentType", "n", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "o", "()J", "<set-?>", "getOffset", "offset", "getSize", "size", "lane", "s", "span", "t", "mainAxisSizeWithSpacings", "u", "crossAxisSize", "v", "(Z)V", "nonScrollableItem", "w", "x", "minMainAxisOffset", "y", "maxMainAxisOffset", "", "z", "[I", "placeableOffsets", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/f0;)I", "mainAxisSize", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class r implements InterfaceC15349i, InterfaceC15765y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<f0> placeables;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e.b horizontalAlignment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e.c verticalAlignment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final H1.t layoutDirection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int spacing;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Object contentType;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemAnimator<r> animator;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int span;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final int[] placeableOffsets;

    public /* synthetic */ r(int i10, List list, boolean z10, e.b bVar, e.c cVar, H1.t tVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, z10, bVar, cVar, tVar, z11, i11, i12, i13, j10, obj, obj2, lazyLayoutItemAnimator, j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r(int i10, List<? extends f0> list, boolean z10, e.b bVar, e.c cVar, H1.t tVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator<r> lazyLayoutItemAnimator, long j11) {
        this.index = i10;
        this.placeables = list;
        this.isVertical = z10;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = cVar;
        this.layoutDirection = tVar;
        this.reverseLayout = z11;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.spacing = i13;
        this.visualOffset = j10;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j11;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            f0 f0Var = (f0) list.get(i14);
            height += getIsVertical() ? f0Var.getHeight() : f0Var.getWidth();
            iMax = Math.max(iMax, !getIsVertical() ? f0Var.getHeight() : f0Var.getWidth());
        }
        this.size = height;
        this.mainAxisSizeWithSpacings = RangesKt.f(getSize() + this.spacing, 0);
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    @Override // kotlin.InterfaceC15765y
    public int a() {
        return this.placeables.size();
    }

    @Override // kotlin.InterfaceC15765y
    /* renamed from: b, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // kotlin.InterfaceC15765y
    public void d(boolean z10) {
        this.nonScrollableItem = z10;
    }

    @Override // kotlin.InterfaceC15765y
    /* renamed from: e, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    /* renamed from: f, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // l0.InterfaceC15349i, kotlin.InterfaceC15765y
    public int getIndex() {
        return this.index;
    }

    @Override // l0.InterfaceC15349i, kotlin.InterfaceC15765y
    public Object getKey() {
        return this.key;
    }

    @Override // l0.InterfaceC15349i
    public int getOffset() {
        return this.offset;
    }

    @Override // l0.InterfaceC15349i
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.InterfaceC15765y
    /* renamed from: i, reason: from getter */
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // kotlin.InterfaceC15765y
    public Object j(int index) {
        return this.placeables.get(index).a();
    }

    @Override // kotlin.InterfaceC15765y
    /* renamed from: k, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // kotlin.InterfaceC15765y
    public long l(int index) {
        int[] iArr = this.placeableOffsets;
        int i10 = index * 2;
        return H1.n.f((iArr[i10] << 32) | (iArr[i10 + 1] & 4294967295L));
    }

    @Override // kotlin.InterfaceC15765y
    /* renamed from: m, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    /* renamed from: o, reason: from getter */
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    public final void p(f0.a scope, boolean isLookingAhead) {
        GraphicsLayer layer;
        f0.a aVar;
        long jK;
        int i10 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            C14589e.a("position() should be called first");
        }
        int iA = a();
        while (i10 < iA) {
            f0 f0Var = this.placeables.get(i10);
            int iN = this.minMainAxisOffset - n(f0Var);
            int i11 = this.maxMainAxisOffset;
            long jL = l(i10);
            androidx.compose.foundation.lazy.layout.c cVarE = this.animator.e(getKey(), i10);
            if (cVarE != null) {
                if (isLookingAhead) {
                    cVarE.F(jL);
                } else {
                    if (!H1.n.j(cVarE.getLookaheadOffset(), androidx.compose.foundation.lazy.layout.c.INSTANCE.a())) {
                        jL = cVarE.getLookaheadOffset();
                    }
                    long jO = H1.n.o(jL, cVarE.r());
                    if ((g(jL) <= iN && g(jO) <= iN) || (g(jL) >= i11 && g(jO) >= i11)) {
                        cVarE.n();
                    }
                    jL = jO;
                }
                layer = cVarE.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (getIsVertical()) {
                    jK = (((this.mainAxisLayoutSize - H1.n.l(jL)) - n(f0Var)) & 4294967295L) | (H1.n.k(jL) << 32);
                } else {
                    jK = (((this.mainAxisLayoutSize - H1.n.k(jL)) - n(f0Var)) << 32) | (4294967295L & H1.n.l(jL));
                }
                jL = H1.n.f(jK);
            }
            long jO2 = H1.n.o(jL, this.visualOffset);
            if (!isLookingAhead && cVarE != null) {
                cVarE.E(jO2);
            }
            if (!getIsVertical()) {
                aVar = scope;
                GraphicsLayer graphicsLayer = layer;
                if (graphicsLayer != null) {
                    f0.a.t(aVar, f0Var, jO2, graphicsLayer, 0.0f, 4, null);
                } else {
                    f0.a.s(aVar, f0Var, jO2, 0.0f, null, 6, null);
                }
            } else if (layer != null) {
                aVar = scope;
                f0.a.z(aVar, f0Var, jO2, layer, 0.0f, 4, null);
            } else {
                aVar = scope;
                f0.a.y(aVar, f0Var, jO2, 0.0f, null, 6, null);
            }
            i10++;
            scope = aVar;
        }
    }

    public final void q(int mainAxisOffset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = mainAxisOffset;
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        List<f0> list = this.placeables;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f0 f0Var = list.get(i10);
            int i11 = i10 * 2;
            if (getIsVertical()) {
                int[] iArr = this.placeableOffsets;
                e.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    C14589e.b("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i11] = bVar.a(f0Var.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i11 + 1] = mainAxisOffset;
                width = f0Var.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i11] = mainAxisOffset;
                int i12 = i11 + 1;
                e.c cVar = this.verticalAlignment;
                if (cVar == null) {
                    C14589e.b("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr2[i12] = cVar.a(f0Var.getHeight(), layoutHeight);
                width = f0Var.getWidth();
            }
            mainAxisOffset += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void r(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    private final int g(long j10) {
        if (getIsVertical()) {
            return H1.n.l(j10);
        }
        return H1.n.k(j10);
    }

    private final int n(f0 f0Var) {
        if (getIsVertical()) {
            return f0Var.getHeight();
        }
        return f0Var.getWidth();
    }

    public final void c(int delta, boolean updateAnimations) {
        int iIntValue;
        int iL;
        if (!getNonScrollableItem()) {
            this.offset = getOffset() + delta;
            int length = this.placeableOffsets.length;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 & 1;
                if ((getIsVertical() && i11 != 0) || (!getIsVertical() && i11 == 0)) {
                    int[] iArr = this.placeableOffsets;
                    iArr[i10] = iArr[i10] + delta;
                }
            }
            if (updateAnimations) {
                int iA = a();
                for (int i12 = 0; i12 < iA; i12++) {
                    androidx.compose.foundation.lazy.layout.c cVarE = this.animator.e(getKey(), i12);
                    if (cVarE != null) {
                        long rawOffset = cVarE.getRawOffset();
                        if (getIsVertical()) {
                            iIntValue = H1.n.k(rawOffset);
                            iL = Integer.valueOf(H1.n.l(rawOffset) + delta).intValue();
                        } else {
                            iIntValue = Integer.valueOf(H1.n.k(rawOffset) + delta).intValue();
                            iL = H1.n.l(rawOffset);
                        }
                        cVarE.J(H1.n.f((iIntValue << 32) | (4294967295L & iL)));
                    }
                }
            }
        }
    }

    @Override // kotlin.InterfaceC15765y
    public void h(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        q(mainAxisOffset, layoutWidth, layoutHeight);
    }
}
