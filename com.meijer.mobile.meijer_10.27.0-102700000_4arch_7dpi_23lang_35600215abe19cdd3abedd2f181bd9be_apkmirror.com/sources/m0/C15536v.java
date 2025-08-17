package m0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.f0;
import i0.C14589e;
import java.util.List;
import kotlin.InterfaceC15765y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J/\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J=\u0010+\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020&2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u00020&2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0007¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010:R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010:R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010MR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bN\u0010@R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010OR \u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\b=\u0010QR\u001a\u0010\u001a\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010:\u001a\u0004\bP\u0010<R\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010:\u001a\u0004\bG\u0010<R\u0017\u0010U\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<R\u001a\u0010V\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010:\u001a\u0004\bK\u0010<R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010:R\u0016\u0010Y\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010:R\u0016\u0010Z\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010:R \u0010\\\u001a\u00020[8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010M\u001a\u0004\bA\u0010QR*\u0010^\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\u00138\u0016@RX\u0096\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010M\u001a\u0004\bR\u0010QR$\u0010)\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b_\u0010:\u001a\u0004\bH\u0010<R$\u0010*\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b`\u0010:\u001a\u0004\bJ\u0010<R\"\u0010c\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010B\u001a\u0004\bX\u0010D\"\u0004\bE\u0010bR\u0018\u0010e\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010dR\u0018\u0010U\u001a\u00020\u0003*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010fR\u0014\u0010g\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010<\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"Lm0/v;", "Lm0/j;", "Ln0/y;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "LH1/t;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/f0;", "placeables", "LH1/n;", "visualOffset", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "LH1/b;", "constraints", "lane", "span", "<init>", "(ILjava/lang/Object;ZIIZLH1/t;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "j", "(I)Ljava/lang/Object;", "l", "(I)J", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", "h", "(IIII)V", "row", "column", "u", "(IIIIII)V", "mainAxisLayoutSize", "v", "(I)V", "delta", "updateAnimations", "o", "(IZ)V", "Landroidx/compose/ui/layout/f0$a;", "scope", "isLookingAhead", "t", "(Landroidx/compose/ui/layout/f0$a;Z)V", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "Z", "k", "()Z", "d", "getCrossAxisSize", "e", "f", "LH1/t;", "g", "i", "Ljava/util/List;", "J", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "m", "()J", "n", "p", "q", "mainAxisSize", "mainAxisSizeWithSpacings", "r", "s", "minMainAxisOffset", "maxMainAxisOffset", "LH1/r;", "size", "<set-?>", "offset", "w", "x", "y", "(Z)V", "nonScrollableItem", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/f0;)I", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15536v implements InterfaceC15524j, InterfaceC15765y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final H1.t layoutDirection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<f0> placeables;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Object contentType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemAnimator<C15536v> animator;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int span;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long offset;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int row;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int column;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    public /* synthetic */ C15536v(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, H1.t tVar, int i13, int i14, List list, long j10, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, obj, z10, i11, i12, z11, tVar, i13, i14, list, j10, obj2, lazyLayoutItemAnimator, j11, i15, i16);
    }

    @Override // kotlin.InterfaceC15765y
    public void h(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        u(mainAxisOffset, crossAxisOffset, layoutWidth, layoutHeight, -1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C15536v(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, H1.t tVar, int i13, int i14, List<? extends f0> list, long j10, Object obj2, LazyLayoutItemAnimator<C15536v> lazyLayoutItemAnimator, long j11, int i15, int i16) {
        this.index = i10;
        this.key = obj;
        this.isVertical = z10;
        this.crossAxisSize = i11;
        this.reverseLayout = z11;
        this.layoutDirection = tVar;
        this.beforeContentPadding = i13;
        this.afterContentPadding = i14;
        this.placeables = list;
        this.visualOffset = j10;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j11;
        this.lane = i15;
        this.span = i16;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            f0 f0Var = (f0) list.get(i17);
            iMax = Math.max(iMax, getIsVertical() ? f0Var.getHeight() : f0Var.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = RangesKt.f(i12 + iMax, 0);
        this.size = getIsVertical() ? H1.r.c((iMax & 4294967295L) | (this.crossAxisSize << 32)) : H1.r.c((this.crossAxisSize & 4294967295L) | (iMax << 32));
        this.offset = H1.n.INSTANCE.b();
        this.row = -1;
        this.column = -1;
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

    @Override // m0.InterfaceC15524j
    /* renamed from: c, reason: from getter */
    public long getSize() {
        return this.size;
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

    @Override // m0.InterfaceC15524j
    /* renamed from: f, reason: from getter */
    public int getRow() {
        return this.row;
    }

    @Override // m0.InterfaceC15524j
    /* renamed from: g, reason: from getter */
    public int getColumn() {
        return this.column;
    }

    @Override // m0.InterfaceC15524j, kotlin.InterfaceC15765y
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.InterfaceC15765y
    public Object getKey() {
        return this.key;
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
    /* renamed from: m, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    @Override // m0.InterfaceC15524j
    /* renamed from: n, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    /* renamed from: q, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: s, reason: from getter */
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    public final void t(f0.a scope, boolean isLookingAhead) {
        GraphicsLayer layer;
        f0.a aVar;
        int i10 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            C14589e.a("position() should be called first");
        }
        int iA = a();
        while (i10 < iA) {
            f0 f0Var = this.placeables.get(i10);
            int iR = this.minMainAxisOffset - r(f0Var);
            int i11 = this.maxMainAxisOffset;
            long offset = getOffset();
            androidx.compose.foundation.lazy.layout.c cVarE = this.animator.e(getKey(), i10);
            if (cVarE != null) {
                if (isLookingAhead) {
                    cVarE.F(offset);
                } else {
                    long jO = H1.n.o(!H1.n.j(cVarE.getLookaheadOffset(), androidx.compose.foundation.lazy.layout.c.INSTANCE.a()) ? cVarE.getLookaheadOffset() : offset, cVarE.r());
                    if ((p(offset) <= iR && p(jO) <= iR) || (p(offset) >= i11 && p(jO) >= i11)) {
                        cVarE.n();
                    }
                    offset = jO;
                }
                layer = cVarE.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                offset = H1.n.f(((getIsVertical() ? (this.mainAxisLayoutSize - H1.n.l(offset)) - r(f0Var) : H1.n.l(offset)) & 4294967295L) | ((getIsVertical() ? H1.n.k(offset) : (this.mainAxisLayoutSize - H1.n.k(offset)) - r(f0Var)) << 32));
            }
            long jO2 = H1.n.o(offset, this.visualOffset);
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

    public final void v(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    private final int p(long j10) {
        if (getIsVertical()) {
            return H1.n.l(j10);
        }
        return H1.n.k(j10);
    }

    private final int r(f0 f0Var) {
        if (getIsVertical()) {
            return f0Var.getHeight();
        }
        return f0Var.getWidth();
    }

    @Override // kotlin.InterfaceC15765y
    public long l(int index) {
        return getOffset();
    }

    public final void o(int delta, boolean updateAnimations) {
        int iK;
        int iIntValue;
        if (!getNonScrollableItem()) {
            long offset = getOffset();
            if (getIsVertical()) {
                iK = H1.n.k(offset);
            } else {
                iK = H1.n.k(offset) + delta;
            }
            boolean isVertical = getIsVertical();
            int iL = H1.n.l(offset);
            if (isVertical) {
                iL += delta;
            }
            this.offset = H1.n.f((iK << 32) | (iL & 4294967295L));
            if (updateAnimations) {
                int iA = a();
                for (int i10 = 0; i10 < iA; i10++) {
                    androidx.compose.foundation.lazy.layout.c cVarE = this.animator.e(getKey(), i10);
                    if (cVarE != null) {
                        long rawOffset = cVarE.getRawOffset();
                        if (getIsVertical()) {
                            iIntValue = H1.n.k(rawOffset);
                        } else {
                            iIntValue = Integer.valueOf(H1.n.k(rawOffset) + delta).intValue();
                        }
                        boolean isVertical2 = getIsVertical();
                        int iL2 = H1.n.l(rawOffset);
                        if (isVertical2) {
                            iL2 = Integer.valueOf(iL2 + delta).intValue();
                        }
                        cVarE.J(H1.n.f((iL2 & 4294967295L) | (iIntValue << 32)));
                    }
                }
            }
        }
    }

    public final void u(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        int i10;
        long jF;
        if (getIsVertical()) {
            i10 = layoutHeight;
        } else {
            i10 = layoutWidth;
        }
        this.mainAxisLayoutSize = i10;
        if (!getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        if (getIsVertical() && this.layoutDirection == H1.t.f12007b) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        if (getIsVertical()) {
            jF = H1.n.f((crossAxisOffset << 32) | (4294967295L & mainAxisOffset));
        } else {
            jF = H1.n.f((crossAxisOffset & 4294967295L) | (mainAxisOffset << 32));
        }
        this.offset = jF;
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }
}
