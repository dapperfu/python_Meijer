package androidx.compose.foundation.lazy.layout;

import H1.n;
import H1.r;
import V0.InterfaceC5310d1;
import Y0.C5425a;
import Z.W;
import Z.X;
import Z.i0;
import Z.k0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.C5824u;
import androidx.compose.ui.node.InterfaceC5823t;
import androidx.compose.ui.node.Y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.C15748h;
import kotlin.C15755o;
import kotlin.InterfaceC15761u;
import kotlin.InterfaceC15765y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003Y47B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0005J3\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\b\u0002\u0010\u000f\u001a\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f*\u00020\u00162\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0089\u0001\u0010,\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u0005J\u001f\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\f¢\u0006\u0004\b1\u00102R*\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010@R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u0002000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0017\u0010Q\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bK\u0010PR\u0018\u0010S\u001a\u00020\u0012*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010RR\u0018\u0010\r\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010TR\u0018\u0010U\u001a\u00020\f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010TR\u0017\u0010X\u001a\u00020V8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bH\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Ln0/y;", "T", "", "<init>", "()V", "key", "", "o", "(Ljava/lang/Object;)V", "n", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;", "itemInfo", "k", "(Ln0/y;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V", "", "isMovingAway", "q", "(Ln0/y;Z)V", "", "s", "([ILn0/y;)I", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Ln0/u;", "keyIndexMap", "Ln0/B;", "itemProvider", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "Lqv/O;", "coroutineScope", "LV0/d1;", "graphicsContext", "m", "(IIILjava/util/List;Ln0/u;Ln0/B;ZZIZIILqv/O;LV0/d1;)V", "p", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/c;", "e", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/c;", "LZ/W;", "a", "LZ/W;", "keyToItemInfoMap", "b", "Ln0/u;", "c", "I", "firstVisibleIndex", "LZ/X;", "d", "LZ/X;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "f", "movingInFromEndBound", "g", "movingAwayToStartBound", "h", "movingAwayToEndBound", "i", "disappearingItems", "Landroidx/compose/ui/node/t;", "j", "Landroidx/compose/ui/node/t;", "displayingNode", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "modifier", "(Ln0/y;)Z", "hasAnimations", "(Ln0/y;)I", "crossAxisOffset", "LH1/r;", "()J", "minSizeToFitDisappearingItems", "DisplayingDisappearingItemsElement", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends InterfaceC15765y> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15761u keyIndexMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleIndex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5823t displayingNode;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W<Object, LazyLayoutItemAnimator<T>.b> keyToItemInfoMap = i0.c();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final X<Object> movingAwayKeys = k0.a();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingInFromStartBound = new ArrayList();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingInFromEndBound = new ArrayList();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingAwayToStartBound = new ArrayList();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingAwayToEndBound = new ArrayList();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<androidx.compose.foundation.lazy.layout.c> disappearingItems = new ArrayList();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Modifier modifier = new DisplayingDisappearingItemsElement(this);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "n", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "node", "", "o", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends Y<DisplayingDisappearingItemsNode> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LazyLayoutItemAnimator<?> animator;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && Intrinsics.e(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void c(DisplayingDisappearingItemsNode node) {
            node.K2(this.animator);
        }

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "LX0/c;", "", "I", "(LX0/c;)V", "t2", "()V", "u2", "K2", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "o", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$a, reason: from toString */
    private static final /* data */ class DisplayingDisappearingItemsNode extends Modifier.c implements InterfaceC5823t {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private LazyLayoutItemAnimator<?> animator;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && Intrinsics.e(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.ui.node.InterfaceC5823t
        public void I(X0.c cVar) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.foundation.lazy.layout.c cVar2 = (androidx.compose.foundation.lazy.layout.c) list.get(i10);
                GraphicsLayer graphicsLayerP = cVar2.getLayer();
                if (graphicsLayerP != null) {
                    float fK = n.k(cVar2.getFinalOffset());
                    float fK2 = fK - n.k(graphicsLayerP.getTopLeft());
                    float fL = n.l(cVar2.getFinalOffset()) - n.l(graphicsLayerP.getTopLeft());
                    cVar.getDrawContext().getTransform().d(fK2, fL);
                    try {
                        C5425a.a(cVar, graphicsLayerP);
                    } finally {
                        cVar.getDrawContext().getTransform().d(-fK2, -fL);
                    }
                }
            }
            cVar.a2();
        }

        public final void K2(LazyLayoutItemAnimator<?> animator) {
            if (Intrinsics.e(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.p();
            ((LazyLayoutItemAnimator) animator).displayingNode = this;
            this.animator = animator;
        }

        @Override // androidx.compose.ui.Modifier.c
        public void t2() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.Modifier.c
        public void u2() {
            this.animator.p();
        }

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R*\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\"\u0010%\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b*\u0010 R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b&\u0010 R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "positionedItem", "Lqv/O;", "coroutineScope", "LV0/d1;", "graphicsContext", "", "layoutMinOffset", "layoutMaxOffset", "crossAxisOffset", "", "k", "(Ln0/y;Lqv/O;LV0/d1;III)V", "", "Landroidx/compose/foundation/lazy/layout/c;", "<set-?>", "a", "[Landroidx/compose/foundation/lazy/layout/c;", "()[Landroidx/compose/foundation/lazy/layout/c;", "animations", "LH1/b;", "b", "LH1/b;", "()LH1/b;", "setConstraints-_Sx5XlM", "(LH1/b;)V", "constraints", "c", "I", "()I", "setCrossAxisOffset", "(I)V", "d", "i", "lane", "e", "g", "j", "span", "f", "", "h", "()Z", "isRunningPlacement", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private final class b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private H1.b constraints;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int crossAxisOffset;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int lane;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int layoutMinOffset;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int layoutMaxOffset;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private androidx.compose.foundation.lazy.layout.c[] animations = C15755o.f150918a;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int span = 1;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln0/y;", "T", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ LazyLayoutItemAnimator<T> f48771f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LazyLayoutItemAnimator<T> lazyLayoutItemAnimator) {
                super(0);
                this.f48771f = lazyLayoutItemAnimator;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC5823t interfaceC5823t = ((LazyLayoutItemAnimator) this.f48771f).displayingNode;
                if (interfaceC5823t != null) {
                    C5824u.a(interfaceC5823t);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }
        }

        public b() {
        }

        private final boolean h() {
            for (androidx.compose.foundation.lazy.layout.c cVar : this.animations) {
                if (cVar != null && cVar.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void l(b bVar, InterfaceC15765y interfaceC15765y, InterfaceC16622O interfaceC16622O, InterfaceC5310d1 interfaceC5310d1, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                i12 = LazyLayoutItemAnimator.this.f(interfaceC15765y);
            }
            bVar.k(interfaceC15765y, interfaceC16622O, interfaceC5310d1, i10, i11, i12);
        }

        /* renamed from: a, reason: from getter */
        public final androidx.compose.foundation.lazy.layout.c[] getAnimations() {
            return this.animations;
        }

        /* renamed from: b, reason: from getter */
        public final H1.b getConstraints() {
            return this.constraints;
        }

        /* renamed from: c, reason: from getter */
        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        /* renamed from: d, reason: from getter */
        public final int getLane() {
            return this.lane;
        }

        /* renamed from: e, reason: from getter */
        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        /* renamed from: f, reason: from getter */
        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        /* renamed from: g, reason: from getter */
        public final int getSpan() {
            return this.span;
        }

        public final void i(int i10) {
            this.lane = i10;
        }

        public final void j(int i10) {
            this.span = i10;
        }

        public final void k(T positionedItem, InterfaceC16622O coroutineScope, InterfaceC5310d1 graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (!h()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int length = this.animations.length;
            for (int iA = positionedItem.a(); iA < length; iA++) {
                androidx.compose.foundation.lazy.layout.c cVar = this.animations[iA];
                if (cVar != null) {
                    cVar.y();
                }
            }
            if (this.animations.length != positionedItem.a()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, positionedItem.a());
                Intrinsics.i(objArrCopyOf, "copyOf(...)");
                this.animations = (androidx.compose.foundation.lazy.layout.c[]) objArrCopyOf;
            }
            this.constraints = H1.b.a(positionedItem.getConstraints());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int iA2 = positionedItem.a();
            LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i10 = 0; i10 < iA2; i10++) {
                C15748h c15748hC = C15755o.c(positionedItem.j(i10));
                if (c15748hC == null) {
                    androidx.compose.foundation.lazy.layout.c cVar2 = this.animations[i10];
                    if (cVar2 != null) {
                        cVar2.y();
                    }
                    this.animations[i10] = null;
                } else {
                    androidx.compose.foundation.lazy.layout.c cVar3 = this.animations[i10];
                    if (cVar3 == null) {
                        cVar3 = new androidx.compose.foundation.lazy.layout.c(coroutineScope, graphicsContext, new a(lazyLayoutItemAnimator));
                        this.animations[i10] = cVar3;
                    }
                    cVar3.C(c15748hC.K2());
                    cVar3.I(c15748hC.M2());
                    cVar3.D(c15748hC.L2());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15761u f48772a;

        public c(InterfaceC15761u interfaceC15761u) {
            this.f48772a = interfaceC15761u;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(this.f48772a.c(((InterfaceC15765y) t10).getKey())), Integer.valueOf(this.f48772a.c(((InterfaceC15765y) t11).getKey())));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15761u f48773a;

        public d(InterfaceC15761u interfaceC15761u) {
            this.f48773a = interfaceC15761u;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(this.f48773a.c(((InterfaceC15765y) t10).getKey())), Integer.valueOf(this.f48773a.c(((InterfaceC15765y) t11).getKey())));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class e<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15761u f48774a;

        public e(InterfaceC15761u interfaceC15761u) {
            this.f48774a = interfaceC15761u;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(this.f48774a.c(((InterfaceC15765y) t11).getKey())), Integer.valueOf(this.f48774a.c(((InterfaceC15765y) t10).getKey())));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class f<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15761u f48775a;

        public f(InterfaceC15761u interfaceC15761u) {
            this.f48775a = interfaceC15761u;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(this.f48775a.c(((InterfaceC15765y) t11).getKey())), Integer.valueOf(this.f48775a.c(((InterfaceC15765y) t10).getKey())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(InterfaceC15765y interfaceC15765y) {
        long jL = interfaceC15765y.l(0);
        return !interfaceC15765y.getIsVertical() ? n.l(jL) : n.k(jL);
    }

    private final int h(InterfaceC15765y interfaceC15765y) {
        long jL = interfaceC15765y.l(0);
        return interfaceC15765y.getIsVertical() ? n.l(jL) : n.k(jL);
    }

    private final void k(T item, int mainAxisOffset, LazyLayoutItemAnimator<T>.b itemInfo) {
        int i10 = 0;
        long jL = item.l(0);
        long jH = item.getIsVertical() ? n.h(jL, 0, mainAxisOffset, 1, null) : n.h(jL, mainAxisOffset, 0, 2, null);
        androidx.compose.foundation.lazy.layout.c[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i11 = 0;
        while (i10 < length) {
            androidx.compose.foundation.lazy.layout.c cVar = animations[i10];
            int i12 = i11 + 1;
            if (cVar != null) {
                cVar.J(n.o(jH, n.n(item.l(i11), jL)));
            }
            i10++;
            i11 = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r43, int r44, int r45, java.util.List<T> r46, kotlin.InterfaceC15761u r47, kotlin.InterfaceC15716B<T> r48, boolean r49, boolean r50, int r51, boolean r52, int r53, int r54, qv.InterfaceC16622O r55, V0.InterfaceC5310d1 r56) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.m(int, int, int, java.util.List, n0.u, n0.B, boolean, boolean, int, boolean, int, int, qv.O, V0.d1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void l(LazyLayoutItemAnimator lazyLayoutItemAnimator, InterfaceC15765y interfaceC15765y, int i10, b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            LazyLayoutItemAnimator<T>.b bVarE = lazyLayoutItemAnimator.keyToItemInfoMap.e(interfaceC15765y.getKey());
            Intrinsics.g(bVarE);
            bVar = bVarE;
        }
        lazyLayoutItemAnimator.k(interfaceC15765y, i10, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n() {
        /*
            r14 = this;
            Z.W<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r0 = r14.keyToItemInfoMap
            boolean r0 = r0.i()
            if (r0 == 0) goto L63
            Z.W<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r0 = r14.keyToItemInfoMap
            java.lang.Object[] r1 = r0.values
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5e
            r3 = 0
            r4 = r3
        L15:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L59
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2f:
            if (r9 >= r7) goto L57
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L53
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r10
            androidx.compose.foundation.lazy.layout.c[] r10 = r10.getAnimations()
            int r11 = r10.length
            r12 = r3
        L47:
            if (r12 >= r11) goto L53
            r13 = r10[r12]
            if (r13 == 0) goto L50
            r13.y()
        L50:
            int r12 = r12 + 1
            goto L47
        L53:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2f
        L57:
            if (r7 != r8) goto L5e
        L59:
            if (r4 == r2) goto L5e
            int r4 = r4 + 1
            goto L15
        L5e:
            Z.W<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r0 = r14.keyToItemInfoMap
            r0.k()
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.n():void");
    }

    private final void o(Object key) {
        androidx.compose.foundation.lazy.layout.c[] animations;
        LazyLayoutItemAnimator<T>.b bVarU = this.keyToItemInfoMap.u(key);
        if (bVarU == null || (animations = bVarU.getAnimations()) == null) {
            return;
        }
        for (androidx.compose.foundation.lazy.layout.c cVar : animations) {
            if (cVar != null) {
                cVar.y();
            }
        }
    }

    private final void q(T item, boolean isMovingAway) {
        LazyLayoutItemAnimator<T>.b bVarE = this.keyToItemInfoMap.e(item.getKey());
        Intrinsics.g(bVarE);
        androidx.compose.foundation.lazy.layout.c[] animations = bVarE.getAnimations();
        int length = animations.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            androidx.compose.foundation.lazy.layout.c cVar = animations[i10];
            int i12 = i11 + 1;
            if (cVar != null) {
                long jL = item.l(i11);
                long jS = cVar.getRawOffset();
                if (!n.j(jS, androidx.compose.foundation.lazy.layout.c.INSTANCE.a()) && !n.j(jS, jL)) {
                    cVar.m(n.n(jL, jS), isMovingAway);
                }
                cVar.J(jL);
            }
            i10++;
            i11 = i12;
        }
    }

    static /* synthetic */ void r(LazyLayoutItemAnimator lazyLayoutItemAnimator, InterfaceC15765y interfaceC15765y, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lazyLayoutItemAnimator.q(interfaceC15765y, z10);
    }

    public final androidx.compose.foundation.lazy.layout.c e(Object key, int placeableIndex) {
        androidx.compose.foundation.lazy.layout.c[] animations;
        LazyLayoutItemAnimator<T>.b bVarE = this.keyToItemInfoMap.e(key);
        if (bVarE == null || (animations = bVarE.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    public final long i() {
        long jA = r.INSTANCE.a();
        List<androidx.compose.foundation.lazy.layout.c> list = this.disappearingItems;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.foundation.lazy.layout.c cVar = list.get(i10);
            GraphicsLayer graphicsLayerP = cVar.getLayer();
            if (graphicsLayerP != null) {
                jA = r.c((Math.max((int) (jA & 4294967295L), n.l(cVar.getRawOffset()) + ((int) (graphicsLayerP.getSize() & 4294967295L))) & 4294967295L) | (Math.max((int) (jA >> 32), n.k(cVar.getRawOffset()) + ((int) (graphicsLayerP.getSize() >> 32))) << 32));
            }
        }
        return jA;
    }

    /* renamed from: j, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    private final boolean g(T t10) {
        int iA = t10.a();
        for (int i10 = 0; i10 < iA; i10++) {
            if (C15755o.c(t10.j(i10)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int s(int[] iArr, T t10) {
        int iM = t10.getLane();
        int iE = t10.getSpan() + iM;
        int iMax = 0;
        while (iM < iE) {
            int i10 = iArr[iM] + t10.getMainAxisSizeWithSpacings();
            iArr[iM] = i10;
            iMax = Math.max(iMax, i10);
            iM++;
        }
        return iMax;
    }

    public final void p() {
        n();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }
}
